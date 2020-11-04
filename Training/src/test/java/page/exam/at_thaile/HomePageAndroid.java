package page.exam.at_thaile;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-thaile
 */

public class HomePageAndroid extends page.exam.HomePage {

    @AndroidFindBy(id = "menu_toggle_modes")
    private MobileElement btn21Tweaks;

    @AndroidFindBy(className = "android.widget.TextView")
    private MobileElement tvTime;

    public HomePageAndroid(MobileDriver driver) {
        super(driver);
    }

    public void click21TweaksButton() {
        btn21Tweaks.click();
    }

    @Override
    public void clickFoodName(int n) {
        listMenu.findElements(By.id("food_name")).get(n - 1).click();
        super.clickFoodName(n);
    }
}

