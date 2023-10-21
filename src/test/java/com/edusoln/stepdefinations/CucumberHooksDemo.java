package com.edusoln.stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooksDemo {


	@Before(order=0)
	public void beforeScenerio() {
		
	System.out.println("i am before sceanrio")	;
	}
	

	@Before(value="@tag1 or @tag2", order=1)
	public void beforetag1() {
		
	System.out.println("i am before tag1 sceanrio")	;
	}
	
	

	@After
	public void After() {
		
		System.out.println("i am after sceanrio")	;
		
	}
}
