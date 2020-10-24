package page.at_loannguyen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

public class FlaxseedsPageIOS {
    @iOSFindBy(className = "UIANavigationBar")
    private MobileElement actionBar;

    @iOSFindBy(id = "Flaxseeds")
    private MobileElement screenName;

    @iOSFindBy(id = "Brown flaxseeds")
    private MobileElement typeBrownFlaxseeds;

    @iOSFindBy(id = "Golden flaxseeds")
    private MobileElement typeGoldenFlaxseeds;

    public String getScreenName(){
        return screenName.getText();
    }

    public FlaxseedsPageIOS clickBackButton () {
         actionBar.findElement(By.id("Daily Dozen")).click();
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

