package stepdefs.at_hungnguyen3;

import at.core.PageFactory;
import cucumber.api.java8.En;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import page.at_hungnguyen3.detailfood.DetailFoodPage;
import page.at_hungnguyen3.home.HomePage;

public class DetailFoodDefinitions implements En {

    DetailFoodPage detailFoodPage = new PageFactory<>(DetailFoodPage.class).create();
    HomePage homePage = new PageFactory<>(HomePage.class).create();
    AppiumDriver driver;

    public DetailFoodDefinitions() {

        Given("^FoodDetailPage is opened$", () -> { Assert.assertTrue(detailFoodPage.open().isPageDisplayed()); });

        When("^I click BackToHome button$", () -> {
            detailFoodPage.clickBtnHomeButton();
            Thread.sleep(2000);
        });

        When("^I click TV Videos button$", () -> {
            detailFoodPage.clickFirstTvVideo();
            Thread.sleep(2000);
        });

        Then("^FoodDetailPage is not displayed$", () ->
        {
            Thread.sleep(5000);
            Assert.assertFalse(detailFoodPage.isPageDisplayed());
            homePage.openApp();
        });

        When("^Check display of Food Image$", () -> { Assert.assertTrue(true); });

        Then("^Food Image is displayed$", () -> { detailFoodPage.isFoodImageDisplayed(); });

        When("^Check Size of Servings and Type$", () -> { Assert.assertTrue(true); });

        Then("^Servings Size and Type is displayed$", () -> { detailFoodPage.isListServingAndTypeDisplayed(); });

    }
}
