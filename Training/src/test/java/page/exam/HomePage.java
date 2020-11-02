package page.exam;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class HomePage extends BasePage {

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIATabBar")
    private MobileElement actionBar;

    @AndroidFindBy(id = "menu_toggle_modes")
    private MobileElement tvMenuToggleModes;

    @iOSFindBy(className = "UIATable")
    @AndroidFindBy(className = "android.widget.ListView")
    private MobileElement listMenu;

    @iOSFindBy(id = "Settings")
    private MobileElement settingButton;

    @iOSFindBy(id = "ic stat")
    private MobileElement statButton;

    public HomePage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(titleLabel);
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
        return titleLabel.getText();
    }

    public HomePage clickMenuButton() {
//        actionBar.findElement(By.className("android.widget.ImageView")).click();
        return this;
    }

    public void moveToDetail() {
        listMenu.findElements(By.id("food_name")).get(6).click();
    }

    public String getTextTvMenuToggleModes() {
        return tvMenuToggleModes.getText();
    }

    public void clickStatButton(){ statButton.click(); }

    public boolean isListMenuDisplay() {
        return isForElementPresent(listMenu);
    }

    public boolean isContentTvMenuToggleModesContain(String text) {
        return getTextTvMenuToggleModes().contains(text);
    }
}
