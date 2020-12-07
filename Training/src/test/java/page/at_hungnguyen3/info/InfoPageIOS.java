package page.at_hungnguyen3.info;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class InfoPageIOS extends InfoPage {

    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement txtTitleOfPage;

    @iOSFindBy(id = "Info")
    protected MobileElement backButton;

    public InfoPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public List<MobileElement> getListItem() {
        return listTitle.findElements(By.className("UIAStaticText"));
    }

    @Override
    public InfoPage clickBackButton() {
        backButton.click();
        return this;
    }
}
