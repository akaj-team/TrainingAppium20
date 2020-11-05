package page.at_chungpham;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ServicesPageiOS extends ServicesPage {

    @iOSFindBy(xpath = "//*[@text='Daily Dozen' and @class='UIAButton' and ./parent::*[@class='UIATabBar']]")
    private MobileElement btnMenuDailyDozen;

    @iOSFindBy(xpath = "//*[@value='21 Tweaks']")
    private MobileElement btnMenuTweaks;

    @iOSFindBy(xpath = "//*[@value='Info']")
    private MobileElement btnMenuInfo;

    @iOSFindBy(id = "Settings")
    private MobileElement btnMenuSettings;

    public ServicesPageiOS(MobileDriver driver) {
        super(driver);
    }

    public void clickBtnMenuDailyDozen() {
        btnMenuDailyDozen.click();
    }

    public void clickBtnMenuTweaks() {
        btnMenuTweaks.click();
    }

    public void clickBtnMenuInfo() {
        btnMenuInfo.click();
    }

    public void clickBtnMenuSettings() {
        btnMenuSettings.click();
    }


    @Override
    public boolean isPageDisplayed() {
        return false;
    }

    @Override
    public BasePage open() {
        return null;
    }
}
