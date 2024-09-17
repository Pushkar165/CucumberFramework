package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.HomePage;
import PageObject.LoginPage;
import Utilities.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDef extends BaseClass{
	
	@Before
	public void setUp() throws Exception
	{
		
		ReadConfig RC = new ReadConfig(); // Object of readconfig class is created
										//can keep this declaration in base class.
		String Browser = RC.getBrowser(); // getbrowser method is called and stred that value in string var
		
		
		
		switch(Browser.toLowerCase()) // used switch statements for different browser values
									//Browser.tolowercase will convert the value in lowercase
									//it will execute the block of codes which matches the value in properties file.
		{
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
			
		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
			default:
				driver=null;
				break;
			
			
			
		}
		
	

		
		
		
		
		
		
		
		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 */
	}
	
	/*
	 * @BeforeStep public void BeforeStepDemo() {
	 * System.out.println("before steps"); }
	 */
	
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	loginpg = new LoginPage(driver);
	Homepg = new HomePage(driver);
	   
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	   driver.get(url);
	}

	@When("User enter valid userID as {string} and password as {string}")
	public void user_enter_valid_user_id_as_and_password_as(String email, String password) {
		 loginpg.EnterEmail(email);
		 loginpg.Enterpassword(password);
	}
	
		
	

	@When("User clicks on login button.")
	public void user_clicks_on_login_button() {
	   loginpg.ClickOnLoginButton();
	
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String ExpectedTitle) {
		String ActualTitle = driver.getTitle();
		if (ActualTitle.equals(ExpectedTitle))
		{
		 Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	
	}
	
	
	@When("User clicks on three horizontal bar.")
	public void user_clicks_on_three_horizontal_bar() {
	   Homepg.ClickOnBurgerMenuBtn(); 
	}

	@When("User clicks on about.")
	public void user_clicks_on_about() {
	    Homepg.ClickOnAboutSideBarLink();
	}
	
	
	
	@After
	public void tearDown(Scenario sc) throws IOException 
	{   
		if(sc.isFailed()==true) 
		{
			String fileWithPath = "C:\\Users\\Pushkar Shukla\\OneDrive\\Desktop\\Eclipse_Program\\CucucmberFramework\\Screenshots\\Screenshot.png";
			TakesScreenshot TS = ((TakesScreenshot)driver); 
			File srcFile= TS.getScreenshotAs(OutputType.FILE);
			File desFile= new File (fileWithPath);
			FileUtils.copyFile(srcFile, desFile);
			
		}
		
		driver.quit();
		
	}
	
	@After
	public void closeWindow()
	{   
		driver.quit();
		
	}

	/*
	 * @AfterStep public void AfterStepDemo() { System.out.println("before steps");
	 * }
	 */
	
	}


	
	


