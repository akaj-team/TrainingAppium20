package page.at_hoatran;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class InfoPageIOS extends BasePage {
    @iOSFindBy(id="Info")
    private MobileElement txtTitle;

    public InfoPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return false;
    }

    @Override
    public BasePage open() {
        return null;
    }

    public String getTitle() {
        return txtTitle.getText();
    }

    public InfoPageIOS clickTitle() {
        txtTitle.click();
        return this;
    }


}
