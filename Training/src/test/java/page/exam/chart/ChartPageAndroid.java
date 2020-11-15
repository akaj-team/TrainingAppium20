package page.exam.chart;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class ChartPageAndroid extends ChartPage {
    public ChartPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public ChartPageAndroid clickBackButton() {
        actionBar.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }
}
