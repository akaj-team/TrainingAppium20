package page.at_loannguyen;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class FoodDetailPageAndroid extends FoodDetailPage {
    MobileElement btnBack = actionBar.findElementByClassName("android.widget.ImageButton");


    public FoodDetailPageAndroid(MobileDriver driver) {
        super(driver);
    }

    public String getScreenName() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    public FoodDetailPageAndroid clickBackButton() {
        btnBack.click();
        return this;
    }
}
