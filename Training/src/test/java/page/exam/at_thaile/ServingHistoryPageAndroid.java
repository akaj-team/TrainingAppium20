package page.exam.at_thaile;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

/**
 * for screen
 *
 * @author at-thai.le
 */

public class ServingHistoryPageAndroid extends ServingHistoryPage {
    @AndroidFindBy(id = "time_range_selector_selected_year")
    private MobileElement yearSelected;

    @AndroidFindBy(id = "time_range_selector_selected_month")
    private MobileElement monthSelected;

    @AndroidFindBy(id = "time_scale_spinner")
    private MobileElement timeDropDownList;

    public ServingHistoryPageAndroid(MobileDriver driver) {
        super(driver);
    }

    public String getTextYearSelected() {
        return yearSelected.getText();
    }

    public String getTextMonthSelected() {
        return monthSelected.getText();
    }

    public void clickTimeDropDownList() {
        timeDropDownList.click();
    }

    public void getTimeDropDownList() {
        List<MobileElement> list = getDriver().findElements(By.id("time_scale_spinner"));
        list.get(1).click();
    }
}
