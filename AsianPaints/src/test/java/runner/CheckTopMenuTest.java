package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/Feature/TopMenu.feature",glue= {"stepDefinition"},plugin= {"pretty","html:target/Cucumber"})
public class CheckTopMenuTest extends AbstractTestNGCucumberTests {

}
