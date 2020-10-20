package at_nghiatruong;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

/**
 * @author AT-Nghia Truong on 10/19/20.
 */
public class TweaksPage extends BasePage {

    public TweaksPage(MobileDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @AndroidFindBy(className = "//*[@class='android.widget.TextView']")
    private MobileElement listMenu;

    @AndroidFindBy(className = "//*[@class='android.widget.CheckBox']")
    private MobileElement listCheckboxes;

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }

    @Override
    public BasePage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
        }
        return this;
    }

    public TweaksPage clickOnTweaksButton() {
        actionBar.findElement(By.xpath("//*[@text='21 Tweaks']")).click();
        return this;
    }

    public boolean isListCheckboxesDisplay() {
        return isForElementPresent(listCheckboxes);
    }
}
