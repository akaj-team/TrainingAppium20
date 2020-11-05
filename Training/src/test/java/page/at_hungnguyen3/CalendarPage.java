package page.at_hungnguyen3;

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
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import page.HomePage;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class CalendarPage extends BasePage {
    JavascriptExecutor jsExecutor;
    String currentTime = getCurrentTime();

    @AndroidFindBy(className = "android.widget.ImageButton")
    @iOSFindBy(className = "UIAButton")
    private MobileElement btnBack;

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement actionBar;

    @AndroidFindBy(xpath = "//*[@text='History']")
    @iOSFindBy(id = "History")
    private MobileElement tvHistory;

    @AndroidFindBy(xpath = "//*[@text='Some servings']")
    @iOSFindBy(xpath = "//*[@text='Some servings']")
    private MobileElement tvSomeServings;

    @AndroidFindBy(xpath = "//*[@text='All servings']")
    @iOSFindBy(xpath = "//*[@text='All servings']")
    private MobileElement tvAllServings;

    public CalendarPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(tvHistory);
    }

    @Override
    public CalendarPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.open();
        }
        return this;
    }

    public CalendarPage clickBtnBackButton() {
        waitForElementDisplay(btnBack);
        btnBack.click();
        return this;
    }

    public boolean isHistoryDisplay() {
        return isForElementPresent(tvHistory);
    }

    public String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
        String strDate = formatter.format(date);
        return strDate;
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

    public String getTextTitle(){
        return "";
    }

    public String getTextTime(){
        return "";
    }

    public boolean isCurrentTime(){
        String[] parts = currentTime.split("(?=-)");
        String month = parts[1];
        String year = parts[2];
        return  ((getTextTime().contains(month)) && (getTextTime().contains(year)));
    }

}

