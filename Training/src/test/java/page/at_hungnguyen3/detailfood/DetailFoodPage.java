package page.at_hungnguyen3.detailfood;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import page.at_hungnguyen3.home.HomePage;

import java.util.Random;

public class DetailFoodPage extends BasePage {
    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement actionBar;

    @AndroidFindBy(xpath = "//*[@text='Serving Sizes']")
    @iOSFindBy(id = "Serving Sizes")
    protected MobileElement tvHeader;

    @AndroidFindBy(id = "food_info_image")
    @iOSFindBy(className = "UIAImage")
    private MobileElement foodImage;

    public DetailFoodPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(tvHeader);
    }

    @Override
    public DetailFoodPage open() {
        if(!isPageDisplayed()){
            int i = randomNumber();
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.clickMoreInfoButton(i);
            waitForElementDisplay(tvHeader);
        }
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

    public static int randomNumber(){
        Random random = new Random();
        return random.nextInt(6);
    }

    public DetailFoodPage clickBtnHomeButton(){
        return this;
    }

    public DetailFoodPage clickFirstTvVideo(){
        return this;
    }

    public int getSizeOfListServing(){
        return randomNumber();
    }

    public boolean isFoodImageDisplayed(){
        return foodImage.isDisplayed();
    }

    public boolean isListServingAndTypeDisplayed(){
        return false;
    }

    public DetailFoodPage waitForPageDisplay(){
        waitForElementDisplay(tvHeader);
        return this;
    }

    public boolean isFirstVideoDisplayed(){
        return false;
    }
}
