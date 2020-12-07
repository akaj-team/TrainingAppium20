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
import java.util.Random;

public abstract class InfoPage extends BasePage {

    @AndroidFindBy(id = "action_bar")
    @iOSFindBy(className = "UIATabBar")
    protected MobileElement actionBar;

    @AndroidFindBy(className = "android.widget.ListView")
    @iOSFindBy(className = "UIATable")
    protected MobileElement listTitle;


    public InfoPage(MobileDriver driver) {
        super(driver);
    }

    public static int randomNumber() {
        Random random = new Random(8);
        return random.nextInt();
    }

    @Override
    public InfoPage open() {
        if (!isPageDisplayed()) {
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.open().clickInfoMenuButton();
            waitForPageDisplayed();
        }
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

    public InfoPage waitForPageDisplayed() {
        waitForElementDisplay(getListItem().get(0));
        return this;
    }

    public String getTextInfo(int pos) {
        return getListItem().get(pos).getText();
    }

    public InfoPage clickAboutItem() {
        getListItem().get(10).click();
        return this;
    }

    public InfoPage clickDonateItem() {
        getListItem().get(5).click();
        return this;
    }

    public InfoPage clickBackButton() {
        return this;
    }
}
