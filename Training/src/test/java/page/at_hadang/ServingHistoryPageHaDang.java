package page.at_hadang;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import page.at_thaile.ServingHistoryPage;

/**
 * for Servings History screen
 *
 * @author at-ha.dang
 */

public class ServingHistoryPageHaDang extends BasePage {
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement actionBar;

    public ServingHistoryPageHaDang(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public ServingHistoryPageHaDang open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePageHaDang homePageHaDang = new PageFactory<>(HomePageHaDang.class).create();
            homePageHaDang.open().isPageDisplayed();
            homePageHaDang.clickChartButton();
        }
        return this;
    }

    public String getScreenTitle() {
        return "";
    }
}
