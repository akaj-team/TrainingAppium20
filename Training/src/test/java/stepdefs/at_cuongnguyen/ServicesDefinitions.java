package stepdefs.at_cuongnguyen;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import at_cuongnguyen.Services;

public class ServicesDefinitions extends BaseDefinitions implements En {
    Services service = new PageFactory<>(Services.class).create();

    public ServicesDefinitions() {
        Then("^The header bar including Back button on the left$", () -> Assert.assertTrue(service.isImageBtnContain()));

        When("^I check the header bar of screen$", () -> Assert.assertTrue(service.open().isPageDisplayed()));

        Then("^The header bar including Videos button on the right$", () -> Assert.assertTrue(service.isBtnvideoContain()));

        When("^I click on Back button$", () -> {
        });
        Then("^I move to previous screen$", () -> {
        });
        When("^I click on Videos button$", () -> {
        });
        Then("^Open the url in new tab correctly with param-request$", () -> {
        });
        When("^I move to \\[service\\] area$", () -> {
        });
        Then("^I check the \\[Service type\\] text is Services$", () -> {
        });
    }
}
    
