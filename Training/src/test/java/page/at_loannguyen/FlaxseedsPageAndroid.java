package page.at_loannguyen;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class FlaxseedsPageAndroid extends FlaxseedsPage {
    MobileElement btnBack = actionBar.findElementByClassName("android.widget.ImageButton");


    public FlaxseedsPageAndroid(MobileDriver driver) {
        super(driver);
    }

    public String getScreenName() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    public FlaxseedsPageAndroid clickBackButton() {
        btnBack.click();
        return this;
    }
}
