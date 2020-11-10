package stepdefs.at_hoatran;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.at_hoatran.HomePageHoa;

import java.util.concurrent.TimeUnit;

/**
 * for screen
 *
 * @author at-hoa.tran
 */
public class HomeDefinitionsHoa extends BaseDefinitions implements En {
    HomePageHoa homePageHoa = new PageFactory<>(HomePageHoa.class).create();
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
            driver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
            Assert.assertEquals(homePageHoa.getTitleHistoryScreen(), name);
        });

        When("^I click on the More Info button at the (\\d+) position$", (Integer pos) -> {
            homePageHoa.clickMoreInfoButton(pos);
            driver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        });
        Then("^Move to Servings Size screen of \"([^\"]*)\" item successfully$", (String name) -> {
            Assert.assertEquals(homePageHoa.getTitleServingsSizeScreen(name), name);
        });

        When("^I click on the More Info button of Vitamin B12 item$", () -> {
            homePageHoa.clickSupplementItem();
        });

        Then("^The Home screen is not displayed$", () -> {
            Assert.assertEquals(true, homePageHoa.isNotHomepageDisplayed());
        });

        When("^I click on the Tweaks button$", () -> {
            homePageHoa.clickTweaksButton();
        });
        Then("^Move to Tweaks screen successfully$", () -> {
            Assert.assertEquals(homePageHoa.isTweaksScreenDisplayed(), true);
        });

        When("^I click on the InfoMenu button$", () -> {
            homePageHoa.clickInfoMenuButton();
        });
        Then("^Move to Info screen successfully$", () -> {
            Assert.assertEquals(homePageHoa.isInfoScreenDisplayed(), true);
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
