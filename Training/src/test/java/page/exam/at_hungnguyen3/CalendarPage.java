package page.exam.at_hungnguyen3;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import page.exam.HomePage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarPage extends BasePage {
    @AndroidFindBy(className = "android.widget.ImageButton")
    @iOSFindBy(className = "UIAButton")
    private MobileElement back ;

    @AndroidFindBy(xpath = "//*[@id='action_bar']//*[@class='android.widget.TextView']")
    @iOSFindBy(xpath = "//*[@XCElementType='XCUIElementTypeNavigationBar']/*[@class='UIAStaticText']")
    private MobileElement item ;

    @AndroidFindBy(xpath = "//*[@text='History']")
    @iOSFindBy(id = "History")
    private MobileElement history ;

    @AndroidFindBy(id = "month_name")
    @iOSFindBy(xpath = "//*[@x='322']")
    private MobileElement time ;

    @AndroidFindBy(xpath = "//*[@text='Some servings']")
    @iOSFindBy(xpath = "//*[@text='Some servings']")
    private MobileElement someServings ;

    @AndroidFindBy(xpath = "//*[@text='All servings']")
    @iOSFindBy(xpath = "//*[@text='All servings']")
    private MobileElement allServings ;

    public CalendarPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(history);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()){
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.open();}
        return null;
    }

    public CalendarPage clickBackButton(){
        waitForElementDisplay(back);
        back.click();
        return this;
    }

    public String getItemText(){
        waitForElementDisplay(item);
        return item.getText();
    }

    public boolean isHistoryDisplay(){
        return isForElementPresent(history);
    }

    public String getTime(){
        waitForElementDisplay(time);
        return time.getText();
    }

    public String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
        String strDate = formatter.format(date);
        return strDate;
    }

    public boolean isCurrentTime(){
        String currentTime = getCurrentTime();
        String[] parts = currentTime.split("(?=-)");
        String month = parts[1];
        String year = parts[2];
        if ((currentTime.contains(month)) && (currentTime.contains(month))){

            return true;
        }
        else {
            return false;
        }
    }
}

