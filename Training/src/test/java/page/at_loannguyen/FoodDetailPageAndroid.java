package page.at_loannguyen;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class FoodDetailPageAndroid extends FoodDetailPage {
    @AndroidFindBy(xpath = "//*[@class='android.view.ViewGroup']/*[@class='android.widget.TextView']")
    private MobileElement screenName;

    @AndroidFindBy(className = "android.widget.ImageButton")
    private MobileElement btnBack;

    public FoodDetailPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return super.isPageDisplayed();
    }

    @Override
    public String getScreenName() {
        return screenName.getText();
    }

    @Override
    public FoodDetailPage tapBackButton() {
        waitForElementDisplay(btnBack);
        btnBack.click();
        return this;
    }
}
