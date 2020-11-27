package page.at_hungnguyen3.info;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

public class InfoPageAndroid extends InfoPage {

    public InfoPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public List<MobileElement> getListItem() {
        return listTitle.findElements(By.id("title"));
    }
}
