package stepdefs.at_hungnguyen3;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import page.at_hungnguyen3.home.HomePage;
import page.at_hungnguyen3.tweaks.TweaksPage;

import java.util.ArrayList;
import java.util.List;

public class TweakDefinitions extends BaseDefinitions implements En {
    TweaksPage tweaksPage = new PageFactory<>(TweaksPage.class).create();
    HomePage homePage = new PageFactory<>(HomePage.class).create();
    List<MobileElement> list = new ArrayList<>();

    int pos = 0;

    public TweakDefinitions() {

        Given("^TweaksPage screen is opened$", () -> {
            Assert.assertTrue(tweaksPage.open().isPageDisplayed());
        });

        When("^I click Daily Dozen button$", () -> {
            tweaksPage.clickBtnHome();
            Thread.sleep(2000);
        });

        Then("^Homepage screen is displayed$", () -> {
            Assert.assertTrue(homePage.isPageDisplayed());
        });

        Then("^Title contains \"([^\"]*)\"$", (String arg0) -> {
            Assert.assertTrue(tweaksPage.getTitle().contains(arg0));
        });

        When("^I click About Menu button$", () -> {
            tweaksPage.clickAboutButton();
        });

        Then("^Menu About is displayed$", () -> {
            Thread.sleep(5000);
            tweaksPage.isAboutMenuDisplayed();
        });

        When("^I click Lastest Video Button$", () -> {
            tweaksPage.clickLastestVideoButton();
        });

        Then("^I click CheckBox and CheckBox is checked$", () -> {
            list = tweaksPage.getListCheckBox();
            for (int i = 0; i < list.size(); i++) {
                if (!tweaksPage.isCheckBoxChecked(list, i)) {
                    tweaksPage.clickCheckBox(list, i);
                    pos = i;
                    Assert.assertTrue(tweaksPage.isCheckBoxChecked(list, pos));
                    break;
                }
            }
        });
        Then("^TweaksPage screen is not displayed$", () -> {
            Thread.sleep(5000);
            Assert.assertFalse(homePage.isPageDisplayed());
            homePage.openApp();
        });
    }
}
