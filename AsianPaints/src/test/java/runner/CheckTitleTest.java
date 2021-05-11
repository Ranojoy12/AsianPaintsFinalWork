package runner;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/Feature/checktitle.feature",glue= {"stepDefinition"},plugin= {"pretty","html:target/Destination"})
@CucumberOptions(features="src/test/resources/Feature/checktitle.feature",glue= {"stepDefinition"},plugin= {"json:target/Destination.json"})
public class CheckTitleTest extends AbstractTestNGCucumberTests{

}
