package page.at_loannguyen;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class HomePageAndroid extends HomePage {
    MobileElement tvTitle = actionBar.findElement(By.className("android.widget.TextView"));

    public HomePageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        waitForElementDisplay(tvTitle);
        return tvTitle.getText();
    }
}
