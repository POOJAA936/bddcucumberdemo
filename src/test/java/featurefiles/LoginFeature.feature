Feature: Testing the Login feature of Actitime Application

Background:
Given the browser Lunched
And the Application is loaded

Scenario: Testing the Login Feature with valid username
When the user enters the valid username
And the user enters the valid password
And the userclicks on the Login button
Then dashboard should be displayed

Scenario: Testing the forgotten password link
When user clicks on Forget your password link
Then forgot your password component page should be displayed