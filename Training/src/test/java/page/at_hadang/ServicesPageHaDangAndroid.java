package page.at_hadang;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;

/**
 * for Services screen
 *
 * @author at-ha.dang
 */

public class ServicesPageHaDangAndroid extends ServicesPageHaDang {

    public ServicesPageHaDangAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getFoodName() {
        return actionBar.findElements(By.className("android.widget.TextView")).get(1).getText();
    }
}
