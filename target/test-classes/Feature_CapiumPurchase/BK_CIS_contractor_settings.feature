Feature: Contractor settings

  Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Bookkeeping module
    
 Scenario: navigate to contractor settings in CIS and verify CS
 Given navigate to inside the client and verify CS
 Then navigate to contractor settings in CIS and verify CS
 
 Scenario: enter the data in settings and verify CS
 Given navigate to inside the client and verify CS
 Then navigate to contractor settings in CIS and verify CS
 Then enter the data in settings and verify CS
 
 Scenario: Click on double arrows in contractor settings page and verify the detail boxes are opening or closing CS
 Given navigate to inside the client and verify CS
 Then navigate to contractor settings in CIS and verify CS
 Then Click on double arrows in contractor settings page and verify the detail boxes are opening or closing CS
 
 Scenario: Click on side single arrows in contractor settings page and verify CS
 Given navigate to inside the client and verify CS
 Then navigate to contractor settings in CIS and verify CS
 Then Click on side single arrows in contractor settings page and verify CS
 
 