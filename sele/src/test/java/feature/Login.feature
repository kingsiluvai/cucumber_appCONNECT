Feature: Application Login


Scenario: Home Page Default Login
Given User is an appconnect landing page 
When User login into application with username and password 
Then Home page is populated 
And options are displayed 
