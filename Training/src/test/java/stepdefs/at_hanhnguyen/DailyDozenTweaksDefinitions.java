package stepdefs.at_hanhnguyen;

import at.core.PageFactory;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import at.base.BaseDefinitions;
import org.testng.Assert;
import page.at_hanhnguyen.DailyDozenTweaksAndroidPage;
import page.at_hanhnguyen.DailyDozenTweaksPage;
import page.at_hanhnguyen.TweakDetailPage;

/**
 * @author hanhnguyent
 */
class DailyDozenTweaksDefinitions extends BaseDefinitions implements En {
    DailyDozenTweaksPage dailyDozenTweaksPage= new PageFactory<>(DailyDozenTweaksPage.class).create();
    TweakDetailPage tweakDetailPage= new PageFactory<>(TweakDetailPage.class).create();
    DailyDozenTweaksAndroidPage dailyDozenTweaksAndroidPage=new PageFactory<>(DailyDozenTweaksAndroidPage.class).create();

    public DailyDozenTweaksDefinitions() {
        Given("^Tweaks screen is opened$", () ->
                Assert.assertTrue(dailyDozenTweaksPage.open().isPageDisplayed()));

        When("^I check title on Daily Dozen Tweaks screen$", () -> Assert.assertTrue(true));

        Then("^The title is \"([^\"]*)\" which was shown$", (String expectedText) ->
                Assert.assertEquals(dailyDozenTweaksAndroidPage.verifyTweakText(),expectedText));
        When("^I check default tab on Tweak screen$", () -> Assert.assertTrue(true));

        Then("^The default tab is today$", () -> Assert.assertTrue(dailyDozenTweaksPage.getCurrentDate()));

        When("^I tap into calendar icon$", () -> dailyDozenTweaksPage.clickIntoCalendarIcon());

        And("^I tap into \"([^\"]*)\"$", (String date) -> dailyDozenTweaksPage.selectDate(date));

        Then("^showing the tab is \"([^\"]*)\"$", (String dateAfterSelect) ->
                Assert.assertEquals(dailyDozenTweaksPage.verifyDateAfterSelectDate(),dateAfterSelect));
        When("^I check title under Tweak text$", () -> Assert.assertTrue(true));

        Then("^The title under the Tweak text is \"([^\"]*)\"$", (String expectedText) ->
                Assert.assertEquals(dailyDozenTweaksAndroidPage.verifyWeightText(),expectedText));
        When("^I check  the eye open is shown or not$", () -> Assert.assertTrue(true));

        Then("^The the eye open is shown$", () -> Assert.assertTrue(dailyDozenTweaksAndroidPage.verifyTheEyeOpen()));

        When("^I check showing the title at AT EACH MEAL group$", () -> Assert.assertTrue(true));

        Then("^The group title shows as \"([^\"]*)\"$", (String groupName) ->
                Assert.assertTrue(dailyDozenTweaksPage.verifyTitleGroupShowCorrectly(groupName)));

        When("^I check showing the all items AT EACH MEAL$", () -> Assert.assertTrue(true));

        Then("^All items in AT EACH MEAL are shown correctly with \"([^\"]*)\"$", (String itemName) ->
                Assert.assertTrue(dailyDozenTweaksPage.verifyAllItemsShowCorrectly(itemName)));
        Then("^Showing the calendar with title is \"([^\"]*)\"$", (String historyTitle) ->
                Assert.assertEquals(dailyDozenTweaksPage.verifyCalendarPopUpTitle(),historyTitle));
        When("^I tap into \"([^\"]*)\" item$", (String itemName) -> dailyDozenTweaksPage.clickIntoItem(itemName));
        Then("^Showing the item detail page with title is \"([^\"]*)\"$", (String title) ->
                Assert.assertEquals(tweakDetailPage.getTextTitleAtTweakDetail(),title));
        And("^Showing the image on this page$", () -> Assert.assertTrue(tweakDetailPage.isImageDisplay()));

        And("^showing the title of content is \"([^\"]*)\"$", (String itemName) ->
                Assert.assertEquals(tweakDetailPage.getTextTitleOfContent(),itemName));
        And("^Showing the content on this page$", () -> Assert.assertTrue(tweakDetailPage.getTextfContent()));

        When("^I tap back button detail item page$", () -> tweakDetailPage.clickBackButton());

        Then("^Showing the Daily Dozen Tweaks screen$", () -> dailyDozenTweaksPage.isPageDisplayed());

        When("^I tap into checkbox on each item$", () -> dailyDozenTweaksPage.clickIntoAllCheckbox());

        Then("^all check box on row was checked$", () -> Assert.assertTrue(dailyDozenTweaksPage.verifyCheckboxIsChecked()));

    }
}
