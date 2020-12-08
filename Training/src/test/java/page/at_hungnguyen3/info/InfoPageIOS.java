package page.at_hungnguyen3.info;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

public class InfoPageIOS extends InfoPage {

    @iOSFindBy(className = "UIANavigationBar")
    protected MobileElement txtTitleOfPage;

    @iOSFindBy(id = "Info")
    protected MobileElement backButton;

    @iOSFindBy(xpath = "//*[@text='About']")
    protected MobileElement tvAbout;

    public InfoPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public List<MobileElement> getListItem() {
        if (listTitle.findElements(By.className("UIAStaticText")).size() == 9) {
            return listTitle.findElements(By.className("UIAStaticText"));
        } else return null;
    }

    @Override
    public InfoPage clickBackButton() {
        backButton.click();
        return this;
    }

    @Override
    public InfoPage clickDonateItem() {
        getListItem().get(5).click();
        return this;
    }

    @Override
    public InfoPage clickAboutItem() {
        getListItem().get(8).click();
        return this;
    }

    @Override
    public boolean checkItemInListCorrect(int pos, String itemName) {
        if (pos < 9) {
            return getTextInfo(pos).equals(itemName);
        } else return true;
    }
}
