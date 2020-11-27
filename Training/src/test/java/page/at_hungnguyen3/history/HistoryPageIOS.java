package page.at_hungnguyen3.history;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

public class HistoryPageIOS extends HistoryPage {

    @iOSFindBy(id = "Daily Dozen")
    private MobileElement tvBack;

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
}
