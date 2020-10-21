package page.at_chungpham;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import page.HomePage;


public class ServicesPage extends BasePage {

    @iOSFindBy(xpath = "//*[@text='Daily Dozen' and @class='UIAButton' and ./parent::*[@text='Daily Dozen']]")
    @AndroidFindBy(xpath = "//*[@contentDescription='Navigate up']")
    private MobileElement btnBack;

    //@iOSFindBy(xpath = "")
    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and ./parent::*[@id='action_bar']]")
    private MobileElement title;

    @iOSFindBy(xpath = "//*[@text='VIDEOS' and @class='UIAButton' and ./parent::*[@text='Daily Dozen']]")
    @AndroidFindBy(id = "food_info_videos")
    private MobileElement btnVideo;

    @iOSFindBy(xpath = "//*[@knownSuperClass='UIImageView']")
    @AndroidFindBy(id = "food_info_image")
    private MobileElement foodImage;

    @iOSFindBy(xpath = "//*[@id='Serving Sizes' and @class='UIAStaticText']")
    @AndroidFindBy(xpath = "//*[@text='Serving Sizes']")
    private MobileElement txtServingSizesTitle;

    @iOSFindBy(id = "Units:")
    @AndroidFindBy(xpath = "//*[@text='Units']")
    private MobileElement txtUnit;

    @AndroidFindBy(id = "change_units_button")
    private MobileElement btnChangeUnit;

    @iOSFindBy(xpath = "//*[@text='METRIC' and @class='UIAButton' and ./parent::*[@class='UIATable']]")
    @AndroidFindBy(xpath = "//*[@text='METRIC']")
    private MobileElement btnChangeToImperial;

    @iOSFindBy(xpath = "//*[@text='IMPERIAL' and @class='UIAStaticText' and ./parent::*[./parent::*[@text='Serving Sizes']]]")
    @AndroidFindBy(xpath = "//*[@text='IMPERIAL']")
    private MobileElement btnChangeToMetric;

    @AndroidFindBy(id = "text1")
    private MobileElement txtListServingSizes;

    @iOSFindBy(xpath = "//*[@text='Types' and @class='UIAStaticText'")
    @AndroidFindBy(xpath = "//*[@text='Types']")
    private MobileElement txtTypes;

    @AndroidFindBy(id = "food_name")
    private MobileElement txtFoodName;

    @iOSFindBy(id = "VIDEOS")
    @AndroidFindBy(id = "food_videos")
    private MobileElement btnFoodVideo;



    public ServicesPage(MobileDriver driver) {
        super(driver);
    }

    HomePage homePage = new PageFactory<>(HomePage.class).create();

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(txtServingSizesTitle);
    }

    @Override
    public void waitForElementDisplay(MobileElement element, int timeOutInSecond) {
        super.waitForElementDisplay(txtServingSizesTitle, timeOutInSecond);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            homePage.open();
            homePage.clickBtnFoodName();
        }
        return this;
    }

    public boolean servingSizesTitle() {
        return isForElementPresent(txtServingSizesTitle);
    }

    public String getTitleServingSizes() {
        return txtServingSizesTitle.getText();
    }

    @Override
    public BasePage clickBackButton() {
        btnBack.click();
        return this;
    }

    public void clickVideo() {
        btnVideo.click();
    }

    public String getTxtUnit() {
        return txtUnit.getText();
    }

    public void clickBtnChangeToImperial() {
        btnChangeToImperial.click();
    }

    public void clickBtnChangeToMetric() {
        btnChangeToMetric.click();
    }

    public void clickBtnChangeUnit() {
        btnChangeUnit.click();
    }

    public boolean isTypesPresent() {
        if (txtListServingSizes.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isVideoRedirect() {
        if (txtServingSizesTitle.isDisplayed()) {
            return false;
        } else {
            return true;
        }
    }

    public String getTxtTypes() {
        return txtTypes.getText();
    }

    public void clickBtnFoodVideo() {
        btnFoodVideo.click();
    }

    public String getTextBtnImperial() {
        return btnChangeToMetric.getText();
    }

    public String getTextBtnMetric() {
        return btnChangeToImperial.getText();
    }
}
