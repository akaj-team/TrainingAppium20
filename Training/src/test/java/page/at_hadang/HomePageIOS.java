package page.at_hadang;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import java.util.List;

/**
 * for Home screen on iOS
 *
 * @author at-ha.dang
 */

public class HomePageIOS extends HomePage{
    @iOSFindBy(xpath = "//*[@text='0 / 24']")
    private MobileElement txtNumServings;

    @iOSFindBy(xpath = "((//*[@class='UIATable']/*[@class='UIAView'])/*[@class='UIAButton'])")
    private List<MobileElement> containerCheckBoxes;

    @iOSFindBy(xpath = "//*[@text='ic stat']")
    private MobileElement btnChart;

    public HomePageIOS(MobileDriver driver) {
        super(driver);
    }

    public final void clickChartButton(){
        waitForElementDisplay(btnChart);
        btnChart.click();
    }
}
