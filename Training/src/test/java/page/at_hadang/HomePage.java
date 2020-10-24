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

    @AndroidFindBy(id = "Daily Dozen")
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

    @AndroidFindBy(id = "food_name")
    @iOSFindBy(id = "More Info")
    protected List<MobileElement> lstBtnMoreInfo;

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

    public String getTextHeader() {
        waitForElementDisplay(tvHeader);
        return tvHeader.getText();
    }

    public final void click21TweaksButton() {
        waitForElementDisplay(btn21Tweaks);
        btn21Tweaks.click();
    }

    public final void clickInfoMenuButton() {
        waitForElementDisplay(btnInfoMenu);
        btnInfoMenu.click();
    }

    public final void clickMoreInfoButton() {
        for (int i = 0; i < lstBtnMoreInfo.size(); i++) {
            lstBtnMoreInfo.get(i).click();
        }
    }

    public final void clickCalendarButton() {
        for (int i = 0; i < lstBtnCalendar.size(); i++) {
            lstBtnCalendar.get(i).click();
        }
    }
}
