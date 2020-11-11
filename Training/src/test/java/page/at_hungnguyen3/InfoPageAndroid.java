package page.at_hungnguyen3;

import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class InfoPageAndroid extends InfoPage {

    @AndroidFindBy(id = "title")
    List<MobileElement> listInfo;

    @AndroidFindBy(xpath = "//*[@text='About this app']")
    MobileElement titleAbout;

    public InfoPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        waitForElementDisplay(listInfo.get(0), 5000);
        return isForElementPresent(listInfo.get(0));
    }

    @Override
    public InfoPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            TweaksPage tweaksPage = new PageFactory<>(TweaksPage.class).create();
            tweaksPage.open().clickBtnAbout();
            waitForElementDisplay(listInfo.get(0));
        }
        return this;
    }

    @Override
    public String getTextInfo(int pos) {
        waitForElementDisplay(listInfo.get(pos));
        return listInfo.get(pos).getText();
    }

    @Override
    public InfoPage clickAbout() {
        waitForElementDisplay(listInfo.get(10));
        listInfo.get(10).click();
        return this;
    }

    @Override
    public boolean isAboutPageDisplayed() {
        waitForElementDisplay(titleAbout, 5000);
        return isForElementPresent(titleAbout);
    }

    public InfoPage pressBackKeyDevice() {
        AndroidDriver driver = (AndroidDriver) getDriver();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return this;
    }

    @Override
    public InfoPage clickDonate() {
        waitForElementDisplay(listInfo.get(5));
        listInfo.get(5).click();
        return this;
    }
}
