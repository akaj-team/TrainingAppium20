package page.exam.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class HomePageAndroid extends HomePage {

    @AndroidFindBy(xpath = "//*[@class='androidx.appcompat.widget.LinearLayoutCompat']/preceding-sibling::*")
    private MobileElement titleHome;

    @AndroidFindBy(id = "food_name")
    List<MobileElement> listFoodName;

    @AndroidFindBy(id = "menu_toggle_modes")
    MobileElement tweaksMenu;

    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @AndroidFindBy(id = "title")
    List<MobileElement> listAboutMenu;

    @AndroidFindBy(xpath = "//*[@text='About']")
    MobileElement tvAbout;

    @AndroidFindBy(id = "")
    List<MobileElement> listCheckBox;


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
    public HomePage clickMoreInfo(int pos) {
        waitForElementDisplay(listFoodName.get(pos));
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

}


