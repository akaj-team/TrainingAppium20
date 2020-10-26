package page.at_loannguyen;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

public class FlaxseedsPageIOS extends FlaxseedsPage{
    @iOSFindBy(id = "Flaxseeds")
    private MobileElement screenName;

    @iOSFindBy(id = "Brown flaxseeds")
    private MobileElement typeBrownFlaxseeds;

    @iOSFindBy(id = "Golden flaxseeds")
    private MobileElement typeGoldenFlaxseeds;

    MobileElement btnBack = actionBar.findElementById("Daily Dozen");

    public FlaxseedsPageIOS(MobileDriver driver) {
        super(driver);
    }

    public String getScreenName(){
        return screenName.getText();
    }

    public FlaxseedsPageIOS clickBackButton () {
         btnBack.click();
         return this;
    }

    public FlaxseedsPageIOS getTypeBrownFlaxseeds(){
        typeBrownFlaxseeds.getText();
        return this;
    }

    public FlaxseedsPageIOS getTypeGoldenFlaxseeds(){
        typeGoldenFlaxseeds.getText();
        return this;
    }
}

