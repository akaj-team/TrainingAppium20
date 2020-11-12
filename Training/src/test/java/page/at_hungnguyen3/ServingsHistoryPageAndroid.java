package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class ServingsHistoryPageAndroid extends ServingsHistoryPage {

    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @AndroidFindBy(id = "time_scale_spinner")
    private MobileElement timeSpinner;

    @AndroidFindBy(className = "android.widget.CheckedTextView")
    List<MobileElement> listTimeSpinner;

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

    @Override
    public String getTextTitle() {
        waitForElementDisplay(actionBar.findElement(By.className("android.widget.TextView")));
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    @Override
    public ServingsHistoryPage clickBackButton() {
        waitForElementDisplay(actionBar.findElement(By.className("android.widget.ImageButton")));
        actionBar.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }

    @Override
    public ServingsHistoryPage clickTimeSpinner() {
        waitForElementDisplay(timeSpinner);
        timeSpinner.click();
        return this;
    }

    @Override
    public boolean isListTimeSpinnerDisplayed() {
        waitForElementDisplay(listTimeSpinner.get(0),5000);
        return !listTimeSpinner.isEmpty();
    }
}

