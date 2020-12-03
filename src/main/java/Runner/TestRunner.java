package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features  = "/Users/sanjms/Documents/JavaTraining2020/FreeCRMBDDFrameworkCucumber/src/main/java/Feature/taggedhooks.feature",  //path of feature file
		glue={"stepDefinitions"}, //path of step definition file
		format={"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, // to generate different types of reporting
		monochrome = true, //dispaly the console output in proper readable format
		dryRun = false, // to check the mapping between feature file and step definition file
		strict = true, // it will check if any of the step is not defined in step definition file 
		tags ={"~@SmokeTest , ~@RegressionTest"}
		)

public class TestRunner {

}
