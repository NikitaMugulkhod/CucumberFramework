package com.edusoln.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\Featurefile",
		glue= {"com.edusoln.stepdefinations"} ,
		dryRun=false,
		monochrome=true,
		tags="  @OrangeHRMLogin",
				plugin= {"pretty","html:target/cucumber-reports/reports.html",
						"json:target/cucumber-reports/cucumber.json",
						  "junit:target/cucumber-reports/cucumber.xml",
						  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
)
 public class TestRunner {

}
