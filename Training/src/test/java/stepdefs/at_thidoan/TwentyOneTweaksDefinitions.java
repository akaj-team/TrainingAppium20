package stepdefs.at_thidoan;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_thidoan.TwentyOneTweaks;

public class TwentyOneTweaksDefinitions extends BaseDefinitions implements En {
    TwentyOneTweaks twentyOneTweaks = new PageFactory<>(TwentyOneTweaks.class).create();

    public TwentyOneTweaksDefinitions() {
        Given("^Twenty one Tweaks screen is opened$", () -> {

            twentyOneTweaks.clickBtnMenuToggleMode();
        });
        When("^I check all check boxes$", () -> {
            twentyOneTweaks.checkAllCheckBoxes();
        });
        Then("^All check boxes are checked successfully$", () -> {
            Assert.assertTrue(twentyOneTweaks.isAllCheckBoxChecked());
        });
        When("^I uncheck all check boxes$", () -> {
            twentyOneTweaks.uncheckAllCheckBoxes();
        });
        Then("^All check boxes are unchecked successfully$", () -> {
            Assert.assertTrue(twentyOneTweaks.isAllCheckBoxUnchecked());
        });
        When("^I click calendar button of the Preload Water$", () -> {
            twentyOneTweaks.clickBtnCalendar();
        });
        Then("^The calendar Preload Water in the current date is opened successfully$", () -> {
            Assert.assertTrue(twentyOneTweaks.isCalendarOfPreloadWaterDisplayed());
        });
        When("^I click info button of the Preload Water$", () -> {
            twentyOneTweaks.clickBtnMoreInfo();
        });
        Then("^The Preload Water detail is opened successfully$", () -> {
            Assert.assertTrue(twentyOneTweaks.isDetailPreloadWaterDisplayed());
        });
    }
}
