package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import page.at_hungnguyen3.InfoPage;

public class InfoPageIOS extends InfoPage {

    @iOSFindBy(className = "UIANavigationBar")
    private MobileElement actionBar;

    public InfoPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public InfoPage clickBtnBackToHome() {
        waitForElementDisplay(actionBar.findElement(By.className("UIAButton")),5000);
        actionBar.findElement(By.className("UIAButton")).click();
        return this;
    }

    @Override
    public InfoPage clickVideoButton() {
        waitForElementDisplay(actionBar.findElement(By.id("VIDEOS")),5000);
        actionBar.findElement(By.id("VIDEOS")).click();
        return this;
    }
}
