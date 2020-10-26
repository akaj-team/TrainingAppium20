package page.at_hadang;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

/**
 * for Home screen on Android
 *
 * @author at-ha.dang
 */

public class HomePageAndroid extends HomePage {
    @AndroidFindBy(className = "android.widget.ScrollView")
    private MobileElement container;

    @AndroidFindBy(id = "sub_header")
    private MobileElement subHeader;

    @AndroidFindBy(id = "food_name")
    private List<MobileElement> lstBtnMoreInfo;

    public HomePageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextOfFoodName(int pos) {
        return container.findElements(By.id("food_name")).get(pos).getText();
    }

    @Override
    public HomePage clickChartButton() {
        waitForElementDisplay(subHeader);
        List<MobileElement> el = subHeader.findElements(By.className("android.widget.TextView"));
        el.get(el.size() - 1).click();
        return this;
    }

    @Override
    public HomePage clickMoreInfoButton(String name, int pos) {
        String foodName = container.findElements(By.id("food_name")).get(pos).getText();
        if (foodName.equals(name)) {
            lstBtnMoreInfo.get(pos).click();
        }
        return this;
    }
}

