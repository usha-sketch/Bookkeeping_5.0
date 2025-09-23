Feature: Client Dashboard

Background: User login
  Given Launch the browser
  And User need to enter the Application Url
  When User Enter username and Password
  Then User Click on login button
  And redirect to Bookkeeping module
  
  Scenario: Validate Client Dashboard
  Given Click on search box in all Clients,enter client name and Click on search icon and Click on searched client
  And Verify dashboard displaying or not successfully and take screenshot
  
  Scenario: Validate Total Income in Client Dashboard
  Given Click on search box in all Clients,enter client name and Click on search icon and Click on searched client
  And Verify Total Income
  
  Scenario: Validate Total Expenditure in Client Dashboard
  Given Click on search box in all Clients,enter client name and Click on search icon and Click on searched client
  And Verify Total Expenditure
  
  Scenario: Validate Bank Balance in Client Dashboard
  Given Click on search box in all Clients,enter client name and Click on search icon and Click on searched client
  And Verify Bank Balance
  And Click on View Bank Book and verify
  
  Scenario: Validate Cash in Hand in Client Dashboard
  Given Click on search box in all Clients,enter client name and Click on search icon and Click on searched client
  And Verify Cash in Hand
  And Click on View Cash Book and verify
  
  Scenario: Validate Income by Category in Client Dashboard
  Given Click on search box in all Clients,enter client name and Click on search icon and Click on searched client
  And Verify Income by Category
  
  Scenario: Validate Expenditure by Category in Client Dashboard
  Given Click on search box in all Clients,enter client name and Click on search icon and Click on searched client
  And Verify Expenditure by Category
  
  Scenario: Validate Income vs Expenditure in Client Dashboard
  Given Click on search box in all Clients,enter client name and Click on search icon and Click on searched client
  And Verify Income vs Expenditure
  
  Scenario: Validate Ageing Summary in Client Dashboard
  Given Click on search box in all Clients,enter client name and Click on search icon and Click on searched client
  And Verify Ageing Summary
  And Verify Ageing Summary Dropdown
  
  Scenario: Validate VAT Summary in Client Dashboard
  Given Click on search box in all Clients,enter client name and Click on search icon and Click on searched client
  And Verify VAT Summary
  
  Scenario: Validate Cash Flow in Client Dashboard
  Given Click on search box in all Clients,enter client name and Click on search icon and Click on searched client
  And Verify Cash Flow
  
  Scenario: Validate Year Dropdown in Client Dashboard
  Given Click on search box in all Clients,enter client name and Click on search icon and Click on searched client
  And Verify year drop down