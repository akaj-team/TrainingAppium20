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

    @AndroidFindBy(xpath = "//*[@id='action_bar']/*[@class='android.widget.TextView']")
    @iOSFindBy(xpath = "//*[@class='UIANavigationBar']/*[@class='UIAStaticText']")
    private MobileElement titleHome;

    @AndroidFindBy(id = "food_history")
    @iOSFindBy(id = "ic calendar")
    List<MobileElement> listCalendar;

    @AndroidFindBy(id = "food_name")
    @iOSFindBy(xpath = "//*[@id='ic calendar']/parent::*//*[@XCElementType='XCUIElementTypeStaticText']")
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
        return isForElementPresent(actionBar);
    }

    @Override
    public HomePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public String getTextTitle() {
        return titleHome.getText();
    }

    public String getTextFoodName(int pos) {
        return listFoodName.get(pos).getText();
    }

    public HomePage clickMoreInfo(int pos){
        return this;
    }

    public HomePage scrollToElement(MobileElement element) {
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }
}
