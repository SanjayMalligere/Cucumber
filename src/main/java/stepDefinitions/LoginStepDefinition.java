//package stepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStepDefinition {
//	
//	WebDriver driver;
//
//	@Given("^User is already on login page$")
//	public void user_already_on_login_Page(){
//		System.setProperty("webdriver.gecko.driver", "/Users/sanjms/Downloads/geckodriver 3");
//		driver = new FirefoxDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.get("https://classic.crmpro.com");
//		
//		try {
//			Thread.sleep(9000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM(){
//		
//		try {
//			Thread.sleep(9000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//	//	Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.", title);
//		                    
//	    
//	}
//
////	@Then("^enter username and password$")
////	public void enter_username_and_password() {
////		 driver.findElement(By.name("username")).sendKeys("batchautomation");
////		 driver.findElement(By.name("password")).sendKeys("Test@12345");
////	   
////	}
//	
//	
//	@Then("^enter \"(.*)\" and \"(.*)\"$")
//	public void enter_username_and_password(String username, String password) {
//		 driver.findElement(By.name("username")).sendKeys(username);
//		 driver.findElement(By.name("password")).sendKeys(password);
//	   
//	}
//	
//	
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button(){
//		WebElement loginBtn =
//			 driver.findElement(By.xpath("//input[@type='submit']"));
//				 JavascriptExecutor js = (JavascriptExecutor)driver;
//				 js.executeScript("arguments[0].click();", loginBtn);
//				 
//				 
//				 try {
//						Thread.sleep(9000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//	    
//	}
//
//	@Then("^user in on Home Page$")
//	public void user_in_on_Home_Page(){
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("CRMPRO", title);
//	    
//	}
//	
//	@Then("^user moves to new contacts page$")
//	public void user_moves_to_new_contacts_page()  {
//		try {
//			Thread.sleep(9000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//		try {
//			Thread.sleep(9000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	   
//	}
//	
//
//
//	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_contact_details_and_and(String firstname, String lastname, String position)  {
//		driver.findElement(By.id("first_name")).sendKeys(firstname);
//		 driver.findElement(By.id("surname")).sendKeys(lastname);
//		 driver.findElement(By.id("company_position")).sendKeys(position);
//		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//		 try {
//				Thread.sleep(9000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	    
//	}
//	
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	   
//	}
//	
//
//}
