package at_cuongnguyen;

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

public class HomePageIOS extends at_cuongnguyen.HomePage {
    @iOSFindBy(className = "UIATable")
    private MobileElement container;

    @iOSFindBy(id = "ic stat")
    private MobileElement btnChart;

    @iOSFindBy(id = "More Info")
    private List<MobileElement> lstBtnMoreInfo;

    @iOSFindBy(id = "Settings")
    public MobileElement btnSetting;

    public HomePageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isTextOfFoodNameContain(String name, int pos)  {
        return container.findElements(By.className("UIAStaticText")).get(pos).getText().contains(name);
    }

    @Override
    public at_cuongnguyen.HomePage clickChartButton() {
        waitForElementDisplay(btnChart);
        btnChart.click();
        return this;
    }

    @Override
    public HomePage clickSettingButton(){
        btnSetting.click();
        return this;
    }

    @Override
    public at_cuongnguyen.HomePage clickMoreInfoButton(String name, int pos) {
        lstBtnMoreInfo.get(pos).click();
        return this;
    }
}
