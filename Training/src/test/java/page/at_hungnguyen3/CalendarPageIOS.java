package page.exam.at_hungnguyen3;

import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import page.exam.HomePage;

import java.util.List;

public class CalendarPageIOS extends CalendarPage {

    String currentTime = getCurrentTime();

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

    public String getTimeText(){
        return monthList.get(1).getText();
    }

    public String getItemText(){
        return item.getText();
    }

    public boolean isCurrentTime() {
        String[] parts = currentTime.split("(?=-)");
        String month = parts[1];
        String year = parts[2];
        return  ((getTimeText().contains(month)) && (getTimeText().contains(year)));
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
}
