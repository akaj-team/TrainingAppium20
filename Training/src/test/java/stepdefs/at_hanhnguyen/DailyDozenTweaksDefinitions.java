package stepdefs.at_hanhnguyen;

import at.core.PageFactory;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import at.base.BaseDefinitions;
import org.testng.Assert;
import page.at_hanhnguyen.DailyDozenTweaksPage;

/**
 * @author hanhnguyent
 */
class DailyDozenTweaksDefinitions extends BaseDefinitions implements En {
    DailyDozenTweaksPage dailyDozenTweaksPage= new PageFactory<>(DailyDozenTweaksPage.class).create();

    public DailyDozenTweaksDefinitions() {
        Given("^Tweaks screen is opened$", () -> {
           Assert.assertTrue(dailyDozenTweaksPage.open().isPageDisplayed());
        });
        When("^I check title on Daily Dozen Tweaks screen$", () -> {
           Assert.assertTrue(true);
        });
        Then("^The title is \"([^\"]*)\" which was shown$", (String expectedText) -> {
            Assert.assertEquals(dailyDozenTweaksPage.verifyTweakText(),expectedText);
        });
        When("^I check default tab on Tweak screen$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The default tab is today as \"([^\"]*)\"$", (String currentDate) -> {
            Assert.assertEquals(dailyDozenTweaksPage.getCurrentDate(),currentDate);
        });
        When("^I tap into calendar icon$", () -> {
            dailyDozenTweaksPage.clickIntoCalendarIcon();
        });
        And("^I tap into \"([^\"]*)\"$", (String date) -> {
            dailyDozenTweaksPage.selectDate(date);
        });
        Then("^showing the tab is \"([^\"]*)\"$", (String dateAfterSelect) -> {
            Assert.assertEquals(dailyDozenTweaksPage.verifyDateAfterSelectDate(),dateAfterSelect);
        });
        When("^I check title under Tweak text$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The title under the Tweak text is \"([^\"]*)\"$", (String expectedText) -> {
            Assert.assertEquals(dailyDozenTweaksPage.verifyWeightText(),expectedText);
        });
        When("^I check  the eye open is shown or not$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The the eye open is shown$", () -> {
            Assert.assertTrue(dailyDozenTweaksPage.verifyTheEyeOpen());
        });
        When("^I check showing the title at AT EACH MEAL group$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The group title shows as \"([^\"]*)\"$", (String groupName) -> {
            Assert.assertTrue(dailyDozenTweaksPage.verifyTitleGroupShowCorrectly(groupName));
        });
        When("^I check showing the all items AT EACH MEAL$", () -> {
            Assert.assertTrue(true);
        });
        Then("^All items in AT EACH MEAL are shown correctly with \"([^\"]*)\"$", (String itemName) -> {
            Assert.assertTrue(dailyDozenTweaksPage.verifyAllItemsShowCorrectly(itemName));
        });
        Then("^Showing the calendar with title is \"([^\"]*)\"$", (String historyTitle) -> {
           Assert.assertEquals(dailyDozenTweaksPage.verifyCalendarPopUpTitle(),historyTitle);
        });
        When("^I tap into first item$", () -> {

        });
        Then("^Showing the item detail page with title is \"([^\"]*)\"$", (String arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        And("^Showing the image on this page$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        And("^showing the title of content is \"([^\"]*)\"$", (String arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        And("^Showing the content on this page$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        When("^I tap back button detail item page$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        Then("^Showing the Daily Dozen Tweaks screen$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        When("^I tap into checkbox on each item$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        Then("^all check box on row was checked$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

    }
}
