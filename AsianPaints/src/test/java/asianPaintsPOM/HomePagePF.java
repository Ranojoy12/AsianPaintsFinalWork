package asianPaintsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePF {
	WebDriver driver;
	@FindBy(xpath="//a[@data-target='#PAINTSTEXTURES']")
WebElement paints_texture;
	@FindBy(xpath="//a[@data-target='#WALLCOVERINGS']")
	WebElement wall_covering;
	@FindBy(xpath="//a[@data-target='#HEALTHHYGIENE']")
	WebElement health_hygiene;
	@FindBy(xpath="//a[@data-target='#SERVICES']")
	WebElement Services;
	@FindBy(xpath="//a[@data-target='#IDEAS']")
	WebElement ideas;
	@FindBy(xpath="//a[@data-target='#SHOP']")
	WebElement shop;
	@FindBy(xpath="//h2[contains(text(),'Create your dream home with our painting experts')]")
	WebElement First_hd;
	@FindBy(xpath="//h2[contains(text(),'Interior Design Service')]")
	WebElement Second_hd;
	@FindBy(xpath="//h2[contains(text(),'Latest from our blogs')]")
	WebElement Third_hd;
	@FindBy(xpath="//h2[contains(text(),'Exquisite Finishes For Your Dream Home')]")
	WebElement Fourth_hd;
	@FindBy(xpath="//h2[contains(text(),'Paint Budget Calculator')]")
	WebElement Fifth_hd;
	@FindBy(xpath="//h2[contains(text(),'Colour Visualiser')]")
	WebElement Sixth_hd;
	@FindBy(xpath="//h2[contains(text(),'Explore Colours')]")
	WebElement Seventh_hd;
	@FindBy(xpath="//h2[contains(text(),'Explore Our Stores')]")
	WebElement Eigth_hd;
	@FindBy(xpath="//h2[contains(text(),'Explore Our Stores')]")
	WebElement Ninth_hd;
	@FindBy(xpath="//a[@class='iconLinks iconLinks__profile profile-js-handle visible-desktop']")
	WebElement profile;
	@FindBy(xpath="//input[@id='loginMobile']")
	WebElement mobile;
	@FindBy(xpath="//button[@class='ctaText modal__variant-login--submit']")
	WebElement submit;
	@FindBy(xpath="//input[@id='loginOtp']")
	WebElement otp;
	@FindBy(xpath="//button[@class='ctaText validate-login  modal__variant-login--submit']")
	WebElement Submit1;
	@FindBy(xpath="//a[@data-dropdown-target='#loginDropdown']")
	WebElement profile1;
	@FindBy(xpath="//a[@class='logout-link']")
	WebElement logout;
	public HomePagePF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public boolean checkPaintsTexture()
	{
		return paints_texture.isDisplayed();
	}
	public boolean checkWallCovering()
	{
		return wall_covering.isDisplayed();
	}
	public boolean checkHealthHygiene()
	{
		return health_hygiene.isDisplayed();
	}
	public boolean checkService()
	{
		return Services.isDisplayed();
	}
	public boolean checkIdeas()
	{
		return ideas.isDisplayed();
	}
	public boolean checkShop()
	{
		return shop.isDisplayed();
	}
	public boolean checkHeader1()
	{
		return First_hd.isDisplayed();
	}
	public boolean checkHeader2()
	{
		return Second_hd.isDisplayed();
	}
	public boolean checkHeader3()
	{
		return Third_hd.isDisplayed();
	}
	public boolean checkHeader4()
	{
		return Fourth_hd.isDisplayed();
	}
	public boolean checkHeader5()
	{
		return Fifth_hd.isDisplayed();
	}
	public boolean checkHeader6()
	{
		return Sixth_hd.isDisplayed();
	}
	public boolean checkHeader7()
	{
		return Seventh_hd.isDisplayed();
	}
	public boolean checkHeader8()
	{
		return Eigth_hd.isDisplayed();
	}
	public boolean checkHeader9()
	{
		return Ninth_hd.isDisplayed();
	}
	public void clickProfile()
	{
		profile.click();
	}
	public void setMobile(String mob)
	{
		mobile.sendKeys(mob);
	}
	public void clickSubmit()
	{
		submit.click();
	}
	public void Submit()
	{
		Submit1.click();
	}
	public void clickProfile1()
	{
		profile1.click();
	}
	public boolean checklogOut()
	{
		return logout.isDisplayed();
	}
}
