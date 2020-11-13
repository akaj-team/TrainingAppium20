package page.exam.at_thaile;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

import java.util.List;

/**
 * for screen
 *
 * @author at-thaile
 */

public class HomePage extends BasePage {

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIATabBar")
    private MobileElement actionBar;

    @AndroidFindBy(id = "menu_toggle_modes")
    private MobileElement tvMenuToggleModes;

    @iOSFindBy(className = "UIATable")
    @AndroidFindBy(className = "android.view.View")
    public MobileElement listMenu;

    @iOSFindBy(id = "Settings")
    private MobileElement btnSetting;

    @iOSFindBy(id = "ic stat")
    @AndroidFindBy(className = "android.widget.TextView")
    private MobileElement btnStat;

    @iOSFindBy(id = "More Info")
    @AndroidFindBy(id = "food_name")
    private MobileElement btnMoreDetails;

    @iOSFindBy(id = "ic calendar")
    @AndroidFindBy(id = "food_history")
    private MobileElement btnCalendar;

    @AndroidFindBy(className = "android.widget.LinearLayout")
    private MobileElement btnFood;

    public HomePage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public HomePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            waitForElementDisplay(actionBar);
        }
        return this;
    }

    public String getTextTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    public HomePage clickFoodName(int n) {
        return this;
    }

    public HomePage clickMenuButton() {
        actionBar.findElement(By.className("android.widget.ImageView")).click();
        return this;
    }

    public void moveToDetail() {
        listMenu.findElements(By.id("food_name")).get(6).click();
    }

    public String getTextTvMenuToggleModes() {
        return tvMenuToggleModes.getText();
    }

    public void clickStatButton() {
        btnStat.click();
    }

    public boolean isListMenuDisplay() {
        return isForElementPresent(listMenu);
    }

    public boolean isContentTvMenuToggleModesContain(String text) {
        return getTextTvMenuToggleModes().contains(text);
    }

    public void clickMoreInfoButton() {
        btnMoreDetails.click();
    }

    public void clickCalendarButton() {
        btnCalendar.click();
    }

}
