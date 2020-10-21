package at_nghiatruong;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
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

    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }
    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    MobileElement container = (MobileElement) getDriver().findElement(By.id("date_tweaks"));
    List<MobileElement> tweakList = container.findElements(By.className("android.widget.LinearLayout"));

    public TweaksPage clickAllCheckboxes(){

        for (int i = 0; i< tweakList.size(); i++)
            tweakList.get(i).findElement(By.className("android.widget.CheckBox")).click();
        return this;
    }
    public TweaksPage isAllCheckboxesSelected(){

        for (int i = 0; i< tweakList.size(); i++)
            Assert.assertTrue(tweakList.get(i).findElement(By.className("android.widget.CheckBox")).isSelected());
        return this;
    }

}

