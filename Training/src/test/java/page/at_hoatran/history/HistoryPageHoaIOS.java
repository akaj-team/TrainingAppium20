package page.at_hoatran.history;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class HistoryPageHoaIOS extends HistoryPageHoa {

    @iOSFindBy(id = "Daily Dozen")
    private MobileElement tvBack;

    public HistoryPageHoaIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("UIAStaticText")).getText();
    }

    @Override
    public HistoryPageHoa clickBackButton() {
        tvBack.click();
        return this;
    }
}
