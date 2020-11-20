package page.at_hadang;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

/**
 * for Home screen
 *
 * @author at-ha.dang
 */

public class HomePageHaDang extends BasePage {
    JavascriptExecutor jsExecutor;

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement actionBar;

    @AndroidFindBy(id = "header")
    @iOSFindBy(id = "Servings")
    private MobileElement tvHeader;

    @AndroidFindBy(id = "menu_toggle_modes")
    @iOSFindBy(id = "21 Tweaks")
    private MobileElement btn21Tweaks;

    @AndroidFindBy(id = "food_history")
    @iOSFindBy(xpath = "//*[@id='ic calendar']")
    private List<MobileElement> lstBtnCalendar;

    public HomePageHaDang(MobileDriver driver) {
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
            waitForElementDisplay(actionBar);
        }
        return this;
    }

    public String getTextTitle() {
        return "";
    }

    public String getTextHeader() {
        waitForElementDisplay(tvHeader);
        return tvHeader.getText();
    }

    public HomePageHaDang click21TweaksButton() {
        waitForElementDisplay(btn21Tweaks);
        btn21Tweaks.click();
        return this;
    }

    public HomePageHaDang clickChartButton() {
        return this;
    }

    public HomePageHaDang clickInfoMenuButton() {
        return this;
    }

    public void scrollToElement(MobileElement element) {
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public String getTextOfFoodName(int pos) {
        return "";
    }

    public HomePageHaDang clickMoreInfoButton(String name, int pos) {
        return this;
    }

    public HomePageHaDang clickCalendarButton() {
        lstBtnCalendar.forEach(mobileElement -> mobileElement.click());
        return this;
    }
}
