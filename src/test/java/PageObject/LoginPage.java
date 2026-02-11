package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    	
    	 
		//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
    	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
    	 UserID.clear();
    	UserID.sendKeys(eml);
    }
    
    public void Enterpassword(String pwd)
    {//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
	 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
    	password.clear();
    	password.sendKeys(pwd);
    }
    
    public void ClickOnLoginButton ()
    {//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginbtn")));
    	loginbtn.click();
    }
    
   
    }
  
    
    
    
   
    
    
    

