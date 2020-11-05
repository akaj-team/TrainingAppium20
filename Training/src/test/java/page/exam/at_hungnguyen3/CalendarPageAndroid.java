package page.exam.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalendarPageAndroid extends CalendarPage {

    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @AndroidFindBy(id = "month_name")
    private MobileElement time;

    @AndroidFindBy(id = "previous")
    private MobileElement previous;

    @AndroidFindBy(id = "next")
    private MobileElement next;

    MobileElement item = actionBar.findElementByClassName("android.widget.TextView");

    public CalendarPage clickToNextButton() {
        waitForElementDisplay(next);
        next.click();
        return this;
    }

    public CalendarPage clickToPreviousButton() {
        waitForElementDisplay(previous);
        previous.click();
        return this;
    }

    @Override
    public CalendarPage clickDailyDozenButton() {
        return clickBtnBack();
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