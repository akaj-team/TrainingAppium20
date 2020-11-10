package stepdefs.at_hungnguyen3;

import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hungnguyen3.FoodDetailsPage;

public class FoodDetailsDefinitions implements En {

    FoodDetailsPage foodDetailsPage = new PageFactory<>(FoodDetailsPage.class).create();

    public FoodDetailsDefinitions() {

        Given("^InfoPage is opened$", () -> foodDetailsPage.open().isPageDisplayed());

        When("^I click BackToHome button$", () -> foodDetailsPage.clickBtnBackToHome());

        When("^I click Videos button$", () -> foodDetailsPage.clickVideoButton());

        Then("^Servings Size is exist$", () -> Assert.assertTrue(foodDetailsPage.getSizeOfServing() > 0));

        Then("^Types is exist$", () -> Assert.assertTrue(foodDetailsPage.getSizeOfTypes() > 0));

        When("^Check Size of Servings$", () -> Assert.assertTrue(true));

        When("^Check Size of Type$", () -> Assert.assertTrue(true));

    }
}
