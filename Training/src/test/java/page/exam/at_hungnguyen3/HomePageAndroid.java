package page.exam.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageAndroid extends HomePage {


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
}
