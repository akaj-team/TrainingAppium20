package page.at_loannguyen;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class FoodDetailPageAndroid extends FoodDetailPage {
    MobileElement btnBack = actionBar.findElementByClassName("android.widget.ImageButton");

    MobileElement screenName = actionBar.findElement(By.className("android.widget.TextView"));

    public FoodDetailPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getScreenName() {
        return screenName.getText();
    }

    public FoodDetailPageAndroid clickBackButton() {
        btnBack.click();
        return this;
    }
}
