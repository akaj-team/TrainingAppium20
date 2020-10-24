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
    @AndroidFindBy(xpath = "//*[@text='Daily Dozen']")
    private MobileElement tvTitle;

    @AndroidFindBy(className = "android.widget.ScrollView")
    private MobileElement container;

    @AndroidFindBy(id = "sub_header")
    private MobileElement subHeader;

    @AndroidFindBy(id = "num_servings")
    private MobileElement txtNumServings;

    @AndroidFindBy(id = "max")
    private MobileElement txtMaxServings;

    @AndroidFindBy(className = "android.widget.CheckBox")
    private List<MobileElement> lstCheckBoxes;

    public HomePageAndroid(MobileDriver driver) {
        super(driver);
    }

    public String getTextTitleAndroid() {
        waitForElementDisplay(tvTitle);
        return tvTitle.getText();
    }

    public final void clickChartButtonAndroid() {
        waitForElementDisplay(subHeader);
        List<MobileElement> el = subHeader.findElements(By.className("android.widget.TextView"));
        el.get(el.size() - 1).click();
    }

    public String getTextOfFoodNameAndroid(int pos) {
        return container.findElements(By.id("food_name")).get(pos).getText();
    }

    public final boolean verifyCheckBoxQuantityAndroid(String name, int quantity) {
        List<MobileElement> containerCheckBox = container.findElements(By.id("food_check_boxes_container"));
        for (int i = 0; i < containerCheckBox.size(); i++) {
            String foodName = container.findElements(By.id("food_name")).get(i).getText();
            List<MobileElement> countCheckBox = (List<MobileElement>) containerCheckBox.get(i).findElement(By.className("android.widget.CheckBox"));
            if (foodName == name && countCheckBox.size() == quantity) {
                return true;
            }
        }
        return false;
    }

    public final void clickMoreInfoButtonOfVitaminB12Android(String name, int pos) {
        String foodName = container.findElements(By.id("food_name")).get(pos).getText();
        if (foodName == name) {
            lstBtnMoreInfo.get(pos).click();
        }
    }

    public final boolean isHomePageDisplayedAndroid() {
        if (!tvTitle.isDisplayed()) {
            return false;
        }
        return true;
    }

    public final void clickCheckBoxOfFirstItem() {
        List<MobileElement> containerCheckBox = container.findElements(By.id("food_check_boxes_container"));
        List<MobileElement> lstCheckBox = (List<MobileElement>) containerCheckBox.get(0).findElement(By.className("android.widget.CheckBox"));
        lstCheckBox.get(0).click();
    }

    public final boolean isAllCheckBoxOfFirstItemSelected() {
        List<MobileElement> containerCheckBox = container.findElements(By.id("food_check_boxes_container"));
        List<MobileElement> lstCheckBox = (List<MobileElement>) containerCheckBox.get(0).findElement(By.className("android.widget.CheckBox"));
        for (int i = 0; i < lstCheckBox.size(); i++) {
            if (!lstCheckBox.get(i).isSelected()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isFirstCheckBoxOfFirstItemUnselected() {
        List<MobileElement> containerCheckBox = container.findElements(By.id("food_check_boxes_container"));
        List<MobileElement> lstCheckBox = (List<MobileElement>) containerCheckBox.get(0).findElement(By.className("android.widget.CheckBox"));
        if (!lstCheckBox.get(0).isSelected()) {
            return true;
        }
        return false;
    }

    public final void clickLastCheckBoxOfFirstItem() {
        List<MobileElement> containerCheckBox = container.findElements(By.id("food_check_boxes_container"));
        List<MobileElement> lstCheckBox = (List<MobileElement>) containerCheckBox.get(0).findElement(By.className("android.widget.CheckBox"));
        lstCheckBox.get(lstCheckBox.size() - 1).click();
    }

    public final boolean isAllCheckBoxOfFirstItemUnselected() {
        List<MobileElement> containerCheckBox = container.findElements(By.id("food_check_boxes_container"));
        List<MobileElement> lstCheckBox = (List<MobileElement>) containerCheckBox.get(0).findElement(By.className("android.widget.CheckBox"));
        for (int i = 0; i < lstCheckBox.size(); i++) {
            if (!lstCheckBox.get(i).isSelected()) {
                return true;
            }
        }
        return false;
    }
}

