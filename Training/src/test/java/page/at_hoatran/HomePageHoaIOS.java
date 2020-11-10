package page.at_hoatran;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

/**
 * for screen
 *
 * @author at-hoa.tran
 */
public class HomePageHoaIOS extends HomePageHoa {

    @iOSFindBy(id = "ic stat")
    private MobileElement btnIcStat;

    @iOSFindBy(id = "Today")
    private MobileElement btnToday;

    @iOSFindBy(className = "UIAPicker")
    private MobileElement datePicker;

    @iOSFindBy(id = "suplement")
    private MobileElement suplement;

    @iOSFindBy(id = "21 Tweaks")
    private MobileElement btnTweaks;

    @iOSFindBy(id = "Info")
    private MobileElement btnInfo;

    @iOSFindBy(id = "Settings")
    private MobileElement btnSettings;

    @iOSFindBy(id = "ic stat")
    private MobileElement btnChart;

    @iOSFindBy(xpath = "//*[@knownSuperClass='UINavigationTransitionView']")
    private MobileElement navigationServing;

    @iOSFindBy(xpath = "//*[@XCElementType='XCUIElementTypeNavigationBar']")
    private MobileElement navbarServing;

    public HomePageHoaIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("UIAStaticText")).getText();
    }

    @Override
    public List<MobileElement> getListFoodName() {
        return listFood.findElements(By.className("UIAStaticText"));
    }

    @Override
    public HomePageHoa clickCalendarButton(int n) {
        listFood.findElements(By.id("ic calendar")).get(n).click();
        return this;
    }

    @Override
    public String getTitleHistoryScreen() {
        return actionBar.findElement(By.className("UIAStaticText")).getText();
    }

    @Override
    public HomePageHoa clickSupplementItem() {
        return this;
    }

    @Override
    public HomePageHoa selectCheckBox(int n) {
        return this;
    }

    @Override
    public HomePageHoa unselectCheckBox(int n) {
        return this;
    }

    @Override
    public HomePageHoa clickMoreInfoButton(int n) {
        listFood.findElements(By.id("More Info")).get(n).click();
        return this;
    }

    @Override
    public String getTitleServingsSizeScreen(String text) {
        return navigationServing.findElement(By.id(text)).getText();
    }

    @Override
    public boolean isNotHomepageDisplayed() {
        if (getTitle() == "Daily Dozen")
            return false;
        else
            return true;
    }

    @Override
    public String getTitleInfoMenuScreen() {
        return "";
    }

    @Override
    public HomePageHoa clickTweaksButton() {
        btnTweaks.click();
        return this;
    }

    @Override
    public boolean isTweaksScreenDisplayed() {
        String result = actionBar.findElement(By.className("UIAStaticText")).getText();
        if (result == "21 Tweaks")
            return true;
        else
            return false;
    }

    @Override
    public HomePageHoa clickInfoMenuButton() {
        btnInfo.click();
        return this;
    }

    @Override
    public boolean isInfoScreenDisplayed() {
        String result = actionBar.findElement(By.className("UIAStaticText")).getText();
        if (result == "Info")
            return true;
        else
            return false;
    }

    @Override
    public HomePageHoa clickSettingsMenuButton() {
        btnSettings.click();
        return this;
    }

    @Override
    public boolean isSettingsScreenDisplayed() {
        String result = actionBar.findElement(By.className("UIAStaticText")).getText();
        if (result == "Settings")
            return true;
        else
            return false;
    }

    @Override
    public HomePageHoa clickChartButton() {
        btnChart.click();
        return this;
    }

}
