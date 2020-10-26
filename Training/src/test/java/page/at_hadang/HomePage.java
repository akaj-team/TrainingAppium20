package page.at_hadang;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

/**
 * for Home screen
 *
 * @author at-ha.dang
 */

public class HomePage extends BasePage {
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement actionBar;

    @AndroidFindBy(xpath = "//*[@text='Daily Dozen']")
    @iOSFindBy(id = "Daily Dozen")
    private MobileElement tvTitle;

    @AndroidFindBy(id = "header")
    @iOSFindBy(id = "Servings")
    private MobileElement tvHeader;

    @AndroidFindBy(id = "menu_toggle_modes")
    @iOSFindBy(id = "21 Tweaks")
    private MobileElement btn21Tweaks;

    @AndroidFindBy(className = "android.widget.ImageView")
    @iOSFindBy(id = "Info")
    private MobileElement btnInfoMenu;

    @AndroidFindBy(id = "food_history")
    @iOSFindBy(id = "ic calendar")
    private List<MobileElement> lstBtnCalendar;

    public HomePage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public BasePage open() {
//        if (!isPageDisplayed()){
//            getDriver().launchApp();
//            waitForElementDisplay(actionBar);
//        }
        return this;
    }

    public String getTextTitle() {
        waitForElementDisplay(tvTitle);
        return tvTitle.getText();
    }

    public String getTextHeader() {
        waitForElementDisplay(tvHeader);
        return tvHeader.getText();
    }

    public HomePage click21TweaksButton() {
        waitForElementDisplay(btn21Tweaks);
        btn21Tweaks.click();
        return this;
    }

    public HomePage clickChartButton() {
        return this;
    }

    public HomePage clickInfoMenuButton() {
        waitForElementDisplay(btnInfoMenu);
        btnInfoMenu.click();
        return this;
    }

    public String getTextOfFoodName(int pos) {
        return "";
    }

    public HomePage clickMoreInfoButton(String name, int pos) {
        return this;
    }

    public HomePage clickCalendarButton() {
        for (MobileElement mobileElement : lstBtnCalendar) {
            mobileElement.click();
        }
        return this;
    }

    public boolean isHomePageNotDisplayed() {
        return !tvTitle.isDisplayed();
    }
}
