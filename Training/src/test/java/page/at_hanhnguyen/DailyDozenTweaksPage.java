package page.at_hanhnguyen;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
//import page.exam.HomePage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;

public class DailyDozenTweaksPage extends BasePage {

    HomePage homePage = new PageFactory<>(HomePage.class).create();

    @AndroidFindBy(xpath = "//*[@text='History']")
    @iOSFindBy (id = "History")
    private MobileElement lnHistory;

    @AndroidFindBy(id = "tweak_history")
    @iOSFindBy(id = "ic calendar")
    private List<MobileElement> lstcalendarIcon;

    @AndroidFindBy(className = "android.widget.CheckBox")
    @iOSFindBy()
    public List<MobileElement> lstCheckbox;

    @AndroidFindBy(className = "android.widget.CheckedTextView")
    private List<MobileElement> lstDate;

    @AndroidFindBy(id = "date_pager_indicato")
    private MobileElement viewGroupDate;


    public DailyDozenTweaksPage(MobileDriver driver) {
        super(driver);
    }

    public boolean isPageDisplayed() {
        return false;
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            homePage.open();
            homePage.click21TweaksButton();
        }
        return this;
    }

    public boolean verifyTitleGroupShowCorrectly(String title) {
        return false;
    }

    public boolean verifyAllItemsShowCorrectly(String name) { return false ; }

    public DailyDozenTweaksPage clickIntoItem(String itemName){
        return this;
    }

    public String verifyCalendarPopUpTitle() {
        return lnHistory.getText();
    }

    public void clickIntoCalendarIcon() {
        lstcalendarIcon.get(0).click();
    }

    public DailyDozenTweaksPage clickIntoAllCheckbox() { return this;}

    public boolean verifyCheckboxIsChecked() {
        return false;
    }

    public boolean getCurrentDate() {
        Date todaysDate = new Date();
        DateFormat formatDate = new SimpleDateFormat("E, MMM dd");
        String formatDateString = formatDate.format(todaysDate);
        if (viewGroupDate.findElement(By.className("android.widget.TextView")).getText().equals(formatDateString)){
            return true;
        }
        return false;
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
}
