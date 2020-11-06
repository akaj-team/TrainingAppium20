package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class ServingsHistoryPageAndroid extends ServingsHistoryPage {

    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    public ServingsHistoryPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        waitForElementDisplay(actionBar.findElement(By.className("android.widget.TextView")),5000);
        return isForElementPresent(actionBar.findElement(By.className("android.widget.TextView")));
    }

    public ServingsHistoryPage backKeyDevice() {
        AndroidDriver driver = (AndroidDriver) getDriver();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return this;
    }
}
