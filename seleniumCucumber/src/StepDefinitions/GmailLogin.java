package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

//import bsh.Capabilities;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GmailLogin {

	
			String baseUrl = "https://www.flipkart.com";
		public static WebDriver driver;
		
		@Before
		public void Setup()
		{
			
			System.setProperty("webdriver.firefox.marionette","C:\\Users\\sdhanalakota\\Documents\\sanjay\\TestNg\\Jars\\geckodriver.exe");
	        
		    DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		    
		    
		    capabilities.setCapability("marionette", false);	
		    driver = new FirefoxDriver();
		}
		

		
		@After
		public void teardown()
		{
			//driver.findElement((By.className("gb_ab"))).click();
			
			driver.quit();
		}
	    
		@Given("^I am on Login page$")
		public void i_am_on_Login_page() throws Throwable {
			 driver.get("https://www.gmail.com");
			    System.out.println("Enter gmail url");
		}

		@When("^i enter username and password$")
		public void i_enter_username_and_password() throws Throwable {

			Thread.sleep(3000);
		   driver.findElement((By.xpath("//*[@id='identifierId']"))).sendKeys("sanjay.d498");
		   
		   driver.findElement((By.xpath("//*[@id='identifierNext']/content/span"))).click();
		   Thread.sleep(3000);
		   driver.findElement((By.xpath("//*[@id='password']/div[1]/div/div[1]/input"))).sendKeys("sanjaysanjay123");
		  
		}

		@When("^i click submit button$")
		public void i_click_submit_button() throws Throwable {

			driver.findElement((By.xpath("//*[@id='passwordNext']/div[2]"))).click();
			Thread.sleep(20000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		@Then("^i should be shown inbox page$")
		public void i_should_be_shown_inbox_page() throws Throwable {

			 Actions actions = new Actions(driver);
			//driver.findElement((By.id(".//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a/span"))).click();
			//WebElement subMenu = driver.findElement(By.xpath(".//*[@id='gb_71']"));
	        //actions.moveToElement(subMenu);
	        //actions.click().build().perform();
		}

	    
		
		
		
	

}
