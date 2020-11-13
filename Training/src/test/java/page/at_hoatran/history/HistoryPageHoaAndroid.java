package page.at_hoatran.history;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class HistoryPageHoaAndroid extends HistoryPageHoa {
    public HistoryPageHoaAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    @Override
    public HistoryPageHoa clickBackButton() {
        actionBar.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }
}
