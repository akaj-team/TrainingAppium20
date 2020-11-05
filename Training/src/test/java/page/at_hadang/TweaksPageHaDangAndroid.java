package page.at_hadang;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;

/**
 * for Tweaks screen
 *
 * @author at-ha.dang
 */

public class TweaksPageHaDangAndroid extends TweaksPageHaDang{

    public TweaksPageHaDangAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }
}
