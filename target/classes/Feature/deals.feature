Feature: Deal data creation

Scenario: Free CRM create a new deal Scenario

Given User is already on login page
When title of login page is Free CRM
Then enter username and password
| batchautomation | Test@12345 | 
Then user clicks on login button
Then user in on Home Page
Then user moves to new deal page
Then user enters deal details 
| test deal | 1000 | 50 | 10 |
Then close the browser