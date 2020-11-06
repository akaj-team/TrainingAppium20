package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class InfoPageAndroid extends InfoPage {

    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @AndroidFindBy(id = "food_info_videos")
    private MobileElement btnVideo;

    @AndroidFindBy(id = "text1")
    List<MobileElement> listServings;

    @AndroidFindBy(id = "food_name")
    List<MobileElement> listTypes;

    public InfoPageAndroid(MobileDriver driver) {
        super(driver);
    }

    public InfoPage backKeyDevice() {
        AndroidDriver driver = (AndroidDriver) getDriver();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return this;
    }

    @Override
    public InfoPage clickBtnBackToHome() {
        waitForElementDisplay(actionBar.findElement(By.className("android.widget.ImageButton")), 5000);
        actionBar.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }

    @Override
    public InfoPage clickVideoButton() {
        waitForElementDisplay(btnVideo, 5000);
        btnVideo.click();
        return this;
    }

    @Override
    public int getSizeOfServing() {
        waitForElementDisplay(listServings.get(0), 5000);
        return listServings.size();
    }

    @Override
    public int getSizeOfTypes() {
        waitForElementDisplay(listTypes.get(0));
        return listTypes.size();
    }
}
