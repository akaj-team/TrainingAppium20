package stepdefs.at_hungnguyen3;

import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hungnguyen3.InfoPage;


public class InfoDefinitions implements En {

    int pos = 0;

    InfoPage infoPage = new PageFactory<>(InfoPage.class).create();

    public InfoDefinitions() {

        Then("^Info Menu is \"([^\"]*)\"$", (String name) -> {
            Assert.assertEquals(infoPage.getTextInfo(pos), name);
            pos++;
        });

        When("^I click About$", () -> infoPage.clickAbout());

        Then("^About Page is opened$", () -> infoPage.isAboutPageDisplayed());

        When("^I click back button$", () -> infoPage.pressBackKeyDevice());

        When("^I click Donate$", () -> infoPage.clickDonate());

        Then("^InfoPage is not opened$", () -> Assert.assertFalse(infoPage.isPageDisplayed()));

        When("^I click back button (\\d+) times$", (Integer arg0) -> {
            infoPage.clickBackButton();
            Thread.sleep(1000);
            infoPage.clickBackButton();
        });

    }
}
