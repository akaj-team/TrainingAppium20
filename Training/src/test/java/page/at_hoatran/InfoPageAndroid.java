package page.at_hoatran;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class InfoPageAndroid extends BasePage {
    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @AndroidFindBy(className = "android.widget.ListView")
    private MobileElement listTitle;

    @AndroidFindBy(id="url_bar")
    private MobileElement urlBar;

    public InfoPageAndroid(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(listTitle.findElement(By.xpath("//*[@text='Latest Videos']")));
    }

    @Override
    public BasePage open(){
        clickMoreOptionsButton();
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            clickMoreOptionsButton();
            waitForPageDisplayed(listTitle.findElement(By.xpath("//*[@text='Latest Videos']")));
        }
        return this;
    }

    public InfoPageAndroid clickMoreOptionsButton() {
        actionBar.findElement(By.className("android.widget.ImageView")).click();
        return this;
    }

    public String getTitle(int n) {
        List<MobileElement> title = listTitle.findElements(By.className("android.widget.LinearLayout"));
//        List<MobileElement> title = listTitle.findElements(By.id("Title"));
        System.out.println(title.size());
        if (!title.isEmpty()) {
            return title.get(n).getText();
        }
        return null;
    }

    public InfoPageAndroid clickTitleButton(int n) {
        List<MobileElement> title = listTitle.findElements(By.id("Title"));
        System.out.println(title.size());
        if (!title.isEmpty()) {
            title.get(n).click(); // print text in {n}th element
            return this;
        }
        return this;
    }
}
