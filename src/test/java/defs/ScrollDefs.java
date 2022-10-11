package defs;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScrollDefs {
	
	WebDriver driver;
	
	@Given("user at homepage {string}")
	public void user_at_homepage(String string) {
		String path = System.getenv("WEBDRIVER");
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
	}

	@When("user input {string}")
	public void user_input(String string) {
		driver.findElement(By.xpath("//input[@data-unify='Search']")).sendKeys(string);
	}

	@When("user klik search")
	public void user_klik_search() {
		driver.findElement(By.xpath("//button[@aria-label='Kirimkan']")).click();
	}

	@When("user scrolls on the page")
	public void user_scrolls_on_the_page() {
		boolean state = true;
		
		while (state) {
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				for (int y = 0; y <= 200; y++) {
					js.executeScript("window.scrollBy(0, " + y + ")");
					state = false;
				}
			} catch (Exception e) { }
		}
	}

	@Then("result total product")
	public void result_total_product() {
		int sizeExpect = 80;
		
		List<WebElement> price = this.driver.findElements(By.xpath("//div[@data-testid='spnSRPProdPrice']"));
		System.out.println(price.size());
		assertTrue(sizeExpect == price.size());
		
		driver.quit();
	}

}
