package page.exam.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class HomePageIOS extends HomePage {

    MobileElement tabBar = (MobileElement) getDriver().findElementByClassName("UIATabBar");

    List<MobileElement> listTabBar = tabBar.findElements(By.className("UIAButton"));

    MobileElement tweaksMenu = listTabBar.get(2);

    @iOSFindBy(id = "More Info")
    List<MobileElement> listMoreInfo;

    public HomePageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextTweaksMenu() {
        return tweaksMenu.getText();
    }

    @Override
    public HomePage clickBtnTweaks() {
        waitForElementDisplay(tweaksMenu);
        tweaksMenu.click();
        return this;
    }
}
