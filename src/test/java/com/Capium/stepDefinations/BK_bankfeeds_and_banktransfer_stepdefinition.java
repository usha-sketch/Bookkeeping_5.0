package com.Capium.stepDefinations;

import com.Capium.Actions.BK_bankTrasfer_and_bankfeeds_actions;
import com.Capium.Utilites.StepTracker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BK_bankfeeds_and_banktransfer_stepdefinition {
	BK_bankTrasfer_and_bankfeeds_actions  banktranferactions=new BK_bankTrasfer_and_bankfeeds_actions();
	
	@Then("Click on BankTransfers and Verify")
	public void ClickonBankTraferandverify() throws InterruptedException {
		banktranferactions.ClickonBankTranferandverify();
		StepTracker.setCurrentStep("Click on BankTransfers and Verify");
	}
	
	@Then("Click on Add BankTransfer and Verify")
	public void ClickonAddBankTransferandverify() throws InterruptedException {
		banktranferactions.ClickonAddBankTranferAndverify();
		StepTracker.setCurrentStep("Click on Add BankTransfer and Verify");
	}
	@And("Enter the Data in Bank transfer")
	public void Enterthedatainbanktransfer() throws InterruptedException {
		banktranferactions.EnterthedataInBankTransfer();
		StepTracker.setCurrentStep("Enter the Data in Bank transfer");
	}
	
	@And("click on clearform and validate")
	public void Clickonclearformandvalidate() throws InterruptedException {
		banktranferactions.Clearformandvalidate();
		StepTracker.setCurrentStep("click on clearform and validate");
	}
	@And("Click on Save and Exit and validate")
	public void Clickonsaveandexitandvalidate() throws InterruptedException {
		banktranferactions.clickonsaveandExit_BankTransfer();
		StepTracker.setCurrentStep("Click on Save and Exit and validate");
	}
	
	@And("Click on Exports in the Bank Transfer")
	public void ClickonExportsonBankTranfer() throws InterruptedException {
		banktranferactions.ClickonExportsonBankTransfer();
		StepTracker.setCurrentStep("Click on Exports in the Bank Transfer");
	}
	
	@And("Click on StatusAll dropdown and Validate")
	public void ValidateStatusAllDropdown() throws InterruptedException {
		banktranferactions.ValidateStatusAllDropdown();
		StepTracker.setCurrentStep("Click on StatusAll dropdown and Validate");
	}
	
	@Then("Click on BankFeed and Verify")
	public void ClickonBankFeed() throws InterruptedException {
		banktranferactions.clickonBankFeed();
		StepTracker.setCurrentStep("Click on BankFeed and Verify");
	}
	@And("Click on LinkBankAccount and Verify")
	public void ClickonLinkBankAccoun() throws InterruptedException {
		banktranferactions.ClickonLinkBankAccount();
		StepTracker.setCurrentStep("Click on LinkBankAccount and Verify");
	}
	
	@Then("Validate the Type Dropdown")
	public void ValidateTypeDropdown() throws InterruptedException {
		banktranferactions.ValidateTypeDropdown();
		StepTracker.setCurrentStep("Validate the Type Dropdown");
	}
	
	@Given("navigate to inside the client and verify BT")
	public void navigate_to_inside_the_client_and_verify_bt() throws InterruptedException {
		banktranferactions.navigatetoinsidetheclientandverifyBT();
		StepTracker.setCurrentStep("navigate to inside the client and verify BT");
	}

	@Then("Click on check box in main grid and verify the enabling options BT")
	public void click_on_check_box_in_main_grid_and_verify_the_enabling_options_bt() throws InterruptedException {
		banktranferactions.ClickoncheckboxinmaingridandverifytheenablingoptionsBT();
		StepTracker.setCurrentStep("Click on check box in main grid and verify the enabling options BT");
	}

	@Then("CLick on bank tranfer id and verify the popup BT")
	public void c_lick_on_bank_tranfer_id_and_verify_the_popup_bt() throws InterruptedException {
		banktranferactions.ClickonbanktranferidandverifythepopupBT();
		StepTracker.setCurrentStep("CLick on bank tranfer id and verify the popup BT");
	}

	@Then("Click on check box in edit bank tranfer page and verify the enabling options BT")
	public void click_on_check_box_in_edit_bank_tranfer_page_and_verify_the_enabling_options_bt() throws InterruptedException {
		banktranferactions.ClickoncheckboxineditbanktranferpageandverifytheenablingoptionsBT();
		StepTracker.setCurrentStep("Click on check box in edit bank tranfer page and verify the enabling options BT");
	}

	@Then("Click on double arrows in edit bank tranfer page and verify the detail boxes are opening or closing BT")
	public void click_on_double_arrows_in_edit_bank_tranfer_page_and_verify_the_detail_boxes_are_opening_or_closing_bt() throws InterruptedException {
		banktranferactions.ClickondoublearrowsineditbanktranferpageandverifythedetailboxesareopeningorclosingBT();
		StepTracker.setCurrentStep("Click on double arrows in edit bank tranfer page and verify the detail boxes are opening or closing BT");
	}

	@Then("verify search bar in main grid BT")
	public void verify_search_bar_in_main_grid_bt() throws InterruptedException {
		banktranferactions.verifysearchbarinmaingridBT();
		StepTracker.setCurrentStep("verify search bar in main grid BT");
	}

	@Then("Click on plus symbol in edit bank transfer page BT")
	public void click_on_plus_symbol_in_edit_bank_transfer_page_bt() throws InterruptedException {
		banktranferactions.ClickonplussymbolineditbanktransferpageBT();
		StepTracker.setCurrentStep("Click on plus symbol in edit bank transfer page BT");
	}

	@Then("Verify search icon and cross mark in edit bank transfer page BT")
	public void verify_search_icon_and_cross_mark_in_edit_bank_transfer_page_bt() throws InterruptedException {
		banktranferactions.VerifysearchiconandcrossmarkineditbanktransferpageBT();
		StepTracker.setCurrentStep("Verify search icon and cross mark in edit bank transfer page BT");
	}
}
