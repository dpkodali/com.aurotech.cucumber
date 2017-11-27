package com.aurotech.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue={"com.aurotech.stepDefinition"},
		plugin={"html:target/cucumber-html-report","json:target/cucumber.json","usage:target/cucumber-usage.json"}
		)

public class TestRunner {
	
}
