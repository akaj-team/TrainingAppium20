package page.at_hadang;

import io.appium.java_client.MobileDriver;

/**
 * for Calendar screen
 *
 * @author at-ha.dang
 */

public class CalendarPageHaDangIOS extends CalendarPageHaDang{

    public CalendarPageHaDangIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextTitle() {
        return actionBar.findElementByClassName("UIAStaticText").getText();
    }
}
