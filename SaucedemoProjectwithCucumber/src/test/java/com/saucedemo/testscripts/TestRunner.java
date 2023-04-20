package com.saucedemo.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue   = "com.saucedemo.testscripts"
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	
}
