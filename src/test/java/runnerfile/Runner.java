package runnerfile;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@Test
@CucumberOptions(features = "./src/test/java/featurefiles/LoginFeature4.feature", glue ={"stepdefinition"}, tags = {"@End2End","@SmokeTest"})
public class Runner extends AbstractTestNGCucumberTests
{
	
}