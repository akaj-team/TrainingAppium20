package page.exam.at_thaile;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-thaile
 */

public class HomePageIOS extends page.exam.HomePage {

    @iOSFindBy(id = "Today")
    private MobileElement btnToday;

    @iOSFindBy(id = "Supplements")
    private MobileElement btnSupply;

    @iOSFindBy(className = "UIAButton")
    private MobileElement chk;

    @iOSFindBy(className = "UIAStaticText")
    private MobileElement supplyPopUp;

    public HomePageIOS(MobileDriver driver) {
        super(driver);
    }

    public void clickTodayButton() {
        btnToday.click();
    }

    public void clickSupplyButton(){
        btnSupply.click();
    }

    public boolean isDisplaySupplyPopup(){
        return isForElementPresent(supplyPopUp);
    }

    public void clickFoodName(int n) {
        listMenu.findElements(By.id("More Info")).get(n-1).click();
        super.clickFoodName(n);
    }
}
