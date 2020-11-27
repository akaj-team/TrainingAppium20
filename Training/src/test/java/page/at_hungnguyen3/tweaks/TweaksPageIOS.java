package page.at_hungnguyen3.tweaks;

import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import page.at_hungnguyen3.home.HomePage;

public class TweaksPageIOS extends TweaksPage {

    @iOSFindBy(className = "UIANavigationBar")
    private MobileElement actionBar;

    @iOSFindBy(id = "Info")
    private MobileElement btnAbout;

    @iOSFindBy(id = "Today")
    private MobileElement today;

    @iOSFindBy(id = "Latest Videos")
    private MobileElement lastestVideo;

    public TweaksPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(today);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("UIAStaticText")).getText();
    }

    @Override
    public TweaksPage open() {
        if (!isPageDisplayed()) {
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.clickTweaksButton();
            waitForElementDisplay(actionBar.findElement(By.className("android.widget.TextView")));
        }
        return this;
    }

    @Override
    public TweaksPage clickAboutButton() {
        btnAbout.click();
        return this;
    }

    @Override
    public TweaksPage clickLastestVideoButton() {
        lastestVideo.click();
        return this;
    }
}
