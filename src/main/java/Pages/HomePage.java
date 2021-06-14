package Pages;







import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class HomePage 

{    	
WebDriver driver;


    public HomePage(WebDriver ldriver)
			{
			this.driver =ldriver;
			}

    
			@FindBy(how=How.XPATH,using="//input[@name='j_username']")
			private WebElement Username;

		   @FindBy(xpath="//input[@name='j_password']")
		   private   WebElement Password;
		   
		   @FindBy(xpath="//input[@name='Submit']")
		   private   WebElement ButtonClick;

		   
public void usr(String username) 
			
		     {
						
	Username.sendKeys(username);
						
					
		     }	  
			
     public void pwd(String password) 
			
     {
				
    	 Password.sendKeys(password);
				
			
     }	  
	
     public void click() 
		
     {
				
    	 ButtonClick.click();
				
			
     }	  
    


	}
	
