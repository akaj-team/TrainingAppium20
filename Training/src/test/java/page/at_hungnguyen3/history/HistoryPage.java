package page.at_hungnguyen3.history;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import page.at_hungnguyen3.home.HomePage;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;

public class HistoryPage extends BasePage {

    String currentTime = getCurrentTime();

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement actionBar;

    @AndroidFindBy(xpath = "//*[@text='History']")
    @iOSFindBy(id = "History")
    private MobileElement tvHistory;

    public HistoryPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(tvHistory);
    }

    @Override
    public HistoryPage open() {
        if(!isPageDisplayed()){
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.open().clickCalendarButton(randomNumber());
            waitForElementDisplay(tvHistory);
        }
        return this;
    }

    public String getTitle() {
        return "";
    }

    public HistoryPage clickBackButton() {
        return this;
    }

    public HistoryPage waitForPageDisplayed() {
        waitForElementDisplay(tvHistory);
        return this;
    }

    public static int randomNumber(){
        Random random = new Random();
        return random.nextInt(6);
    }

    public HistoryPage swipeToTheLeft() {
        swipeLeft();
        return this;
    }

    public HistoryPage swipeToTheRight() {
        swipeRight();
        return this;
    }

    public String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
        String strDate = formatter.format(date);
        return strDate;
    }

    public boolean isCurrentTime() {
        String[] parts = currentTime.split("(?=-)");
        String month = parts[1];
        String year = parts[2];
        return ((getTextTime().contains(month)) && (getTextTime().contains(year)));
    }

    public String getTextTime(){
        return "";
    }
}
