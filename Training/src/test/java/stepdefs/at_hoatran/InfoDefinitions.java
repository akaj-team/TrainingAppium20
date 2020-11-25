package stepdefs.at_hoatran;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.Assert;
import page.at_hoatran.InfoPage;

public class InfoDefinitions extends BaseDefinitions implements En {
    InfoPage infoPage = new PageFactory<>(InfoPage.class).create();

    public InfoDefinitions() {
        Given("^Info screen is opened$", () -> {
            Assert.assertTrue(infoPage.open().isPageDisplayed());
        });

        When("^Check Title of Info screen$", () -> Assert.assertTrue(true));
        Then("^Title is displayed correctly with content \"([^\"]*)\"$", (String text) -> Assert.assertEquals(infoPage.getTitleOfPage(), text));
        When("^Tap on Title of Info screen$", () -> infoPage.clickTitleOfPage());
        Then("^Nothing happens$", () -> Assert.assertTrue(infoPage.open().isPageDisplayed()));

        When("^Check content of (\\d+) th menu$", (Integer n) -> Assert.assertTrue(true));
        Then("^Content of (\\d+) th menu is displayed correctly \"([^\"]*)\"$", (Integer n, String text) -> Assert.assertEquals(infoPage.getTitle(n), text));

        When("^Tap on (\\d+) th menu$", (Integer n) -> infoPage.clickTitleButton(n));

        Then("^Move to \"([^\"]*)\"$", (String text) -> {
            WebDriver driver;
            SafariOptions options = new SafariOptions();
            driver = new SafariDriver(options);
            Thread.sleep(4000);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, text);
            driver.close();
        });

        Then("^About this app screen is displayed correctly$", () -> {
            Assert.assertTrue(infoPage.isAboutThisAppDisplayed());
        });

    }
}
