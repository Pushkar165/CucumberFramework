package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	WebDriver Hdriver;
	
	public HomePage(WebDriver driverr)
	{
		Hdriver=driverr;
		PageFactory.initElements(driverr, this);
	}
	
    @FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
    WebElement BurgerMenuBtn;
    
    @FindBy(xpath= "//*[@id=\"about_sidebar_link\"]")
    WebElement AboutSideBarLink;
    
    @FindBy(xpath="//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div[1]/div[1]/div[1]/span")
    WebElement Products;
    
    @FindBy(xpath="//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement PlatformForTest;
    
    @FindBy(xpath="//*[@id=\"__next\"]/header/div/div/div[2]/div[2]/a/button")
    WebElement RequestADemo;
    
    

    
    
    public void ClickOnBurgerMenuBtn()
    {
    	BurgerMenuBtn.click();
    }
    
    public void ClickOnAboutSideBarLink ()
    {
    	AboutSideBarLink.click();
    
   
    }
    
    
    public void ClickOnProducts()
    {
    	Products.click();
    }
    
    public void ClickOnPlatformForTest()
    {
    	PlatformForTest.click();
    
   
    }
   
    
    public void ClickOnRequestADemo()
    {
    	RequestADemo.click();
    }
    
   

	


    
   
}
  
    


