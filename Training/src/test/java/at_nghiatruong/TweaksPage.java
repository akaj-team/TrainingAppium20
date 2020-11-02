package at_nghiatruong;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.*;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import page.exam.HomePage;
import java.util.List;

/**
 * @author AT-Nghia Truong on 10/19/20.
 */
public class TweaksPage extends BasePage {
    int pos;
    JavascriptExecutor jsExecutor;
    TweaksPage tweaksPage = new PageFactory<>(TweaksPage.class).create();

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(accessibility = "21 Tweaks")
    MobileElement actionBar;

    @AndroidFindBy(id= "tweak_name")
    @iOSFindBy(className = "UIAStaticText")
    private MobileElement tweakName;

    @AndroidFindBy(className = "android.widget.CheckBox")
    @iOSFindBy(className = "UIAButton")
    private MobileElement checkboxes;

    @AndroidFindBy(id = "tweak_history")
    @iOSFindBy(id = "ic calendar")
    private MobileElement btnHistory;

    @AndroidFindBy(className = "android.widget.TextView")
    @iOSFindBy(id = "21 Tweaks")
    private MobileElement txtTitle;

    @AndroidFindBy(id = "date_tweaks")
    @iOSFindBy(className = "UIAView")
    private MobileElement container;

    @AndroidFindBy(xpath = "//*[@text='21 Tweaks']")
    @iOSFindBy(id = "21 Tweaks")
    private MobileElement btn21Tweaks;

    @AndroidFindBy(className = "android.widget.LinearLayout")
    @iOSFindBy(id = "UIAView" )
    List<MobileElement> listLayout;

    public TweaksPage(MobileDriver<WebElement> driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public TweaksPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            //homePage.open().clickTo21TweaksButton();
        }
        return this;
    }

    public TweaksPage clickAllCheckboxes(){
        for (int i = 0; i< listLayout.size(); i++)
           if (listLayout.get(i).findElement(By.className("android.widget.CheckBox")).isEnabled())
               listLayout.get(i).findElement(By.className("android.widget.CheckBox")).click();
            scrollToElement(checkboxes);
        return this;
    }

    public TweaksPage isAllCheckboxesSelected(){
        for (int i = 0; i< listLayout.size(); i++)
            Assert.assertTrue(listLayout.get(i).findElement(By.className("android.widget.CheckBox")).isSelected());
        return this;
    }

    public TweaksPage getTitleMenuInTweaksList(){
        listLayout.get(pos).findElement(By.id("tweak_name")).getText();
        return this;
    }

    public TweaksPage clickCheckboxInListLayout(){
        waitForElementDisplay(checkboxes);
        checkboxes.click();
        return this;
    }

    public String getTextTitle() {
        waitForElementDisplay(txtTitle);
        return txtTitle.getText();
    }

    public void clickOnHistoryButton(){
        waitForElementDisplay(btnHistory);
        btnHistory.click();
    }
    public void scrollToElement(MobileElement element) {
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}