package page.at_hungnguyen3.tweaks;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TweaksPage extends BasePage {

    @AndroidFindBy(id = "title")
    @iOSFindBy(className = "UIAStaticText")
    List<MobileElement> listAbout;

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement actionBar;

    @iOSFindBy(id = "Daily Dozen")
    @AndroidFindBy(id = "menu_toggle_modes")
    private MobileElement btnHome;

    @AndroidFindBy(id = "header")
    @iOSFindBy(id = "21 Tweaks")
    private MobileElement tvHeader;

    @AndroidFindBy(id ="date_tweaks")
    @iOSFindBy(className = "UIATable")
    private MobileElement listTweaks;

    public TweaksPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return false;
    }

    @Override
    public TweaksPage open() {
        return this;
    }

    public String getTitle() {
        return "";
    }

    public TweaksPage clickBtnHome() {
        btnHome.click();
        return this;
    }

    public TweaksPage waitForPageDisplayed() {
        waitForElementDisplay(tvHeader);
        return this;
    }

    public TweaksPage clickAboutButton() {
        return this;
    }

    public boolean isAboutMenuDisplayed() {
        return isForElementPresent(listAbout.get(randomNumber()));
    }

    public TweaksPage clickLastestVideoButton () {
        return this;
    }

    public List<MobileElement> getListCheckBox(){
        return new ArrayList<>();
    }

    public TweaksPage clickCheckBox(int pos){
        getListCheckBox().get(pos).click();
        return this;
    }

    public TweaksPage clickCheckBox(List<MobileElement> list, int pos){
        list.get(pos).click();
        return this;
    }

    public boolean isCheckBoxChecked(List<MobileElement> list, int pos){
        return false;
    }

    public static int randomNumber(){
        Random random = new Random(8);
        return random.nextInt();
    }
}
