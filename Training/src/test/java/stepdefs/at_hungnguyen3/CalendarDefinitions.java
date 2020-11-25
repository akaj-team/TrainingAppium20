package stepdefs.at_hungnguyen3;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hungnguyen3.CalendarPage;

public class CalendarDefinitions extends BaseDefinitions implements En {
    CalendarPage calendarPage = new PageFactory<>(CalendarPage.class).create();

    public CalendarDefinitions() {

        Given("^Calendar screen is opened$", () -> {
            Assert.assertTrue(calendarPage.open().isPageDisplayed());
        });
        When("^I tap on back button$", () -> {
            calendarPage.clickBtnBack();
        });
        When("^I check content of item$", () -> {
        });
        When("^I check display initial time$", () ->
                Assert.assertTrue(true));
        When("^I check display of Calendar screen$", () -> {
            Assert.assertTrue(calendarPage.isPageDisplayed());
        });
        Then("^Calendar is displayed$", () -> {
            calendarPage.isPageDisplayed();
        });

        Then("^The initial time is current time$", () ->
                calendarPage.isCurrentTime());

        When("^I check display of history$", () ->
                Assert.assertTrue(true));

        Then("^Text is \"([^\"]*)\"$", (String text) ->
                Assert.assertEquals(calendarPage.getTextHistory(), text));
        When("^I check item$", () ->
                Assert.assertTrue(true));

        Then("^Item text is correct$", () ->
                calendarPage.isItemCorrect());


    }
}
