package page.exam.at_hungnguyen3;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class HomePage extends BasePage {
    JavascriptExecutor jsExecutor;
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    private MobileElement actionBar;

    @AndroidFindBy(xpath = "//*[@class='androidx.appcompat.widget.LinearLayoutCompat']/preceding-sibling::*")
    @iOSFindBy(xpath = "//*[@class='UIANavigationBar']//child::*")
    private MobileElement titleHome;

    @AndroidFindBy(id = "food_history")
    @iOSFindBy(id = "ic calendar")
    List<MobileElement> listCalendar;

    @AndroidFindBy(id = "food_name")
    @iOSFindBy(xpath = "//*[@id='ic calendar']/parent::*/*[@class='UIAStaticText']")
    List<MobileElement> listFoodName;

    @AndroidFindBy(xpath = "//*[@text='Servings']")
    @iOSFindBy(id = "Servings")
    MobileElement tvServings;

    @AndroidFindBy(id = "menu_toggle_modes")
    @iOSFindBy(xpath = "//*[@class='UIATabBar']/child::*[2]")
    MobileElement tweaksMenu;

    public HomePage clickBtnCalendar(int pos) {
        waitForElementDisplay(listCalendar.get(pos));
        listCalendar.get(pos).click();
        return this;
    }

    public HomePage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        waitForElementDisplay(titleHome);
        return isForElementPresent(titleHome);
    }

    public boolean isTvServingsDisplayed(){
        waitForElementDisplay(tvServings);
        return isForElementPresent(tvServings);
    }
    @Override
    public HomePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            waitForElementDisplay(tvServings);
        }
        return this;
    }

    public String getTextTitle() {
        waitForElementDisplay(titleHome);
        return titleHome.getText();
    }

    public String getTextFoodName(int pos) {
        return listFoodName.get(pos).getText();
    }

    public HomePage clickMoreInfo(int pos){
        waitForElementDisplay(listFoodName.get(pos));
        listFoodName.get(pos).click();
        return this;
    }

    public HomePage scrollToElement(MobileElement element) {
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }

    public String getTextTweaksMenu() {
        waitForElementDisplay(tweaksMenu);
        return tweaksMenu.getText();
    }

    public boolean isTweaksMenuContainsText(String text){
        waitForElementDisplay(tvServings);
        return getTextTweaksMenu().contains(text);
    }

    public HomePage clickBtnTweaks() {
        waitForElementDisplay(tweaksMenu);
        tweaksMenu.click();
        return this;
    }

}
