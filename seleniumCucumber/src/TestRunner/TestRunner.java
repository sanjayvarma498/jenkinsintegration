package TestRunner;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
	//format = {"pretty","html:reports/test-report"},	
	features={"Features/GmailLogin.feature"},
	glue= {"StepDefinitions"}
		)
public class TestRunner {

}

