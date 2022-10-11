package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/featuresFiles/scroll.feature", glue = "defs", plugin = { "pretty",
		"html: target/cucumber-reports", "json: target/cucumber-reports/Scroll.json" })

public class ScrollRunner extends AbstractTestNGCucumberTests {

}
