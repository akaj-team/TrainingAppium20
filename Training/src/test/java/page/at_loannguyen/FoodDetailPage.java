package page.at_loannguyen;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

public class FoodDetailPage extends BasePage {

    @iOSFindBy(className = "UIANavigationBar")
    @AndroidFindBy(id = "action_bar")
    public MobileElement actionBar;

    @iOSFindBy(id = "VIDEOS")
    @AndroidFindBy(id = "food_info_videos")
    private MobileElement btnVideos;

    @iOSFindBy(id = "Serving Sizes")
    @AndroidFindBy(xpath = "//*[@text='Serving Sizes']")
    private MobileElement tvServingSizes;

    @iOSFindBy(id = "Units:")
    @AndroidFindBy(xpath = "//*[@text='Units']")
    private MobileElement tvUnits;

    @iOSFindBy(id = "IMPERIAL")
    @AndroidFindBy(id = "change_units_button")
    private MobileElement btnImperial;

    @iOSFindBy(id = "1 tablespoon ground")
    @AndroidFindBy(id = "android:id/text1")
    private MobileElement tvSubContent;

    @iOSFindBy(id = "Types")
    @AndroidFindBy(xpath = "//*[@text='Types']")
    private MobileElement types;

    @AndroidFindBy(className = "android.widget.TextView")
    private MobileElement listTypes;

    public FoodDetailPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(btnVideos);
    }

    @Override
    public FoodDetailPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.clickItemsList(6);
            waitForElementDisplay(btnVideos);
        }
        return this;
    }

    public String getScreenName(){
        return "";
    }

    public FoodDetailPage tapBackButton(){
        return this;
    }

    public FoodDetailPage clickVideosButton() {
        btnVideos.click();
        return this;
    }

    public String getContentServingSize(){
        return tvServingSizes.getText();
    }

    public String getContentUnit(){
        return tvUnits.getText();
    }

    public FoodDetailPage clickImperialButton() {
        btnImperial.click();
        return this;
    }

    public String getTextButtonImperial() {
        return btnImperial.getText();
    }

    public String getSubContent() {
        return tvSubContent.getText();
    }

    public String getContentTypes(){
        return types.getText();
    }

    public void getTypeCategory(int pos) {
        listTypes.findElements(By.id("food_name")).get(pos).getText();
    }
}
