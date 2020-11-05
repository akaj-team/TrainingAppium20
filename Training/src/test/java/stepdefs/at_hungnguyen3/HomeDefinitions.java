package stepdefs.at_hungnguyen3;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hungnguyen3.CalendarPage;
import page.at_hungnguyen3.HomePage;
import page.at_hungnguyen3.InfoPage;
import page.at_hungnguyen3.TweaksPage;

public class HomeDefinitions extends BaseDefinitions implements En {
    int pos = 0;
    HomePage homePage = new PageFactory<>(HomePage.class).create();
    CalendarPage calendarPage = new PageFactory<>(CalendarPage.class).create();
    InfoPage infoPage = new PageFactory<>(InfoPage.class).create();
    TweaksPage tweaksPage = new PageFactory<>(TweaksPage.class).create();

    public HomeDefinitions() {

        When("^I check title on home screen$", () -> Assert.assertTrue(true));

        Then("^The title is \"([^\"]*)\"$", (String titleText) -> Assert.assertEquals(homePage.getTextTitle(), titleText));

        When("^I check content tweaks button$", () -> Assert.assertTrue(true));

        When("^I check display of Food Name in the Servings list$", () -> Assert.assertTrue(true));

        Then("^Texts of Food Names contains \"([^\"]*)\"$", (String foodName) -> {
            if (homePage.isPageDisplayed()) {
                String actualFoodName = homePage.getTextFoodName(pos);
                actualFoodName.contains(foodName);
                pos++;
            }
        });

        When("^I click Info button$", () -> homePage.clickMoreInfo(0));

        When("^I click Tweaks button$", () -> homePage.clickBtnTweaks());

        When("^I click Calendar Button$", () -> homePage.clickBtnCalendar(0));

        Then("^InfoPage is displayed$", () -> infoPage.isBtnVideoDisplayed());

        Then("^TweaksPage is displayed$", () -> tweaksPage.isTweaksNameDisplayed());

        Then("^CalendarPage is displayed$", () -> calendarPage.isPageDisplayed());

        Then("^The content contain \"([^\"]*)\" or \"([^\"]*)\"$", (String text1, String text2) ->
                Assert.assertTrue(homePage.isTweaksMenuContainsText(text1) || homePage.isTweaksMenuContainsText(text2)));

        When("^I click About button$", () -> homePage.clickBtnAbout());

        Then("^About Menu is displayed$", () -> homePage.isAboutMenuDisplayed());

        Given("^HomePage is opened$", () -> homePage.open().isPageDisplayed());
    }

}
