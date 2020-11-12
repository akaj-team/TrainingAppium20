package page.at_hanhnguyen;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class DailyDozenTweaksAndroidPage extends DailyDozenTweaksPage {

    @AndroidFindBy(id = "header_tweaks")
    private MobileElement headerTweak;

    @AndroidFindBy(id = "date_weights")
    private MobileElement datWeight;

    @AndroidFindBy(id = "morning_weight")
    private MobileElement txtMorningWeight;

    @AndroidFindBy(id = "evening_weigh")
    private MobileElement txtEveningWeight;

    @AndroidFindBy(id = "tweak_name")
    private List<MobileElement> lstTweakName;

    @AndroidFindBy(id = "tweak_group_title")
    private List<MobileElement> lstGroupTitle;


    public DailyDozenTweaksAndroidPage(MobileDriver driver) { super(driver); }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(headerTweak.findElement(By.id("header")));
    }

    public String verifyTweakText() {
        return headerTweak.findElement(By.id("header")).getText();
    }

    public String verifyWeightText() { return datWeight.findElement(By.id("header")).getText();
    }

    public boolean verifyTheEyeOpen() {
        return isForElementPresent(txtMorningWeight) && isForElementPresent(txtEveningWeight); }

    @Override
    public boolean verifyAllItemsShowCorrectly(String name) {
        for (MobileElement element : lstTweakName) {
            if (!element.getText().equals(name)) {
                return false;
            }
        }
        return true ;
    }

    @Override
    public boolean verifyTitleGroupShowCorrectly(String title) {
        for (MobileElement element : lstGroupTitle) {
            if (element.getText().equals(title)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public DailyDozenTweaksAndroidPage clickIntoItem(String itemName){
        for (MobileElement element: lstTweakName){
            if (element.getText().equals(itemName)){
                element.click();break;
            }
        } return this;
    }

    @Override
    public DailyDozenTweaksAndroidPage clickIntoAllCheckbox() {
        for (MobileElement element:lstCheckbox){
            if (element.getAttribute("checked").equals("false")){
                element.click();
            }
        }
        return this;
    }

    @Override
    public boolean verifyCheckboxIsChecked() {
        for (MobileElement element:lstCheckbox){
            if (!element.getAttribute("checked").equals("true")){
                return false;
            }
        } return true;
    }
}
