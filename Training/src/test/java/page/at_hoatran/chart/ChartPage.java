package page.at_hoatran.chart;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import page.at_hoatran.detailfood.DetailFoodPage;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class ChartPage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text='Time Scale']")
    @iOSFindBy(xpath = "//*[@text='Time Scale']")
    private MobileElement tvHeader;

    public ChartPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(tvHeader);
    }

    @Override
    public BasePage open() {
        return this;
    }

    public ChartPage clickBackButton() {
        return this;
    }
}
