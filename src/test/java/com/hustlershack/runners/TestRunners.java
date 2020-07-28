package com.hustlershack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Features",
		glue= "com.fatimashack.stepdef"
		
		
		
		)


public class TestRunners extends AbstractTestNGCucumberTests {
	


}
