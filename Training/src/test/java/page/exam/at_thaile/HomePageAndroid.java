package page.exam.at_thaile;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

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

    @AndroidFindBy(className = "android.widget.CheckBox")
    private MobileElement chk;

    public HomePageAndroid(MobileDriver driver) {
        super(driver);
    }

    public void click21TweaksButton() {
        btn21Tweaks.click();
    }

    public List<MobileElement> getFood() {
        List<MobileElement> elements = listMenu.findElement(By.className(android.widget.LinearLayout[1]));
        return elements;
    }

    public void clickCheckBox() {
        chk = getFood().get(0).findElements(By.className(android.widget.CheckBox));
        chk.click();
    }

    @Override
    public void clickFoodName(int n) {
        listMenu.findElements(By.id("food_name")).get(n - 1).click();
        super.clickFoodName(n);
    }

    public void checkSelected(){
        chk = getFood().get(0).findElement(By.className(android.widget.LinearLayout[1])).isSelected();
    }

    public void isCheckSelected(){
        boolean isCheckSelected = getFood().get(0).findElement(By.className(android.widget.LinearLayout[1])).isSelected();
        if(isCheckSelected = false){
            chk.click();
        }
    }
}

