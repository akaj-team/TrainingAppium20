package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;

public class InforPageIOS extends InfoPage {

    public InforPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public InfoPage open() {
        return this;
    }

    @Override
    public boolean isPageDisplayed() {
        return true;
    }


}
