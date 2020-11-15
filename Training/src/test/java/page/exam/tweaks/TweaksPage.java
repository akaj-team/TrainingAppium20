package page.exam.tweaks;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class TweaksPage extends BasePage {
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    public MobileElement actionBar;

    @iOSFindBy(id = "Daily Dozen")
    @AndroidFindBy(id = "menu_toggle_modes")
    private MobileElement btnHome;

    @AndroidFindBy(id = "header")
    @iOSFindBy(id = "21 Tweaks")
    private MobileElement tvHeader;

    public TweaksPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(tvHeader);
    }

    @Override
    public BasePage open() {
        return this;
    }

    public String getTitle() {
        return "";
    }

    public TweaksPage clickBtnHome() {
        btnHome.click();
        return this;
    }

    public TweaksPage waitForPageDisplayed() {
        waitForElementDisplay(tvHeader);
        return this;
    }
}
