package tests;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Data 
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
	public Object[][] getData(){
		// Create object with two paraments
		// first parameter is row and second one is column
		Object[][] data = new Object[2][2];
		data[0][0] = "testemailone@gmail.com";
		data[0][1] = "password";
		
		data[1][0] = "testemailtwo@test.com";
		data[1][1] = "password";
 
		return data;
	}

//It get values from ReadVariant function method

//To get data from dataprovider
	@Test(dataProvider="testdataset")
	public void fbLoginLogout(String username, String password) throws Exception{
	
 		// To pass Email
driver.findElement(By.name("j_username")).sendKeys(username);
 		// To clear password field
Thread.sleep(100);
driver.findElement(By.name("j_password")).sendKeys(password);

Thread.sleep(100);
 		// To click on Account settings dropdown	

driver.quit();
}
	

}
