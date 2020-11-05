package page.at_loannguyen;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class CalendarPage extends BasePage {
    @AndroidFindBy(xpath = "//*[@text='History']")
    @iOSFindBy(id = "History")
    private MobileElement tvHistory;

    public CalendarPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return false;
    }

    @Override
    public CalendarPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            waitForElementDisplay(tvHistory);
        }
        return this;
    }

    public boolean isHistoryDisplay(){
        waitForElementDisplay(tvHistory);
        return isForElementPresent(tvHistory);
    }
}
