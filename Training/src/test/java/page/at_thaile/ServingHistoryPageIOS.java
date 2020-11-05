package page.at_thaile;

import at.base.BasePage;
import cucumber.api.java.en.And;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * for screen
 *
 * @author at-thai.le
 */

public class ServingHistoryPageIOS extends ServingHistoryPage {
    @iOSFindBy(id = "ic left")
    private MobileElement leftButton;

    @iOSFindBy(id = "ic left double")
    private MobileElement leftDoubleButton;

    @iOSFindBy(id = "ic right")
    private MobileElement rightButton;

    @iOSFindBy(id = "ic right double")
    private MobileElement rightDoubleButton;

    @iOSFindBy(id = "Daily Dozen")
    private MobileElement dailyDozenButton;

    @iOSFindBy(id = "21 Tweaks")
    private MobileElement tweaksButton;

    @iOSFindBy(id = "Info")
    private MobileElement infoButton;

    @iOSFindBy(id = "Settings")
    private MobileElement settingButton;

    @iOSFindBy(className = "UIAView")
    private MobileElement timeView;

    public ServingHistoryPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return super.open();
    }

    public String getTextTimeView() {
        return timeView.getText();
    }

    public void clickDailyDozenButton() {
        dailyDozenButton.click();
    }

    public void clickTweakButton() {
        tweaksButton.click();
    }

    public void clickInfoButton() {
        infoButton.click();
    }

    public void clickSettingButton() {
        settingButton.click();
    }
}
