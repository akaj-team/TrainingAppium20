package page.at_hadang;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * for Services screen
 *
 * @author at-ha.dang
 */

public class ServicesPageHaDang extends BasePage{
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    public MobileElement actionBar;

    @AndroidFindBy(id = "food_videos")
    @iOSFindBy(id = "VIDEOS")
    public MobileElement btnMenu;

    public ServicesPageHaDang(MobileDriver driver) {
        super(driver);
    }

    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public BasePage open() {
        return null;
    }

    public ServicesPageHaDang open(String name, int pos) {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePageHaDang homePageHaDang = new PageFactory<>(HomePageHaDang.class).create();
            homePageHaDang.open().isPageDisplayed();
            homePageHaDang.clickMoreInfoButton(name, pos);
            waitForElementDisplay(btnMenu);
        }
        return this;
    }

    public String getFoodName() {
        return "";
    }
}
