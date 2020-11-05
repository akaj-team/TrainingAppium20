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
    CalendarPageIOS calendarPageIOS = new PageFactory<>(CalendarPageIOS.class).create();
    CalendarPageAndroid calendarPageAndroid = new PageFactory<>(CalendarPageAndroid.class).create();

    public CalendarDefinitions() {

        Given("^Calendar screen is opened$", () -> {
            Assert.assertTrue(calendarPage.open().isHistoryDisplay());
        });
        When("^I tap on back button$", () -> {
            calendarPage.clickBackButton();
        });
        When("^I check content of item$", () -> {
        });
        When("^I check display initial time$", () -> {
        });
        When("^I check display of Calendar screen$", () -> {
            Assert.assertTrue(calendarPage.isHistoryDisplay());
        });
        Then("^Calendar is displayed$", () -> {
            calendarPage.isHistoryDisplay();
        });
        When("^I tap on info button$", () -> {
            calendarPageIOS.clickInfoButton();
        });
        When("^I tap on settings button$", () -> {
            calendarPageIOS.clickSettingsButton();
        });
        When("^I tap on daily dozen button$", () -> {
            calendarPageIOS.clickDailyDozenButton();
        });
        When("^I tap on next button$", () -> {
            calendarPageAndroid.clickToNextButton();
        });
        When("^I tap on next previous button$", () -> {
            calendarPageAndroid.clickToPreviousButton();
        });
    }
}
