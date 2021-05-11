package stepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VerifyTitle {
	WebDriver driver;
	@Test
	@Given("^user is in the home page of the application$")
	public void user_is_in_the_home_page_of_the_application() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.asianpaints.com/");
	 driver.manage().window().maximize();
	 //Alert alert=driver.switchTo().alert();
	 //alert.dismiss();
	    
	}
@Test
	@Then("^user should successfully view the title of application$")
	public void user_should_successfully_view_the_title_of_application() throws Exception {
//	Alert alert=driver.switchTo().alert();
//	alert.dismiss();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Wall Paints, Home Painting & Paint Colour Combinations in India - Asian Paints");
		driver.quit();
		
	    
	}

}
