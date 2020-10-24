package page.at_hadang;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

import java.util.List;

/**
 * for Home screen on iOS
 *
 * @author at-ha.dang
 */

public class HomePageIOS extends HomePage {
    @iOSFindBy(className = "UIATable")
    private MobileElement container;

    @iOSFindBy(id = "ic stat")
    private MobileElement btnChart;

    public HomePageIOS(MobileDriver driver) {
        super(driver);
    }

    public String getTextOfFoodNameIOS(int pos) {
        return container.findElements(By.className("UIAStaticText")).get(pos).getText();
    }

    public final void clickChartButtonIOS() {
        waitForElementDisplay(btnChart);
        btnChart.click();
    }

    public final boolean verifyCheckBoxQuantityIOS(String name, int quantity) {
        return true;
    }

    public final void clickMoreInfoButtonOfVitaminB12IOS(String name, int pos) {
        String foodName = container.findElements(By.className("UIAStaticText")).get(pos).getText();
        if (foodName == name) {
            lstBtnMoreInfo.get(pos).click();
        }
    }
}
