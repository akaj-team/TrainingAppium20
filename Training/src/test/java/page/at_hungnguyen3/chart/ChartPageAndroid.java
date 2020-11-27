package page.at_hungnguyen3.chart;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;

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
