package stepdefs.at_thaile;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.exam.at_thaile.ServingHistoryPage;

/**
 * for screen
 *
 * @author at-thai.le
 */

public class ServingHistoryDefinitions extends BaseDefinitions implements En{
    ServingHistoryPage servingHistory = new PageFactory<>(ServingHistoryPage.class).create();

    public ServingHistoryDefinitions(){

        When("^I check title on ServingHistory screen$", () -> Assert.assertTrue(true));

        Then("^The title is \"Serving History\"$", (String text) -> Assert.assertEquals(servingHistory.getTextScreenTitle(), text));
    }
}