package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

public class FoodDetailsPageIOS extends FoodDetailsPage {

    @iOSFindBy(className = "UIANavigationBar")
    private MobileElement actionBar;

    public FoodDetailsPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public FoodDetailsPage clickBtnBackToHome() {
        waitForElementDisplay(actionBar.findElement(By.className("UIAButton")),5000);
        actionBar.findElement(By.className("UIAButton")).click();
        return this;
    }

    @Override
    public FoodDetailsPage clickVideoButton() {
        waitForElementDisplay(actionBar.findElement(By.id("VIDEOS")),5000);
        actionBar.findElement(By.id("VIDEOS")).click();
        return this;
    }
}
