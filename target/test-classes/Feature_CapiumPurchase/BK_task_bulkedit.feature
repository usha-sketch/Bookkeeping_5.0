Feature: Bulkedit

  Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Bookkeeping module
    
 
 #Scenario: navigate to bulk edit in task and verify BE
 #Given navigate to inside the client and verify BE
 #Then navigate to bulk edit in task and verify BE
 
 Scenario: select the check box in main grid, edit and verify BE
 Given navigate to inside the client and verify BE
 Then navigate to bulk edit in task and verify BE
 Then select the check box in main grid and edit and verify BE
 
 #Scenario: Verify search bar in main grid and verify BE
 #Given navigate to inside the client and verify BE
 #Then navigate to bulk edit in task and verify BE
 #Then Verify search bar in main grid and verify BE
 #
 #Scenario: Select the accounts in accounts dropdown and verify BE
 #Given navigate to inside the client and verify BE
 #Then navigate to bulk edit in task and verify BE
 #Then select the from and to date and verify BE
 #
 #Scenario: verify reference number and edit and download options BE
 #Given navigate to inside the client and verify BE
 #Then navigate to bulk edit in task and verify BE
 #Then verify reference number and edit and download options BE
 #
 
 
 
 
 
 
 
 