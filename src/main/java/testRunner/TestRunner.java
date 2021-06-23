package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Selenium\\Assignment Workspace\\The Star Wars API\\src\\main\\java\\feature", //the path of the feature files
		glue = {"stepDefinition"},  //the path of the step definition files
		plugin = {"pretty", "html:test-outout"}, //to generate report
		monochrome = true, //display the console output in a proper readable format
		dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}	
		)


public class TestRunner {

}
