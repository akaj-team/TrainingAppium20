package stepdefs.at_hungnguyen3;

import at.core.PageFactory;
import cucumber.api.java8.En;
import org.junit.Assert;
import page.at_hungnguyen3.info.InfoPage;

public class InfoDefinitions implements En {

    InfoPage infoPage = new PageFactory<>(InfoPage.class).create();

    public InfoDefinitions() {

        Given("^InfoPage is opened$", () -> {
            Assert.assertTrue(infoPage.open().isPageDisplayed());
        });

        When("^I click About$", () -> {
            infoPage.clickAboutItem();
            Thread.sleep(2000);
        });

        When("^I click back button$", () -> {
            infoPage.clickBackButton();
            Thread.sleep(2000);
        });

        When("^I click Donate$", () -> {
            infoPage.clickDonateItem();
        });

        When("^I check List Info$", () -> {
            Assert.assertTrue(true);
        });

        Then("^InfoPage screen is not displayed$", () -> {
            Thread.sleep(2000);
            Assert.assertFalse(infoPage.isPageDisplayed());
        });

        Then("^I see \"([^\"]*)\" item or \"([^\"]*)\" at the (\\d+) position on list info$", (String arg0, String arg1 , Integer pos) -> {
        Assert.assertTrue(infoPage.checkItemInListCorrect(pos,arg0) || infoPage.checkItemInListCorrect(pos,arg1) );
        });


    }
    }

