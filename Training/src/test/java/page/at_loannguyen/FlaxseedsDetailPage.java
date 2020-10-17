package page.at_loannguyen;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import page.exam.HomePage;

public class FlaxseedsDetailPage extends BasePage {

    @AndroidFindBy(className = "android.widget.TextView")
    private MobileElement screenName;

    @AndroidFindBy(className = "android.widget.ImageButton")
    private MobileElement backbutton;

    @AndroidFindBy(id = "food_info_videos")
    private MobileElement videosbutton;

    @AndroidFindBy(id = "food_info_image")
    private MobileElement image;

    @AndroidFindBy(className = "android.widget.ImageButton")
    private MobileElement servingsizes;

    @AndroidFindBy(id = "org.nutritionfacts.dailydozen:id/change_units_button")
    private MobileElement imperialbutton;

    @AndroidFindBy(id = "org.nutritionfacts.dailydozen:id/change_units_button")
    private MobileElement metricbutton;

    @AndroidFindBy(id = "android:id/text1")
    private MobileElement subcontent;

    @AndroidFindBy(id = "org.nutritionfacts.dailydozen:id/food_name")
    private MobileElement typebrowmflaxseed;

    @AndroidFindBy(id = "org.nutritionfacts.dailydozen:id/food_name")
    private MobileElement typegoldenflaxseed;

    public HomePage hp;

    public FlaxseedsDetailPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return false;
    }

    @Override
    public FlaxseedsDetailPage open() {
        if (!isPageDisplayed()) {
            hp = new HomePage(getDriver());
            hp.open().moveToDetail();
            getDriver().launchApp();
            waitForElementDisplay(screenName);
        }
        return this;
    }

    public String getScreenName() {
        return screenName.findElement(By.className("android.widget.TextView")).getText();
    }

    public FlaxseedsDetailPage clickBackButton() {
        backbutton.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }

    public FlaxseedsDetailPage clickVideosButton() {
        videosbutton.findElement(By.id("food_info_videos")).click();
        return this;
    }

    public FlaxseedsDetailPage clickImperialButton() {
        imperialbutton.findElement(By.id("org.nutritionfacts.dailydozen:id/change_units_button")).click();
        return this;
    }

    public String getSubContent() {
        return subcontent.findElement(By.id("android:id/text1")).getText();
    }

    public String getTypeBrownFlaxseeds() {
        return typebrowmflaxseed.findElement(By.id("org.nutritionfacts.dailydozen:id/food_name")).getText();
    }

    public String getTypeGoldenFlaxseeds() {
        return typegoldenflaxseed.findElement(By.id("org.nutritionfacts.dailydozen:id/food_name")).getText();
    }

}