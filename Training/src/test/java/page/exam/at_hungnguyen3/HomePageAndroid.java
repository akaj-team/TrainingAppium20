package page.exam.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageAndroid extends HomePage {

    @AndroidFindBy(xpath = "//*[@class='androidx.appcompat.widget.LinearLayoutCompat']/preceding-sibling::*")
    private MobileElement titleHome;

    @AndroidFindBy(id = "menu_toggle_modes")
    MobileElement tweaksMenu;

    @Override
    public String getTextTitle() {
        return titleHome.getText();
    }

    public HomePageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextTweaksMenu() {
        waitForElementDisplay(tweaksMenu);
        return tweaksMenu.getText();
    }

    @Override
    public HomePage clickBtnTweaks() {
        waitForElementDisplay(tweaksMenu);
        tweaksMenu.click();
        return this;
    }

    @Override
    public boolean isTweaksMenuContainsText(String text) {
        return getTextTweaksMenu().contains(text);
    }
}


