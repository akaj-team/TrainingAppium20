package stepdefs.at_thaile;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.exam.HomePage;
import page.exam.at_thaile.ServingHistoryPage;

/**
 * for screen
 *
 * @author at-thai.le
 */

public class ServingHistoryDefinitions extends BaseDefinitions implements En{
    ServingHistoryPage servingHistory = new PageFactory<>(ServingHistoryPage.class).create();
    HomePage hp = new PageFactory<>(HomePage.class).create();

    public ServingHistoryDefinitions(){

        When("^I check title on ServingHistory screen$", () -> Assert.assertTrue(true));
        Then("^The title is \"Serving History\"$",
                (String text) -> Assert.assertEquals(servingHistory.getTextScreenTitle(), text));

        When("^I click Month button$", () -> servingHistory.clickMonthButton());
        Then("^Month button is active$", () -> Assert.assertTrue(servingHistory.isDisplayTimeBar()));

        When("^I click Year button$", () -> servingHistory.clickYearButton());
        Then("^Year button is active$", () -> Assert.assertFalse(servingHistory.isDisplayTimeBar()));

        When("^I click Day button$", () -> servingHistory.clickDayButton());
        Then("^Day button is active$", () -> Assert.assertTrue(servingHistory.isDisplayTimeBar()));

        When("^I check text of Time Scale$", () -> Assert.assertTrue(true));
        Then("^The text is \"([^\"]*)\"$", (String text) -> Assert.assertEquals(servingHistory.getTextTimeScale(), text));

        When("^I click Back button$", () -> servingHistory.clickBackButton());
        Then("^Display Home screen$", () -> Assert.assertTrue(hp.open().isPageDisplayed()));

    }
}
