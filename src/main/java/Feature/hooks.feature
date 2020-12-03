Feature: Free CRM Application Test

Scenario: Craete Deals Test 
	Given user is on deals page
	Then user fills the deals form
	Then deal is created
	
	
Scenario: Craete Contact Test 
	Given user is on contacts page
	Then user fills the contacts form
	Then contact is created
	
	
	
Scenario Outline: Craete Email Test 
	Given user is on Email page
	Then user fills the Email form
	Then mail is created
	
	Examples:
	|mail1|
	|mail2|
	|mail3|	