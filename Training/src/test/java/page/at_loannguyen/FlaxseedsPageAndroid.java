package page.at_loannguyen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class FlaxseedsPageAndroid {
    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    public String getScreenName() {
        return actionBar.findElement(By.className("android.widget.TextView")).getText();
    }

    public FlaxseedsPageAndroid clickBackButton() {
        actionBar.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }
}
