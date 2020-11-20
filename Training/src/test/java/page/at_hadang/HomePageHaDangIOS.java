package page.at_hadang;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

import java.util.List;

/**
 * for Home screen
 *
 * @author at-ha.dang
 */

public class HomePageHaDangIOS extends HomePageHaDang{
    @iOSFindBy(className = "UIATable")
    private MobileElement container;

    @iOSFindBy(id = "Info")
    private MobileElement btnInfoMenu;

    @iOSFindBy(xpath = "//*[@id='ic stat']")
    private MobileElement btnChart;

    @iOSFindBy(xpath = "//*[@id='More Info']")
    private List<MobileElement> lstBtnMoreInfo;

    public HomePageHaDangIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextTitle() {
        return actionBar.findElement(By.id("Daily Dozen")).getText();
    }

    @Override
    public String getTextOfFoodName(int pos) {
        return container.findElements(By.className("UIAStaticText")).get(pos).getText();
    }

    @Override
    public HomePageHaDang clickInfoMenuButton() {
        waitForElementDisplay(btnInfoMenu);
        btnInfoMenu.click();
        return this;
    }

    @Override
    public HomePageHaDang clickChartButton() {
        waitForElementDisplay(btnChart);
        btnChart.click();
        return this;
    }

    @Override
    public HomePageHaDang clickMoreInfoButton(String name, int pos) {
        String foodName = container.findElements(By.className("UIAStaticText")).get(pos).getText();
        if (foodName.equals(name)) {
            lstBtnMoreInfo.get(pos).click();
        }
        return this;
    }
}
