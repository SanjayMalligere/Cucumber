package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HooksStepDefinition {
	
	@Before
	public void setUP(){
		System.out.println("launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}
	
	@After
	public void tearDown(){
		System.out.println("close the browser");
	}
	
	@Given("^user is on deals page$")
	public void user_is_on_deals_page() {
		System.out.println("User is onDeals Page");
	    
	}

	@Then("^user fills the deals form$")
	public void user_fills_the_deals_form() {
		System.out.println("create a deal");
	   
	}

	@Then("^deal is created$")
	public void deal_is_created()  {
		System.out.println("deal is created");
	    
	}

	@Given("^user is on contacts page$")
	public void user_is_on_contacts_page()  {
		System.out.println("user is on contact page");
	    
	}

	@Then("^user fills the contacts form$")
	public void user_fills_the_contacts_form() {
		System.out.println("create a contact");
	    
	}
	
	@Then("^contact is created$")
	public void contact_is_created() throws Throwable {
	System.out.println("contact is created");
	}

	@Given("^user is on Email page$")
	public void user_is_on_Email_page()  {
		System.out.println("user is on mail page");
	    
	}

	@Then("^user fills the Email form$")
	public void user_fills_the_Email_form() {
		System.out.println("create a mail");
	}
	
	@Then("^mail is created$")
	public void mail_is_created() throws Throwable {
	System.out.println("mail is created");
	}

}
