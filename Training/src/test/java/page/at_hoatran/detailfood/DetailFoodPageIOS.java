package page.at_hoatran.detailfood;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import page.at_hoatran.history.HistoryPageHoa;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class DetailFoodPageIOS extends DetailFoodPage {
    @iOSFindBy(id = "Daily Dozen")
    private MobileElement tvBack;

    public DetailFoodPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("UIAStaticText")).getText();
    }

    @Override
    public DetailFoodPage clickBackButton() {
        tvBack.click();
        return this;
    }
}
