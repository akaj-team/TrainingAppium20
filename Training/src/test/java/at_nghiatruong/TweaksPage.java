package at_nghiatruong;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.*;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.exam.HomePage;
import java.util.List;

/**
 * @author AT-Nghia Truong on 10/19/20.
 */
public class TweaksPage extends BasePage {

    public TweaksPage(MobileDriver<WebElement> driver) {
        super(driver);
    }

    HomePage homePage = new PageFactory<>(HomePage.class).create();

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(accessibility = "21 Tweaks")
    MobileElement actionBar;

    @AndroidFindBy(id= "tweak_name")
    @iOSFindBy(className = "UIAStaticText")
    private List<MobileElement> tweakName;

    @AndroidFindBy(className = "android.widget.CheckBox")
    @iOSFindBy(className = "UIAButton")
    List<MobileElement> listCheckboxes;

    @AndroidFindBy(id = "tweak_history")
    @iOSFindBy(id = "ic calendar")
    List<MobileElement> listHistory;

    @AndroidFindBy(className = "android.widget.TextView")
    @iOSFindBy(id = "21 Tweaks")
    private MobileElement txtTitle;

    @AndroidFindBy(id = "tweak_icon")
    @iOSFindBy(className = "UIAView")
    List<MobileElement> listTweakIcon;
    List<MobileElement> iosTweakContainer;

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            homePage.clickMenuButton();
        }
        return this;
    }

    MobileElement dateTweaks = (MobileElement) getDriver().findElement(By.id("date_tweaks"));
    List<MobileElement> container = dateTweaks.findElements(By.className("android.widget.LinearLayout"));

    public TweaksPage clickAllCheckboxes(){
        for (int i = 0; i< container.size(); i++)
            container.get(i).findElement(By.className("android.widget.CheckBox")).click();
            scrollToElementContainText("Trendelenburg",container.get(20));
        return this;
    }

    public TweaksPage isAllCheckboxesSelected(){
        for (int i = 0; i< container.size(); i++)
            Assert.assertTrue(container.get(i).findElement(By.className("android.widget.CheckBox")).isSelected());
        return this;
    }

    public TweaksPage getTitleMenuInTweaksList(){
        container.get(pos).findElement(By.id("tweak_name")).getText();
        return this;
    }

    int pos;
    public TweaksPage clickCheckboxInTweaksList(){
        container.get(pos).findElement(By.className("android.widget.CheckBox")).click();
        return this;
    }

    public String getTextTitle() {
        waitForElementDisplay(txtTitle);
        return txtTitle.getText();
    }
}