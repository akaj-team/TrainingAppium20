package page.at_hungnguyen3.home;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class HomePageIOS extends HomePage {

    @iOSFindBy(id = "ic stat")
    private MobileElement btnChart;

    public HomePageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("UIAStaticText")).getText();
    }

    @Override
    public HomePage clickMoreInfoButton(int n) {
        listFood.findElements(By.id("More Info")).get(n).click();
        return this;
    }

    @Override
    public List<MobileElement> getListFoodName() {
        return listFood.findElements(By.className("UIAStaticText"));
    }

    @Override
    public HomePage clickSupplementItem() {
        scrollToView();
        List<MobileElement> list = listFood.findElements(By.id("More Info"));
        list.get(list.size() - 1).click();
        return this;
    }

    @Override
    public HomePage clickChartButton() {
        btnChart.click();
        return this;
    }

    @Override
    public List<MobileElement> getListCheckbox() {
        List<MobileElement> listCheckbox = new ArrayList<>();
        List<MobileElement> listButton = listFood.findElements(By.className("UIAButton"));
        for (MobileElement el : listButton) {
            if (el.getAttribute("name") == null) {
                listCheckbox.add(el);
            } else if (el.getAttribute("name").equals("ic checkmark white green")) {
                listCheckbox.add(el);
            }
        }
        return listCheckbox;
    }

    @Override
    public boolean isCheckboxChecked(int pos) {
        try {
            return getListCheckbox().get(pos).getAttribute("name").equals("ic checkmark white green");
        } catch (Exception e) {
            return false;
        }
    }
}
