package tests;

import org.testng.annotations.Test;

import com.Test_utility.Utilt;


import Pages.HomePage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;



public class DataDrivenTest extends Utilt
{

	WebDriver driver;
	
	@BeforeMethod()
	public void beforeMethod()

	{
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/login?from=%2F");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}
	@DataProvider(name="testdataset")
		public Iterator<Object[]> TestData()

		{
			ArrayList<Object[]> testData = Utilt.testdatasetFromExcel();
			
			return testData.iterator();
		}
	

	
//It get values from ReadVariant function method

//To get data from dataprovider
	@Test(dataProvider="testdataset")
	public void fbLoginLogout(String username, String password, String username1, String password1, String username2, String password2) throws Exception{

		HomePage login_page=PageFactory.initElements(driver, HomePage.class);
		
		login_page.usr(username);
		Thread.sleep(1000);
		login_page.pwd(password);
		Thread.sleep(1000);
		login_page.click();
		Thread.sleep(1000);
		login_page.usr(username1);
		Thread.sleep(1000);
		login_page.pwd(password1);
		Thread.sleep(1000);
		login_page.click();
		Thread.sleep(1000);
		login_page.usr(username2);
		Thread.sleep(1000);
		login_page.pwd(password2);
		Thread.sleep(1000);
		login_page.click();
		Thread.sleep(1000);


}
 	
	@AfterMethod()
	public void aftermethod() {
		driver.quit();
	}
	 
}
