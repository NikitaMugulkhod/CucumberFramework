@OrganeHRMLAssignLeave
Feature: Orange HRM Assign Leave validation

Scenario Outline:	 Verify use is able to assign leave
Given User is already logged in and is on Dashboard page 
When user enters "<EmployeeName>","<LeaveType>","<fromDate>","<toDate>","<comment>" on Assign Leave page
And clicks on Assign button 
Then user should be able to Assign leave sucesully 
Examples:
|EmployeeName|LeaveType|fromDate|toDate|comment|
|orange|US - Personal|2022-08-17|2022-08-17|This is test cmmnt|