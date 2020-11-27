package page.at_hungnguyen3.info;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class InfoPageIOS extends InfoPage {
    @iOSFindBy(className = "UIANavigationBar")
    public MobileElement txtTitleOfPage;

    public InfoPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public List<MobileElement> getListItem() {
        return listTitle.findElements(By.className("UIAStaticText"));
    }
}
