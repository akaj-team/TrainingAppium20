package page.at_hungnguyen3.history;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HistoryPage extends BasePage {

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    public MobileElement actionBar;

    @AndroidFindBy(id = "time_scale_spinner")
    @iOSFindBy(className = "UIASegmentedControl")
    private MobileElement spinnerTime;

    public HistoryPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(spinnerTime);
    }

    @Override
    public HistoryPage open() {
        return this;
    }

    public String getTitle() {
        return "";
    }

    public HistoryPage clickBackButton() {
        return this;
    }

    public HistoryPage waitForPageDisplayed() {
        waitForElementDisplay(spinnerTime);
        return this;
    }
}
