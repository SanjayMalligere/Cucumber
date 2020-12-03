@FunctionalTest
Feature: Free CRM Application Testing

@SmokeTest @RegressionTest
Scenario: Login to Application
Given this is login test

@SmokeTest @RegressionTest
Scenario: Login with wrong credentials 
Given this is negative login test

@SmokeTest
Scenario: Create Deals
Given this is deals test

@RegressionTest
Scenario: Create Contacts
Given this is contacts test

@End2EndTest
Scenario: Create a Task
Given this is task test

@End2EndTest @SmokeTest
Scenario: Create a Case
Given this is case test

@End2EndTest
Scenario: Application Logout
Given this is application logout test

@SmokeTest
Scenario: Browser Close
Given this is close browser test