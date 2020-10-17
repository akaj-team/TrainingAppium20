package page.at_loannguyen;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import page.exam.HomePage;

public class FlaxseedsDetailPage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text='Flaxseeds']")
    private MobileElement screenName;

    @AndroidFindBy(className = "android.widget.ImageButton")
    private MobileElement backButton;

    @AndroidFindBy(id = "food_info_videos")
    private MobileElement videosButton;

    @AndroidFindBy(xpath = "//*[@text='Serving Sizes']")
    private MobileElement servingSizes;

    @AndroidFindBy(id = "//*[@resource-id='org.nutritionfacts.dailydozen:id/change_units_button']")
    private MobileElement imperialButton;

    @AndroidFindBy(id = "android:id/text1")
    private MobileElement subContent;

    @AndroidFindBy(xpath = "//*[@text='Types']")
    private MobileElement types;

    @AndroidFindBy(xpath = "//*[@text='Brown flaxseeds']")
    private MobileElement typeBrownFlaxseed;

    @AndroidFindBy(xpath = "//*[@text='Golden flaxseeds']")
    private MobileElement typeGoldenFlaxseed;

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
        return screenName.getText();
    }

    public FlaxseedsDetailPage clickBackButton() {
        backButton.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }

    public FlaxseedsDetailPage clickVideosButton() {
        videosButton.click();
        return this;
    }

    public String getContentServingSize(){
        return servingSizes.getText();
    }

    public FlaxseedsDetailPage clickImperialButton() {
        imperialButton.click();
        return this;
    }

    public String getSubContent() {
        return subContent.getText();
    }

    public String getContentTypes(){
        return types.getText();
    }

    public String getTypeBrownFlaxseeds() {
        return typeBrownFlaxseed.getText();
    }

    public String getTypeGoldenFlaxseeds() {
        return typeGoldenFlaxseed.getText();
    }

    public String getTextButtonImerial() {
        return imperialButton.getText();
    }
}