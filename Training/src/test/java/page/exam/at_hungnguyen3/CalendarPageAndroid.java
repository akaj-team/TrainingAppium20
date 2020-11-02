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

    public CalendarPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextTitle() {
        return item.getText();
    }

    @Override
    public String getTextTime() {
        return time.getText();
    }

}
