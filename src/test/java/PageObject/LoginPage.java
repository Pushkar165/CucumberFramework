package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver Rdriver)
	{
		ldriver=Rdriver;
		PageFactory.initElements(Rdriver, this);
	}
	
    @FindBy(id="user-name")
    WebElement UserID;
    
    @FindBy(id= "password")
    WebElement password;
    
    @FindBy(id = "login-button")
    WebElement loginbtn;
    
    
    
    

     public void EnterEmail(String eml)
    {
    	UserID.clear();
    	UserID.sendKeys(eml);
    }
    
    public void Enterpassword(String pwd)
    {
    	password.clear();
    	password.sendKeys(pwd);
    }
    
    public void ClickOnLoginButton ()
    {
    	loginbtn.click();
    }
    
   
    }
  
    
    
    
    
    

