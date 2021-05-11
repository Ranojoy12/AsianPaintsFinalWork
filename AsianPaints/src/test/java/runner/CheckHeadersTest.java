package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@CucumberOptions(features="src/test/resources/Feature/headers_information.feature",glue= {"stepDefinition"},plugin= {"pretty","html:target/Information"})
@CucumberOptions(features="src/test/resources/Feature/headers_information.feature",glue= {"stepDefinition"},plugin= {"json:target/Information.json"})
public class CheckHeadersTest extends AbstractTestNGCucumberTests {

}
