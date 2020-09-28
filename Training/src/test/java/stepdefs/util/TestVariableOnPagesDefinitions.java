package stepdefs.util;

import at.base.BaseDefinitions;
import at.base.BasePage;
import at.core.PageFactory;
import cucumber.api.java8.En;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.core.util.ReflectionUtil;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import java.lang.reflect.Field;

/**
 * @author at-vinh.huynh
 */
public class TestVariableOnPagesDefinitions extends BaseDefinitions implements En {

    private Class pagesClass[] = {
    };

    public TestVariableOnPagesDefinitions() {
        When("^Open definitions util to valid variables on pages$", () -> Assert.assertTrue(validatePage()));

        Given("^App is opened$", () -> {
        });
    }

    private boolean validatePage() {
        for (Class page : pagesClass) {
            BasePage basePage = new PageFactory<BasePage>(page).create();
            basePage.open();
            if (!basePage.isPageDisplayed()) {
                System.out.println("Can not open " + page.getSimpleName());
                continue;
            }
            System.out.println("\nStarting to valid variables on " + page.getSimpleName() + ":");
            Field[] fields = page.getDeclaredFields();
            for (Field field : fields) {
                System.out.print("\tVariable: " + field.getName());
                if (!MobileElement.class.isAssignableFrom(field.getType())) {
                    System.out.println("\n\tSkip check variable: " + field.getName() + " because not a MobileElement");
                    continue;
                }
                try {
                    MobileElement mobileElement = (MobileElement) ReflectionUtil.getFieldValue(field, basePage);
                    if (!mobileElement.isDisplayed()) {
                        System.out.print(" - =>>>>>>>>>>> FAILED!!!\n");
                    } else {
                        System.out.print(" - Passed!!!\n");
                    }
                } catch (NoSuchElementException e) {
                    System.out.print(" - =>>>>>>>>>>> FAILED!!!\n");
                }
            }
        }
        return true;
    }
}
