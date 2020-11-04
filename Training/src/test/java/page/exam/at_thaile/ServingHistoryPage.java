package page.exam.at_thaile;

import at.base.BasePage;
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
    private MobileElement tvTitle;

    @iOSFindBy(id = "21 Tweaks")
    @AndroidFindBy(className = "android.widget.ImageButton")
    private MobileElement btnBack;

    @iOSFindBy(id = "Time Scale")
    @AndroidFindBy(xpath = "//*[@text='Time Scale']")
    private MobileElement tvScale;

    @iOSFindBy(id = "Day")
    @AndroidFindBy(xpath = "//*[@text='Day']")
    private MobileElement dayButton;

    @iOSFindBy(className = "UIAView")
    @AndroidFindBy(className = "android.widget.LinearLayout")
    private MobileElement timeBar;

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
        return isForElementPresent(tvTitle);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePage hp = new PageFactory<>(HomePage.class).create();
            hp.open();
//            hp.clickStatButton();
            waitForElementDisplay(tvTitle);
        }
        return this;
    }

    @Override
    public BasePage clickBackButton() {
        btnBack.click();
        return super.clickBackButton();
    }

    public String getTextScreenTitle() {
        return tvTitle.getText();
    }

    public String getTextTimeScale() {
        return tvScale.getText();
    }

    public void clickMonthButton() {
        monthButton.click();
    }

    public void clickYearButton() {
        yearButton.click();
    }

    public void clickDayButton() {
        dayButton.click();
    }

    public boolean isDisplayTimeBar() {
        return isForElementPresent(timeBar);
    }
}
