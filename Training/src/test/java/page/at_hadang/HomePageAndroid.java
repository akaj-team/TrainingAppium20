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
    @AndroidFindBy(id = "num_servings")
    private MobileElement txtNumServings;

    @AndroidFindBy(id = "max")
    private MobileElement txtMaxServings;

    @AndroidFindBy(id = "food_check_boxes_container")
    private List<MobileElement> containerCheckBoxes;

    @AndroidFindBy(xpath = "//*[@text='\uF080']")
    private MobileElement btnChart;

    public HomePageAndroid(MobileDriver driver) {
        super(driver);
    }

    public final void clickChartButton(){
        waitForElementDisplay(btnChart);
        containerCheckBoxes.get(1).click();
        btnChart.click();
    }

    public final boolean verifyCheckBoxQuantity(String name, int quantity){
        int i = 0;
        for (MobileElement elementServings: lstFoodServings){
            String foodName = elementServings.findElements(By.id("food_name")).get(i).getText();
            int countCheckBox = containerCheckBoxes.size();
            if (foodName == name && countCheckBox == quantity){
                i++;
                if (i == lstFoodServings.size());
                return true;
            }
        }
        return false;
    }
}
