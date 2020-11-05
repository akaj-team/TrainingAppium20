package stepdefs.at_hainguyen.settings;

import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hainguyen.settings.SettingsPage;

public class SettingsDefinitions implements En {
    SettingsPage page = new PageFactory<>(SettingsPage.class).create();

    public SettingsDefinitions() {
        Given("^Settings screen is opened$", () -> {
            Assert.assertTrue(page.open().isPageDisplayed());
        });
        Then("^The title of Settings must is \"([^\"]*)\"$", (String arg0) -> {
            Assert.assertEquals(page.getTitle(), arg0);
        });
        And("^The title of section (\\d+) must is \"([^\"]*)\"$", (Integer arg0, String arg1) -> {
            if (arg0 == 1) {
                Assert.assertEquals(page.getTitleOfSection1(), arg1);
            } else if (arg0 == 2) {
                Assert.assertEquals(page.getTitleOfSection2(), arg1);
            } else if (arg0 == 3) {
                Assert.assertEquals(page.getTitleOfSection3(), arg1);
            }
        });
        And("^The content of note section (\\d+) must is \"([^\"]*)\"$", (Integer arg0, String arg1) -> {
            Assert.assertEquals(page.getContentNoteOfSection1(), arg1);
        });
        And("^The title of cell in section (\\d+) must is \"([^\"]*)\"$", (Integer arg0, String arg1) -> {

        });
        And("^The content of note section (\\d+) must is \"([^\"]*)\"', 'Daily Dozen Only', '\"([^\"]*)\"', 'Daily Dozen \\+ (\\d+) Tweaks', '\"([^\"]*)\"', 'Daily Dozen Only', '\"([^\"]*)\"', 'Daily Dozen \\+ (\\d+) Tweaks', '\"([^\"]*)\"$", (Integer arg0, String arg1, String arg2, Integer arg3, String arg4, String arg5, Integer arg6, String arg7) -> {
        });
        And("^The tile of bottom button must is \"([^\"]*)\"$", (String arg0) -> {
        });
        When("^Tap on button `Imperial`$", () -> {
        });
        Then("^Button `Imperial` must is highlight and button `Metric` and button `Toggle Units` must is gray$", () -> {
        });
        When("^Tap on button `Metric`$", () -> {
        });
        Then("^Button `Metric` must is highlight and button Imperial and button `Toggle Units` must is gray$", () -> {
        });
        When("^Tap on button `Toggle Units`$", () -> {
        });
        Then("^Button `Toggle Units` must is highlight and button `Imperial` and button `Metric` must is gray$", () -> {
        });
        When("^Value of `Enable Reminders` is true$", () -> {
        });
        Then("^Status of `Enable Reminders` must is On$", () -> {
        });
        When("^Value of `Enable Reminders` is falser$", () -> {
        });
        Then("^Status of `Enable Reminders` must is Off$", () -> {
        });
    }
}
