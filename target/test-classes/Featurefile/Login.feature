 @OrangeHRMLogin
 Feature: Orange HRM login validation

  @Login1
  Scenario: login to OrangeHRM login Application
  Given user is on login screen
  When users enters userid and password on login page
  And   user clicks on login button
  Then user  should able to on dashboard page
 
  @datawithoutExamples
  Scenario: login to OrangeHRM login Application
  Given user is on login screen
  When users enters userid  as "Admin" password as "admin123" login page
  And   user clicks on login button
  Then user  should able to on dashboard page

 @datawithExamples
 Scenario: login to OrangeHRM login Application
  Given user is on login screen
  When users enters  "<userid>" and "<password>"
  And   user clicks on login button
  Then user  should able to on dashboard page
 Examples:
  	|userid|password|
  	|Admin |admin123|
  		
  	
  @datatable
 Scenario: login to OrangeHRM login Application
  Given user is on login screen
  When users enters credentials on login page
  |userid|password|
  |Admin |admin123|
   And  user clicks on login button
  Then  user  should able to on dashboard page
  	