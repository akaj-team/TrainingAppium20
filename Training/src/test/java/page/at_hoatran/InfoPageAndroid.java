package page.at_hoatran;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class InfoPageAndroid extends InfoPage {

    @AndroidFindBy(id = "url_bar")
    private MobileElement urlBar;

    public InfoPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle(int n) {
        return listTitle.findElements(By.id("title")).get(n-1).getText();
    }

    @Override
    public InfoPage clickTitleButton(int n) {
        listTitle.findElements(By.id("title")).get(n-1).click();
        return this;
    }

    // BACK button of Android
    public InfoPageAndroid backKeyDevice() {
        AndroidDriver driver = (AndroidDriver) getDriver();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return this;
    }
}
