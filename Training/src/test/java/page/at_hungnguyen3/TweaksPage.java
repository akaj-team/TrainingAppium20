package page.at_hungnguyen3;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class TweaksPage extends BasePage {

    @AndroidFindBy(id = "tweak_name")
    @iOSFindBy(xpath = "//*[@text='ic calendar']/parent::*//*[@class='UIAStaticText']")
    MobileElement tweaksName;

    @AndroidFindBy(id = "menu_toggle_modes")
    @iOSFindBy(id = "Daily Dozen")
    MobileElement BtnDailyDozen;

    public TweaksPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return false;
    }

    @Override
    public TweaksPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.open().clickBtnTweaks();
            waitForElementDisplay(tweaksName);
        }
        return this;
    }

    public boolean isTweaksNameDisplayed(){
        waitForElementDisplay(tweaksName,5000);
        return isForElementPresent(tweaksName);
    }

    public TweaksPage clickBtnDailyDozen () {
        waitForElementDisplay(BtnDailyDozen,5000);
        BtnDailyDozen.click();
        return this;
    }

    public String getTextTitle(){
        return "";
    }

    public TweaksPage clickBtnAbout(){
        return this;
    }

    public boolean isAboutMenuDisplayed(){
        return false;
    }
}
