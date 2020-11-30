package page.at_hungnguyen3.info;


import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import page.at_hungnguyen3.history.HistoryPage;

import java.util.List;

public class InfoPageAndroid extends InfoPage {

    public InfoPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public List<MobileElement> getListItem() {
        return listTitle.findElements(By.id("title"));
    }

    @Override
    public InfoPage clickBackButton() {
        backKeyDevice();
        return this;
    }

    public InfoPage backKeyDevice() {
        AndroidDriver driver = (AndroidDriver) getDriver();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return this;
    }
}