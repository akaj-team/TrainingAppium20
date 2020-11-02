package at_nghiatruong;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author AT-Nghia Truong on 10/19/20.
 */
public class TweaksPageAndroid extends BasePage {
    int pos;
    JavascriptExecutor jsExecutor;
    TweaksPageAndroid tweaksPageAndroid = new PageFactory<>(TweaksPageAndroid.class).create();

    @AndroidFindBy(id = "action_bar")
    MobileElement actionBar;

    @AndroidFindBy(id = "tweak_icon")
    List<MobileElement> lstIcon;

    @AndroidFindBy(id = "sub_header")
    MobileElement tvSubHeader;

    public TweaksPageAndroid(MobileDriver<WebElement> driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public TweaksPageAndroid open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public TweaksPageAndroid isAllCheckboxesSelected(){
        for (int i = 0; i< lstIcon.size(); i++)
            Assert.assertTrue(lstIcon.get(i).findElement(By.className("android.widget.CheckBox")).isDisplayed());
        return this;
    }

    public void scrollToElement(MobileElement element) {
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}