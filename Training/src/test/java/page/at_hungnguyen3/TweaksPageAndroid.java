package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TweaksPageAndroid extends TweaksPage{

    public TweaksPageAndroid(MobileDriver driver) {
        super(driver);
    }

    public TweaksPage backKeyDevice() {
        AndroidDriver driver = (AndroidDriver) getDriver();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return this;
    }
}
