package page.at_hungnguyen3;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class InfoPage extends BasePage {

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    public MobileElement actionBar;

    @AndroidFindBy(xpath = "//*[@id='action_bar']/*[@class='android.widget.TextView']")
    @iOSFindBy(xpath = "//*[@class='UIANavigationBar']/*[@knownSuperClass='UIAccessibilityElement']")
    public MobileElement titleInfo;

    @AndroidFindBy(id = "food_info_videos")
    @iOSFindBy(xpath = "//*[@class='UIANavigationBar']/*[@id='VIDEOS']")
    private MobileElement btnVideo;

    @AndroidFindBy(className = "android.widget.ImageButton")
    @iOSFindBy(xpath = "//*[@class='UIATabBar']/*[@id='Daily Dozen']")
    private MobileElement btnBackToHome;

    public InfoPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(btnVideo);
    }

    public boolean isBtnVideoDisplayed(){
        waitForElementDisplay(btnVideo,5000);
        return isForElementPresent(btnVideo);
    }

    @Override
    public InfoPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.open().clickMoreInfo(2);
            isForElementPresent(btnVideo);
        }
        return this;
    }

    public String getTextTitle(){return titleInfo.getText();}

    public InfoPage clickToBtnVideo(){
        waitForElementDisplay(btnVideo);
        btnVideo.click();
        return this;
    }

    public InfoPage clickBtnBackToHome(){
        waitForElementDisplay(btnBackToHome);
        btnBackToHome.click();
        return this;
    }

}
