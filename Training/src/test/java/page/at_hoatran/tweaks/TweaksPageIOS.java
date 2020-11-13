package page.at_hoatran.tweaks;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class TweaksPageIOS extends TweaksPage {
    public TweaksPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("UIAStaticText")).getText();
    }
}
