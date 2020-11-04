package page.at_hanhnguyen;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import page.exam.HomePage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;

public class DailyDozenTweaksPage extends BasePage {

    HomePage homePage = new PageFactory<>(HomePage.class).create();
    @AndroidFindBy(id = "header_tweaks")
    private MobileElement headerTweak;

    @AndroidFindBy(id = "date_weights")
    private MobileElement datWeight;

    @AndroidFindBy(id = "tweak_name")
    private List<MobileElement> lstTweakName;

    @AndroidFindBy(id = "tweak_group_title")
    private List<MobileElement> lstGroupTitle;

    @AndroidFindBy(xpath = "//*[@text='History']")
    private MobileElement lnHistory;

    @AndroidFindBy(id = "tweak_history")
    private List<MobileElement> lstcalendarIcon;

    @AndroidFindBy(className = "android.widget.CheckBox")
    private List<MobileElement> lstCheckbox;

    @AndroidFindBy(className = "android.widget.CheckedTextView")
    private List<MobileElement> lstDate;

    @AndroidFindBy(id = "date_pager_indicato")
    private MobileElement viewGroupDate;

    @AndroidFindBy(id = "morning_weight")
    private MobileElement txtMorningWeight;

    @AndroidFindBy(id = "evening_weigh")
    private MobileElement txtEveningWeight;

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

    public String verifyWeightText() {
        return datWeight.findElement(By.id("header")).getText();
    }

    public String verifyTweakText() {
        return headerTweak.findElement(By.id("header")).getText();
    }

    public boolean verifyAllItemsShowCorrectly(String name) {
        for (MobileElement element : lstTweakName) {
            if (!element.getText().equals(name)) {
                return false;
            }
        }
        return true ;
    }

    public boolean verifyTitleGroupShowCorrectly(String title) {
        for (MobileElement element : lstGroupTitle) {
            if (element.getText().equals(title)) {
                return false;
            }
        }
        return true;
    }

    public String verifyCalendarPopUpTitle() {
        return lnHistory.getText();
    }

    public void clickIntoCalendarIcon() {
        lstcalendarIcon.get(0).click();
    }

    public void clickIntoAllCheckbox() {
        for (MobileElement element:lstCheckbox){
            if (element.getAttribute("checked").equals("false")){
                element.click();
            }
        }
    }

    public boolean verifyCheckboxIsChecked() {
        for (MobileElement element:lstCheckbox){
            if (!element.getAttribute("checked").equals("true")){
               return false;
            }
        } return true;
    }

    public String getCurrentDate() {
        Date todaysDate = new Date();
        DateFormat formatDate = new SimpleDateFormat("E, MMM dd");
        String formatDateString = formatDate.format(todaysDate);
        return formatDateString;
    }

    public void selectDate(String date) {
        for (MobileElement element : lstDate) {
            if (element.getText().equals(date)) {
                element.click();
                break;
            }
        }
    }

    public String verifyDateAfterSelectDate() {
        return viewGroupDate.findElement(By.className("android.widget.TextView")).getText();
    }

    public boolean verifyTheEyeOpen() {
        return isForElementPresent(txtMorningWeight) && isForElementPresent(txtEveningWeight);
    }

    public void clickIntoItem(String itemName){
        for (MobileElement element: lstTweakName){
            if (element.getText().equals(itemName)){
                element.click();break;
            }
        }
    }
}