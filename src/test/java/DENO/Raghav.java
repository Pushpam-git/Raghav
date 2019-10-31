package DENO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Raghav{
	@Given("user is on website")
	public void user_is_on_website() {
	    System.out.println("WELCOME");
	}

	@When("he clicks on login")
	public void he_clicks_on_login() {
		 System.out.println("WELCOME");
	}

	@When("provides correct credentails")
	public void provides_correct_credentails() {
		 System.out.println("WELCOME");
	}

	@Then("He sees the home page")
	public void he_sees_the_home_page() {
		 System.out.println("WELCOME");
	}

}
