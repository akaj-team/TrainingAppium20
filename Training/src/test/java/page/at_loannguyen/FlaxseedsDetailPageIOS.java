package page.at_loannguyen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

public class FlaxseedsDetailPageIOS {
    @iOSFindBy(xpath = "//*[@class='UIANavigationBar']")
    private MobileElement actionBar;

    @iOSFindBy(id = "Brown flaxseeds")
    private MobileElement typeBrownFlaxseeds;

    @iOSFindBy(id = "Golden flaxseeds")
    private MobileElement typeGoldenFlaxseeds;

    public FlaxseedsDetailPageIOS clickBackButton () {
         actionBar.findElement(By.id("Daily Dozen")).click();
         return this;
    }

    public FlaxseedsDetailPageIOS getTypeBrownFlaxseeds(){
        typeBrownFlaxseeds.getText();
        return this;
    }

    public FlaxseedsDetailPageIOS getTypeGoldenFlaxseeds(){
        typeGoldenFlaxseeds.getText();
        return this;
    }
}

