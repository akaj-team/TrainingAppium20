package stepdefs.at_hadang;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hadang.HomePage;

public class HomeDefinitions extends BaseDefinitions implements En {
    HomePage homePage = new PageFactory<>(HomePage.class).create();
//    HistoryPage historyPage = new PageFactory<>(HistoryPage.class).create();
//    ServicesPage servicesPage = new PageFactory<>(ServicesPage.class).create();
//    TweaksPage tweaksPage = new PageFactory<>(TweaksPage.class).create();
//    InfoPage infoPage = new PageFactory<>(InfoPage.class).create();
//    ServingHistoryPage servingHistoryPage = new PageFactory<>(ServingHistoryPage.class).create();

    public HomeDefinitions() {
        Given("^Home page is opened$", () -> {
            Assert.assertTrue(homePage.open().isPageDisplayed());
        });
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
            Assert.assertEquals(homePage.getTextOfFoodName(pos), name);
        });
        When("^I click on the Calendar button of each item$", () -> {
            homePage.clickCalendarButton();
        });
        Then("^Move to History screen of \"([^\"]*)\" item successfully$", (String name) -> {
//            Assert.assertTrue(historyPage.open().isPageDisplayed());
//            Assert.assertEquals(historyPage.get(), name);
        });
        When("^I click on the More Info button of \"([^\"]*)\" item at the (\\d+) position$", (String name, Integer pos) -> {
            homePage.clickMoreInfoButton(name, pos);
        });
        Then("^Move to Servings Size screen of \"([^\"]*)\" item successfully$", (String name) -> {
//            Assert.assertTrue(servicesPage.open().isPageDisplayed());
//            Assert.assertEquals(servicesPage.get(), name);
        });
        When("^I click on the More Info button of \"([^\"]*)\" item at the (\\d+) th position$", (String name, Integer pos) -> {
            homePage.clickMoreInfoButton(name, pos);
        });
        Then("^The Home screen is not displayed$", () -> {
            Assert.assertTrue(homePage.isHomePageNotDisplayed());
        });
        When("^I click on the Tweaks button$", () -> {
            homePage.click21TweaksButton();
        });
        Then("^Move to Tweaks screen successfully$", () -> {
//            Assert.assertTrue(tweaksPage.open().isPageDisplayed());
        });
        When("^I click on the InfoMenu button$", () -> {
            homePage.clickInfoMenuButton();
        });
        Then("^Move to Info screen successfully$", () -> {
//            Assert.assertTrue(infoPage.open().isPageDisplayed());
        });
        When("^I click on the Chart button$", () -> {
            homePage.clickChartButton();
        });
        Then("^Move to Servings History screen successfully$", () -> {
//            Assert.assertTrue(servingHistoryPage.open().isPageDisplayed());
        });
    }
}
