package stepdefs.exam;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import cucumber.api.java8.Pa;
import org.testng.Assert;
import page.exam.at_hungnguyen3.CalendarPage;
import page.exam.at_hungnguyen3.HomePage;
import page.exam.at_hungnguyen3.InfoPage;
import page.exam.at_hungnguyen3.TweaksPage;

import java.util.Calendar;

public class HomeDefinitions extends BaseDefinitions implements En {
    int pos = 0;
    HomePage homePage = new PageFactory<>(HomePage.class).create();
    CalendarPage calendarPage = new PageFactory<>(CalendarPage.class).create();
    InfoPage infoPage = new PageFactory<>(InfoPage.class).create();
    TweaksPage tweaksPage = new PageFactory<>(TweaksPage.class).create();

    public HomeDefinitions() {
        When("^I check title on home screen$", () -> Assert.assertTrue(true));

        Then("^The title is \"([^\"]*)\"$", (String titleText) ->
                Assert.assertEquals(homePage.getTextTitle(), titleText));

        When("^I check content tweaks button$", () -> Assert.assertTrue(true));

        Given("^Home screen is opened$", () -> Assert.assertTrue(homePage.open().isPageDisplayed()));

        Then("^The content contain \"([^\"]*)\"$", (String tweaksText) ->
                homePage.isTweaksMenuContainsText(tweaksText));

        When("^I click Calendar Button$", () -> homePage.clickBtnCalendar(2));

        Then("^Calendar Page is displayed$", () -> calendarPage.isPageDisplayed());

        When("^I click Info button$", () -> homePage.clickMoreInfo(2));

        Then("^InfoPage is displayed$", () -> infoPage.isPageDisplayed());

        When("^I check display of Food Name in the Servings list$", () -> Assert.assertTrue(true));

        Then("^Texts of Food Names contains \"([^\"]*)\"$", (String foodName) -> {
            String actualFoodName = homePage.getTextFoodName(pos);
            actualFoodName.contains(foodName);
            pos++;
        });

        When("^I click Tweaks button$", () -> homePage.clickBtnTweaks());

        Then("^TweaksPage is displayed$", () -> Assert.assertTrue(tweaksPage.isPageDisplayed()));

    }
}
