package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//features = ".//Features/LoginFeature.feature",
		features = ".//Features",
		glue = "StepDefinition" ,
		dryRun = false ,
		monochrome = true ,
		//tags= "regression",
		plugin = {"pretty","html:target/Cucumber-Reports/report1.html",
				"json:target/Cucumber-Reports/report2.json","junit:target/Cucumber-Reports/report3.xml"}
		
		
		
		
		)





public class Run {
// this class will be empty.
}
