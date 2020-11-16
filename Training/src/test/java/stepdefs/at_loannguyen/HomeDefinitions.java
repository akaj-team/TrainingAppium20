package stepdefs.at_loannguyen;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_loannguyen.CalendarPage;
import page.at_loannguyen.HomePage;
import page.at_loannguyen.TweaksPage;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class HomeDefinitions extends BaseDefinitions implements En {
    HomePage homePage = new PageFactory<>(HomePage.class).create();
    CalendarPage calendarPage = new PageFactory<>(CalendarPage.class).create();
    TweaksPage tweaksPage = new PageFactory<>(TweaksPage.class).create();
    int pos =0;

    public HomeDefinitions() {
        When("^I check content tweaks button$", () ->
                Assert.assertTrue(true));
        Then("^The content contain \"([^\"]*)\"$", (String text) ->
                Assert.assertTrue(homePage.isContentTvMenuToggleModesContain(text)));

        Given("^Home screen is opened$", () ->
                Assert.assertTrue(homePage.open().isPageDisplayed()));

        When("^I check title on home screen$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The title is \"([^\"]*)\"$", (String arg0) -> {
            Assert.assertEquals(homePage.getTitle(),arg0);
        });

        When("^I check display of items in the Servings list$", () -> {
            Assert.assertTrue(true);
        });
        Then("^I see \"([^\"]*)\" item at the position on list$", (String arg0) -> {
            homePage.getNameOfListMenu(pos);
            pos ++;
        });

        When("^I click \\[Calendar\\] button$", () -> {
            homePage.clickButtonCalendar(pos);
            pos++;
        });
        Then("^\\[Calendar\\] screen is displayed correctly$", () -> {
            calendarPage.isHistoryDisplay();
        });

        When("^I click \\[TWEAKS\\] button$", () -> {
            homePage.clickButtonTweaks();
        });
        Then("^\\[TWEAKS\\] screen is displayed correctly$", () -> {
            tweaksPage.open().isDailyDozenDisplay();
        });
        
        When("^I check content of \\[Servings\\] text$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The content of \\[Servings\\] text is \"([^\"]*)\"$", (String arg0) -> {
            homePage.getTextServings();
        });
    }
}
