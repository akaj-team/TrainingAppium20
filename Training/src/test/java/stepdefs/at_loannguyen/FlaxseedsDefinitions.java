package stepdefs.at_loannguyen;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_loannguyen.FlaxseedsPage;

public class FlaxseedsDefinitions extends BaseDefinitions implements En {
    FlaxseedsPage flaxseedsPage = new PageFactory<>(FlaxseedsPage.class).create();

    public FlaxseedsDefinitions() {

        Given("^Flaxseeds Detail screen is opened$", () -> {
            Assert.assertTrue(flaxseedsPage.open().isPageDisplayed());
        });
        Then("^The screen name is \"([^\"]*)\"$", (String arg0) -> {

        });

        When("^I click <= button$", () -> {
            flaxseedsPage.clickBackButton();
        });
        Then("^Display Home screen$", () -> {
            Assert.assertTrue(flaxseedsPage.isPageDisplayed());
        });

        When("^I click VIDEOS button$", () -> {
            flaxseedsPage.clickVideosButton();
        });
        Then("^Display \\[Information of Flaxseeds\\] webview$", () -> {
            Assert.assertTrue(flaxseedsPage.isPageDisplayed());
        });

        Then("^The content is \"([^\"]*)\"$", (String arg0) -> {
        });

        Then("^Button is IMPERIAL$", () -> {
            String currentValue = flaxseedsPage.getTextButtonImperial();
            if (!currentValue.equals("IMPERIAL")) {
                flaxseedsPage.clickImperialButton();
            }
        });
        When("^I click IMPERIAL button$", () -> {
            flaxseedsPage.clickImperialButton();
        });
        Then("^IMPERIAL button change to METRIC button$", () -> {
            Assert.assertEquals(flaxseedsPage.getTextButtonImperial(), "METRIC");
        });

        Then("^Button is METRIC$", () -> {
            String currentValue = flaxseedsPage.getTextButtonImperial();
            if(!currentValue.equals("METRIC")){
                flaxseedsPage.clickImperialButton();
            }
        });
        When("^I click METRIC button$", () -> {
            flaxseedsPage.clickImperialButton();
        });
        Then("^METRIC button change to IMPERIAL button$", () -> {
            Assert.assertEquals(flaxseedsPage.getTextButtonImperial(), "IMPERIAL" );
        });

        Then("^The sub content of \\[Serving Sizes\\] is \"([^\"]*)\"$", (String arg0) -> {

        });

        Then("^The content (\\d+) is \"([^\"]*)\"$", (Integer arg0, String arg1) -> {
        });

        When("^I check display of Units label$", () -> {
        });
        Then("^The content of units is \"([^\"]*)\"$", (String arg0) -> {
        });
        
        When("^I check list of \\[Types\\]$", () -> {
        });
        Then("^The list of \\[Types\\] is displayed correctly$", () -> {
        });
    }
}
