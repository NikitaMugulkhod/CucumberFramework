package com.edusoln.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.edusoln.base.CommonFunctions;
import com.edusoln.utilities.PropertyReader;

public class LoginPage extends CommonFunctions {
	
	public static void login() {
		
    driver.findElement(By.name(PropertyReader.getProperty("username_name"))).sendKeys("Admin");
    driver.findElement(By.name(PropertyReader.getProperty("password_name"))).sendKeys("admin123");
		
	}
	
	
	public static void login(String userid,String pass) {
		
    driver.findElement(By.name(PropertyReader.getProperty("username_name"))).sendKeys("usrid");
    driver.findElement(By.name(PropertyReader.getProperty("password_name"))).sendKeys("pass");
		
	}
	
	
	public static void clickbtn() {
		driver.findElement(By.className(PropertyReader.getProperty("loginbtn_className"))).click();
	}
	
	
	public static void loginpageDisplayCheck() {
	
    //Assert.assertTrue(driver.findElement(By.className("oxd-text oxd-text--h5 orangehrm-login-title"))).i
	Assert.assertTrue(driver.findElement(By.className("oxd-text oxd-text--h5 orangehrm-login-title")).isDisplayed());
	
		
}
	

	public static void dashboardDisplayCheck() {
		
		Assert.assertTrue(driver.findElement(By.className("dashboardmenu_className")).isDisplayed())	;
	
}
}