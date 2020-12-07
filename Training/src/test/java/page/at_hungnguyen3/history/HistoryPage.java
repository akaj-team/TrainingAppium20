package page.at_hungnguyen3.history;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import page.at_hungnguyen3.home.HomePage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class HistoryPage extends BasePage {

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement actionBar;
    @AndroidFindBy(xpath = "//*[@text='History']")
    @iOSFindBy(id = "History")
    private MobileElement tvHistory;

    public HistoryPage(MobileDriver driver) {
        super(driver);
    }

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(6);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(tvHistory);
    }

    @Override
    public HistoryPage open() {
        if (!isPageDisplayed()) {
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

    public String getCurrentTimeFollowFormatMMYY() {
        String currentTime = getCurrentTime();
        String[] parts = currentTime.split("(?=-)");
        String month = parts[1].substring(1);
        String year = parts[2].substring(1);
        return month + " " + year;
    }

    public String getTextTime() {
        return "";
    }
}
