package page.at_hadang;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

/**
 * for Home screen
 *
 * @author at-ha.dang
 */

public class HomePageHaDangAndroid extends HomePageHaDang{
    @AndroidFindBy(className = "android.widget.ScrollView")
    private MobileElement container;

    @AndroidFindBy(id = "sub_header")
    private MobileElement subHeader;

    @AndroidFindBy(id = "food_name")
    private List<MobileElement> lstBtnMoreInfo;

    public HomePageHaDangAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    @Override
    public String getTextOfFoodName(int pos) {
//        scrollToElement(container.findElements(By.id("food_name")).get(pos));
        return container.findElements(By.id("food_name")).get(pos).getText();
    }



    @Override
    public HomePageHaDang clickInfoMenuButton() {
        actionBar.findElement(By.className("android.widget.ImageView")).click();
        return this;
    }

    @Override
    public HomePageHaDang clickChartButton() {
        waitForElementDisplay(subHeader);
        List<MobileElement> el = subHeader.findElements(By.className("android.widget.TextView"));
        el.get(el.size() - 1).click();
        return this;
    }

    @Override
    public HomePageHaDang clickMoreInfoButton(String name, int pos) {
        String foodName = container.findElements(By.id("food_name")).get(pos).getText();
        if (foodName.equals(name)) {
            lstBtnMoreInfo.get(pos).click();
        }
        return this;
    }
}
