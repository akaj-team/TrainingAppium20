package page.at_hoatran;

import at.base.BasePage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

/**
 * for screen
 *
 * @author at-hoa.tran
 */

public class InfoPage extends BasePage {

    @AndroidFindBy(id = "action_bar")
    private MobileElement actionBar;

    @iOSFindBy(id="Info")
    private MobileElement txtTitle;

    @AndroidFindBy(xpath = "//*[@text='Latest Videos']")
    @iOSFindBy(id = "'Latest Videos")
    private MobileElement btnLatestVideos;

    @AndroidFindBy(xpath = "//*[@text='How Not to Die']")
    @iOSFindBy(id = "How Not to Die")
    private MobileElement btnHowNotToDie;

    @AndroidFindBy(xpath = "//*[@text='Cookbook']")
    @iOSFindBy(id="How Not to Die Cookbook")
    private MobileElement btnCookBook;

    @AndroidFindBy(xpath = "//*[@text='How Not to Diet']")
    @iOSFindBy(id="How Not to Diet")
    private MobileElement btnHowNotToDiet;

    @AndroidFindBy(xpath = "//*[@text='Daily Dozen Challenge']")
    @iOSFindBy(id="Daily Dozen Challenge")
    private MobileElement btnDailyDozenChallenge;

    @AndroidFindBy(xpath = "//*[@text='Donate']")
    @iOSFindBy(id = "Donate")
    private MobileElement btnDonate;

    @AndroidFindBy(xpath = "//*[@text='Subscribe']")
    @iOSFindBy(id = "Subscribe")
    private MobileElement btnSubscribe;

    @AndroidFindBy(xpath = "//*[@text='Open Source']")
    @iOSFindBy(id = "Open Source")
    private MobileElement btnOpenSource;

    @AndroidFindBy(xpath = "//*[@text='Daily Reminder Settings']")
    private MobileElement btnDailyReminderSettings;

    @AndroidFindBy(xpath = "//*[@text='Backup']")
    private MobileElement btnBackup;

    @AndroidFindBy(xpath = "//*[@text='About']")
    @iOSFindBy(id = "About")
    private MobileElement btnAbout;


    public InfoPage(MobileDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(actionBar);
    }


    @Override
    public BasePage open(){
        if (!isPageDisplayed()) {
            getDriver().launchApp();
            waitForPageDisplayed(actionBar);
        }
        return this;
    }

    public InfoPage clickMoreOptionsButton() {
        actionBar.findElement(By.className("android.widget.ImageView")).click();
        return this;
    }

    public boolean isListMenuDisplay() {
        return isForElementPresent(btnLatestVideos);
    }

    public InfoPage openInfoPage(){
        if (!isListMenuDisplay()) {
            getDriver().launchApp();
            open();
            clickMoreOptionsButton();
        }
        return this;
    }

    public String getTextTitle() { return txtTitle.getText(); }
    public InfoPage clickTextTitle() {
        txtTitle.click();
        return this;
    }

    public String getTextLatestVideos() {
        return btnLatestVideos.getText();
    }
    public InfoPage clickLatestVideosButton() {
        btnLatestVideos.click();
        return this;
    }

    public String getTextHowNotToDie() {
        return btnHowNotToDie.getText();
    }
    public InfoPage clickHowNotToDieButton() {
        btnHowNotToDie.click();
        return this;
    }

    public String getTextCookbook() {
        return btnCookBook.getText();
    }
    public InfoPage clickCookbookButton() {
        btnCookBook.click();
        return this;
    }

    public String getTextHowNotToDiet() {
        return btnHowNotToDiet.getText();
    }
    public InfoPage clickHowNotToDietButton() {
        btnHowNotToDiet.click();
        return this;
    }

    public String getTextDailyDozenChallenge() {
        return btnDailyDozenChallenge.getText();
    }
    public InfoPage clickDailyDozenChallengeButton() {
        btnDailyDozenChallenge.click();
        return this;
    }

    public String getTextDonate() {
        return btnDonate.getText();
    }
    public InfoPage clickDonateButton() {
        btnDonate.click();
        return this;
    }

    public String getTextSubscribe() {
        return btnSubscribe.getText();
    }
    public InfoPage clickSubscribeButton() {
        btnSubscribe.click();
        return this;
    }

    public String getTextOpenSource() {
        return btnOpenSource.getText();
    }
    public InfoPage clickOpenSourceButton() {
        btnOpenSource.click();
        return this;
    }

    public String getTextDailyReminderSettings() {
        return btnDailyReminderSettings.getText();
    }
    public InfoPage clickDailyReminderSettingsButton() {
        btnDailyReminderSettings.click();
        return this;
    }

    public String getTextBackup() {
        return btnBackup.getText();
    }
    public InfoPage clickBackupButton() {
        btnBackup.click();
        return this;
    }

    public String getTextAbout() {
        return btnAbout.getText();
    }
    public InfoPage clickAboutButton() {
        btnAbout.click();
        return this;
    }

}
