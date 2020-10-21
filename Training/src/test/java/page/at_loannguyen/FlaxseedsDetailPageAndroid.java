package page.at_loannguyen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class FlaxseedsDetailPageAndroid {
    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    public FlaxseedsDetailPageAndroid clickBackButton() {
        actionBar.findElement(By.className("android.widget.ImageButton")).click();
        return this;
    }
}
