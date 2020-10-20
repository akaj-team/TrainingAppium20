package page.at_hoatran;

import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import page.exam.HomePage;

public class InfoPageIOS extends HomePage {
    @iOSFindBy(className = "UIATable")
    private MobileElement listTitle;

    @iOSFindBy(className="UIANavigationBar")
    private MobileElement txtTitleOfPage;

    public InfoPageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(listTitle.findElement(By.id("Latest Videos")));
    }

    public HomePage openInfoScreen(){
        HomePage homePage = new PageFactory<>(HomePage.class).create();
        homePage.openInfoPageIOS();
        return this;
    }

    public boolean isAboutThisAppDisplayed(){
        return isForElementPresent(txtTitleOfPage.findElement(By.className("UIAStaticText")));
    }

    public String getTitleOfPage() {
        return txtTitleOfPage.findElement(By.className("UIAStaticText")).getText();
    }

    public InfoPageIOS clickTitleOfPage() {
        txtTitleOfPage.findElement(By.className("UIAStaticText")).click();
        return this;
    }

    public String getTitle(int n) {
        return listTitle.findElements(By.className("UIAStaticText")).get(n-1).getText();
    }

    public InfoPageIOS clickTitleButton(int n) {
        listTitle.findElements(By.className("UIAStaticText")).get(n-1).click();
        return this;
    }
}
