package page.exam.at_hungnguyen3;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalendarPageAndroid extends CalendarPage{

    @AndroidFindBy(id = "month_name")
    private MobileElement time;

    @AndroidFindBy(id = "previous")
    private MobileElement previous;

    @AndroidFindBy(id = "next")
    private MobileElement next;

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

    public String getTime() {
        waitForElementDisplay(time);
        return time.getText();
    }

    public boolean isCurrentTime() {
        String currentTime = getCurrentTime();
        String[] parts = getTime().split("(?=-)");
        String month = parts[1];
        String year = parts[2];
        if ((currentTime.contains(month)) && (currentTime.contains(year))) {
            return true;
        } else {
            return false;
        }
    }

    public CalendarPageAndroid(MobileDriver driver) {
        super(driver);
    }
}
