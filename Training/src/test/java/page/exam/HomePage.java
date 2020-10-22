package page.exam;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class HomePage extends BasePage {
    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @AndroidFindBy(id = "menu_toggle_modes")
    private MobileElement tvMenuToggleModes;

    @AndroidFindBy(className = "android.widget.ListView")
    private MobileElement listMenu;

    public HomePage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {

        return isForElementPresent(actionBar);
    }
    HomePage homePage = new PageFactory<>(HomePage.class).create();

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }
    public String getTextTitle() {

        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }
    public HomePage clickMenuButton() {
        actionBar.findElement(By.className("android.widget.ImageView")).click();
        return this;
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
