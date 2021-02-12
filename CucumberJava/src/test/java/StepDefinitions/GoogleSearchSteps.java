package StepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver =null;

	@Given("browser is open and user is on google search")
	public void browser_is_open_and_user_is_on_google_search() {
		System.out.println("user open browser and navigates to google search");
		System.setProperty("webdriver.chrome.driver","/Users/BharathG/Documents/Automation/CucumberJava/src/test/resources/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() throws InterruptedException {
		System.out.println("google search page");
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		Thread.sleep(2000);
	}

	@And("user clicks on search button")
	public void user_clicks_on_search_button() throws InterruptedException {
		System.out.println("user hits search");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("user navigated to results page");
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}


}
