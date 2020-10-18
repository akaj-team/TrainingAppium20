package page.exam.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class CalendarPageAndroid extends CalendarPage{

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

    public CalendarPageAndroid(MobileDriver driver) {
        super(driver);
    }

}
