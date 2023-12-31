package com.edusoln.stepdefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.edusoln.base.CommonFunctions;
import com.edusoln.base.Constants;
import com.edusoln.utilities.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CucumberHooks extends CommonFunctions {

	

	@Before()
	public void beforeScenerio() {
		
	browserLaunch(PropertyReader.getProperty(Constants.BROWSER));
	driver.get(PropertyReader.getProperty(Constants.BROWSER));
	
	}
	
	

	@AfterStep   //after every step
	public void afterStep(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "screenshot");
		}
		
		
	}
	
	@After
	public void AfterScenerior() {
		
		driver.quit();	
		
	}
	
}

