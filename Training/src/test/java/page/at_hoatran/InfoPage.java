package page.at_hoatran;

import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import page.exam.HomePage;

public abstract class InfoPage extends HomePage {

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIATabBar")
    public MobileElement actionBar;

    @AndroidFindBy(className = "android.widget.ListView")
    @iOSFindBy(className = "UIATable")
    public MobileElement listTitle;

    @AndroidFindBy(className = "//*[@text='Latest Videos']")
    @iOSFindBy(id = "Latest Videos")
    private MobileElement btnLatestVideo;

    @AndroidFindBy(id="url_bar")
    private MobileElement urlBar;

    public InfoPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(listTitle.findElement(By.id("Latest Videos")));
    }

    public String getTitleOfPage() {
        return "";
    }

    public InfoPage clickTitleOfPage() {
        return this;
    }

    public String getTitle(int n) {
        return "";
    }

    public InfoPage clickTitleButton(int n) {
        return this;
    }

    public boolean isAboutThisAppDisplayed(){
        return false;
    }
}
