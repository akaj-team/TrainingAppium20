package page.exam.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class CalendarPageIOS extends CalendarPage {

    @iOSFindBy(className = "UIATabBar")
    private MobileElement tabBar ;

    @iOSFindBy(id = "Info")
    private MobileElement info ;

    @iOSFindBy(className = "Settings")
    private MobileElement settings ;

    MobileElement item = actionBar.findElementByClassName("UIAStaticText");

    MobileElement dailyDozenButton = tabBar.findElementById("Daily Dozen");

    MobileElement monthCollection = (MobileElement) getDriver().findElement(By.className("UIACollectionView"));

    List<MobileElement> monthList = monthCollection.findElements(By.className("UIAStaticText"));

    public CalendarPageIOS(MobileDriver driver) {
        super(driver);
    }

    public CalendarPageIOS clickDailyDozenButton(){
        waitForElementDisplay(dailyDozenButton);
        dailyDozenButton.click();
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

    @Override
    public String getTextTitle() {
        return item.getText();
    }

    @Override
    public String getTextTime() {
        return monthList.get(1).getText();
    }

}
