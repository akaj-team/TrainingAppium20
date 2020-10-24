package page.at_chungpham;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import page.HomePage;
import org.openqa.selenium.By;


/**
 * @author at_chungpham
 */
public class ServicesPage extends BasePage {

    @iOSFindBy(xpath = "//*[@text='Daily Dozen'")
    @AndroidFindBy(xpath = "//*[@contentDescription='Navigate up']")
    private MobileElement btnBack;

    @iOSFindBy(xpath = "//*[@text='VIDEOS'")
    @AndroidFindBy(id = "food_info_videos")
    private MobileElement btnVideo;

    @iOSFindBy(xpath = "//*[@knownSuperClass='UIImageView']")
    @AndroidFindBy(id = "food_info_image")
    private MobileElement imgFoodImage;

    @iOSFindBy(xpath = "//*[@id='Serving Sizes' and @class='UIAStaticText']")
    @AndroidFindBy(xpath = "//*[@text='Serving Sizes']")
    private MobileElement txtServingSizesTitle;

    @iOSFindBy(id = "Units:")
    @AndroidFindBy(xpath = "//*[@text='Units']")
    private MobileElement txtUnit;

    @iOSFindBy(xpath = "//*[@text='METRIC'")
    @AndroidFindBy(xpath = "//*[@text='METRIC']")
    private MobileElement btnChangeToImperial;

    @iOSFindBy(xpath = "//*[@text='IMPERIAL']")
    @AndroidFindBy(xpath = "//*[@text='IMPERIAL']")
    private MobileElement btnChangeToMetric;

    @iOSFindBy(xpath = "//*[@text='Types'")
    @AndroidFindBy(xpath = "//*[@text='Types']")
    private MobileElement txtTypes;

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
