package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@CucumberOptions(features="src/test/resources/Feature/checklogin.feature",glue= {"stepDefinition"},tags= {"@valid,@invalid"},plugin= {"pretty","html:target/Login"})
@CucumberOptions(features="src/test/resources/Feature/checklogin.feature",glue= {"stepDefinition"},tags= {"@valid,@invalid"},plugin= {"json:target/Login.json"})
public class LoginTest extends AbstractTestNGCucumberTests {

}
