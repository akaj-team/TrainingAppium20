package page.at_hanhnguyen;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class DailyDozenTweaksIOSPage extends DailyDozenTweaksPage {

    @iOSFindBy(accessibility = "21 Tweaks")
    private MobileElement headerTweak;

    @iOSFindBy(className = "UIATable")
    private MobileElement contentItem;

    @iOSFindBy(xpath = "//*[@id='Today' and @class='UIAStaticText']")
    private MobileElement lbToday;

    public DailyDozenTweaksIOSPage(MobileDriver driver) { super(driver); }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(headerTweak.findElement(By.id("21 Tweaks")));
    }

    @Override
    public boolean verifyAllItemsShowCorrectly(String name) {
        List<MobileElement>lstTweakName= (List<MobileElement>) contentItem.findElement(By.className("UIAStaticText"));
        for (MobileElement element : lstTweakName) {
            if (!element.getText().equals(name)) {
                return false;
            }
        }
        return true ;
    }
    @Override
    public DailyDozenTweaksIOSPage clickIntoAllCheckbox() {
        for (MobileElement element:lstCheckbox){
            if (!element.getAttribute("name").equals("ic checkmark white green")){
                element.click();
            }
        }
        return this;
    }

    @Override
    public boolean verifyCheckboxIsChecked() {
        for (MobileElement element:lstCheckbox){
            if (!element.getAttribute("name").equals("ic checkmark white green")){
                return false;
            }
        }
        return true;
    }

    public void verifyTodayText(){
        lbToday.getText();
    }
}
