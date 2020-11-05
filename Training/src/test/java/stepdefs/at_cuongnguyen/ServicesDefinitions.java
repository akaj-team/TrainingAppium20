package stepdefs.at_cuongnguyen;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import page.at_cuongnguyen.ServicesPage;
import cucumber.api.java8.En;
import org.testng.Assert;

public class ServicesDefinitions extends BaseDefinitions implements En {
    ServicesPage svp = new PageFactory<>(ServicesPage.class).create();

    public ServicesDefinitions() {

        Given("^Services screen is opened$", () -> Assert.assertTrue(svp.isPageDisplayed()));

        Then("^The header bar including Back button on the left$", () -> Assert.assertTrue(svp.isDailyDozenBtnContain()));

        When("^I check the header bar of screen$", () -> Assert.assertTrue(svp.open().isPageDisplayed()));

        Then("^The header bar including Videos button on the right$", () -> Assert.assertTrue(svp.isbtnvideoContain()));

        When("^I click on Back button$", () -> svp.clickPreviousButton());

        When("^I click on Videos on button$", () -> {
            svp.clickVideoButton();
        });

        Then("^I move to previous screen$", () -> Assert.assertTrue(svp.isPreviousScreenDisplayed()));

        Then("^Open the url in new tab correctly with param-request$", () -> {
        });

        When("^I move to \\[service\\] area$", () -> {
            Assert.assertTrue(svp.checkServicesArea());
        });

        Then("^I check the \\[Service type\\] text is \"([^\"]*)\"$", (String text) -> {
            Assert.assertEquals(svp.getTextTitle(), text);
        });

        Then("^I click on Unit button$", () -> {
            svp.clickUnitButton();
        });
    }
}