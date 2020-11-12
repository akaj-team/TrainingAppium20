package stepdefs.at_hungnguyen3;

import at.core.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java8.En;
import page.at_hungnguyen3.ServingsHistoryPage;

public class ServingsHistoryDefinitions implements En {

    ServingsHistoryPage servingsHistoryPage = new PageFactory<>(ServingsHistoryPage.class).create();

    public ServingsHistoryDefinitions() {

        Given("^Servings History Page is opened$", () -> servingsHistoryPage.open().isPageDisplayed());

        Then("^Text contains \"([^\"]*)\"$", (String text) ->
                servingsHistoryPage.getTextTitle().contains(text));

        When("^I click Back button in Servings History Page$", () ->
                servingsHistoryPage.clickBackButton());

        When("^I click time spinner button in Servings History Page$", () ->
                servingsHistoryPage.clickTimeSpinner());

        Then("^List time spinner is displayed$", () ->
                servingsHistoryPage.isListTimeSpinnerDisplayed());

    }
}
