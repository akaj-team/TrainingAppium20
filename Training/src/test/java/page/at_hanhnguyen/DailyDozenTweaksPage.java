package page.at_hanhnguyen;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.exam.HomePage;

import java.util.List;

public class DailyDozenTweaksPage extends BasePage {
    @AndroidFindBy(xpath = "//*[@text='Tweaks']")
    private MobileElement lbTweak;

    @AndroidFindBy(xpath = "//*[@text='Weight']")
    private MobileElement lbWeight;

    @AndroidFindBy(id = "tweak_name")
    private List<MobileElement>lstTweak;

    @AndroidFindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@text='Preload with Water \uF05A']]")
     private MobileElement lbTweakName;

    @AndroidFindBy(xpath = "//*[@text='History']")
     private MobileElement lbHistory;

    @AndroidFindBy(xpath = "(//*[@id='tweak_history'])[1]")
    private MobileElement calendarIcon;

    HomePage homePage = new PageFactory<>(HomePage.class).create();

    public DailyDozenTweaksPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(lbTweak);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            homePage.clickRightHeader();
        }
        return this;
    }

    public String verifyWeightText(){
        return lbWeight.getText();
    }

    public String verifyTweakText(){
        return lbTweak.getText();
    }

    public boolean showAllItems(String name) {
        for (MobileElement element : lstTweak) {
            if (!lbTweakName.getText().equals(name)){
                return false;
            }
        } return true ;
    }

    public String verifyCalendarPopUpTitle(){ return lbHistory.getText(); }

    public void clickIntoCalendarIcon(){
        calendarIcon.isDisplayed();
        calendarIcon.click();
    }
}