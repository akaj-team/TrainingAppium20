package page.at_hungnguyen3.chart;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

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
