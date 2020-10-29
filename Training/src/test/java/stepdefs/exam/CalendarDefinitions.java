package stepdefs.exam;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.exam.at_hungnguyen3.CalendarPage;
import page.exam.at_hungnguyen3.CalendarPageAndroid;
import page.exam.at_hungnguyen3.CalendarPageIOS;

public class CalendarDefinitions extends BaseDefinitions implements En {
    CalendarPage calendarPage = new PageFactory<>(CalendarPage.class).create();

    public CalendarDefinitions() {

        Given("^Calendar screen is opened$", () -> {
            Assert.assertTrue(calendarPage.open().isPageDisplayed());
        });
        When("^I tap on back button$", () -> {
            calendarPage.clickBackButton();
        });
        When("^I check display initial time$", () -> {
        });
        When("^I check display of Calendar screen$", () -> {
        });
        Then("^Calendar is displayed$", () -> {
            Assert.assertTrue(calendarPage.isHistoryDisplay());
        });
        Then("^The initial time is current time$", () -> {
            calendarPage.isCurrentTime();
        });
    }
}
