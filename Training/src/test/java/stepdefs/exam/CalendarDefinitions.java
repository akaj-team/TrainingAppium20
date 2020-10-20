package stepdefs.exam;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import page.exam.at_hungnguyen3.CalendarPage;

public class CalendarDefinitions extends BaseDefinitions implements En {
    CalendarPage calendarPage = new PageFactory<>(CalendarPage.class).create();

    public CalendarDefinitions() {

        Given("^Calendar screen is opened$", () -> {calendarPage.open();
        });
        When("^I tap on back button$", () ->{calendarPage.clickBackButton();});
        When("^I check content of item$", () -> {calendarPage.getItemText(); });
        When("^I check display initial time$", () -> {calendarPage.getTime(); });
        When("^I check display of Calendar screen$", () -> {calendarPage.isHistoryDisplay(); });
        Then("^Calendar is displayed$", () -> {calendarPage.isHistoryDisplay(); });


    }
    }