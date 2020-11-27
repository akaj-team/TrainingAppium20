package page.at_hungnguyen3.tweaks;

import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import page.at_hungnguyen3.home.HomePage;

import java.util.List;


public class TweaksPageAndroid extends TweaksPage {

    @AndroidFindBy(id ="date_tweaks")
    private MobileElement listTweaks;

    @AndroidFindBy(id = "header")
    private MobileElement tvHeader;

    @AndroidFindBy(id = "title")
    private List<MobileElement> aboutMenu;

    @AndroidFindBy(xpath = "//*[@text='Every Day']")
    private MobileElement everyDay;

    public TweaksPageAndroid(MobileDriver driver) {
        super(driver);
    }

    public TweaksPage backKeyDevice() {
        AndroidDriver driver = (AndroidDriver) getDriver();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return this;
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(everyDay);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    @Override
    public TweaksPage open() {
        if (!isPageDisplayed()) {
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.clickTweaksButton();
            waitForElementDisplay(actionBar.findElement(By.className("android.widget.TextView")));
        }
        return this;
    }

    @Override
    public TweaksPage clickAboutButton() {
        actionBar.findElement(By.className("android.widget.ImageView")).click();
        return this;
    }

    @Override
    public TweaksPage clickLastestVideoButton() {
        aboutMenu.get(0).click();
        return this;
    }

    @Override
    public List<MobileElement> getListCheckBox() {
        return listTweaks.findElements(By.className("android.widget.CheckBox"));
    }

    @Override
    public boolean isCheckBoxChecked(List<MobileElement> list, int pos) {
        return list.get(pos).getAttribute("checked").equals("true");
    }
}
