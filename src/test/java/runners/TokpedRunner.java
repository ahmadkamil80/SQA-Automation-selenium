package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/featuresFiles/tokped.feature", glue = "defs", plugin = { "pretty",
		"html: target/cucumber-reports", "json: target/cucumber-reports/Tokped.json" })

public class TokpedRunner extends AbstractTestNGCucumberTests {

}
