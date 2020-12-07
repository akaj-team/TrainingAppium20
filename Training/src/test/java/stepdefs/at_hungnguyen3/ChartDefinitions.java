package stepdefs.at_hungnguyen3;

import at.core.PageFactory;
import cucumber.api.java8.En;
import org.junit.Assert;
import page.at_hungnguyen3.chart.ChartPage;

public class ChartDefinitions implements En {
    ChartPage chartPage = new PageFactory<>(ChartPage.class).create();

    public ChartDefinitions() {
        Given("^ChartPage screen is opened$", () -> {
            Assert.assertTrue(chartPage.open().isPageDisplayed());
        });
        When("^I Check Text of tv Header$", () -> {
            Assert.assertTrue(true);
        });
        Then("^Text is \"([^\"]*)\"$", (String arg0) -> {
            Assert.assertEquals(chartPage.getTextTvHeader(), arg0);
        });
        When("^I click Home Button$", () -> {
            chartPage.clickBackButton();
            Thread.sleep(2000);
        });
        When("^I check title of Chart screen$", () -> {
            Assert.assertTrue(true);
        });
        Then("^Title is \"([^\"]*)\" or \"([^\"]*)\"$", (String text1, String text2) -> {
            System.out.println(chartPage.getTextTitle());
            Assert.assertTrue(chartPage.getTextTitle().equals(text1) || chartPage.getTextTitle().equals(text2));
        });
    }
}
