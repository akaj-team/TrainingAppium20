package page.exam.at_hungnguyen3;

import at.base.BasePage;
import at.core.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SettingsPage extends BasePage {

    @iOSFindBy(id = "Settings")
    private MobileElement titleLabel;

    @iOSFindBy(id = "MEASUREMENT UNITS")
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
        return isForElementPresent(titleLabel);
    }

    @Override
    public SettingsPage open() {
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            HomePage homePage = new PageFactory<>(HomePage.class).create();
           homePage.open();
           homePage.open();

            waitForElementDisplay(titleLabel);
        }
        return this;
    }

    public String getTitle() {
        return titleLabel.getText();
    }

    public String getTitleOfSection1() {
        return titleSection1Label.getText();
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