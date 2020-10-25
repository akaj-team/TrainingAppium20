package page.exam.at_thaile;

import at.base.BasePage;
import cucumber.api.java.en.And;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import page.exam.HomePage;
import at.core.PageFactory;

/**
 * for screen
 *
 * @author at-thai.le
 */

public class ServingHistoryPage extends BasePage {
    @iOSFindBy(id = "Servings History")
    @AndroidFindBy(className = "android.widget.TextView")
    private MobileElement screenTitle;

    @iOSFindBy(id = "21 Tweaks")
    @AndroidFindBy(className = "android.widget.ImageButton")
    private MobileElement backButton;

    @iOSFindBy(id = "Time Scale")
    @AndroidFindBy(className = "android.widget.TextView")
    private MobileElement scaleText;

    @iOSFindBy(className = "UIAView")
    private MobileElement timeView;

    @AndroidFindBy(id = "time_range_selector_selected_year")
    private MobileElement yearSelected;

    @AndroidFindBy(id = "time_range_selector_selected_month")
    private MobileElement monthSelected;

    @AndroidFindBy(id = "time_scale_spinner")
    private MobileElement timeDropDownList;

    @iOSFindBy(id = "Day")
    @AndroidFindBy(xpath = "//*[@text='Day']")
    private MobileElement dayButton;

    @iOSFindBy(id = "Month")
    @AndroidFindBy(xpath = "//*[@text='Month']")
    private MobileElement monthButton;

    @iOSFindBy(id = "Year")
    @AndroidFindBy(xpath = "//*[@text='Year']")
    private MobileElement yearButton;

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

    public ServingHistoryPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(screenTitle);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            HomePage hp = new PageFactory<>(HomePage.class).create();
            getDriver().launchApp();
            waitForElementDisplay(screenTitle);
        }
        return this;
    }

    @Override
    public BasePage clickBackButton() {
        backButton.click();
        return super.clickBackButton();
    }

    public String getTextTimeView() {
        return timeView.getText();
    }

    public String getTextScreenTitle() {
        return screenTitle.getText();
    }

    public String getTextTimeScale(){
        return scaleText.getText();
    }

    public void clickMonthButton() {
        monthButton.click();
    }

    public void clickYearButton() {
        yearButton.click();
    }
    public void clickTweakButton(){
        tweaksButton.click();
    }
    public void clickInfoButton(){
        infoButton.click();
    }
    public void clickSettingButton(){
        settingButton.click();
    }
}
