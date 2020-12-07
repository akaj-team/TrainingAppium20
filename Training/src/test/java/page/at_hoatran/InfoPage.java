package page.at_hoatran;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public abstract class InfoPage extends BasePage {

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIATabBar")
    public MobileElement actionBar;

    @AndroidFindBy(className = "android.widget.ListView")
    @iOSFindBy(className = "UIATable")
    public MobileElement listTitle;

    @AndroidFindBy(className = "//*[@text='Latest Videos']")
    @iOSFindBy(id = "Latest Videos")
    private MobileElement btnLatestVideo;

    @AndroidFindBy(id = "url_bar")
    private MobileElement urlBar;

    public InfoPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(btnLatestVideo);
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

    public boolean isAboutThisAppDisplayed() {
        return false;
    }
}
