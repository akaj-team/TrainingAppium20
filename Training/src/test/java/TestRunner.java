import at.core.CucumberRunnerBase;
import cucumber.api.CucumberOptions;

/**
 * @author at-hangtran
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
 * Class TestRunner
 * @author at-hangtran
 */
class TestRunner extends CucumberRunnerBase {

}
