package page.at_hadang;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

/**
 * for Home screen
 *
 * @author at-ha.dang
 */

public class HomePage extends BasePage {
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(xpath = "//*[@accessibilityLabel='Daily Dozen']")
    private MobileElement actionBar;

    @AndroidFindBy(className = "//*[@text='Daily Dozen']")
    @iOSFindBy(xpath = "//*[@text='Daily Dozen' and @class='UIAStaticText']")
    private MobileElement txtTitle;

    @AndroidFindBy(id = "menu_toggle_modes")
    @iOSFindBy(xpath = "//*[@text='21 Tweaks']")
    private MobileElement btn21Tweaks;

    @AndroidFindBy(className = "android.widget.ImageView")
    @iOSFindBy(xpath = "//*[@text='Info']")
    private MobileElement btnInfoMenu;

    @AndroidFindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@id='food_icon'] and ./*]")
    @iOSFindBy(className = "UIAView")
    protected List<MobileElement> lstFoodServings;

    @AndroidFindBy(id = "food_name")
    @iOSFindBy(className = "UIAStaticText")
    private List<MobileElement> lstFoodName;

    @AndroidFindBy(id = "food_name")
    @iOSFindBy(xpath = "//*[@text='More Info']")
    private List<MobileElement> lstBtnMoreInfo;

    @AndroidFindBy(id = "food_history")
    @iOSFindBy(xpath = "//*[@text='ic calendar']")
    private List<MobileElement> lstBtnCalendar;

    public HomePage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public BasePage open() {
        return this;
    }

    public String getTextTitle() {
        waitForElementDisplay(txtTitle);
        return txtTitle.getText();
    }

    public final void click21TweaksButton() {
        waitForElementDisplay(btn21Tweaks);
        btn21Tweaks.click();
    }

    public final void clickInfoMenuButton() {
        waitForElementDisplay(btnInfoMenu);
        btnInfoMenu.click();
    }

    public final boolean verifyLstFoodName(String name) {
        int i = 0;
        for (MobileElement elementServings : lstFoodName) {
            String foodName = elementServings.getText().trim();
            scrollToElementContainText(foodName);
            if (foodName == name) {
                i++;
                if (i <= lstFoodName.size()) ;
                return true;
            }
        }
        return false;
    }

    protected void scrollToElementContainText(String foodName) {
    }

    public final void clickInfoIcon() {
        for (int i = 0; i < lstBtnMoreInfo.size(); i++) {
            lstBtnMoreInfo.get(i).click();
        }
    }

    public final void clickCalendarButton() {
        for (int i = 0; i <= lstBtnCalendar.size(); i++) {
            lstBtnCalendar.get(i).click();
        }
    }

    public final void clickMoreInfoButtonOfVitaminB12(){
        lstBtnMoreInfo.get(12).click();
    }
}
