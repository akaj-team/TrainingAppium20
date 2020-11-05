package page.at_hoatran;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import page.exam.HomePage;

import java.util.List;

/**
 * for screen
 *
 * @author at-hoa.tran
 */
public class HomePageHoa extends BasePage {
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    public MobileElement actionBar;

    @AndroidFindBy(id = "header")
    @iOSFindBy(id = "Servings")
    public MobileElement txtHeader;

    @AndroidFindBy(id = "date_food_servings")
    @iOSFindBy(className = "UIATable")
    public MobileElement listFood;

    @AndroidFindBy(id = "food_history")
    @iOSFindBy(id = "ic calendar")
    private List<MobileElement> lstCalendar;

    public HomePageHoa(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public String getTitle() {
        return "";
    }

    public String getTextHeader() {
        return "";
    }

    public boolean isImageOfFoodDisplayed(int n) {
        return false;
    }

    public boolean isTextFoodContain(int n, String text) {
        return false;
    }

    public HomePageHoa clickCalendarButton(int n) {
        return this;
    }

    public String getTitleHistoryScreen() {
        return "";
    }

    public HomePageHoa clickSupplementItem() {
        return this;
    }

    public HomePageHoa selectCheckBox(int n) {
        return this;
    }

    public HomePageHoa unselectCheckBox(int n) {
        return this;
    }

    public HomePageHoa clickMoreInfoButton(int n) {
        return this;
    }

    public String getTitleServingsSizeScreen(String text) {
        return "";
    }

    public HomePageHoa clickBackButtonOnServingsSizeScreen() {
        return this;
    }

    public boolean isNotHomepageDisplayed() {
        return false;
    }

    public String getTitleInfoMenuScreen() {
        return "";
    }

    public HomePageHoa clickTweaksButton() {
        return this;
    }

    public boolean isTweaksScreenDisplayed() {
        return false;
    }

    public HomePageHoa clickInfoMenuButton() {
        return this;
    }

    public boolean isInfoScreenDisplayed() {
        return false;
    }

    public HomePageHoa clickSettingsMenuButton() {
        return this;
    }

    public boolean isSettingsScreenDisplayed() {
        return false;
    }

    public HomePageHoa clickChartButton() {
        return this;
    }

    public boolean isServingsHistoryDisplayed() {
        return false;
    }
}
