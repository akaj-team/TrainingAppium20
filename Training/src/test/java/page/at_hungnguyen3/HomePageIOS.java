package page.at_hungnguyen3;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

import java.util.List;

public class HomePageIOS extends HomePage {

    MobileElement tabBar = (MobileElement) getDriver().findElementByClassName("UIATabBar");

    @iOSFindBy(className = "UIATable")
    private MobileElement container;

    @iOSFindBy(className = "UIAButton")
    List<MobileElement> listTabBar;

    @iOSFindBy(xpath = "//*[@id='ic calendar']/parent::*//*[@class='UIAStaticText']")
    List<MobileElement> listFoodName;

    @iOSFindBy(className = "UIANavigationBar")
    MobileElement actionBar;

    @iOSFindBy(id = "ic stat")
    MobileElement btnChart;

    MobileElement tweaksMenu = listTabBar.get(1);

    MobileElement btnAbout = listTabBar.get(2);

    @iOSFindBy(id = "More Info")
    List<MobileElement> listMoreInfo;

    @iOSFindBy(className = "UIAStaticText")
    List<MobileElement> listAboutMenu;

    @iOSFindBy(xpath = "//*[@text='About']")
    MobileElement tvAbout;

    public HomePageIOS(MobileDriver driver) {
        super(driver);
    }

    @Override
    public String getTextTitle() {
        return actionBar.findElement(By.className("UIAStaticText")).getText();
    }

    @Override
    public String getTextTweaksMenu() {
        return listTabBar.get(1).getText();
    }

    @Override
    public HomePage clickBtnTweaks() {
        waitForElementDisplay(listTabBar.get(1));
        listTabBar.get(1).click();
        return this;
    }

    @Override
    public boolean isTweaksMenuContainsText(String text) {
        waitForElementDisplay(listTabBar.get(1));
        return getTextTweaksMenu().contains(text);
    }

    @Override
    public HomePage clickFoodDetails(int pos) {
        waitForElementDisplay(listMoreInfo.get(pos));
        scrollToElement(listMoreInfo.get(pos));
        listMoreInfo.get(pos).click();
        return this;
    }

    @Override
    public HomePage clickBtnAbout() {
        waitForElementDisplay(listTabBar.get(2), 5000);
        listTabBar.get(2).click();
        return this;
    }

    @Override
    public boolean isAboutMenuDisplayed() {
        waitForElementDisplay(tvAbout, 5000);
        return isForElementPresent(tvAbout);
    }

    @Override
    public String getTextFoodName(int pos) {
        waitForElementDisplay(container.findElements(By.className("UIAStaticText")).get(pos));
        return container.findElements(By.className("UIAStaticText")).get(pos).getText();
    }

    @Override
    public HomePage clickBtnChart() {
        waitForElementDisplay(btnChart,2);
        btnChart.click();
        return this;
    }
}


