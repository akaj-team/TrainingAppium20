package page.at_loannguyen;

import at.base.BasePage;
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
    private MobileElement videosButton;

    @iOSFindBy(id = "Serving Sizes")
    @AndroidFindBy(xpath = "//*[@text='Serving Sizes']")
    private MobileElement servingSizes;

    @iOSFindBy(id = "Units:")
    @AndroidFindBy(xpath = "//*[@text='Units']")
    private MobileElement units;

    @iOSFindBy(id = "IMPERIAL")
    @AndroidFindBy(id = "change_units_button")
    private MobileElement imperialButton;

    @iOSFindBy(id = "1 tablespoon ground")
    @AndroidFindBy(id = "android:id/text1")
    private MobileElement subContent;

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
        return false;
    }

    @Override
    public FoodDetailPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public FoodDetailPage clickVideosButton() {
        videosButton.click();
        return this;
    }

    public String getContentServingSize(){
        return servingSizes.getText();
    }

    public String getContentUnit(){
        return units.getText();
    }

    public FoodDetailPage clickImperialButton() {
        imperialButton.click();
        return this;
    }

    public String getTextButtonImperial() {
        return imperialButton.getText();
    }

    public String getSubContent() {
        return subContent.getText();
    }

    public String getContentTypes(){
        return types.getText();
    }

    public void getTypeCategory(int pos) {
        listTypes.findElements(By.id("food_name")).get(pos).getText();
    }
}
