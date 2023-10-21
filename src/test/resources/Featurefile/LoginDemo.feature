 @tag
 Feature: Login validation
 
 Background: user needs tologged in
 Given user needs to access application
 Then user should have internet connection
 
 @tag1@smoke
 Scenario: verify user login is sucesfully
 Given user is on login page
 When users enters userid and password
 And clicks on login button
 Then user is able to on dashboard page


 @tag2@ignore
 Scenario: verify user login is sucesfully
 Given user is on login page
 When users enters userid and password
 And clicks on login button
 Then user is able to on dashboard page
 
  @tag3@smoke
 Scenario: verify user login is sucesfully
 Given user is on login page
 When users enters userid and password
 And clicks on login button
 Then user is able to on dashboard page