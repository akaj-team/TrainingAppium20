package page.at_loannguyen;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import javax.swing.text.TabExpander;

public class TweaksPage extends BasePage {
    public TweaksPage(MobileDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "tweak_group_title")
    private MobileElement tvTextDailyDozen;

    @Override
    public boolean isPageDisplayed() {
        return false;
    }

    @Override
    public TweaksPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            waitForElementDisplay(tvTextDailyDozen);
        }
        return this;
    };

    public boolean isDailyDozenDisplay(){
        waitForElementDisplay(tvTextDailyDozen);
        return isForElementPresent(tvTextDailyDozen);
    }
}
