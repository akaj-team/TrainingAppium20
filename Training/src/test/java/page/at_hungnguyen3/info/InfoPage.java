package page.at_hungnguyen3.info;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import page.at_hungnguyen3.home.HomePage;

import java.util.ArrayList;
import java.util.List;

public class InfoPage extends BasePage {

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIATabBar")
    protected MobileElement actionBar;

    @AndroidFindBy(className = "android.widget.ListView")
    @iOSFindBy(className = "UIATable")
    protected MobileElement listTitle;

    public InfoPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public InfoPage open() {
        if (!isPageDisplayed()) {
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.open().clickInfoMenuButton();
            waitForElementDisplay(getListItem().get(0));
        }
        return this;
    }

    public List<MobileElement> getListItem() {
        return new ArrayList<>();
    }

    public String getTextInfo(int pos) {
        return getListItem().get(pos).getText();
    }

    public InfoPage clickAboutItem() {
        return this;
    }

    public InfoPage clickDonateItem() {
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

    public InfoPage clickBackButton() {
        return this;
    }

    public boolean checkItemInListCorrect(int pos , String itemName){
        return false;
    }
}
