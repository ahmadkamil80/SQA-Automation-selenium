package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/featuresFiles/palindrome.feature", glue = "defs", plugin = { "pretty",
		"html: target/cucumber-reports", "json: target/cucumber-reports/Palindrome.json" })

public class PalindromeRunner extends AbstractTestNGCucumberTests {

}
