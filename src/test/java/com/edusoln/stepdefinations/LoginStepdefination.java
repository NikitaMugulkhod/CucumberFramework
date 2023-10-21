package com.edusoln.stepdefinations;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.edusoln.base.CommonFunctions;
import com.edusoln.pages.LoginPage;
//import com.edusoln.utlities.PropertyReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import java.util.List;
//import java.util.Map;

import org.apache.logging.log4j.LogManager;

//import org.apache.logging.log4j.LogManager;

//import com.edusoln.pages.LoginPage;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class LoginStepdefination {
	
	static Logger log=LogManager.getLogger(LoginStepdefination.class);
	
	@Given("user is on login screen")
	public void user_is_on_login_screen() {
	    LoginPage.loginpageDisplayCheck();
	    log.info("login check is completed");
	}

	@When("users enters userid and password on login page")
	public void users_enters_userid_and_password_on_login_page() {
	   LoginPage.login();
	   log.info("user id and password has been entered");
	}
	
	@When("users enters userid  as {string} password as {string} login page")
	public void users_enters_userid_as_password_as_login_page(String userid, String password) {
	   LoginPage.login( userid, password);
	   log.info("user id and password has been entered");
	
	}
	
	@When("users enters  {string} and {string}")
	public void users_enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.login(string,string2);
		
	}
	
	@When("users enters credentials on login page")
	public void users_enters_credentials_on_login_page(io.cucumber.datatable.DataTable dataTable) {
	   
		List<Map<String, String>> data = dataTable.asMaps();
		for (Map<String, String> d : data) {
			System.out.println(d.get("userid") + "-" + d.get("password"));
			LoginPage.login(d.get("userid"), d.get("password"));
			log.info("user id and password has been entered");
			
		}
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		LoginPage. clickbtn();
		log.info("user has click on login button");
	}

	@Then("user  should able to on dashboard page")
	public void user_should_able_to_on_dashboard_page() {
	  LoginPage.dashboardDisplayCheck();
	  log.info("user id logged sucesfully");
	  
	}

}
