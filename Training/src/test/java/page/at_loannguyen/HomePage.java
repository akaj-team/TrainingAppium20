package page.at_loannguyen;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import sun.jvmstat.monitor.event.HostEvent;

import java.util.List;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class HomePage extends BasePage {
    @iOSFindBy(className = "UIANavigationBar")
    @AndroidFindBy(id = "action_bar")
    public MobileElement actionBar;

    @iOSFindBy(id = "21 Tweaks")
    @AndroidFindBy(id = "menu_toggle_modes")
    private MobileElement tvMenuToggleModes;

    @iOSFindBy(id ="Servings" )
    @AndroidFindBy(id = "header")
    private MobileElement tvServings;

    @iOSFindBy(id = "ic calendar")
    @AndroidFindBy(id = "food_history")
    List<MobileElement> btnCalendar;

    @iOSFindBy(className = "UIAView")
    @AndroidFindBy(id = "food_name")
    List<MobileElement> tvListMenu;

    public HomePage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(tvMenuToggleModes);
    }

    @Override
    public HomePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            waitForElementDisplay(tvMenuToggleModes);
        }
        return this;
    }

    public String getTitle(){
        return "";
    }

    public String getTextTvMenuToggleModes() {
        return tvMenuToggleModes.getText();
    }

    public boolean isContentTvMenuToggleModesContain(String text) {
        return getTextTvMenuToggleModes().contains(text);
    }

    public String getTextServings(){
        return tvServings.getText();
    }

    public HomePage clickButtonCalendar(int pos){
        btnCalendar.get(pos).click();
        return this;
    }

    public HomePage clickButtonTweaks(){
        tvMenuToggleModes.click();
        return this;
    }

    public HomePage getNameOfListMenu(int pos){
        tvListMenu.get(pos).getText();
        return this;
    }
}
