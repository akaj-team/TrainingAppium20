package page.at_hungnguyen3.home;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class HomePageAndroid extends HomePage {
    @AndroidFindBy(id = "sub_header")
    private MobileElement containerSubHeader;

    public HomePageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    @Override
    public List<MobileElement> getListFoodName() {
        return listFood.findElements(By.id("food_name"));
    }

    @Override
    public HomePage clickMoreInfoButton(int n) {
        listFood.findElements(By.id("food_name")).get(n).click();
        return this;
    }

    @Override
    public HomePage clickChartButton() {
        containerSubHeader.findElements(By.className("android.widget.TextView")).get(3).click();
        return this;
    }

    @Override
    public List<MobileElement> getListCheckbox() {
        return listFood.findElements(By.className("android.widget.CheckBox"));
    }

    @Override
    public boolean isCheckboxChecked(int pos) {
        return getListCheckbox().get(pos).getAttribute("checked").equals("true");
    }
}
