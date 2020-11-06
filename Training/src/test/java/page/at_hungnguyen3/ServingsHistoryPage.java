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
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.open().clickBtnChart();
        }
        return this;
    }

}
