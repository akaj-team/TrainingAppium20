package stepdefs.at_hungnguyen3;

import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hungnguyen3.TweaksPage;

public class TweaksDefinitions implements En {
    TweaksPage tweaksPage = new PageFactory<>(TweaksPage.class).create();

    public TweaksDefinitions() {

        When("^I click Daily Dozen button$", () -> tweaksPage.clickBtnDailyDozen());

        Given("^Tweaks is opened$", () -> tweaksPage.open().isPageDisplayed());

        When("^I click About Menu button$", () -> tweaksPage.clickBtnAbout());

        Then("^Menu About is displayed$", () -> tweaksPage.isAboutMenuDisplayed());

        Then("^Title contains \"([^\"]*)\"$", (String textTitle) -> {
            Thread.sleep(2000);
            Assert.assertTrue(tweaksPage.getTextTitle().contains(textTitle));
        });

    }
}

