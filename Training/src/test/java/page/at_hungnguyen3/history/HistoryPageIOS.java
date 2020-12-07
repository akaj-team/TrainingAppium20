package page.at_hungnguyen3.history;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

public class HistoryPageIOS extends HistoryPage {

    @iOSFindBy(id = "Info")
    private MobileElement info ;

    @iOSFindBy(className = "Settings")
    private MobileElement tvSettings ;

    @iOSFindBy(id = "Daily Dozen")
    private MobileElement tvBack;

    @iOSFindBy(className = "UIACollectionView")
    private MobileElement monthCollection;

    MobileElement item = actionBar.findElementByClassName("UIAStaticText");

    public HistoryPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("UIAStaticText")).getText();
    }

    @Override
    public HistoryPage clickBackButton() {
        tvBack.click();
        return this;
    }

    @Override
    public String getTextTime() {
        return monthCollection.findElements(By.className("UIAStaticText")).get(1).getText();
    }
}
