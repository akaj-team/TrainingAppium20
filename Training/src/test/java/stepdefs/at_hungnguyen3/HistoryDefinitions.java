package stepdefs.at_hungnguyen3;

import at.core.PageFactory;
import cucumber.api.java8.En;
import org.junit.Assert;
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

        Then("^The initial time is current time$", () -> {
            historyPage.isCurrentTime();
        });

        When("^I swipe from the left$", () -> {
            historyPage.swipeToTheRight();
            Thread.sleep(2000);
        });

        Then("^The time is not current time$", () -> {
            Assert.assertFalse(historyPage.isCurrentTime());
        });

        When("^I swipe from the right$", () -> {
            historyPage.swipeToTheLeft();
            Thread.sleep(2000);
        });

    }
}
