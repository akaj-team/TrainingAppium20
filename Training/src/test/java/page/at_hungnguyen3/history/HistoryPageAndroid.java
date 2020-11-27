package page.at_hungnguyen3.history;

import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;

public class HistoryPageAndroid extends HistoryPage {
    public HistoryPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    @Override
    public HistoryPage clickBackButton() {
        actionBar.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }
}
