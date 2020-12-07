package stepdefs.at_hungnguyen3;

import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hungnguyen3.history.HistoryPage;

public class HistoryDefinitions implements En {

    HistoryPage historyPage = new PageFactory<>(HistoryPage.class).create();

    public HistoryDefinitions() {

        Given("^HistoryPage screen is opened$", () -> {
            Assert.assertTrue(historyPage.open().isPageDisplayed());
        });

        When("^I tap on back button$", () -> {
            historyPage.clickBackButton();
            Thread.sleep(2000);
        });

        When("^I check display initial time$", () -> {
            Assert.assertTrue(true);
        });

        Then("^The initial time is current time$", () -> Assert.assertEquals(historyPage.getTextTime(), historyPage.getCurrentTimeFollowFormatMMYY()));

        When("^I swipe from the left$", () -> {
            historyPage.swipeToTheLeft();
            Thread.sleep(2000);
        });

        Then("^The time is not current time$", () ->
                Assert.assertNotEquals(historyPage.getTextTime(), historyPage.getCurrentTimeFollowFormatMMYY()));

        When("^I swipe from the right$", () -> {
            historyPage.swipeToTheRight();
            Thread.sleep(2000);
        });

    }
}
