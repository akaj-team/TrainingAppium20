package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class TweaksPageIOS extends TweaksPage{

    @iOSFindBy(className = "UIANavigationBar")
    MobileElement actionBar;

    @iOSFindBy(id = "Info")
    MobileElement btnAbout;

    @iOSFindBy(className = "UIAStaticText")
    List<MobileElement> listAbout;

    public TweaksPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextTitle() {
        waitForElementDisplay(actionBar.findElement(By.className("UIAStaticText")));
        return actionBar.findElement(By.className("UIAStaticText")).getText();
    }

    @Override
    public boolean isPageDisplayed() {
        waitForElementDisplay(actionBar.findElement(By.className("UIAStaticText")),5000);
        return isForElementPresent(actionBar.findElement(By.className("UIAStaticText")));
    }

    @Override
    public TweaksPage clickBtnAbout() {
        waitForElementDisplay(btnAbout,5000);
        btnAbout.click();
        return this;
    }

    @Override
    public boolean isAboutMenuDisplayed() {
        waitForElementDisplay(listAbout.get(1),5000);
        return isForElementPresent(listAbout.get(2));
    }
}

