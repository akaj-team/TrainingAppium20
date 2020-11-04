package page.at_hadang;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * for Home screen
 *
 * @author at-ha.dang
 */

public class InfoPageHaDang extends BasePage {
    @AndroidFindBy(xpath = "//*[@text='Latest Videos']")
    @iOSFindBy(id = "Latest Videos")
    private MobileElement btnLatestVideo;

    public InfoPageHaDang(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(btnLatestVideo);
    }

    @Override
    public InfoPageHaDang open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePageHaDang homePage = new PageFactory<>(HomePageHaDang.class).create();
            homePage.open().isPageDisplayed();
            homePage.clickInfoMenuButton();
        }
        return this;
    }
}
