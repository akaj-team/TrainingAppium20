package page.at_hadang;

import io.appium.java_client.MobileDriver;

/**
 * for Servings History screen
 *
 * @author at-ha.dang
 */

public class ServingHistoryPageHaDangAndroid extends ServingHistoryPageHaDang{

    public ServingHistoryPageHaDangAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getScreenTitle() {
        return actionBar.findElementByClassName("android.widget.TextView").getText();
    }
}
