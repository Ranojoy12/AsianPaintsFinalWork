package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import asianPaintsPOM.HomePagePF;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CheckHeadersAndInformation {
	WebDriver driver;
	HomePagePF pf;
	@Test
	@Given("^User is in the home page of the application$")
	public void user_is_in_the_home_page_of_the_application() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.asianpaints.com/");
		 driver.manage().window().maximize();
	}
@Test
	@Then("^user should successfully view all headers present in application$")
	public void user_should_successfully_view_all_headers_present_in_application() throws Exception {
		pf=PageFactory.initElements(driver, HomePagePF.class);
		boolean view=pf.checkHeader1();
		Assert.assertTrue(view);
		boolean view1=pf.checkHeader2();
		Assert.assertTrue(view1);
		boolean view2=pf.checkHeader3();
		Assert.assertTrue(view2);
		boolean view3=pf.checkHeader4();
		Assert.assertTrue(view3);
		boolean view4=pf.checkHeader5();
		Assert.assertTrue(view4);
		boolean view5=pf.checkHeader6();
		Assert.assertTrue(view5);
		boolean view6=pf.checkHeader7();
		Assert.assertTrue(view6);
		boolean view7=pf.checkHeader8();
		Assert.assertTrue(view7);
		boolean view8=pf.checkHeader9();
		Assert.assertTrue(view8);
		driver.quit();
		
		
	    
	}
@Test
	@Then("^user should successfully view all the informations present in the application\\.$")
	public void user_should_successfully_view_all_the_informations_present_in_the_application() throws Exception {
	  WebElement p=driver.findElement(By.tagName("body"));
	  String r=p.getText();
	  System.out.println(r);
	  driver.quit();
	}


}
