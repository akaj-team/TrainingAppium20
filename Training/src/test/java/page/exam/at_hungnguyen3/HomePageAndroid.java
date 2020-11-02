package page.exam.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class HomePageAndroid extends HomePage {

    @AndroidFindBy(id = "menu_toggle_modes")
    MobileElement tweaksMenu;

    public HomePageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public HomePage clickMoreInfo(int pos) {
        waitForElementDisplay(listFoodName.get(pos));
        scrollToElement(listFoodName.get(pos));
        listFoodName.get(pos).click();
        return this;
    }

    @Override
    public String getTextTweaksMenu() {
        return tweaksMenu.getText();
    }

}


