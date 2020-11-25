package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

public class ServingsHistoryPageIOS extends ServingsHistoryPage{

    @iOSFindBy(className = "UIANavigationBar")
    MobileElement actionBar;

    public ServingsHistoryPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        waitForElementDisplay(actionBar.findElement(By.className("UIAStaticText")),5000);
        return isForElementPresent(actionBar.findElement(By.className("UIAStaticText")));
    }

    @Override
    public String getTextTitle() {
        waitForElementDisplay(actionBar.findElement(By.id("Servings History")));
        return actionBar.findElement(By.id("Servings History")).getText();
    }

    @Override
    public ServingsHistoryPage clickBackButton() {
        waitForElementDisplay(actionBar.findElement(By.id("Daily Dozen")));
        actionBar.findElement(By.id("Daily Dozen")).click();
        return this;
    }
}
