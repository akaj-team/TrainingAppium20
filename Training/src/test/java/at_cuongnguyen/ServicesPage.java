package at_cuongnguyen;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * for screen
 *
 * @author at-cuong.nguyen
 */

public class ServicesPage extends BasePage {

    public ServicesPage(MobileDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UINavigationBar")
    public MobileElement actionBar;

    //This element just only iOS containing
    @iOSFindBy(className ="UIAStaticText")
    public MobileElement title;

    //@AndroidFindBy(className = "UIATable")
    //public MobileElement container;

    //@AndroidFindBy(id = "menu_toggle_modes")
    //private MobileElement tvMenuToggleModes;

    //@AndroidFindBy(className = "android.widget.ListView")
    //private MobileElement listMenu;

    @iOSFindBy(xpath = "//*[@text='Daily Dozen'")
    @AndroidFindBy(className = "android.widget.ImageButton")
    public MobileElement btnDailyDozen;

    @AndroidFindBy(id = "food_videos")
    @iOSFindBy(id = "VIDEOS")
    public MobileElement btnMenu;

    @AndroidFindBy(id = "food_info_videos")
    @iOSFindBy(xpath = "//*[@text='VIDEOS'")
    public MobileElement btnVideo;

    @iOSFindBy(className = "UIAImage")
    @AndroidFindBy(id = "food_info_image")
    public MobileElement imgFood;

    @AndroidFindBy(id = "change_units_button")
    public MobileElement btnUnit;

    @iOSFindBy(id = "IMPERIAL")
    public MobileElement btnImperial;

    @iOSFindBy(id = "METRIC")
    public MobileElement btnMetric;

    @iOSFindBy(xpath = "//*[@text='Serving Sizes'")
    @AndroidFindBy(xpath = "//*[@text='Serving Sizes']")
    public MobileElement txtServing;

    public boolean isDailyDozenBtnContain() {
        return btnDailyDozen.isDisplayed();
    }

    public boolean isbtnvideoContain() {
        return btnVideo.isDisplayed();
    }
    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public ServicesPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }
}
