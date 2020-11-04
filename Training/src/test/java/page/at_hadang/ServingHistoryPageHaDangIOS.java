package page.at_hadang;

import io.appium.java_client.MobileDriver;

/**
 * for Home screen
 *
 * @author at-ha.dang
 */

public class ServingHistoryPageHaDangIOS extends ServingHistoryPageHaDang{

    public ServingHistoryPageHaDangIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getScreenTitle() {
        return actionBar.findElementById("Servings History").getText();
    }
}
