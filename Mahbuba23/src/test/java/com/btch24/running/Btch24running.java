package com.btch24.running;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features= "src/test/resources",
	glue= {"com.Batch24.steps"},
	tags= {"@batch24"},
	plugin= {"com.Cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
	monochrome=true
		
		
		
		)

public class Btch24running {

}
