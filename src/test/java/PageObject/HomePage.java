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
	
    @FindBy(id="react-burger-menu-btn")
    WebElement BurgerMenuBtn;
    
    @FindBy(id= "about_sidebar_link")
    WebElement AboutSideBarLink;
    

    
    
    
    

    
    
    public void ClickOnBurgerMenuBtn()
    {
    	BurgerMenuBtn.click();
    }
    
    public void ClickOnAboutSideBarLink ()
    {
    	AboutSideBarLink.click();
    
   
    }
}
  
    


