package page.at_hadang;

import io.appium.java_client.MobileDriver;

/**
 * for Calendar screen
 *
 * @author at-ha.dang
 */

public class CalendarPageHaDangAndroid extends CalendarPageHaDang{

    public CalendarPageHaDangAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextTitle() {
        return actionBar.findElementByClassName("android.widget.TextView").getText();
    }
}
