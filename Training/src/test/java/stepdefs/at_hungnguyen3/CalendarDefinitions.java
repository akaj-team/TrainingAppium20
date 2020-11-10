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
            calendarPage.clickBackButton();
        });
        When("^I check content of item$", () -> {
        });
        When("^I check display initial time$", () -> {
        });
        When("^I check display of Calendar screen$", () -> {
            Assert.assertTrue(calendarPage.isPageDisplayed());
        });
        Then("^Calendar is displayed$", () -> {
            calendarPage.isPageDisplayed();
        });
        When("^I tap on info button$", () -> {
        });
        When("^I tap on settings button$", () -> {
        });
        When("^I tap on daily dozen button$", () -> {
        });
        When("^I tap on next button$", () -> {
        });
        When("^I tap on next previous button$", () -> {
        });
    }
}
