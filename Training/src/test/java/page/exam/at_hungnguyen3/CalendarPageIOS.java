package page.exam.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import java.util.List;

public class CalendarPageIOS extends CalendarPage {

    private final MobileElement monthCollection = (MobileElement) getDriver().findElement(By.className("UIACollectionView"));

   List<MobileElement> monthList = monthCollection.findElements(By.className("UIAStaticText"));

    @iOSFindBy(className = "UIATabBar")
    private MobileElement tabBar ;

    @iOSFindBy(id = "Info")
    private MobileElement info ;

    @iOSFindBy(className = "Settings")
    private MobileElement settings ;

    private final MobileElement dailyDozen = tabBar.findElement(By.id("Daily Dozen"));

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

    public String getTime(){
        return monthList.get(1).getText();
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
}
