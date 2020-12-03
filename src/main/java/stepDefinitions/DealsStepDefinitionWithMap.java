package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsStepDefinitionWithMap {
	
	WebDriver driver;

	@Given("^User is already on login page$")
	public void user_already_on_login_Page(){
		System.setProperty("webdriver.gecko.driver", "/Users/sanjms/Downloads/geckodriver 3");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com");
		
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM(){
		
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String title = driver.getTitle();
		System.out.println(title);
	//	Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.", title);
		                    
	    
	}
	
	@Then("^enter username and password$")
	public void enter_username_and_password(DataTable credentials) {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			 driver.findElement(By.name("username")).sendKeys(data.get("username"));
			 driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
		
	   
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		WebElement loginBtn =
			 driver.findElement(By.xpath("//input[@type='submit']"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", loginBtn);
				 
				 
				 try {
						Thread.sleep(9000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    
	}

	@Then("^user in on Home Page$")
	public void user_in_on_Home_Page(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO", title);
	    
	}
	
	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deals_page()  {
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}
	
	
	
	@Then("^user enters deal details$")
	 public void user_enters_contacts_details(DataTable dealData){
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Map<String, String> data : dealData.asMaps(String.class, String.class)){
			driver.findElement(By.id("title")).sendKeys(data.get("title"));
			 driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			 driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
			 driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
			 
			 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
			 
			 try {
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			 Actions action = new Actions(driver);
			 action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			 driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		}
		 
	 }
	
	
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	   
	}
	

}
