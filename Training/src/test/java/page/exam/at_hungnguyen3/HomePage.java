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
    @iOSFindBy(xpath = "//*[@class='UIANavigationBar']/child::*")
    private MobileElement titleHome;

    @AndroidFindBy(id = "food_history")
    @iOSFindBy(id = "ic calendar")
    List<MobileElement> listCalendar;

    @AndroidFindBy(id = "food_name")
    @iOSFindBy(xpath = "//*[@id='ic calendar']/parent::*/*[@class='UIAStaticText']")
    List<MobileElement> listFoodName;

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

    @Override
    public HomePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            waitForElementDisplay(titleHome);
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

    public String getTextTweaksMenu(){
        return "";
    }

    public boolean isTweaksMenuContainsText(String text){
        return getTextTweaksMenu().contains(text);
    }

    public HomePage clickBtnTweaks(){return this;}

}
