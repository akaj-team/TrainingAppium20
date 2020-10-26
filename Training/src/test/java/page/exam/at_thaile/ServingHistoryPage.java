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
    @AndroidFindBy(xpath = "//*[@text='Daily Servings History']")
    private MobileElement screenTitle;

    @iOSFindBy(id = "21 Tweaks")
    @AndroidFindBy(className = "android.widget.ImageButton")
    private MobileElement backButton;

    @iOSFindBy(id = "Time Scale")
    @AndroidFindBy(xpath = "//*[@text='Time Scale']")
    private MobileElement scaleText;

    @iOSFindBy(id = "Day")
    @AndroidFindBy(xpath = "//*[@text='Day']")
    private MobileElement dayButton;

    @iOSFindBy(id = "Month")
    @AndroidFindBy(xpath = "//*[@text='Month']")
    private MobileElement monthButton;

    @iOSFindBy(id = "Year")
    @AndroidFindBy(xpath = "//*[@text='Year']")
    private MobileElement yearButton;

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
            getDriver().launchApp();
        }
        return this;
    }

    @Override
    public BasePage clickBackButton() {
        backButton.click();
        return super.clickBackButton();
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
}
