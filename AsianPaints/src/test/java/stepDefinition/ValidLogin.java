package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import asianPaintsPOM.HomePagePF;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidLogin {
	WebDriver driver;
	HomePagePF pf;
	@Test
	@Given("^user is in the login page of the of the application$")
	public void user_is_in_the_login_page_of_the_of_the_application() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.asianpaints.com/");
		 driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
@Test(priority=1)
	@When("^user provides valid ([^\\\"]*)$")
	public void user_provides_valid(String mobileno) throws Exception {
		pf=PageFactory.initElements(driver, HomePagePF.class);
		pf.clickProfile();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pf.setMobile(mobileno);
		pf.clickSubmit();
	WebElement p=driver.findElement(By.xpath("//input[@id='loginOtp']"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(30000);
		pf.Submit();
		//Thread.sleep(300000);
	}
@Test(priority=2)
	@Then("^user should successfully view Sign out option$")
	public void user_should_successfully_view_Sign_out_option() throws Exception {
	  pf=PageFactory.initElements(driver, HomePagePF.class);
	 // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 // pf.clickProfile1();
	  Thread.sleep(30000);
	 driver.findElement(By.xpath("//a[@data-dropdown-target='#loginDropdown']")).click();
	 // Thread.sleep(30000);
	  boolean view=pf.checklogOut();
	  Assert.assertTrue(view);	
	  driver.quit();
	}

}
