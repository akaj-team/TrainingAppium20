package page;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class HomePage extends BasePage {

    @iOSFindBy(className = "UIANavigationBar")
    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @iOSFindBy(xpath = "//*[@text='More Info']")
    @AndroidFindBy(id = "food_name")
    private MobileElement btnFood;

    public HomePage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public void clickBtnFoodName(){
        btnFood.click();
    }
}
