Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a New Contac Scenario

Given User is already on login page
When title of login page is Free CRM
Then enter "<username>" and "<password>"
Then user clicks on login button
Then user in on Home Page
Then user moves to new contacts page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:

	| username | password | firstname | lastname | position |
	| batchautomation | Test@12345 | peter | parker | QA | 
	| batchautomation | Test@12345 | tom | jerry | QA | 
	