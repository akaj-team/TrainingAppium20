package page.at_loannguyen;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FoodDetailPageIOS extends FoodDetailPage {
    @iOSFindBy(id = "Flaxseeds")
    private MobileElement screenName;

    @iOSFindBy(id = "Brown flaxseeds")
    private MobileElement typeBrownFlaxseeds;

    @iOSFindBy(id = "Golden flaxseeds")
    private MobileElement typeGoldenFlaxseeds;

    MobileElement btnBack = actionBar.findElementById("Daily Dozen");

    public FoodDetailPageIOS(MobileDriver driver) {
        super(driver);
    }

    public String getScreenName(){
        return screenName.getText();
    }

    public FoodDetailPageIOS clickBackButton () {
         btnBack.click();
         return this;
    }

    public FoodDetailPageIOS getTypeBrownFlaxseeds(){
        typeBrownFlaxseeds.getText();
        return this;
    }

    public FoodDetailPageIOS getTypeGoldenFlaxseeds(){
        typeGoldenFlaxseeds.getText();
        return this;
    }
}

