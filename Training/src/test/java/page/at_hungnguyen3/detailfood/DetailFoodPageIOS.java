package page.at_hungnguyen3.detailfood;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class DetailFoodPageIOS extends DetailFoodPage {
    @iOSFindBy(id = "Daily Dozen")
    private MobileElement tvBack;

    @iOSFindBy(className = "UIAStaticText")
    private MobileElement tvHeader;

    public DetailFoodPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return tvHeader.getText();
    }

    @Override
    public DetailFoodPage clickBackButton() {
        tvBack.click();
        return this;
    }
}
