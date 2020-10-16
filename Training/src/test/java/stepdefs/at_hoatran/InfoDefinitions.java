package stepdefs.at_hoatran;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import page.at_hoatran.InfoPage;

import java.util.concurrent.TimeUnit;

public class InfoDefinitions extends BaseDefinitions implements En {
    InfoPage infoPage= new PageFactory<>(InfoPage.class).create();

    public InfoDefinitions() {
        Given("^Info screen is opened$", () -> {
            Assert.assertTrue(infoPage.open().isPageDisplayed());
            infoPage.clickMoreOptionsButton();
            Assert.assertTrue(infoPage.openInfoPage().isListMenuDisplay());
        });

        When("^Check Title of Info screen$", () -> Assert.assertTrue(true));
        Then("^Content of Title is displayed correctly \"([^\"]*)\"$", (String text) -> Assert.assertEquals(infoPage.getTextTitle(), text));
        When("^Tap on Title of Info screen$", () -> infoPage.clickTextTitle());
        Then("^Nothing happens$", () ->Assert.assertTrue(infoPage.openInfoPage().isListMenuDisplay()));

        When("^Check content of Latest Videos menu$", () -> Assert.assertTrue(true));
        Then("^Latest Videos menu is displayed correctly with content \"([^\"]*)\"$", (String text) -> Assert.assertEquals(infoPage.getTextLatestVideos(), text));
        When("^Tap on Latest Videos menu$", () -> infoPage.clickLatestVideosButton());
        Then("^Move to \"([^\"]*)\"$", (String text) -> {
            WebDriver driver = null;
            //   Thread.sleep(4000);
            driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
            //   WebDriverWait wait = new WebDriverWait(driver, 10);
            //   WebElement messageElement = wait.until();
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, text);
        });
        
        When("^Check content of How Not to Die menu$", () -> Assert.assertTrue(true));
        Then("^\\[How Not to Die\\] menu is displayed correctly with content \"([^\"]*)\"$", (String arg0) -> {
        });
        When("^Tap on How Not to Die menu$", () -> {
        });
        
        When("^Check content of How Not to Die Cookbook menu$", () -> Assert.assertTrue(true));
        Then("^\\[How Not to Die Cookbook\\] menu is displayed correctly with content \"([^\"]*)\"$", (String arg0) -> {
        });
        When("^Tap on How Not to Die Cookbook menu$", () -> {
        });
        
        When("^Check content of How Not to Diet menu$", () -> Assert.assertTrue(true));
        Then("^How Not to Diet menu is displayed correctly with content \"([^\"]*)\"$", (String arg0) -> {
        });
        When("^Tap on How Not to Diet menu$", () -> {
        });
        
        When("^Check content of Daily Dozen Challenge menu$", () -> {
        });
        Then("^\\[Daily Dozen Challenge\\] menu is displayed correctly with content \"([^\"]*)\"$", (String arg0) -> {
        });
        When("^Tap on \\[Daily Dozen Challenge\\] menu$", () -> {
        });
        
        When("^Check content of Donate menu$", () -> {
        });
        Then("^Donate menu is displayed correctly with content \"([^\"]*)\"$", (String arg0) -> {
        });
        When("^Tap on \\[Donate\\] menu$", () -> {
        });

        When("^Check content of \\[Subscribe\\] menu$", () -> {
        });
        Then("^Subscribe menu is displayed correctly with content \"([^\"]*)\"$", (String arg0) -> {
        });
        When("^Tap on Subscribe menu$", () -> {
        });

        When("^Check content of Open Source menu$", () -> {
        });
        Then("^Open Source menu is displayed correctly with content \"([^\"]*)\"$", (String arg0) -> {
        });
        When("^Tap on Open Source menu$", () -> {
        });

        When("^Check content of About menu$", () -> {
        });
        Then("^About menu is displayed correctly with content \"([^\"]*)\"$", (String arg0) -> {
        });
        When("^Tap on About menu$", () -> {
        });
        Then("^About this app screen is displayed correctly$", () -> {
        });

    }
}
