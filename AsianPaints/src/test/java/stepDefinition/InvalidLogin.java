package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import asianPaintsPOM.HomePagePF;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidLogin {
	WebDriver driver;
	HomePagePF pf;
	@Test
	@Given("^user is in the home page of AsianPaints application$")
	public void user_is_in_the_home_page_of_AsianPaints_application() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.asianpaints.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
@Test(priority=1)
	@When("^user provides invalid ([^\\\"]*)$")
	public void user_provides_invalid(String mobileno) throws Exception {
	pf=PageFactory.initElements(driver,HomePagePF.class);	
	    pf.clickProfile();
	    pf.setMobile(mobileno);
	    pf.clickSubmit();
	}
@Test(priority=2)
	@Then("^user should successfully view mobile no is invalid$")
	public void user_should_successfully_view_mobile_no_is_invalid() throws Exception {
		boolean view=driver.findElement(By.xpath("//div[contains(text(),'Phone number is invalid')]")).isDisplayed();
		Assert.assertTrue(view);
		driver.quit();
	}



}
