package page.exam.at_hungnguyen3;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import page.exam.HomePage;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarPage extends BasePage {
    Actions action;
    JavascriptExecutor jsExecutor;

    @AndroidFindBy(className = "android.widget.ImageButton")
    @iOSFindBy(className = "UIAButton")
    private MobileElement back;

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement actionBar;

    @AndroidFindBy(xpath = "//*[@id='action_bar']//*[@class='android.widget.TextView']")
    @iOSFindBy(xpath = "//*[@className = 'UIANavigationBar']/*[@class='UIAStaticText']")
    private MobileElement item;

    @AndroidFindBy(xpath = "//*[@text='History']")
    @iOSFindBy(id = "History")
    private MobileElement history;

    @AndroidFindBy(xpath = "//*[@text='Some servings']")
    @iOSFindBy(xpath = "//*[@text='Some servings']")
    private MobileElement someServings;

    @AndroidFindBy(xpath = "//*[@text='All servings']")
    @iOSFindBy(xpath = "//*[@text='All servings']")
    private MobileElement allServings;

    public CalendarPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(history);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.open();
        }
        return null;
    }

    public CalendarPage clickBackButton() {
        waitForElementDisplay(back);
        back.click();
        return this;
    }

    public String getItemText() {
        waitForElementDisplay(item);
        return item.getText();
    }

    public boolean isHistoryDisplay() {
        return isForElementPresent(history);
    }

    public String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
        String strDate = formatter.format(date);
        return strDate;
    }

    public void isItemCorrect(){
        String itemText = this.getItemText();
        this.clickBackButton();
        HomePage homePage = new PageFactory<>(HomePage.class).create();
        homePage.waitForElementDisplay(actionBar);
        MobileElement itemToClick = (MobileElement) getDriver().findElement(By.xpath(getItemText()));
        scrollToElement(itemToClick);
        itemToClick.click();
        Assert.assertEquals(getItemText(), itemText);
    }

    public void scrollToElement(MobileElement element) {
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

