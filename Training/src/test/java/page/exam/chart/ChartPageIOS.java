package page.exam.chart;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class ChartPageIOS extends ChartPage {
    @iOSFindBy(id = "Daily Dozen")
    private MobileElement tvBack;

    public ChartPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public ChartPageIOS clickBackButton() {
        tvBack.click();
        return this;
    }
}
