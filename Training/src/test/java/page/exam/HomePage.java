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
    @AndroidFindBy(id = "Daily Dozen")
    @iOSFindBy(id = "Daily Dozen")
    private MobileElement titleLabel;

    @AndroidFindBy(id = "menu_toggle_modes")
    private MobileElement tvMenuToggleModes;

    @iOSFindBy(className = "UIATable")
    @AndroidFindBy(className = "android.widget.ListView")
    private MobileElement listMenu;

    @iOSFindBy(id = "Settings")
    private MobileElement settingButton;

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
            waitForElementDisplay(titleLabel);
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
        settingButton.click();
    }

    public String getTextTvMenuToggleModes() {
        return tvMenuToggleModes.getText();
    }

    public boolean isListMenuDisplay() {
        return isForElementPresent(listMenu);
    }

    public boolean isContentTvMenuToggleModesContain(String text) {
        return getTextTvMenuToggleModes().contains(text);
    }
}
