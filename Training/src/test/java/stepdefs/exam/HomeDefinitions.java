package stepdefs.exam;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import page.exam.detailfood.DetailFoodPage;
import page.exam.history.HistoryPage;
import page.exam.home.HomePage;
import page.exam.info.InfoPage;
import page.exam.tweaks.TweaksPage;

import java.util.ArrayList;
import java.util.List;

/**
 * for screen
 *
 * @author at-anh.quach
 */
public class HomeDefinitions extends BaseDefinitions implements En {
    HomePage homePage = new PageFactory<>(HomePage.class).create();
    TweaksPage tweaksPage = new PageFactory<>(TweaksPage.class).create();
    InfoPage infoPage = new PageFactory<>(InfoPage.class).create();
    DetailFoodPage detailFoodPage = new PageFactory<>(DetailFoodPage.class).create();
    HistoryPage historyPage = new PageFactory<>(HistoryPage.class).create();
    List<MobileElement> listCheckbox = new ArrayList<>();
    int pos = 0;

    public HomeDefinitions() {

        Given("^Homepage screen is opened$", () -> Assert.assertTrue(homePage.open().isPageDisplayed()));

        When("^I check title of Home screen$", () -> Assert.assertTrue(true));

        Then("^The title of Home screen is \"([^\"]*)\"$", (String title) -> Assert.assertEquals(homePage.getTitle(), title));

        When("^I check header text of Home screen$", () -> Assert.assertTrue(true));

        Then("^The header text of Home screen is \"([^\"]*)\"$", (String header) ->
                Assert.assertEquals(homePage.getTextHeader(), header));

        When("^I check display of items in the Servings list$", () -> Assert.assertTrue(true));

        Then("^I see \"([^\"]*)\" item at the (\\d+) position on list$", (String name, Integer pos) ->
                Assert.assertTrue(homePage.getTextOfFood(pos).contains(name)));

        When("^I click on the Calendar button of (\\d+) item$", (Integer pos) -> homePage.clickCalendarButton(pos));

        Then("^Move to History screen of \"([^\"]*)\" item successfully$", (String name) -> {
            Assert.assertEquals(historyPage.waitForPageDisplayed().getTitle(), name);
            historyPage.clickBackButton();
            Thread.sleep(3000);
        });

        When("^I click on the More Info button at the (\\d+) position$", (Integer pos) -> {
            homePage.clickMoreInfoButton(pos);
            Thread.sleep(3000);
        });

        Then("^Move to Servings Size screen of \"([^\"]*)\" item successfully$", (String name) -> {
            Assert.assertEquals(detailFoodPage.getTitle(), name);
            detailFoodPage.clickBackButton();
            Thread.sleep(3000);
        });

        When("^I click on the More Info button of Vitamin B12 item$", () -> homePage.clickSupplementItem());

        Then("^The Home screen is not displayed$", () -> {
            Thread.sleep(5000);
            Assert.assertFalse(homePage.isPageDisplayed());
            homePage.openApp();
        });

        When("^I click on the Tweaks button$", () -> homePage.clickTweaksButton());

        Then("^Move to Tweaks screen successfully$", () -> {
            Assert.assertTrue(tweaksPage.waitForPageDisplayed().isPageDisplayed());
            tweaksPage.clickBtnHome();
        });

        When("^I click on the InfoMenu button$", () -> homePage.clickInfoMenuButton());

        Then("^Move to Info screen successfully$", () -> {
            Thread.sleep(3000);
            Assert.assertTrue(infoPage.isPageDisplayed());
        });

        When("^I click on the Chart button$", () -> homePage.clickChartButton());

        Then("^Move to Servings History screen successfully$", () -> {
            Assert.assertTrue(historyPage.waitForPageDisplayed().isPageDisplayed());
            historyPage.clickBackButton();
        });

        When("^I click checkbox$", () -> {
            listCheckbox = homePage.getListCheckbox();
            for (int i = 0; i < listCheckbox.size(); i++) {
                if (!homePage.isCheckboxChecked(listCheckbox, i)) {
                    homePage.clickCheckbox(listCheckbox, i);
                    pos = i;
                    break;
                }
            }
        });

        Then("^Check box is checked$", () ->
                Assert.assertTrue(homePage.isCheckboxChecked(homePage.getListCheckbox(), pos)));
    }
}
