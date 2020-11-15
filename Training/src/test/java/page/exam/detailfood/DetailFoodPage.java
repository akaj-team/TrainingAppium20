package page.exam.detailfood;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class DetailFoodPage extends BasePage {
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    public MobileElement actionBar;

    @AndroidFindBy(xpath = "//*[@text='Serving Sizes']")
    @iOSFindBy(xpath = "//*[@text='Serving Sizes']")
    private MobileElement tvHeader;

    public DetailFoodPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(tvHeader);
    }

    @Override
    public DetailFoodPage open() {
        return this;
    }

    public String getTitle() {
        return "";
    }

    public DetailFoodPage clickBackButton() {
        return this;
    }

    public DetailFoodPage waitForPageDisplayed() {
        waitForElementDisplay(tvHeader);
        return this;
    }
}
