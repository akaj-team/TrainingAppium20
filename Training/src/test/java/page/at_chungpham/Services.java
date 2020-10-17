package page.at_chungpham;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;


public class Services extends BasePage {

    @iOSFindBy(xpath = "//*[@text='Daily Dozen' and @class='UIAButton' and ./parent::*[@text='Daily Dozen']]")
    @AndroidFindBy(xpath = "//*[@contentDescription='Navigate up']")
    private MobileElement buttonBack;

    @iOSFindBy(xpath ="")
    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and ./parent::*[@id='action_bar']]")
    private MobileElement title;

    @iOSFindBy(xpath ="//*[@text='VIDEOS' and @class='UIAButton' and ./parent::*[@text='Daily Dozen']]")
    @AndroidFindBy(id = "food_info_videos")
    private MobileElement video;

    @iOSFindBy(xpath = "//*[@knownSuperClass='UIImageView']")
    @AndroidFindBy(id = "food_info_image")
    private MobileElement foodImage;

    @iOSFindBy(xpath = "//*[@id='Serving Sizes' and @class='UIAStaticText' and ./parent::*[@class='UIATable']]")
    @AndroidFindBy(xpath = "//*[@text='Serving Sizes']")
    private MobileElement servingSizesTitle;

    @iOSFindBy(id = "Units:")
    @AndroidFindBy(xpath = "//*[@text='Units']")
    private MobileElement unit;

    @AndroidFindBy(id = "change_units_button")
    private MobileElement buttonChangeUnit;

    @iOSFindBy(xpath = "//*[@text='METRIC' and @class='UIAButton' and ./parent::*[@class='UIATable']]")
    @AndroidFindBy(xpath = "//*[@text='METRIC']")
    private MobileElement buttonChangToImperial;

    @iOSFindBy(xpath = "//*[@text='IMPERIAL' and @class='UIAStaticText' and ./parent::*[./parent::*[@text='Serving Sizes']]]")
    @AndroidFindBy(xpath = "//*[@text='IMPERIAL']")
    private MobileElement buttonChangToMetric;

    @iOSFindBy(xpath = "//*[@text='Types' and @class='UIAStaticText'")
    @AndroidFindBy(xpath = "//*[@text='Types']")
    private MobileElement types;

    @AndroidFindBy(id = "food_name")
    private MobileElement foodName;

    @iOSFindBy(id = "VIDEOS")
    @AndroidFindBy(id = "food_videos")
    private MobileElement foodVideo;

    @iOSFindBy(xpath = "//*[@text='Daily Dozen' and @class='UIAButton' and ./parent::*[@class='UIATabBar']]")
    private MobileElement menuDailyDozen;

    @iOSFindBy(xpath = "//*[@value='21 Tweaks']")
    private MobileElement menuTweaks;

    @iOSFindBy(xpath = "//*[@value='Info']")
    private MobileElement menuInfo;

    @iOSFindBy(id = "Settings")
    private MobileElement menuSettings;

    public Services(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(servingSizesTitle);
    }

    @Override
    public void waitForElementDisplay(MobileElement element, int timeOutInSecond) {
        super.waitForElementDisplay(servingSizesTitle, timeOutInSecond);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public boolean servingSizesTitle() {
        return isForElementPresent(servingSizesTitle);
    }
}
