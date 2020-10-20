package stepdefs.at_nghiatruong;

import at.core.PageFactory;
import at_nghiatruong.TweaksPage;
import cucumber.api.java8.En;

/**
 * @author AT-Nghia Truong on 10/19/20.
 */
public class TweaksDefinitions implements En {
    TweaksPage tweaksPage = new PageFactory<>(TweaksPage.class).create();

    public TweaksDefinitions() {
        Given("^Tweaks screen is opened$", () -> tweaksPage.clickOnTweaksButton());
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
        Then("^(\\d+)rd checkboxes is also checked$", (Integer arg0) -> {
        });
        Then("^Only the (\\d+)rd checkboxes is checked$", (Integer arg0) -> {
        });
        And("^I click the third checkbox$", () -> {
        });
        When("^I click the checkbox$", () -> {
        });
        Then("^The check  box is checked$", () -> {
        });
        And("^I click the second checkbox$", () -> {
        });
    }
}
