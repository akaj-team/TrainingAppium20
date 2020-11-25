package page.at_hungnguyen3;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;

public class ServingsHistoryPage extends BasePage {

    public ServingsHistoryPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return false;
    }

    @Override
    public ServingsHistoryPage open() {
        return this;
    }

    public String getTextTitle() {
        return "";
    }

    public ServingsHistoryPage clickBackButton() {
        return this;
    }

    public ServingsHistoryPage clickTimeSpinner() {
        return this;
    }

    public boolean isListTimeSpinnerDisplayed () {
        return false;
    }

}
