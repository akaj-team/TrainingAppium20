package stepdefs.home;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.home.HomePage;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class HomeDefinitions extends BaseDefinitions implements En {
    HomePage homePage = new PageFactory<>(HomePage.class).create();

    public HomeDefinitions() {
        When("^I check title on home screen$", () -> Assert.assertTrue(true));

        Then("^The title is \"([^\"]*)\"$", (String text) -> Assert.assertEquals(homePage.getTextTitle(), text));

        When("^I check content tweaks button$", () -> Assert.assertTrue(true));

        Then("^The content contain \"([^\"]*)\"$", (String text) -> Assert.assertTrue(homePage.isContentTvMenuToggleModesContain(text)));

        When("^I click more option button$", () -> homePage.clickMenuButton());

        Then("^Display list options menu$", () -> Assert.assertTrue(homePage.isListMenuDisplay()));

        Given("^Home screen is opened$", () -> Assert.assertTrue(homePage.open().isPageDisplayed()));
    }
}
