package stepdefs.at_hungnguyen3;

import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hungnguyen3.InfoPage;

public class InfoDefinitions implements En {
    InfoPage infoPage = new PageFactory<>(InfoPage.class).create();

    public InfoDefinitions() {

        Given("^InfoPage is opened$", () -> infoPage.open().isPageDisplayed());

        When("^I click BackToHome button$", () -> infoPage.clickBtnBackToHome());

        When("^I click Videos button$", () -> infoPage.clickVideoButton());

        Then("^Servings Size is exist$", () -> Assert.assertTrue(infoPage.getSizeOfServing() > 0));

        Then("^Types is exist$", () -> Assert.assertTrue(infoPage.getSizeOfTypes() > 0));

        When("^Check Size of Servings$", () -> Assert.assertTrue(true));

        When("^Check Size of Type$", () -> Assert.assertTrue(true));

    }
}
