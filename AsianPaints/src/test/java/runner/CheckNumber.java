package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@CucumberOptions(features="src/test/resources/Feature/UnregisteredNo.feature",glue= {"stepDefinition"},plugin= {"json:target/result.json"})
@CucumberOptions(features="src/test/resources/Feature/UnregisteredNo.feature",glue= {"stepDefinition"},plugin= {"pretty","html:target/Unregistered"})
public class CheckNumber extends AbstractTestNGCucumberTests {

}
