package page.exam.detailfood;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class DetailFoodPageAndroid extends DetailFoodPage {
    public DetailFoodPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    @Override
    public DetailFoodPage clickBackButton() {
        actionBar.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }
}
