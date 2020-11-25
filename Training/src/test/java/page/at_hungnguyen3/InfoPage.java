package page.at_hungnguyen3;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;

public class InfoPage extends BasePage {

    public InfoPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return false;
    }

    @Override
    public InfoPage open() {
        return this;
    }

    public String getTextInfo(int pos) {
        return "";
    }

    public InfoPage clickAbout() {
        return this;
    }

    public boolean isAboutPageDisplayed() {
        return false;
    }

    public InfoPage pressBackKeyDevice() {
        return this;
    }

    public InfoPage clickDonate() {
        return this;
    }

}
