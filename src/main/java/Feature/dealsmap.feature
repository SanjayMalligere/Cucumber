Feature: Deal data creation

Scenario: Free CRM create a new deal Scenario

Given User is already on login page
When title of login page is Free CRM
Then enter username and password
|username         | password   |
| batchautomation | Test@12345 |
 
Then user clicks on login button
Then user in on Home Page
Then user moves to new deal page

Then user enters deal details 
| title | amount | probability | commission |
| test deal1 | 1000 | 50 | 10 |
| test deal2 | 2000 | 60 | 20 |
| test deal3 | 3000 | 70 | 30 |
| test deal4 | 4000 | 80 | 40 |


Then close the browser