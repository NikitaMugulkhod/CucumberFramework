package com.edusoln.stepdefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.edusoln.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignLeaveStepdefination {

	static Logger log=LogManager.getLogger(AssignLeaveStepdefination.class);
	
@Given("User is already logged in and is on Dashboard page")
public void user_is_already_logged_in_and_is_on_dashboard_page() {
    LoginPage.login();
    LoginPage.clickbtn();
    LoginPage.dashboardDisplayCheck();
	log.info("Login is completed");
}

@When("user enters {string},{string},{string},{string},{string} on Assign Leave page")
public void user_enters_on_assign_leave_page(String string, String string2, String string3, String string4, String string5) {
	log.info("Assign leave form  is filled");   
}

@When("clicks on Assign button")
public void clicks_on_assign_button() {
	log.info("Leave submission is done");
	}


@Then("user should be able to Assign leave sucesully")
public void user_should_be_able_to_assign_leave_sucesully() {
	
	 log.info("Leave is applied Sucessfully");
	}
}



