package page.at_hainguyen.settings;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import page.exam.HomePage;

public class SettingsPage extends BasePage {

    @iOSFindBy(accessibility = "Settings")
    private MobileElement titleLabel;

    @iOSFindBy(accessibility = "MEASUREMENT UNITS")
    private MobileElement titleSection1Label;

    @iOSFindBy(id = "concat('Set to always be one unit type or enable the ', \"'\", 'Units:', \"'\", ' toggle button.')")
    private MobileElement noteSection1Label;

    @iOSFindBy(id = "DAILY REMINDER")
    private MobileElement titleSection2Label;

    @iOSFindBy(id = "21 TWEAKS VISIBILITY")
    private MobileElement titleSection3Label;

    public SettingsPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        System.out.println(isForElementPresent(titleSection1Label));
        return isForElementPresent(titleSection1Label);
    }

    @Override
    public SettingsPage open() {
        if (!isPageDisplayed()) {
            HomePage homePage = new PageFactory<>(HomePage.class).create();
            homePage.open();
            homePage.moveToDetail();

            //getDriver().launchApp();
            waitForElementDisplay(titleSection1Label);
        }
        return this;
    }

    public String getTitle() {
        return titleLabel.findElement(By.id("Settings")).getText();
    }

    public String getTitleOfSection1() {
        return titleSection1Label.findElement(By.id("MEASUREMENT UNITS")).getText();
    }

    public String getTitleOfSection2() {
        return titleSection2Label.getText();
    }

    public String getTitleOfSection3() {
        return titleSection3Label.getText();
    }

    public String getContentNoteOfSection1() {
        return noteSection1Label.getText();
    }
}
