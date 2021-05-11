package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import asianPaintsPOM.HomePagePF;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CheckTopMenu {
	WebDriver driver;
	HomePagePF pf;
	@Test
	@Given("^user is in the homepage of Asianpaints\\.com$")
	public void user_is_in_the_homepage_of_Asianpaints_com() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.asianpaints.com/");
		 driver.manage().window().maximize();
	   
	}
	@Test(priority=1)
	@Then("^user should successfully view paints & textures option in homepage\\.$")
	public void user_should_successfully_view_paints_textures_option_in_homepage() throws Exception {
		pf=PageFactory.initElements(driver, HomePagePF.class);
		boolean view=pf.checkPaintsTexture();
		Assert.assertTrue(view);
		driver.quit();
		
	}
@Test(priority=2)
	@Then("^user should successfully view Wall coverings option in homepage$")
	public void user_should_successfully_view_Wall_coverings_option_in_homepage() throws Exception {
		pf=PageFactory.initElements(driver,HomePagePF.class);
		boolean view1=pf.checkWallCovering();
		Assert.assertTrue(view1);
		driver.quit();
	    
	}
@Test(priority=3)
	@Then("^user should successfully view health & hygiene option in homepage$")
	public void user_should_successfully_view_health_hygiene_option_in_homepage() throws Exception {
	  pf=PageFactory.initElements(driver, HomePagePF.class);
	  boolean view2=pf.checkHealthHygiene();
	  Assert.assertTrue(view2);
	  driver.quit();
	}
@Test(priority=4)
	@Then("^user should successfully view services option in homeoage\\.$")
	public void user_should_successfully_view_services_option_in_homeoage() throws Exception {
		 pf=PageFactory.initElements(driver, HomePagePF.class);
		 boolean view3=pf.checkService();
		 Assert.assertTrue(view3);
		 driver.quit();
	}
@Test(priority=5)
	@Then("^user should successfully view ideas option in home page\\.$")
	public void user_should_successfully_view_ideas_option_in_home_page() throws Exception {
		pf=PageFactory.initElements(driver, HomePagePF.class);
		boolean view4=pf.checkIdeas();
		Assert.assertTrue(view4);
		driver.quit();
	}
@Test(priority=6)
	@Then("^user should successfully view shop option in home page$")
	public void user_should_successfully_view_shop_option_in_home_page() throws Exception {
		pf=PageFactory.initElements(driver, HomePagePF.class);
		boolean view5=pf.checkShop();
		Assert.assertTrue(view5);
		driver.quit();
	}



}
