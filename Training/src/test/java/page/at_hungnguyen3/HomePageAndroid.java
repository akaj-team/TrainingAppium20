package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class HomePageAndroid extends HomePage {

    @AndroidFindBy(xpath = "//*[@class='androidx.appcompat.widget.LinearLayoutCompat']/preceding-sibling::*")
    private MobileElement titleHome;

    @AndroidFindBy(id = "food_name")
    List<MobileElement> listFoodName;

    @AndroidFindBy(id = "food_icon")
    List<MobileElement> listMoreInfo;

    @AndroidFindBy(id = "menu_toggle_modes")
    MobileElement tweaksMenu;

    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @AndroidFindBy(id = "title")
    List<MobileElement> listAboutMenu;

    @AndroidFindBy(xpath = "//*[@text='About']")
    MobileElement tvAbout;

    @AndroidFindBy(id = "sub_header")
    private MobileElement subHeader;

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

    @Override
    public HomePage clickFoodDetails(int pos) {
        waitForElementDisplay(listFoodName.get(pos), 5);
        listFoodName.get(pos).click();
        return this;
    }

    @Override
    public HomePage clickBtnAbout() {
        waitForElementDisplay(actionBar.findElementByClassName("android.widget.ImageView"));
        actionBar.findElementByClassName("android.widget.ImageView").click();
        return this;
    }

    @Override
    public boolean isAboutMenuDisplayed() {
        waitForElementDisplay(tvAbout, 5000);
        return isForElementPresent(tvAbout);
    }

    @Override
    public String getTextFoodName(int pos) {
        return listFoodName.get(pos).getText();
    }

    @Override
    public HomePage clickBtnChart() {
        waitForElementDisplay(subHeader, 2);
        subHeader.click();
        return this;
    }

    public HomePage backKeyDevice() {
        AndroidDriver driver = (AndroidDriver) getDriver();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return this;
    }
}

