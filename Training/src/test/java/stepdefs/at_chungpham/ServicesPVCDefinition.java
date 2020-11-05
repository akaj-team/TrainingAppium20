package stepdefs.at_chungpham;

import at.core.PageFactory;
import cucumber.api.java8.En;
import org.testng.Assert;
import page.HomePage;
import page.at_chungpham.ServicesPage;
import page.at_chungpham.ServicesPageAndroid;
import page.at_chungpham.ServicesPageiOS;
import page.at_hainguyen.settings.SettingsPage;
import page.at_hoatran.InfoPage;

public class ServicesPVCDefinition implements En {
    ServicesPage svPage = new PageFactory<>(ServicesPage.class).create();
    ServicesPageAndroid svAndroidPage = new PageFactory<>(ServicesPageAndroid.class).create();
    ServicesPageiOS svIOSPage = new PageFactory<>(ServicesPageiOS.class).create();
    HomePage homePage = new PageFactory<>(HomePage.class).create();
    page.exam.TweaksDetailPage tweakPage = new PageFactory<>(page.exam.TweaksDetailPage.class).create();
    InfoPage infopage = new PageFactory<>(InfoPage.class).create();
    SettingsPage settingPage = new PageFactory<>(SettingsPage.class).create();

    public ServicesPVCDefinition() {
        Given("^Services screen is opened$", () -> Assert.assertTrue(svPage.isPageDisplayed()));
        // Check display title of type
        When("^I check display title of Types$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The title text is \"([^\"]*)\"$", (String text) -> {
            Assert.assertEquals(svPage.getTxtTypes(), text);
        });

        // Check display title of Unit

        When("^I check title of Unit$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The title of unit is \"([^\"]*)\"$", (String text) -> {
            Assert.assertEquals(svPage.getTxtUnit(), text);
        });

        // Check display text of Video button
        When("^I check display name of Video button$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The text of video button is \"([^\"]*)\"$", (String text) -> {
            Assert.assertEquals(svPage.getTextVideoButton(), text);
        });

        // Check function of Video button
        When("^I taping on Video button$", () -> {
            svPage.clickBtnFoodVideo();
        });
        Then("^The App redirect to http://nutritionfacts\\.org/topics/ website$", () -> {
            Assert.assertFalse(svPage.verifyFunctionVideoButton());
        });

        // Check display text of button Imperial
        When("^I check display text of Imperial$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The text of Imperial button is \"([^\"]*)\"$", (String text) -> {
            Assert.assertEquals(svPage.getTextBtnImperial(),text);
        });

        // Check function of button Imperial
        When("^I tap on Imperial button$", () -> {
            svPage.clickBtnChangeToMetric();
        });
        Then("^The Metric button display$", () -> {
            Assert.assertEquals(svPage.getTextBtnMetric(),"Metric");
        });

        // Check display text of button Metric
        When("^I check display text of Metric button$", () -> {
            Assert.assertTrue(true);
        });
        Then("^The text of Metric button is \"([^\"]*)\"$", (String text) -> {
            Assert.assertEquals(svPage.getTextBtnMetric(),text);
        });


        //Check function of  Mectric button
        When("^I tap on Metric button$", () -> {
            svPage.clickBtnChangeToImperial();
        });
        Then("^The Imperial button display$", () -> {
            Assert.assertEquals(svPage.getTextBtnImperial(),"Imperial");
        });

        //Check Types section have item or not
        When("^I check list item of Types$", () -> {
            Assert.assertTrue(true);
        });
        Then("^Show the item of Types$", () -> {
            Assert.assertTrue(svAndroidPage.isFoodNamePresent());
        });

        // Check function of Daily Dozen bar
        When("^I tap on Daily Dozen bar$", () -> {
            svIOSPage.clickBtnMenuDailyDozen();
        });
        Then("^The page Daily Dozen display$", () -> {
            Assert.assertTrue(homePage.isPageDisplayed());
        });

        //Check function of Teaks bar
        When("^I tap on Tweaks bar$", () -> {
            svIOSPage.clickBtnMenuTweaks();
        });
        Then("^The page Tweaks is display$", () -> {
            Assert.assertTrue(tweakPage.isPageDisplayed());
        });

        //Check function of Info
        When("^I tap on Info bar$", () -> {
            svIOSPage.clickBtnMenuInfo();
        });
        Then("^The page Info displays$", () -> {
            Assert.assertTrue(infopage.isPageDisplayed());
        });

        // Check function of Setting bar
        When("^I tap on Setting bar$", () -> {
            svIOSPage.clickBtnMenuSettings();
        });
        Then("^The page Setting display$", () -> {
           Assert.assertTrue(settingPage.isPageDisplayed());
        });

        // Check display of Types section
        When("^I check display of Types section$", () -> {
            Assert.assertTrue(true);
        });
        Then("^Display Detail information and Videos button$", () -> {
            Assert.assertTrue(svAndroidPage.isFoodNamePresent());
            Assert.assertTrue(svAndroidPage.isFoodVideoButtonPresent());
        });


    }
}
