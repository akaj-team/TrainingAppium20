package page.exam.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class HomePageIOS extends HomePage {

    @iOSFindBy(id = "More Info")
    List<MobileElement> listMoreInfo;

    public HomePageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public HomePage clickMoreInfo(int pos) {
        waitForElementDisplay(listMoreInfo.get(pos));
        scrollToElement(listMoreInfo.get(pos));
        listMoreInfo.get(pos).click();
        return this;
    }
}
