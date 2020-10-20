package page.at_hoatran;

import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import page.exam.HomePage;

public class InfoPageAndroid extends HomePage {
    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @AndroidFindBy(className = "android.widget.ListView")
    private MobileElement listTitle;

    @AndroidFindBy(id="url_bar")
    private MobileElement urlBar;

    public InfoPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(listTitle.findElement(By.xpath("//*[@text='Latest Videos']")));
    }

    public HomePage openInfoScreen(){
        HomePage homePage = new PageFactory<>(HomePage.class).create();
        homePage.openInfoPageAndroid();
        return this;
    }

    public InfoPageAndroid clickMoreOptionsButton() {
        actionBar.findElement(By.className("android.widget.ImageView")).click();
        return this;
    }

    public String getTitle(int n) {
       return listTitle.findElements(By.id("title")).get(n-1).getText();
    }

    public InfoPageAndroid clickTitleButton(int n) {
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
