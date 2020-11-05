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

    @iOSFindBy(id = "More Info")
    private List<MobileElement> lstBtnMoreInfo;

    public HomePageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextOfFoodName(int pos) {
        return container.findElements(By.className("UIAStaticText")).get(pos).getText();
    }

    @Override
    public HomePage clickChartButton() {
        waitForElementDisplay(btnChart);
        btnChart.click();
        return this;
    }

    @Override
    public HomePage clickMoreInfoButton(String name, int pos) {
        String foodName = container.findElements(By.className("UIAStaticText")).get(pos).getText();
        if (foodName.equals(name)) {
            lstBtnMoreInfo.get(pos).click();
        }
        return this;
    }
}
