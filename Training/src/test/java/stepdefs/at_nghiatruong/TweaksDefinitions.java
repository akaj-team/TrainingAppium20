package stepdefs.at_nghiatruong;

import at.core.PageFactory;
import at_nghiatruong.TweaksPage;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.exam.HomePage;

/**
 * @author AT-Nghia Truong on 10/19/20.
 */
public class TweaksDefinitions implements En {
    TweaksPage tweaksPage = new PageFactory<>(TweaksPage.class).create();


    public TweaksDefinitions() {
        Given("^Tweaks screen is opened$", () -> Assert.assertTrue(tweaksPage.open().isPageDisplayed()));
        When("^I click the first checkbox$", () -> {
        });
        When("^I go to Tweaks page$", () -> {
        });
        Then("^all checkboxes are unchecked$", () -> {
        });
        Then("^all checkboxes are checked$", () -> {
        });
        When("^I click the Second checkbox$", () -> {
        });
        And("^I click the third checkbox$", () -> {
        });
        When("^I click the checkbox$", () -> {
        });
        Then("^The check  box is checked$", () -> {
        });
        And("^I click the second checkbox$", () -> {
        });
        Then("^third checkboxes is also checked$", () -> {
        });
        Then("^Only the third checkboxes is checked$", () -> {
        });
        When("^I click all the first checkbox$", () -> {tweaksPage.clickAllCheckboxes().isAllCheckboxesSelected();
        });
    }
}
