package page.at_hoatran.info;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

public class InfoPageIOS extends InfoPage {
    @iOSFindBy(className="UIANavigationBar")
    public MobileElement txtTitleOfPage;

    public InfoPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTitleOfPage() {
        return txtTitleOfPage.findElement(By.className("UIAStaticText")).getText();
    }

    @Override
    public InfoPage clickTitleOfPage() {
        txtTitleOfPage.findElement(By.className("UIAStaticText")).click();
        return this;
    }

    @Override
    public String getTitle(int n) {
        return listTitle.findElements(By.className("UIAStaticText")).get(n-1).getText();
    }

    @Override
    public InfoPageIOS clickTitleButton(int n) {
        listTitle.findElements(By.className("UIAStaticText")).get(n-1).click();
        return this;
    }

    @Override
    public boolean isAboutThisAppDisplayed(){
        return isForElementPresent(txtTitleOfPage.findElement(By.className("UIAStaticText")));
    }
}
