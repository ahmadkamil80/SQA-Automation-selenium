package defs;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PalindromeDefs {
	String testPalindrome;
	boolean isPalindrome;

	@Given("user input string {string}")
	public void user_input_string(String string) {
		testPalindrome = string;
	}

	@When("user test is palindrome")
	public void user_test_is_palindrome() {
		String resultPalindrome = new StringBuilder(testPalindrome).reverse().toString();
		isPalindrome = testPalindrome.equalsIgnoreCase(resultPalindrome);
	}

	@Then("result {string}")
	public void result(String string) {
		boolean expectResult = Boolean.parseBoolean(string);
		
		if (expectResult) {
			assertTrue(isPalindrome);
		} else {
			assertFalse(isPalindrome);
		}
	}
	
}
