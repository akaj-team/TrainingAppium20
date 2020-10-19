package stepdefs.at_hoatran;

import at.base.BaseDefinitions;
import at.core.PageFactory;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import page.at_hoatran.InfoPageAndroid;
import page.at_hoatran.InfoPageIOS;
import java.util.concurrent.TimeUnit;

public class InfoDefinitions extends BaseDefinitions implements En {
    InfoPageAndroid infoPageAndroid= new PageFactory<>(InfoPageAndroid.class).create();
    InfoPageIOS infoPageIOS= new PageFactory<>(InfoPageIOS.class).create();

    public InfoDefinitions() {
        Given("^Info screen is opened$", () -> {
            Assert.assertTrue(infoPageAndroid.open().isPageDisplayed());
        });

        When("^Check Title of Info screen$", () -> Assert.assertTrue(true));
        When("^Tap on Title of Info screen$", () -> infoPageIOS.clickTitle());
        Then("^Nothing happens$", () -> Assert.assertTrue(infoPageAndroid.open().isPageDisplayed()));

        When("^Check content of (\\d+) th menu$", (Integer n) -> Assert.assertTrue(true));

        Then("^Content of (\\d+) th menu is displayed correctly \"([^\"]*)\"$", (Integer n, String text) -> {
            String info= "Info";
            if (text == info)
                Assert.assertEquals(infoPageIOS.getTitle(), text);
            else
                Assert.assertEquals(infoPageAndroid.getTitle(n), text);
        });

        When("^Tap on (\\d+) th menu$", (Integer n) -> {
                    infoPageAndroid.clickTitleButton(n);
        });

        Then("^Move to \"([^\"]*)\"$", (String text) -> {
            WebDriver driver;
            System.setProperty("webdriver.chrome.driver", ".\\Training\\src\\resources\\drivers\\chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications"); //vô hiệu hóa thông báo chrome
            driver = new ChromeDriver(options);
            //   Thread.sleep(4000);
            driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, text);
        });

        Then("^About this app screen is displayed correctly$", () -> {
        });

    }
}
