package page.exam.info;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.ArrayList;
import java.util.List;

public class InfoPage extends BasePage {

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIATabBar")
    public MobileElement actionBar;

    @AndroidFindBy(className = "android.widget.ListView")
    @iOSFindBy(className = "UIATable")
    public MobileElement listTitle;


    public InfoPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public BasePage open() {
        return this;
    }

    @Override
    public boolean isPageDisplayed() {
        try {
            return getListItem().size() > 0;
        } catch (Exception e) {
            //No-op
        }
        return false;
    }

    public List<MobileElement> getListItem() {
        return new ArrayList<>();
    }
}
