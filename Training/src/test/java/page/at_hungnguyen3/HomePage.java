package page.at_hungnguyen3;
import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class HomePage extends BasePage {

    JavascriptExecutor jsExecutor;

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    private MobileElement actionBar;

    @AndroidFindBy(id = "food_history")
    @iOSFindBy(id = "ic calendar")
    List<MobileElement> listCalendar;

    @AndroidFindBy(id = "food_name")
    @iOSFindBy(xpath = "//*[@id='ic calendar']/preceding-sibling::*[1]")
    List<MobileElement> listFoodName;

    @AndroidFindBy(xpath = "//*[@text='Servings']")
    @iOSFindBy(id = "Servings")
    MobileElement tvServings;

    public HomePage clickBtnCalendar(int pos) {
        waitForElementDisplay(listCalendar.get(pos));
        listCalendar.get(pos).click();
        return this;
    }

    public HomePage (MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        waitForElementDisplay(tvServings);
        return isForElementPresent(tvServings);
    }

    @Override
    public HomePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            waitForElementDisplay(tvServings,5000);
        }
        return this;
    }

    public String getTextTitle() {
        return "";
    }

    public String getTextFoodName(int pos) {
        return listFoodName.get(pos).getText();
    }

    public HomePage clickMoreInfo(int pos) {
        return this;
    }

    public HomePage scrollToElement(MobileElement element) {
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }

    public String getTextTweaksMenu() {
        return "";
    }

    public boolean isTweaksMenuContainsText(String text) {
        return false;
    }

    public HomePage clickBtnTweaks() {
        return this;
    }

    public HomePage clickBtnAbout() {
        return this;
    }

    public boolean isAboutMenuDisplayed() {
        return false;
    }

}
