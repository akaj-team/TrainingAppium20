package stepdefs.at_cuongnguyen;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import at_cuongnguyen.HomePage;
import at_cuongnguyen.ServicesPage;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hainguyen.settings.SettingsPage;
import page.at_hoatran.InfoPage;
import page.at_thidoan.TwentyOneTweaks;
import page.exam.at_hungnguyen3.CalendarPage;
import page.exam.at_thaile.ServingHistoryPage;

public class HomeDefinitions extends BaseDefinitions implements En {
    HomePage homePage = new PageFactory<>(HomePage.class).create();
    CalendarPage calendarPage = new PageFactory<>(CalendarPage.class).create();
    ServicesPage servicesPage = new PageFactory<>(ServicesPage.class).create();
    TwentyOneTweaks tweaksPage = new PageFactory<>(TwentyOneTweaks.class).create();
    InfoPage infoPage = new PageFactory<>(InfoPage.class).create();
    ServingHistoryPage servingHistoryPage = new PageFactory<>(ServingHistoryPage.class).create();
    SettingsPage settingsPage = new PageFactory<>(SettingsPage.class).create();


    public HomeDefinitions() {
        Given("^Home page is opened$", () -> Assert.assertTrue(homePage.open().isPageDisplayed()));

        When("^I check title of Home screen$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The title of Home screen is \"([^\"]*)\"$", (String text) -> {
            Assert.assertEquals(homePage.getTextTitle(), text);
        });
        When("^I check header text of Home screen$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The header text of Home screen is \"([^\"]*)\"$", (String text) -> {
            Assert.assertEquals(homePage.getTextHeader(), text);
        });
        When("^I check display of items in the Servings list$", () -> {
            Assert.assertTrue(true);
        });
        Then("^I see \"([^\"]*)\" item at the (\\d+) position on list$", (String name, Integer pos) -> {
            Assert.assertTrue(homePage.isTextOfFoodNameContain(name,pos));
        });
        When("^I click on the Calendar button of each item$", () -> {
            homePage.clickCalendarButton();
        });
        Then("^Move to History screen of \"([^\"]*)\" item successfully$", (String name) -> {
       //     Assert.assertTrue(calendarPage.open().isPageDisplayed());
         //   Assert.assertEquals(calendarPage.get(), name);
        });
        When("^I click on the More Info button of \"([^\"]*)\" item at the (\\d+) position$", (String name, Integer pos) -> {
            homePage.clickMoreInfoButton(name, pos);
        });
        Then("^Move to Servings Size screen of \"([^\"]*)\" item successfully$", (String name) -> {
            Assert.assertTrue(servicesPage.open().isPageDisplayed());
            Assert.assertEquals(servicesPage.getFoodName(), name);
        });
        When("^I click on the More Info button of \"([^\"]*)\" item at the (\\d+) th position$", (String name, Integer pos) -> {
            homePage.clickMoreInfoButton(name, pos);
        });
        Then("^The Home screen is not displayed$", () -> {
            Assert.assertFalse(homePage.isPageDisplayed());
        });
        When("^I click on the Tweaks button$", () -> {
            homePage.click21TweaksButton();
        });
        Then("^Move to Tweaks screen successfully$", () -> {
             Assert.assertTrue(tweaksPage.open().isPageDisplayed());
        });
        When("^I click on the InfoMenu button$", () -> {
            homePage.clickInfoMenuButton();
        });
        Then("^Move to Info screen successfully$", () -> {
              Assert.assertTrue(infoPage.open().isPageDisplayed());
        });
        When("^I click on the Chart button$", () -> {
            homePage.clickChartButton();
        });
        Then("^Move to Servings History screen successfully$", () -> {
             Assert.assertTrue(servingHistoryPage.open().isPageDisplayed());
        });
        When("^I click on Setting button$", () -> {});

        Then("^I move to \\[Setting\\] screen$", () -> {
            Assert.assertTrue(settingsPage.isPageDisplayed());
        });
    }
}
