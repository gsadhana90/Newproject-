package com.logintestcases;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunners {
	@CucumberOptions(features = "src/test/resources/feature/login1.feature",
			glue = "com.logintestcases")
			public class TestRunner extends AbstractTestNGCucumberTests {
			}

}
