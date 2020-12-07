package stepdefs.at_hungnguyen3;

import at.core.PageFactory;
import cucumber.api.java8.En;
import org.junit.Assert;
import page.at_hungnguyen3.info.InfoPage;

public class InfoDefinitions implements En {
    int pos = 0;
    InfoPage infoPage = new PageFactory<>(InfoPage.class).create();

    public InfoDefinitions() {

        Given("^InfoPage is opened$", () -> {
            Assert.assertTrue(infoPage.open().isPageDisplayed());
        });

        Then("^Info Menu is \"([^\"]*)\"$", (String arg0) -> {
            Assert.assertEquals(infoPage.getTextInfo(pos),arg0);
            pos++; });

        When("^I click About$", () -> {
            infoPage.clickAboutItem();
            Thread.sleep(2000); });

        When("^I click back button$", () -> {
            infoPage.clickBackButton();
            Thread.sleep(2000);
        });

        When("^I click Donate$", () -> { infoPage.clickDonateItem(); });

        When("^I check List Info$", () -> { Assert.assertTrue(true);
        });

    }
}
