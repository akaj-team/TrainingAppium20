package stepdefs.at_loannguyen;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_loannguyen.FlaxseedsDetailPage;
import page.exam.HomePage;

public class FlaxseedsDefinitions extends BaseDefinitions implements En {
    FlaxseedsDetailPage flaxseedsPage = new PageFactory<>(FlaxseedsDetailPage.class).create();

    public FlaxseedsDefinitions() {

        Given("^Flaxseeds Detail screen is opened$", () -> {
            Assert.assertTrue(flaxseedsPage.open().isPageDisplayed());
        });
        Then("^The screen name is \"([^\"]*)\"$", (String arg0) -> {
            Assert.assertEquals(flaxseedsPage.getScreenName(), arg0);
        });

        When("^I click <= button$", () -> {
            flaxseedsPage.clickBackButton();
        });
        Then("^Display Home screen$", () -> {
            Assert.assertTrue(flaxseedsPage.hp.isPageDisplayed());
        });

        When("^I click VIDEOS button$", () -> {
            flaxseedsPage.clickVideosButton();
        });
        Then("^Display \\[Information of Flaxseeds\\] webview$", () -> {
            Assert.assertTrue(flaxseedsPage.isPageDisplayed());
        });

        Then("^The content is \"([^\"]*)\"$", (String arg0) -> {
        });

        Given("^Button must is IMPERIAL$", () -> {
            String currentValue = flaxseedsPage.getTextButtonImerial();
            if (!currentValue.equals("IMPERIAL")) {
                flaxseedsPage.clickImperialButton();
            }
        });
        When("^I click IMPERIAL button$", () -> {
            flaxseedsPage.clickImperialButton();
        });
        Then("^IMPERIAL button change to METRIC button$", () -> {
            Assert.assertEquals(flaxseedsPage.getTextButtonImerial(), "METRIC");
        });

        Given("^Button must is METRIC$", () -> {
            String currentValue = flaxseedsPage.getTextButtonImerial();
            if(!currentValue.equals("METRIC")){
                flaxseedsPage.clickImperialButton();
            }
        });
        When("^I click METRIC button$", () -> {
            flaxseedsPage.clickImperialButton();
        });
        Then("^METRIC button change to IMPERIAL button$", () -> {
            Assert.assertEquals(flaxseedsPage.getTextButtonImerial(), "IMPERIAL" );
        });

        Then("^The sub content of \\[Serving Sizes\\] is \"([^\"]*)\"$", (String arg0) -> {

        });

        Then("^The content (\\d+) is \"([^\"]*)\"$", (Integer arg0, String arg1) -> {
        });

        Then("^The sub content of \\[Types\\] is \"([^\"]*)\"$", (String arg0) -> {
        });

        Then("^The sub content (\\d+) of \\[Types\\] is \"([^\"]*)\"$", (Integer arg0, String arg1) -> {
        });
    }
}
