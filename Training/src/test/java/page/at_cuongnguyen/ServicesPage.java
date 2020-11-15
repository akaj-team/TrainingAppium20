package page.at_cuongnguyen;

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
    @iOSFindBy(className = "UIANavigationBar")
    public MobileElement actionBar;

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

    @iOSFindBy(xpath = "//*[@text='Serving Sizes'")
    @AndroidFindBy(xpath = "//*[@text='Serving Sizes']")
    public MobileElement txtServing;

    //element of previous screen
    @AndroidFindBy(id = "header")
    @iOSFindBy(id = "Servings")
    public MobileElement txtPreviousScreen;

    public boolean isDailyDozenBtnContain() {
        return true;
    }

    public boolean isbtnvideoContain() {
        return btnVideo.isDisplayed();
    }

    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    public boolean isServicesAreaDisplayed() {
        return isForElementPresent(txtServing);
    }

    public boolean isPreviousScreenDisplayed() {
        return isForElementPresent(txtPreviousScreen);
    }

    public ServicesPage checkImg(String im) {
        return this;
    }

    public ServicesPage clickVideoButton() {
        return this;
    }

    public ServicesPage clickPreviousButton() {
        return this;
    }

    public boolean clickUnitButton() {
        return false;
    }

    public ServicesPage clickMenuButton() {
        return this;
    }

    public String getTextTitle() {
        return "";
    }

    public ServicesPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public boolean checkServicesArea() {
        return true;
    }

    public boolean checkPreivousScreen() {
        return true;
    }
}