package stepdefs.at_loannguyen;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_loannguyen.FoodDetailPage;
import page.at_loannguyen.FoodDetailPageAndroid;
import page.at_loannguyen.HomePage;

public class FoodDetailDefinitions extends BaseDefinitions implements En {
    FoodDetailPage foodDetailPage = new PageFactory<>(FoodDetailPage.class).create();
    HomePage homePage = new PageFactory<>(HomePage.class).create();

    public FoodDetailDefinitions() {
        When("^I check screen name of \\[Food Detail\\] screen$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The screen name is \"([^\"]*)\"$", (String arg0) -> {
            Assert.assertEquals(foodDetailPage.getScreenName(), arg0);
        });

        When("^I click <= button$", () -> {
            foodDetailPage.tapBackButton();
        });
        Then("^Display Home screen$", () -> {
            Assert.assertTrue(homePage.open().isPageDisplayed());
        });

        When("^I click VIDEOS button$", () -> {
            foodDetailPage.clickVideosButton();
        });
        Then("^Display \\[Information of Food\\] webview$", () -> {
            Thread.sleep(2000);
            Assert.assertFalse(foodDetailPage.isPageDisplayed());
        });

        When("^I check content is \"([^\"]*)\"$", (String arg0) -> {
            Assert.assertTrue(true);
        });
        Then("^The content is \"([^\"]*)\"$", (String arg0) -> {
            foodDetailPage.getContentServingSize();
        });

        Then("^Button is IMPERIAL$", () -> {
            String currentValue = foodDetailPage.getTextButtonImperial();
            if (!currentValue.equals("IMPERIAL")) {
                foodDetailPage.clickImperialButton();
            }
        });

        When("^I click IMPERIAL button$", () -> {
            foodDetailPage.clickImperialButton();
        });
        Then("^IMPERIAL button change to METRIC button$", () -> {
            Assert.assertEquals(foodDetailPage.getTextButtonImperial(), "METRIC");
        });

        Then("^Button is METRIC$", () -> {
            String currentValue = foodDetailPage.getTextButtonImperial();
            if (!currentValue.equals("METRIC")) {
                foodDetailPage.clickImperialButton();
            }
        });
        When("^I click METRIC button$", () -> {
            foodDetailPage.clickImperialButton();
        });
        Then("^METRIC button change to IMPERIAL button$", () -> {
            Assert.assertEquals(foodDetailPage.getTextButtonImperial(), "IMPERIAL");
        });

        When("^I check sub content of \\[Serving Sizes\\]$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The sub content of \\[Serving Sizes\\] is \"([^\"]*)\"$", (String arg0) -> {
            foodDetailPage.getSubContent();
        });

        When("^I check content (\\d+)$", (Integer arg0) -> {
            Assert.assertTrue(true);
        });
        Then("^The content (\\d+) is \"([^\"]*)\"$", (Integer arg0, String arg1) -> {
            foodDetailPage.getContentTypes();
        });

        When("^I check display of Units label$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The content of units is \"([^\"]*)\"$", (String arg0) -> {
            foodDetailPage.getContentUnit();
        });

        When("^I check list of \\[Types\\]$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The list of \\[Types\\] is displayed correctly$", () -> {

        });

        Given("^Food Detail screen is opened$", () -> {
            homePage.open().clickItemsList(6);
        });
    }
}
