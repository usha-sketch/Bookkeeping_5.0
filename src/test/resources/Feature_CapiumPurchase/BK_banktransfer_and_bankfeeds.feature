Feature: Bank Transfer and bank feed

  Background: User login
    Given Launch the browser
    And User need to enter the Application Url
    When User Enter username and Password
    Then User Click on login button
    And redirect to Bookkeeping module
 
Scenario: navigate to bank transfer and verify BT
 		Given navigate to inside the client and verify BT
 		Then Click on BankTransfers and Verify
		
Scenario: verify the Add Bank Tranfer page
	  Given navigate to inside the client and verify BT
	 	Then Click on BankTransfers and Verify
	 	And Click on Add BankTransfer and Verify
	 	
Scenario: Enter the Mandatory fields and clearform in Bank Transfer
	  Given navigate to inside the client and verify BT
	 	Then Click on BankTransfers and Verify
	 	And Click on Add BankTransfer and Verify
	 	And Enter the Data in Bank transfer
	 	And click on clearform and validate
 
Scenario: Validate the save and exit in Bank Transfer
	 Given navigate to inside the client and verify BT
	 	Then Click on BankTransfers and Verify
	 	And Click on Add BankTransfer and Verify
	 	And Enter the Data in Bank transfer
	 	And Click on Save and Exit and validate
	 	
	Scenario: Validate the Exports in the Bank Transfer
	  Given navigate to inside the client and verify BT
	 	Then Click on BankTransfers and Verify
	 	And Click on Exports in the Bank Transfer

Scenario: Click on check box in main grid and verify the enabling options BT
	  Given navigate to inside the client and verify BT
	 	Then Click on BankTransfers and Verify
	 	And Click on check box in main grid and verify the enabling options BT

Scenario: CLick on bank tranfer id and verify the popup BT
	  Given navigate to inside the client and verify BT
	 	Then Click on BankTransfers and Verify
	 	And CLick on bank tranfer id and verify the popup BT

Scenario: Click on check box in edit bank tranfer page and verify the enabling options BT
	  Given navigate to inside the client and verify BT
	 	Then Click on BankTransfers and Verify
	 	And Click on check box in edit bank tranfer page and verify the enabling options BT

Scenario: Click on double arrows in edit bank tranfer page and verify the detail boxes are opening or closing BT
	  Given navigate to inside the client and verify BT
	 	Then Click on BankTransfers and Verify
		And Click on double arrows in edit bank tranfer page and verify the detail boxes are opening or closing BT

Scenario: verify search bar in main grid BT
	  Given navigate to inside the client and verify BT
	 	Then Click on BankTransfers and Verify
		And verify search bar in main grid BT
		
		Scenario: Click on plus symbol in edit bank transfer page BT
	  Given navigate to inside the client and verify BT
	 	Then Click on BankTransfers and Verify
	 	And Click on plus symbol in edit bank transfer page BT
	 	
	 	Scenario: Click on plus symbol in edit bank transfer page BT
	  Given navigate to inside the client and verify BT
	 	Then Click on BankTransfers and Verify
	 	And Verify search icon and cross mark in edit bank transfer page BT



	 	
Scenario: Validate the BankFeed in Bank Screen
	  Given navigate to inside the client and verify BT
	 	Then Click on BankFeed and Verify
	 	
	Scenario: Validate the Link Bank Account Paage in Bank Screen
	  Given navigate to inside the client and verify BT
	 	Then Click on BankFeed and Verify
	 	And Click on LinkBankAccount and Verify	
	 	

	 	
	 	
	 	
	 	