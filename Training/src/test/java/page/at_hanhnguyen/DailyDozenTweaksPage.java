package page.at_hanhnguyen;

import at.base.BasePage;
import at.core.PageFactory;
import cucumber.api.java.en.And;
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


    @AndroidFindBy(id= "header_tweaks")
    private MobileElement headerTweak;

    @AndroidFindBy(id = "date_weights")
    private MobileElement datWeight;

    @AndroidFindBy(className = "android.widget.LinearLayout")
    private List<MobileElement>lstTweak;

    @AndroidFindBy(id="tweak_name")
    private MobileElement lbTweakName;

    @AndroidFindBy(id = "tweak_group_title")
    private MobileElement lbGroupTitle;

    @AndroidFindBy(xpath = "//*[@text='History']")
     private MobileElement lnHistory;

    @AndroidFindBy(id = "tweak_history")
    private List<MobileElement> lstcalendarIcon;

    @AndroidFindBy(xpath = "//*[@id='tweak_checkboxes']//*[@class='android.widget.CheckBox']")
    private  List<MobileElement> lstCheckbox;

    HomePage homePage = new PageFactory<>(HomePage.class).create();

    public DailyDozenTweaksPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(headerTweak.findElement(By.id("header")));
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            homePage.open();
            homePage.clickRightHeader();
        }
        return this;
    }

    public String verifyWeightText(){
        return datWeight.findElement(By.id("header")).getText();
    }

    public String verifyTweakText(){
        return headerTweak.findElement(By.id("header")).getText();
    }

    public boolean verifyAllItemsShowCorrectly(String name) {
        for (MobileElement element : lstTweak) {
            if (!lbTweakName.getText().equals(name)){
                return false;
            }
        } return true ;
    }

    public boolean verifyTitleGroupShowCorrectly(String title) {
        for (MobileElement element : lstTweak) {
            if (!lbGroupTitle.getText().equals(title)){
                return false;
            }
        } return true ;
    }

    public String verifyCalendarPopUpTitle(){ return lnHistory.getText(); }

    public void clickIntoCalendarIcon(){
        lstcalendarIcon.get(0).click();
    }

    public void clickIntoFirstCheckbox(){
        if (!lstCheckbox.get(0).isSelected()){
            lstCheckbox.get(0).click();
        }
    }

    public boolean verifyCheckboxIsChecked(){
        return lstCheckbox.get(1).isSelected()&& lstCheckbox.get(2).isSelected();
    }
}
