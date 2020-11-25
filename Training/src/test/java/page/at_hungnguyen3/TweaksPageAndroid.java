package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import java.util.List;

public class TweaksPageAndroid extends TweaksPage{

    @AndroidFindBy(id = "title")
    List<MobileElement> listAbout;

    MobileElement actionBar = (MobileElement) getDriver().findElementById("action_bar");

    List<MobileElement> listActionBar = actionBar.findElements(By.className("android.widget.TextView"));

    public TweaksPageAndroid(MobileDriver driver) {
        super(driver);
    }

    public TweaksPage backKeyDevice() {
        AndroidDriver driver = (AndroidDriver) getDriver();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return this;
    }

    @Override
    public String getTextTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    @Override
    public boolean isPageDisplayed() {
        waitForElementDisplay(listActionBar.get(0),5000);
        return isForElementPresent(listActionBar.get(0));
    }

    @Override
    public TweaksPage clickBtnAbout() {
        waitForElementDisplay(actionBar.findElement(By.className("android.widget.ImageView")),5000);
        actionBar.findElement(By.className("android.widget.ImageView")).click();
        return this;
    }

    @Override
    public boolean isAboutMenuDisplayed() {
        waitForElementDisplay(listAbout.get(0),5000);
        return isForElementPresent(listAbout.get(0));
    }

}
