package stepdefs.at_hoatran;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hoatran.detailfood.DetailFoodPage;
import page.at_hoatran.history.HistoryPageHoa;
import page.at_hoatran.home.HomePageHoa;
import page.at_hoatran.info.InfoPage;
import page.at_hoatran.tweaks.TweaksPage;

import java.util.concurrent.TimeUnit;

/**
 * for screen
 *
 * @author at-hoa.tran
 */
public class HomeDefinitionsHoa extends BaseDefinitions implements En {
    HomePageHoa homePageHoa = new PageFactory<>(HomePageHoa.class).create();
    TweaksPage tweaksPage = new PageFactory<>(TweaksPage.class).create();
    InfoPage infoPage = new PageFactory<>(InfoPage.class).create();
    DetailFoodPage detailFoodPage = new PageFactory<>(DetailFoodPage.class).create();
    HistoryPageHoa historyPageHoa = new PageFactory<>(HistoryPageHoa.class).create();
    int num = 0;

    public HomeDefinitionsHoa() {

        Given("^Homepage screen is opened$", () -> Assert.assertTrue(homePageHoa.open().isPageDisplayed()));

        When("^I check title of Home screen$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The title of Home screen is \"([^\"]*)\"$", (String title) -> {
            Assert.assertEquals(homePageHoa.getTitle(), title);
        });

        When("^I check header text of Home screen$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The header text of Home screen is \"([^\"]*)\"$", (String header) -> {
            Assert.assertEquals(homePageHoa.getTextHeader(), header);
        });

        When("^I check display of items in the Servings list$", () -> {
            Assert.assertTrue(true);
        });

        Then("^I see \"([^\"]*)\" item at the (\\d+) position on list$", (String name, Integer pos) -> {
            Assert.assertTrue(homePageHoa.getTextOfFood(pos).contains(name));
        });

        When("^I click on the Calendar button of (\\d+) item$", (Integer pos) -> {
            driver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            homePageHoa.clickCalendarButton(pos);
        });

        Then("^Move to History screen of \"([^\"]*)\" item successfully$", (String name) -> {
            Assert.assertEquals(historyPageHoa.waitForPageDisplayed().getTitle(), name);
            historyPageHoa.clickBackButton();
        });

        When("^I click on the More Info button at the (\\d+) position$", (Integer pos) -> {
            driver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            homePageHoa.clickMoreInfoButton(pos);
        });

        Then("^Move to Servings Size screen of \"([^\"]*)\" item successfully$", (String name) -> {
            Assert.assertEquals(detailFoodPage.getTitle(), name);
            detailFoodPage.clickBackButton();
        });

        When("^I click on the More Info button of Vitamin B12 item$", () -> {
            homePageHoa.clickSupplementItem();
        });

        Then("^The Home screen is not displayed$", () -> {
            Assert.assertFalse(homePageHoa.isPageDisplayed());
            homePageHoa.backKeyDevice();
        });

        When("^I click on the Tweaks button$", () -> {
            homePageHoa.clickTweaksButton();
        });

        Then("^Move to Tweaks screen successfully$", () -> {
            Assert.assertTrue(homePageHoa.isPageDisplayed());
        });

        When("^I click on the InfoMenu button$", () -> {
            homePageHoa.clickInfoMenuButton();
        });
        Then("^Move to Info screen successfully$", () -> {
            Assert.assertTrue(infoPage.isPageDisplayed());
        });

        When("^I click on the Chart button$", () -> {
            homePageHoa.clickChartButton();
        });
        Then("^Move to Servings History screen successfully$", () -> {
            Assert.assertEquals(homePageHoa.isServingsHistoryDisplayed(), true);
        });

        //check image
        Then("^Image is displayed$", () -> {
            Assert.assertTrue(homePageHoa.isImageOfFoodDisplayed(num));
            num++;
        });


    }
}
