package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	System.out.println("User navigates to the login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User enters valid username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("User clicks on login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("User navigated to home page");
	}

	@Given("user enters valid user1 and pass1")
	public void user_enters_valid_user1_and_pass1() {
		System.out.println("User enters valid user1 and pass1");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("User clicks on login button");
	}

	@And("user navigated to the home page")
	public void user_navigated_to_the_home_page() {
		System.out.println("User navigates to the home page");
	}

	@Then("user enters valid user2 and pass2")
	public void user_enters_valid_user2_and_pass2() {
		System.out.println("User enters valid users2 and pass2");
	}	
}
