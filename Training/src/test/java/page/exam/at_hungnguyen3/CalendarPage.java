package page.exam.at_hungnguyen3;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import page.exam.HomePage;
import java.text.SimpleDateFormat;
import java.time.Duration;
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
    public CalendarPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.open().clickCalendarButton();
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

    public CalendarPage swipeToTheLeft(AppiumDriver driver){
        Dimension dimension = driver.manage().window().getSize();
        int startY = (dimension.height / 2);
        int startX = (int) (dimension.width * 0.05);
        int endX = (int) (dimension.width * 0.90);
        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
        return this;
    }

    public CalendarPage swipeToTheRight(AppiumDriver driver){
        Dimension dimension = driver.manage().window().getSize();
        int startY = (int) (dimension.height / 2);
        int startX = (int) (dimension.width * 0.90);
        int endX = (int) (dimension.width * 0.05);
        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
        return this;
    }
}

