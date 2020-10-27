import at.base.BaseDefinitions;
import cucumber.api.java.en.Given;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import at_cuongnguyen.ServicesPageAndroid;

public class ServicesDefinition extends BaseDefinitions implements En {
    ServicesPageAndroid service = new PageFactory<>(ServicesPageAndroid.class).create();

    public ServicesDefinition() {
        Then("^The header bar including Back button on the left$", () -> {});
        When("^I check the header bar of screen$", () -> { });
        Then("^The header bar including Videos button on the right$", () -> {});
        When("^I click on Back button$", () -> {});
        Then("^I move to previous screen$", () -> {});
        When("^I click on Videos button$", () -> {});
        Then("^Open the url in new tab correctly with param-request$", () -> {});
    }

    @Given("Services screen is opened")
    public void dServicesDefinition() {
        Given("^Services screen is opened$", () -> Assert.assertTrue(service.open().isPageDisplayed()));

        When("^I check the header bar on services screen$", () -> Assert.assertTrue(true));

        Then ("^The header is including previous button which on the left of header bar$", () -> Assert.assertTrue(service.isDailyDozenBtnContain()));

        When("^I check the header bar on services screen$", () -> Assert.assertTrue(true));

        Then ("^ Having Videos button which on the right of header bar$", () -> Assert.assertTrue(service.isbtnvideoContain()));

       // When("^I Click on [Previous button]", () -> service.


    }


}
