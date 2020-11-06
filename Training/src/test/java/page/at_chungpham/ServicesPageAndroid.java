package page.at_chungpham;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class ServicesPageAndroid extends ServicesPage {

    @AndroidFindBy(id = "change_units_button")
    private MobileElement btnChangeUnit;

    @AndroidFindBy(id = "food_name")
    private MobileElement txtFoodName;

    public boolean isFoodNamePresent(){
        return txtFoodName.isDisplayed();
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
