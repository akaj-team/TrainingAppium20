import at.core.CucumberRunnerBase;
import cucumber.api.CucumberOptions;

/**
 * CucumberOptions
 */
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefs"},
        tags = {"not @Ignore"},
        plugin = {
                "pretty",
                "junit:target/cucumber-reports/junit-report.xml",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })
/**
 * Class CheckTestRunner
 * @author at-hangtran
 */
class CheckTestRunner extends CucumberRunnerBase {
}
