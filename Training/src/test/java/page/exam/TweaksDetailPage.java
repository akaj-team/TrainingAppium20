package page.exam;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class TweaksDetailPage extends BasePage{

    public TweaksDetailPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    @AndroidFindBy(id = "tweak_name")
     private MobileElement listTweak;

    @AndroidFindBy(xpath = "//*[@class='android.widget.ImageButton']")
    private MobileElement backButton;

    @AndroidFindBy(xpath = "//*[@text='About Tweak']")
    private MobileElement lbAboutTweak;

    @AndroidFindBy(id = "tweak_info_image")
    private MobileElement tweakInfoImage;

    @AndroidFindBy(xpath = "//*[@id='tweak_short']")
    private MobileElement lbTweakShort;

    @AndroidFindBy(xpath = "//*[@id='tweak_text']")
    private MobileElement lbTweakText;

    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    public void open1stTweak() {
        actionBar.findElement(By.id("menu_toggle_modes")).click();
        listTweak.findElement(By.xpath("//*[@index='0']")).click();
    }

    public boolean isImageDisplay(){
        return tweakInfoImage.isDisplayed();
    }
    public String verifyHeaderText(){
        return lbAboutTweak.getText();
    }

    public String verifyTitleText(){
        return lbTweakShort.getText();
    }
    public String verifyContentText(){
        return lbTweakText.getText();
    }

}
