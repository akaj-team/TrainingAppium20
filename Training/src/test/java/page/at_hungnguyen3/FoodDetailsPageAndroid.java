package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class FoodDetailsPageAndroid extends FoodDetailsPage {

    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @AndroidFindBy(xpath = "//*[@id='action_bar']/*[@class='android.widget.TextView']")
    private MobileElement tvTitle;

    @AndroidFindBy(id = "food_info_videos")
    private MobileElement btnVideo;


    @AndroidFindBy(id = "text1")
    List<MobileElement> listServings;

    @AndroidFindBy(id = "food_name")
    List<MobileElement> listTypes;

    public FoodDetailsPageAndroid(MobileDriver driver) {
        super(driver);
    }

    public FoodDetailsPage backKeyDevice() {
        AndroidDriver driver = (AndroidDriver) getDriver();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return this;
    }

    @Override
    public FoodDetailsPage clickBtnBackToHome() {
        waitForElementDisplay(actionBar.findElement(By.className("android.widget.ImageButton")), 5000);
        actionBar.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }

    @Override
    public FoodDetailsPage clickVideoButton() {
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

    @Override
    public String getTextTitle() {
        waitForElementDisplay(tvTitle);
        return tvTitle.getText();
    }
}
