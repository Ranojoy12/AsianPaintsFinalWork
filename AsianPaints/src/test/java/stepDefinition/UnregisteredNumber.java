package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import asianPaintsPOM.HomePagePF;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UnregisteredNumber {
	WebDriver driver;
	HomePagePF pf;
	@Before
	public void setProperty()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	@Given("^User is on the homepage$")
	public void user_is_on_the_homepage() throws Exception {
		//System.setProperty("webdriver.chrome.driver","E:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		 //driver=new ChromeDriver();
		 driver.get("https://www.asianpaints.com/");
		 driver.manage().window().maximize();
	}

	@When("^User provides unregistered ([^\\\"]*) mobile number$")
	public void user_provides_unregistered_mobile_number(String number) throws Exception {
		pf=PageFactory.initElements(driver, HomePagePF.class);
		pf.clickProfile();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pf.setMobile(number);
		pf.clickSubmit();
	    
	}

	@Then("^user should successfully view mobile no is not registered$")
	public void user_should_successfully_view_mobile_no_is_not_registered() throws Exception {
		Thread.sleep(30000);
String p=driver.findElement(By.xpath("//span[@class='modal__variant-login--otp-text' and contains(text(),'An OTP has been sent to your registered mobile number.')]")).getText();
System.out.println(p);
Assert.assertEquals(p,"mobile no is not registered");
	}
@After
public void close()
{
	driver.quit();
}

}
