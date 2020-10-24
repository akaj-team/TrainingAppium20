package page.at_chungpham;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class ServicesPageAndroid extends BasePage {

    @AndroidFindBy(id = "change_units_button")
    private MobileElement btnChangeUnit;

    @AndroidFindBy(id = "text1")
    private MobileElement txtListServingSizes;

    @AndroidFindBy(id = "food_name")
    private MobileElement txtFoodName;

    public boolean isTypesPresent() {
        if (txtListServingSizes.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFoodNamePresent(){
        if(txtFoodName.isDisplayed()){
            return true;
        }else {
            return false;
        }
    }

    public ServicesPageAndroid(MobileDriver driver) {
        super(driver);
    }

    public void clickBtnChangeUnit() {
        btnChangeUnit.click();
    }

    @Override
    public boolean isPageDisplayed() {
        return false;
    }

    @Override
    public BasePage open() {
        return null;
    }
}
