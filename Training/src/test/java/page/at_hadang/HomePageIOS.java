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

    @iOSFindBy(xpath = "//*[@text='0 / 24']")
    private MobileElement txtNumServings;

    @iOSFindBy(xpath = "((//*[@class='UIATable']/*[@class='UIAView'])/*[@class='UIAButton'])")
    private List<MobileElement> containerCheckBoxes;

    @iOSFindBy(xpath = "//*[@text='ic stat']")
    private MobileElement btnChart;

    public HomePageIOS(MobileDriver driver) {
        super(driver);
    }

    public String getTextTitleIOS() {
        return actionBar.findElement(By.className("UIAStaticText")).getText();
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

    public final boolean isHomePageDisplayedIOS() {
        if (!actionBar.findElement(By.className("UIAStaticText")).isDisplayed()) {
            return false;
        }
        return true;
    }
}
