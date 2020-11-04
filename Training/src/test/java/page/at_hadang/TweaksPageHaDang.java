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

public class TweaksPageHaDang extends BasePage {
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement actionBar;

    public TweaksPageHaDang(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public TweaksPageHaDang open() {
        if (!isPageDisplayed()){
            getDriver().launchApp();
            HomePageHaDang homePageHaDang = new PageFactory<>(HomePageHaDang.class).create();
            homePageHaDang.open().isPageDisplayed();
            homePageHaDang.click21TweaksButton();
        }
        return this;
    }

    public String getTextTitle(){
        return "";
    }
}
