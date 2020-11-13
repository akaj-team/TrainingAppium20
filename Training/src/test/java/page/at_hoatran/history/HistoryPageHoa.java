package page.at_hoatran.history;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class HistoryPageHoa extends BasePage {

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIANavigationBar")
    public MobileElement actionBar;

    @AndroidFindBy(xpath = "//*[@text='History']")
    @iOSFindBy(xpath = "//*[@text='History']")
    private MobileElement tvHeader;

    public HistoryPageHoa(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(tvHeader);
    }

    @Override
    public HistoryPageHoa open() {
        return this;
    }

    public String getTitle() {
        return "";
    }

    public HistoryPageHoa clickBackButton() {
        return this;
    }

    public HistoryPageHoa waitForPageDisplayed() {
        waitForElementDisplay(tvHeader);
        return this;
    }
}
