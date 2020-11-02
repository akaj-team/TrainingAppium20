package stepdefs.exam;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.exam.at_hungnguyen3.HomePage;

public class HomeDefinitions extends BaseDefinitions implements En {
    HomePage homePage = new PageFactory<>(HomePage.class).create();

    public HomeDefinitions() {
        When("^I check title on home screen$", () -> Assert.assertTrue(true));

        Then("^The title is \"([^\"]*)\"$", (String titleText) -> Assert.assertEquals(homePage.getTextTitle(), titleText));

        When("^I check content tweaks button$", () -> Assert.assertTrue(true));


        Given("^Home screen is opened$", () -> Assert.assertTrue(homePage.open().isPageDisplayed()));
    }
}
