package page.at_hungnguyen3.tweaks;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import page.at_hungnguyen3.home.HomePage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TweaksPage extends BasePage {

    @AndroidFindBy(id = "title")
    @iOSFindBy(className = "UIAStaticText")
    protected List<MobileElement> listAbout;

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement actionBar;

    @iOSFindBy(id = "Daily Dozen")
    @AndroidFindBy(id = "menu_toggle_modes")
    private MobileElement btnHome;

    @AndroidFindBy(id = "header")
    @iOSFindBy(id = "21 Tweaks")
    private MobileElement tvHeader;

    @AndroidFindBy(id = "date_tweaks")
    @iOSFindBy(className = "UIATable")
    private MobileElement listTweaks;

    public TweaksPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return true;
    }

    @Override
    public TweaksPage open() {
        if (!isPageDisplayed()) {
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.clickTweaksButton();
            waitForElementDisplay(tvHeader);
        }
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
        return listAbout.size() > 0;
    }

    public TweaksPage clickLastestVideoButton() {
        return this;
    }

    public List<MobileElement> getListCheckBox() {
        return new ArrayList<>();
    }

    public TweaksPage clickCheckBox(int pos) {
        getListCheckBox().get(pos).click();
        return this;
    }

    public TweaksPage clickCheckBox(List<MobileElement> list, int pos) {
        list.get(pos).click();
        return this;
    }

    public boolean isCheckBoxChecked(List<MobileElement> list, int pos) {
        return false;
    }

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(9);
    }
}
