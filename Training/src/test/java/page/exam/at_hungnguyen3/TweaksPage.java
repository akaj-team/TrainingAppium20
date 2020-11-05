package page.exam.at_hungnguyen3;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class TweaksPage extends BasePage {

    @AndroidFindBy(id = "tweak_name")
    @iOSFindBy(xpath = "//*[@text='ic calendar']/parent::*//*[@class='UIAStaticText']")
    MobileElement tweaksName;

    public TweaksPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(tweaksName);
    }

    @Override
    public TweaksPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.open().clickBtnTweaks();
            waitForElementDisplay(tweaksName);
        }
        return this;
    }

    public boolean isTweaksNameDisplayed(){
        waitForElementDisplay(tweaksName,5000);
        return isForElementPresent(tweaksName);
    }
}
