package stepdefs.at_loannguyen;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_loannguyen.FoodDetailPage;

public class FoodDetailDefinitions extends BaseDefinitions implements En {
    FoodDetailPage foodDetailPage = new PageFactory<>(FoodDetailPage.class).create();

    public FoodDetailDefinitions() {
        When("^I check screen name of \\[Food Detail\\] screen$", () -> {
        });
        Then("^The screen name is \"([^\"]*)\"$", (String arg0) -> {
        });

        When("^I click <= button$", () -> {
            foodDetailPage.clickBackButton();
        });
        Then("^Display Home screen$", () -> {
            Assert.assertTrue(foodDetailPage.isPageDisplayed());
        });

        When("^I click VIDEOS button$", () -> {
            foodDetailPage.clickVideosButton();
        });
        Then("^Display \\[Information of Food\\] webview$", () -> {
            Assert.assertTrue(foodDetailPage.isPageDisplayed());
        });

        Then("^The content is \"([^\"]*)\"$", (String arg0) -> {
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
            if(!currentValue.equals("METRIC")){
                foodDetailPage.clickImperialButton();
            }
        });
        When("^I click METRIC button$", () -> {
            foodDetailPage.clickImperialButton();
        });
        Then("^METRIC button change to IMPERIAL button$", () -> {
            Assert.assertEquals(foodDetailPage.getTextButtonImperial(), "IMPERIAL" );
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

        Given("^Food Detail screen is opened$", () -> {

        });

    }
}
