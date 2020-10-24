package page.exam.at_hungnguyen3;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import page.exam.HomePage;

import java.util.List;

public class CalendarPageAndroid extends CalendarPage{

    String currentTime = getCurrentTime();

    @AndroidFindBy(id = "month_name")
    private MobileElement time;

    @AndroidFindBy(id = "previous")
    private MobileElement previous;

    @AndroidFindBy(id = "next")
    private MobileElement next;

    private MobileElement item = actionBar.findElementByClassName("android.widget.TextView");

    public CalendarPageAndroid clickToNextButton(){
        waitForElementDisplay(next);
        next.click();
        return this;
    }

    public CalendarPageAndroid clickToPreviousButton(){
        waitForElementDisplay(previous);
        previous.click();
        return this;
    }

    public String getItemText() {
        waitForElementDisplay(item);
        return item.getText();
    }

    public String getTimeText() {
        waitForElementDisplay(time);
        return time.getText();
    }

    public boolean isCurrentTime() {
        String[] parts = currentTime.split("(?=-)");
        String month = parts[1];
        String year = parts[2];
        if ((getTimeText().contains(month)) && (getTimeText().contains(year))) {
            return true;
        } else {
            return false;
        }
    }

    public void isItemCorrect(){
        clickBackButton();
        HomePage homePage = new PageFactory<>(HomePage.class).create();
        homePage.waitForElementDisplay(actionBar);
        int pos = 0;
        String itemListText = listItem.get(pos).getText();
        listItem.get(pos).click ;
        scrollToElement(itemToClick);
        listItem.get(pos).click();
        Assert.assertEquals(getItemText(),getItemText());
        pos++;
    }

    public CalendarPageAndroid(MobileDriver driver) {
        super(driver);
    }
}
