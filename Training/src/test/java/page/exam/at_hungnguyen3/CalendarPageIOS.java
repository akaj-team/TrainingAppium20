package page.exam.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class CalendarPageIOS extends CalendarPage {

    @iOSFindBy(xpath = "//*[@knownSuperClass='UITabBarButton']")
    private MobileElement dailyDozen ;

    @iOSFindBy(id = "Info")
    private MobileElement info ;

    @iOSFindBy(className = "Settings")
    private MobileElement settings ;

    public CalendarPageIOS(MobileDriver driver) {
        super(driver);
    }

    public CalendarPageIOS clickDailyDozenButton(){
        waitForElementDisplay(dailyDozen);
        dailyDozen.click();
        return this;
    }

    public CalendarPageIOS clickInfoButton(){
        waitForElementDisplay(info);
        info.click();
        return this;
    }

    public CalendarPageIOS clickSettingsButton(){
        waitForElementDisplay(settings);
        settings.click();
        return this;
    }
}
