package stepdefs.at_hungnguyen3;

import at.core.PageFactory;
import cucumber.api.java8.En;
import org.junit.Assert;
import page.at_hungnguyen3.chart.ChartPage;
import page.at_hungnguyen3.tweaks.TweaksPage;

public class ChartDefinitions implements En {
    ChartPage chartPage = new PageFactory<>(ChartPage.class).create();
    TweaksPage tweaksPage = new PageFactory<>(TweaksPage.class).create();

    public ChartDefinitions() {
        Given("^ChartPage screen is opened$", () -> {
            Assert.assertTrue(chartPage.open().isPageDisplayed());
        });

        When("^I Check Text of tv Header$", () -> Assert.assertTrue(true));

        Then("^Text is \"([^\"]*)\"$", (String text) -> Assert.assertEquals(chartPage.getTextTvHeader(), text));

        When("^I click Home Button$", () -> {
            chartPage.clickBtnButton();
            Thread.sleep(2000);
        });
        When("^I check title of Chart screen$", () -> {
            Assert.assertTrue(true);
        });

        Then("^Title is \"([^\"]*)\" or \"([^\"]*)\"$", (String arg0, String arg1) -> {
            Assert.assertTrue(chartPage.isTitleCorrect());
        });
    }
}
