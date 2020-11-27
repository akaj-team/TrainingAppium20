package page.at_hungnguyen3.chart;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class ChartPageAndroid extends ChartPage {

    @AndroidFindBy (className = "android.widget.ImageButton")
    private MobileElement btnHome;

    public ChartPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public ChartPageAndroid clickBackButton() {
        actionBar.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }

    @Override
    public ChartPage clickBtnButton() {
        btnHome.click();
        return this;
    }

    @Override
    public String getTextTitle() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }
}
