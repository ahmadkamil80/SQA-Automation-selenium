package defs;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TokpedDefs {
	
	WebDriver driver;
	ChromeOptions options;

	@Given("user homepage {string}")
	public void user_homepage(String string) {
		String path = System.getenv("WEBDRIVER");
		System.setProperty("webdriver.chrome.driver", path);
		options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "localhost:9988");
		driver = new ChromeDriver(options);
		driver.get(string);
	}
	
	@When("user input kategori {string}")
	public void user_input_kategori(String string) {
		driver.findElement(By.xpath("//input[@data-unify='Search']")).sendKeys(string);
	}

	@When("user klik button search")
	public void user_klik_button_search() {
		driver.findElement(By.xpath("//button[@aria-label='Kirimkan']")).click();
	}

	@When("user klik product")
	public void user_klik_product() throws InterruptedException {
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@data-testid='linkProductName'][contains(text(),'XIAOMI OFFICIAL Xiaomi 12 Lite 8/256GB 5G Smartpho')]")).click();
		} catch (NoSuchElementException e) {}
	}

	@Then("user klik Wishlist")
	public void user_klik_Wishlist() throws InterruptedException {
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Wishlist']")).click();
		} catch (NoSuchElementException e) {}
		
		driver.quit();
	}

}
