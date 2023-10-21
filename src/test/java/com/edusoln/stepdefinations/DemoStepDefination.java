package com.edusoln.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDefination {
	
	@Given("user needs to access application")
	public void user_needs_to_access_application() {
	   System.out.println("In background given");
	}

	@Then("user should have internet connection")
	public void user_should_have_internet_connection() {
		  System.out.println("In background then");
	}
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("in given");
	    
	}

	@When("users enters userid and password")
	public void users_enters_userid_and_password() {
		System.out.println("in when");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("in when");
	}

	@Then("user is able to on dashboard page")
	public void user_is_able_to_on_dashboard_page() {
		System.out.println("in then"); 
	}

}
