package page.at_hungnguyen3;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FoodDetailsPage extends BasePage {

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    public MobileElement actionBar;

    @AndroidFindBy(xpath = "//*[@id='action_bar']/*[@class='android.widget.TextView']")
    @iOSFindBy(xpath = "//*[@class='UIANavigationBar']/*[@knownSuperClass='UIAccessibilityElement']")
    public MobileElement titleInfo;

    @AndroidFindBy(id = "food_info_videos")
    @iOSFindBy(xpath = "//*[@class='UIANavigationBar']/*[@id='VIDEOS']")
    private MobileElement btnVideo;

    @AndroidFindBy(xpath = "//*[@text='Serving Sizes']")
    @iOSFindBy(id = "Serving Sizes")
    private MobileElement servingsSize;

    public FoodDetailsPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        waitForElementDisplay(servingsSize, 3);
        return isForElementPresent(servingsSize);
    }

    @Override
    public FoodDetailsPage open() {
        if(!isPageDisplayed()){
            getDriver().launchApp();
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.clickFoodDetails(2);
            waitForElementDisplay(btnVideo);
        }
        return this;
    }

    public FoodDetailsPage clickBtnBackToHome() {
        return this;
    }

    public FoodDetailsPage sleepInSeconds() throws InterruptedException {
        Thread.sleep(2000);
        return this;
    }

    public FoodDetailsPage clickVideoButton() {
        return this;
    }

    public int getSizeOfServing() {
        return 2;
    }

    public int getSizeOfTypes() {
        return 2;
    }

    public String getTextTitle() {
        return "";
    }

}
