Feature: Journal Tab

  Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Bookkeeping module
    
 Scenario: navigate to journal and verify JT
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 
 Scenario: Click on plus in journal main menu JT and verify
 Given navigate to inside the client and verify JT
 Then Click on plus in journal main menu JT and verify
 
 Scenario: Verify add journal
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then add journal and verify JT
 
 Scenario: Verify attachment while adding journal
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then add attachement for journal and verify JT
 
 Scenario: Verify add new lines and delete new lines 
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then add new lines and delete lines for journal and verify JT
 
 Scenario: Click on plus symbol in edit journal page JT
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then Click on plus symbol in edit journal page JT
 
 Scenario: Verify search icon in edit journal page JT
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then Verify search icon and cross mark in edit journal page JT
 
 Scenario: Click on check box in edit journal page and verify the enabling options
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then Click on check box in edit journal page and verify the enabling options
 
 Scenario: Click on double arrows in edit journal page and verify the detail boxes are opening/closing JT
 Given navigate to inside the client and verify JT
 Then Click on plus in journal main menu JT and verify
 Then Click on double arrows in edit journal page and verify the detail boxes are opening or closing JT
 
 Scenario: Click on side single arrows in edit journal page and verify JT
 Given navigate to inside the client and verify JT
 Then Click on plus in journal main menu JT and verify
 Then Click on side single arrows in edit journal page and verify JT
 
 Scenario: verify search bar in main grid JT
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then verify search bar in main grid JT
				 
				 		Scenario: verify period dropdown in main grid JT
				 		Given navigate to inside the client and verify JT
				 		Then navigate to journal and verify JT
				 		Then verify period dropdown in main grid JT
 
 Scenario: Verify check box in main grid
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then Click on checkbox in main grid and verify enabling options JT
 
 Scenario: Verify cancel selection and crossmark
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then Verify cancle selection and cross mark in the down JT
				 #
				#		 Scenario: Verify Pagination dropdown
				#		 Given navigate to inside the client and verify JT
				#		 Then navigate to journal and verify JT
				#		 Then Verify pagination dropdown JT
				 #
 Scenario: Verify export options in main grid
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then Verify export options in main grid JT

 Scenario: verify view option through journal id and icon JT
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then verify view option through journal id and icon JT
 
 Scenario: Verify the export option for the particular journal in the row
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then Verify the page view and download and edit in the particular row
 
 Scenario: Edit the journal and verify JT
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then Edit the journal and verify JT
 
 Scenario: Verify the copy in the row kebab JT
 Given navigate to inside the client and verify JT
 Then navigate to journal and verify JT
 Then Verify the copy in the row kebab JT
 
 
 
 