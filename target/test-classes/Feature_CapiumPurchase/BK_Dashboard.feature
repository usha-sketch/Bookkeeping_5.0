Feature: Dashboard

Background: User login
  Given Launch the browser
  And User need to enter the Application Url
  When User Enter username and Password
  Then User Click on login button
  And redirect to Bookkeeping module
  
   Scenario: Validate Returns in current month in General Dashboard
   Given Verify returns in current month
  
  Scenario: Validate monthly submitted Returns in General Dashboard
  Given Verify monthly submitted return
  And Verify Year drop down
  
  Scenario: Validate All Clients
  Given Click on All Clients and take screenshot
  
  Scenario: Validate Search in All clients
  Given Enter client name, search client name and verify
 
  Scenario: Validate Client Type in All clients
  Given Verify Client Type
  
  Scenario: Validate show drop down for pagination in All clients
  Given Select pagination number in drop down and take screenshot
  
  Scenario: Validate Next button in pagination in All clients
  Given click on Next button and take screenshot
  
  Scenario: Validate Previous button in pagination in All clients
  Given click on Previous button and take screenshot
  
  Scenario: Validate VAT Clients
  Given Click on VAT Clients and take screenshot
  
  Scenario: Validate Search in VAT clients
  Given Enter client name,search client name and verify VAT clients
 
   Scenario: Validate Client Type in VAT clients
  Given Verify Client Type in VAT client
  
  Scenario: Validate show drop down for pagination in VAT clients
  Given Select pagination number in drop down and take screenshot in VAT client
  
  Scenario: Validate Next button in pagination in VAT clients
  Given click on Next button and take screenshot in VAT client
  
  Scenario: Validate Previous button in pagination in VAT clients
  Given click on Previous button and take screenshot in VAT client