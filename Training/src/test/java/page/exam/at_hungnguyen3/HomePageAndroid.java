package page.exam.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageAndroid extends HomePage {

    @AndroidFindBy(id = "menu_toggle_modes")
    MobileElement tweaksMenu;

    public HomePageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextTweaksMenu() {
        return tweaksMenu.getText();
    }

    @Override
    public HomePage clickBtnTweaks() {
        waitForElementDisplay(tweaksMenu);
        tweaksMenu.click();
        return this;
    }
}


