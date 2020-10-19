package at_cuongnguyen;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-cuong.nguyen
 */
public class Services extends BasePage {
    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @AndroidFindBy(id = "menu_toggle_modes")
    private MobileElement tvMenuToggleModes;

    @AndroidFindBy(className = "android.widget.ListView")
    private MobileElement listMenu;

    //Find previous button of header bar
    @iOSFindBy(xpath = "//*[@text='Daily Dozen' and @class='UIAButton' and ./parent::*[@text='Daily Dozen']]")
    @AndroidFindBy(className = "android.widget.ImageButton")
    private MobileElement imageBtn;

    public boolean isImageBtnContain() {
        return imageBtn.isDisplayed();
    }

    @AndroidFindBy(id = "food_info_videos")
    private MobileElement BtnVideo;

    @iOSFindBy(className = "UIAImage")
    @AndroidFindBy(id = "food_info_image")
    private MobileElement ImgFood;

    @AndroidFindBy(id = "change_units_button")
    private MobileElement BtnUnit;

    @iOSFindBy(xpath = "//*[@text='Serving Sizes' and @class='UIAStaticText' and ./parent::*[@class='UIATable']]")
    @AndroidFindBy(xpath = "//*[@text='Serving Sizes']")
    private MobileElement txtServing;

    public boolean isBtnvideoContain() {
        return BtnVideo.isDisplayed();
    }

    public Services clickPreviousButton() {
        actionBar.findElement(By.className("android.widget.ImageView")).click();
        return this;
    }

    public Services(MobileDriver driver) {
        super(driver);
    }

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

    public String getTextTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    public Services clickMenuButton() {
        actionBar.findElement(By.className("android.widget.ImageView")).click();
        return this;
    }


    public String getTextTvMenuToggleModes() {
        return tvMenuToggleModes.getText();
    }

    public boolean isListMenuDisplay() {
        return isForElementPresent(listMenu);
    }

    public boolean isContentTvMenuToggleModesContain(String text) {
        return getTextTvMenuToggleModes().contains(text);
    }
}

