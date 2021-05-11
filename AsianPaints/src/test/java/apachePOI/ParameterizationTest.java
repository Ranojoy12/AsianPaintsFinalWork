package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import asianPaintsPOM.HomePagePF;

public class ParameterizationTest {
	WebDriver driver;
	String num;
	int number;
	@BeforeTest
	public void setBrowser() throws Exception
	{
		File f=new File("E:\\Selenium Software\\InvalidNo.xlsx");
	FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
 number= (int) sheet.getRow(0).getCell(0).getNumericCellValue();
 num=Integer.toString(number);
	System.out.println(number);
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@Test
	public void logIn()
	{
		HomePagePF pf=PageFactory.initElements(driver, HomePagePF.class);
		driver.get("https://www.asianpaints.com/");
		pf.clickProfile();
		pf.setMobile(num);
		pf.clickSubmit();
		boolean view=driver.findElement(By.xpath("//div[contains(text(),'Phone number is invalid')]")).isDisplayed();
		Assert.assertTrue(view);
	}
@AfterTest
public void close()
{
	driver.quit();
}
}
