package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"./src/test/java/Features/Login.feature"},
				 glue= {"StepDefinitions"},
				 //tags= "@Regression",
				 monochrome=true,	 
				 plugin= {"pretty", "html:Reports/HtmlReports/htmlreport.html",
						 			"json:Reports/JsonReports/jsonreport.json"
				 }
				 
		)
public class LoginRunnerTest extends AbstractTestNGCucumberTests{

}
