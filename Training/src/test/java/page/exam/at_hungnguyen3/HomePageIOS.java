package page.exam.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class HomePageIOS extends HomePage {

    MobileElement tabBar = (MobileElement) getDriver().findElementByClassName("UIATabBar");

    List<MobileElement> listTabBar = tabBar.findElements(By.className("UIAButton"));

    @iOSFindBy(className = "UIANavigationBar")
    MobileElement actionBar;

    MobileElement tweaksMenu = listTabBar.get(1);

    @iOSFindBy(id = "More Info")
    List<MobileElement> listMoreInfo;

    public HomePageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextTitle() {
        return actionBar.findElement(By.className("UIAStaticText")).getText();
    }

    @Override
    public String getTextTweaksMenu() {
        return listTabBar.get(1).getText();
    }

    @Override
    public HomePage clickBtnTweaks() {
        waitForElementDisplay(listTabBar.get(1));
        listTabBar.get(1).click();
        return this;
    }

    @Override
    public boolean isTweaksMenuContainsText(String text) {
        waitForElementDisplay(listTabBar.get(1));
        return getTextTweaksMenu().contains(text);
    }
}
