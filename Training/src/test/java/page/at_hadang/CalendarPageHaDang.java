package page.at_hadang;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * for Calendar screen
 *
 * @author at-ha.dang
 */

public class CalendarPageHaDang extends BasePage {
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement actionBar;

    @AndroidFindBy(xpath = "//*[@text='History']")
    @iOSFindBy(id = "History")
    private MobileElement tvHistory;

    public CalendarPageHaDang(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(tvHistory);
    }

    @Override
    public CalendarPageHaDang open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePageHaDang homePageHaDang = new PageFactory<>(HomePageHaDang.class).create();
            homePageHaDang.open().isPageDisplayed();
            homePageHaDang.clickCalendarButton();
        }
        return this;
    }

    public String getTextTitle(){
        return "";
    }
}
