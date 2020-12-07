package page.at_hungnguyen3.chart;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import page.at_hungnguyen3.home.HomePage;

public class ChartPage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text='Time Scale']")
    @iOSFindBy(id = "Time Scale")
    private MobileElement tvHeader;

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement actionBar;

    public ChartPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(tvHeader);
    }

    @Override
    public ChartPage open() {
            if (!isPageDisplayed()){
                HomePage homePage = new PageFactory<>(HomePage.class).create();
                homePage.open().clickChartButton();
                waitForElementDisplay(tvHeader);
            }
            return this;
        }

    public ChartPage clickBackButton() {
        return this;
    }

    public String getTextTvHeader(){
        return tvHeader.getText();
    }

    public String getTextTitle(){
        return "";
    }
}
