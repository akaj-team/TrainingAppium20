package stepdefs.at_cuongnguyen;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import at_cuongnguyen.ServicesPage;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hadang.HomePage;

public class ServicesDefinitions extends BaseDefinitions implements En {
    ServicesPage servicePage = new PageFactory<>(ServicesPage.class).create();
    HomePage homePage = new PageFactory<>(HomePage.class).create();
    String name = "";

    public ServicesDefinitions() {

        Given("^Services screen is opened$", (String name, Integer n) -> Assert.assertTrue(servicePage.open(name, n).isPageDisplayed()));

        When("^I check the header bar of screen$", () -> Assert.assertTrue(servicePage.open().isPageDisplayed()));

        Then("^The header bar including Back button on the left$", () -> Assert.assertTrue(servicePage.isDailyDozenBtnContain()));

        Then("^The header bar including Videos button on the right$", () -> Assert.assertTrue(servicePage.isBtnVideoContain()));

        When("^I click on Back button$", () -> servicePage.clickPreviousButton());

        When("^I click on Videos on button$", () -> {
            servicePage.clickVideoButton();
        });

        Then("^I move to previous screen$", () -> Assert.assertTrue(servicePage.isPreviousScreenDisplayed()));

        Then("^Open the url in new tab correctly with param-request$", () -> {
        });

        When("^I move to \\[service\\] area$", () -> {
            Assert.assertTrue(servicePage.checkServicesArea());
        });

        Then("^I check the \\[Service type\\] text is \"([^\"]*)\"$", (String text) -> {
            Assert.assertEquals(servicePage.getTextTitle(), text);
        });

        Then("^I click on Unit button$", () -> {
            servicePage.clickUnitButton();
        });

        When("^I move back to \\[Home Page\\] screen$", () -> servicePage.clickPreviousButton());

        Then("^I check the Food name item of (\\d+) position$", (Integer n) -> name = homePage.getTextOfFoodName(n));

        Then("^I move to \\[Services\\] screen having \"([^\"]*)\" at (\\d+)$", (String name, Integer n) -> {
            homePage.clickMoreInfoButton(name, n);
        });

        And("^I check the \"([^\"]*)\" on Services screen is correct", (String foodname)
                -> Assert.assertEquals(servicePage.getFoodName(), foodname));
    }
}