Feature: Free CRM Login Feature

#Scenario: Free CRM Login Page

#Given User is already on login page
#When title of login page is Free CRM
#Then enter username and password
#Then user clicks on login button
#Then user in on Home Page


# Without Examples Keyword

#Scenario: Free CRM Login Page

#Given User is already on login page
#When title of login page is Free CRM
#Then enter "batchautomation" and "Test@12345"
#Then user clicks on login button
#Then user in on Home Page
#Then close the browser

# With Examples Keyword

Scenario Outline: Free CRM Login Page

Given User is already on login page
When title of login page is Free CRM
Then enter "<username>" and "<password>"
Then user clicks on login button
Then user in on Home Page
Then close the browser

Examples:

	| username | password |
	| batchautomation | Test@12345 |
	| testadmin | test123 |