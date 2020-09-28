package at.core;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

/**
 * @author hang.tran
 */
@Listeners({ScreenshotListener.class, PropertyListener.class, ReportListener.class})
public class ParallelCucumberRunnerBase extends CustomAbstractTestNGCucumberTests {

    @DataProvider
    public Object[][] features() {
        return super.scenarios();
    }

    @BeforeClass(alwaysRun = true)
    public void setUpClass(final ITestContext context) throws Exception {
        super.setUpClass(context);
        System.out.println("Set Up Class.");
        AppiumController.instance.start(context.getCurrentXmlTest());
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        super.tearDownClass();
        System.out.println("Tear Down Class.");
        AppiumController.instance.stop();
    }
}
