package page.at_loannguyen;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomePageIOS extends HomePage{
    MobileElement tvTitle = actionBar.findElementById("Daily Dozen");

    public HomePageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        waitForElementDisplay(tvTitle);
        return tvTitle.getText();
    }
}
