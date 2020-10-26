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
public class Android_Services extends BasePage {
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UINavigationBar")
    public MobileElement actionBar;

    @AndroidFindBy(className = "UIATable")
    private MobileElement container;

    //@AndroidFindBy(id = "menu_toggle_modes")
    //private MobileElement tvMenuToggleModes;

    //@AndroidFindBy(className = "android.widget.ListView")
    //private MobileElement listMenu;

    @iOSFindBy(xpath = "//*[@text='Daily Dozen'")
    @AndroidFindBy(className = "android.widget.ImageButton")
    private MobileElement img;

    public boolean isImageBtnContain() {
        return img.isDisplayed();
    }

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
    @iOSFindBy(id = "IMPERIAL")
    @iOSFindBy(id = "METRIC")
    public MobileElement btnUnit;

    @iOSFindBy(xpath = "//*[@text='Serving Sizes'")
    @AndroidFindBy(xpath = "//*[@text='Serving Sizes']")
    public MobileElement txtServing;

    public boolean isbtnvideoContain() {
        return btnVideo.isDisplayed();
    }

    public Android_Services clickPreviousButton() {
        actionBar.findElement(By.className("android.widget.ImageView")).click();
        return this;
    }

    public Android_Services clickUnitButton(){
        btnUnit.click();
        return this;
    }

    public Android_Services clickVideoButton(int pos){
        actionBar.findElements(By.id("food_info_videos")).get(pos).click();
        return this;
    }

    public Android_Services(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public Android_Services open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public String getTextTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    public Android_Services clickMenuButton() {
        btnMenu.click();
        return this;
    }

    //public String getTextTvMenuToggleModes() {return tvMenuToggleModes.getText(); }

    //public boolean isListMenuDisplay() {return isForElementPresent(listMenu);}

    public String getTextOfNameFood(int pos) {
        return container.getText();
    }

    public String clickIcCalendar(int pos) {
        return container.findElements(By.className("UIAStaticText")).get(pos).getText();
    }

    //public boolean isContentTvMenuToggleModesContain(String text) {return getTextTvMenuToggleModes().contains(text);}
}

