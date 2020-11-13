package stepdefs.at_thaile;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.exam.at_thaile.HomePage;
import page.exam.at_thaile.HomePageAndroid;
import page.exam.at_thaile.HomePageIOS;
import page.exam.at_thaile.ServingHistoryPage;

public class HomeDefinitions extends BaseDefinitions implements En {
    HomePage hp = new PageFactory<>(HomePage.class).create();
    ServingHistoryPage servingHistory = new PageFactory<>(ServingHistoryPage.class).create();
    HomePageAndroid homePageAndroid = new PageFactory<>(page.exam.at_thaile.HomePageAndroid.class).create();
    HomePageIOS homePageIOS = new PageFactory<>(HomePageIOS.class).create();

    public HomeDefinitions() {

        When("^I open HomePage screen$", () -> Assert.assertTrue(true));
        Then("^Screen title is \"([^\"]*)\"$", (String text) -> Assert.assertEquals(hp.getTextTitle(), text));

        When("^I click on Stat button$", () -> hp.clickStatButton());
        Then("^Open Serving History screen$", () -> Assert.assertTrue(servingHistory.open().isPageDisplayed()));

        When("^I click on Today button$", () -> homePageIOS.clickTodayButton());
        Then("^Display TimeView$", () -> Assert.assertFalse(hp.open().isPageDisplayed()));

        When("^I click on More Info button$", () -> hp.clickMoreInfoButton());
        Then("^Open Service screen$", () -> Assert.assertFalse(hp.open().isPageDisplayed()));

        When("^I click on Supplements button$", () -> homePageIOS.clickSupplyButton());
        Then("^Display Supplements pop-up$", () -> Assert.assertTrue(homePageIOS.open().isDisplaySupplyPopup));

        When("^I click on Beans Calendar button$", () -> hp.clickCalendarButton());
        Then("^Beans calendar screen is display$", () -> Assert.assertFalse(hp.open().isPageDisplayed()));

        Given("^HomePage screen is opened$", () -> Assert.assertTrue(hp.open().isPageDisplayed()));

        When("^I click on Beans Checkbox$", () -> homePageAndroid.clickCheckBox());
        Then("^Beans checkbox is ticked$", () -> );


    }
}