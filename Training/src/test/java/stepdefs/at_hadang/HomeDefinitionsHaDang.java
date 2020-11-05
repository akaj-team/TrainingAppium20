package stepdefs.at_hadang;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hadang.*;

/**
 * for Home screen
 *
 * @author at-ha.dang
 */

public class HomeDefinitionsHaDang extends BaseDefinitions implements En {
    HomePageHaDang homePageHaDang = new PageFactory<>(HomePageHaDang.class).create();
    CalendarPageHaDang calendarPageHaDang = new PageFactory<>(CalendarPageHaDang.class).create();
    ServicesPageHaDang servicesPageHaDang = new PageFactory<>(ServicesPageHaDang.class).create();
    TweaksPageHaDang tweaksPageHaDang = new PageFactory<>(TweaksPageHaDang.class).create();
    InfoPageHaDang infoPageHaDang = new PageFactory<>(InfoPageHaDang.class).create();
    ServingHistoryPageHaDang servingHistoryPageHaDang = new PageFactory<>(ServingHistoryPageHaDang.class).create();

    public HomeDefinitionsHaDang() {
        Given("^Home page is opened at_hadang$", () -> {
            Assert.assertTrue(homePageHaDang.open().isPageDisplayed());
        });
        When("^I check title of Home screen at_hadang$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The title of Home screen is \"([^\"]*)\" at_hadang$", (String text) -> {
            Assert.assertEquals(homePageHaDang.getTextTitle(), text);
        });
        When("^I check header text of Home screen at_hadang$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The header text of Home screen is \"([^\"]*)\" at_hadang$", (String text) -> {
            Assert.assertEquals(homePageHaDang.getTextHeader(), text);
        });
        When("^I check display of items in the Servings list at_hadang$", () -> {
            Assert.assertTrue(true);
        });
        Then("^I see \"([^\"]*)\" item at the (\\d+) position on list at_hadang$", (String name, Integer pos) -> {
            homePageHaDang.getTextOfFoodName(pos).contains(name);
        });
        When("^I click on the Calendar button of each item at_hadang$", () -> {
            homePageHaDang.clickCalendarButton();
        });
        Then("^Move to Calendar screen of \"([^\"]*)\" item successfully at_hadang$", (String name) -> {
            Assert.assertTrue(calendarPageHaDang.open().isPageDisplayed());
            Assert.assertEquals(calendarPageHaDang.getTextTitle(), name);
        });
        When("^I click on the More Info button of \"([^\"]*)\" item at the (\\d+) position at_hadang$", (String name, Integer pos) -> {
            homePageHaDang.clickMoreInfoButton(name, pos);
        });
        Then("^Move to Servings Size screen of \"([^\"]*)\" item successfully at_hadang$", (String name) -> {
            Assert.assertTrue(servicesPageHaDang.open().isPageDisplayed());
            Assert.assertEquals(servicesPageHaDang.getFoodName(), name);
        });
        When("^I click on the More Info button of \"([^\"]*)\" item at the (\\d+) th position at_hadang$", (String name, Integer pos) -> {
            homePageHaDang.clickMoreInfoButton(name, pos);
        });
        Then("^The Home screen is not displayed at_hadang$", () -> {
            Assert.assertFalse(homePageHaDang.isPageDisplayed());
        });
        When("^I click on the Tweaks button at_hadang$", () -> {
            homePageHaDang.click21TweaksButton();
        });
        Then("^Move to \"([^\"]*)\" screen successfully at_hadang$", (String title) -> {
            Assert.assertTrue(tweaksPageHaDang.open().isPageDisplayed());
            Assert.assertEquals(tweaksPageHaDang.getTextTitle(), title);
        });
        When("^I click on the InfoMenu button at_hadang$", () -> {
            homePageHaDang.clickInfoMenuButton();
        });
        Then("^Move to Info screen successfully at_hadang$", () -> {
            Assert.assertTrue(infoPageHaDang.open().isPageDisplayed());
        });
        When("^I click on the Chart button at_hadang$", () -> {
            homePageHaDang.clickChartButton();
        });
        Then("^Move to Servings History screen successfully at_hadang$", () -> {
            Assert.assertTrue(servingHistoryPageHaDang.open().isPageDisplayed());
        });
        And("^The screen title contains text \"([^\"]*)\" at_hadang$", (String title) -> {
            servingHistoryPageHaDang.getScreenTitle().contains(title);
        });
    }
}
