package com.Capium.stepDefinations;

import java.awt.AWTException;

import com.Capium.Actions.BK_bankTab_Overview_action;
import com.Capium.Utilites.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BK_banktab_overview_stepdefinition {
	
	BK_bankTab_Overview_action  bankactions=new BK_bankTab_Overview_action();
	
	@Given("navigate to inside the client and verify BK")
	public void navigate_to_inside_the_client_and_verify_bk() throws InterruptedException {
	    bankactions.navigatetoinsidetheclientandverifyBK();
	    StepTracker.setCurrentStep("navigate to inside the client and verify BK");
	    StepTracker.setCurrentStep("navigate to inside the client and verify BK");
	}

	@Then("navigate to bank and verify BK")
	public void navigate_to_bank_and_verify_bk() throws InterruptedException {
		bankactions.navigatetobankandverifyBK();
		StepTracker.setCurrentStep("navigate to bank and verify BK");
	}

	@Then("add bank BK")
	public void add_bank_bk() throws InterruptedException {
		bankactions.addbankBK();
	    StepTracker.setCurrentStep("add bank BK");
	}

	@Then("verify added bank BK")
	public void verify_added_bank_bk() throws InterruptedException {
		bankactions.verifyaddedbankBK();
	    StepTracker.setCurrentStep("verify added bank BK");
	}

	@Then("edit the bank BK")
	public void edit_the_bank_bk() throws InterruptedException {
		bankactions.editthebankBK();
	    StepTracker.setCurrentStep("edit the bank BK");
	}

	@Then("verify the edited bank")
	public void verify_the_edited_bank() throws InterruptedException {
		bankactions.verifytheeditedbank();
	    StepTracker.setCurrentStep("verify the edited bank");
	}

	@Then("verify enable options in edit bank page BK")
	public void verify_enable_options_in_edit_bank_page_bk() throws InterruptedException {
		bankactions.verifyenableoptionsineditbankpageBK();
	    StepTracker.setCurrentStep("verify enable options in edit bank page BK");
	}


	@Then("Click on plus symbol in bank main menu BK")
	public void click_on_plus_symbol_in_edit_journal_page_bk() throws InterruptedException {
		bankactions.ClickonplussymbolinbankmainmenuBK();
	    StepTracker.setCurrentStep("Click on plus symbol in bank main menu BK");
	}

	@Then("Verify search icon and cross mark in edit bank page BK")
	public void verify_search_icon_and_cross_mark_in_edit_journal_page_bk() throws InterruptedException {
	    bankactions.VerifysearchiconandcrossmarkineditbankpageBK();
	    StepTracker.setCurrentStep("Verify search icon and cross mark in edit bank page BK");
	}

	@Then("Click on double arrows in edit bank page and verify the detail boxes are opening or closing BK")
	public void click_on_double_arrows_in_edit_journal_page_and_verify_the_detail_boxes_are_opening_or_closing_bk() throws InterruptedException {
		 bankactions.ClickondoublearrowsineditbankpageandverifythedetailboxesareopeningorclosingBK();
		    StepTracker.setCurrentStep("Click on double arrows in edit bank page and verify the detail boxes are opening or closing BK");
	}
	
	@Then("verify search bar in main grid BK")
	public void verify_search_bar_in_main_grid_bk() throws InterruptedException {
		bankactions.verifysearchbarinmaingridBK();
	    StepTracker.setCurrentStep("verify search bar in main grid BK");
	}

	@Then("add one transaction from manual import BK")
	public void add_one_transaction_from_manual_import_bk() throws InterruptedException {
		bankactions.addonetransactionfrommanualimportBK();
	    StepTracker.setCurrentStep("add one transaction from manual import BK");
	}

	@Then("import the transactions BK")
	public void import_the_transactions_bk() throws InterruptedException, AWTException {
		bankactions.importthetransactionsBK();
	    StepTracker.setCurrentStep("import the transactions BK");
	}

	@Then("export the transaction BK")
	public void export_the_transaction_bk() throws InterruptedException {
		bankactions.exportthetransactionBK();
	    StepTracker.setCurrentStep("export the transaction BK");
	}

	@Then("add quick journal from the kebab BK")
	public void add_quick_journal_from_the_kebab_bk() throws InterruptedException {
		bankactions.addquickjournalfromthekebabBK();
	    StepTracker.setCurrentStep("add quick journal from the kebab BK");
	}
	
	@Then("verify the journal BK")
	public void verify_the_journal_bk() throws InterruptedException {
		bankactions.verifythejournalBK();
	    StepTracker.setCurrentStep("verify the journal BK");
	}

	@Then("do cashcoding BK")
	public void do_cashcoding_bk() throws InterruptedException {
		bankactions.docashcodingBK();
	    StepTracker.setCurrentStep("do cashcoding BK");
	}
	
	@Then("Verify the cash coding BK")
	public void verify_the_cash_coding_bk() throws InterruptedException {
		bankactions.VerifythecashcodingBK();
	    StepTracker.setCurrentStep("Verify the cash coding BK");
	}

	@Then("click on bank reconcilation icon BK")
	public void click_on_bank_reconcilation_icon_bk() throws InterruptedException {
		bankactions.clickonbankreconcilationiconBK();
	    StepTracker.setCurrentStep("click on bank reconcilation icon BK");
	}

	@Then("verify bank reconcilation BK")
	public void verify_bank_reconcilation_bk() {
		bankactions.verifybankreconcilationBK();
	    StepTracker.setCurrentStep("verify bank reconcilation BK");
	}

	@Then("Click on journal option in action dropdown BK")
	public void click_on_journal_option_in_action_dropdown_bk() throws InterruptedException {
		bankactions.ClickonjournaloptioninactiondropdownBK();
	    StepTracker.setCurrentStep("Click on journal option in action dropdown BK");
	}

	@Then("verify the journal tab from action dropdown in task BK")
	public void verify_the_journal_tab_from_action_dropdown_in_task_bk() throws InterruptedException {
		bankactions.verifythejournaltabfromactiondropdownintaskBK();
	    StepTracker.setCurrentStep("verify the journal tab from action dropdown in task BK");
	}
	
	@Then("Click on match journal option in action dropdown BK")
	public void click_on_match_journal_option_in_action_dropdown_bk() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the matched journal tab BK")
	public void verify_the_matched_journal_bk() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on payment option in action dropdown BK")
	public void click_on_payment_option_in_action_dropdown_bk() throws InterruptedException {
		bankactions.ClickonpaymentoptioninactiondropdownBK();
	    StepTracker.setCurrentStep("Click on payment option in action dropdown BK");
	}

	@Then("verify the payment for payments BK")
	public void verify_the_payment_for_payments_bk() throws InterruptedException {
		bankactions.verifythepaymentforpaymentsBK();
	    StepTracker.setCurrentStep("verify the payment for payments BK");
	}

	@Then("Click on bank transfer option in action dropdown BK")
	public void click_on_bank_transfer_option_in_action_dropdown_bk() throws InterruptedException {
		bankactions.ClickonbanktransferoptioninactiondropdownBK();
	    StepTracker.setCurrentStep("Click on bank transfer option in action dropdown BK");
	}

	@Then("verify the bank transfer BK")
	public void verify_the_bank_transfer_bk() throws InterruptedException {
		bankactions.verifythebanktransferBK();
	    StepTracker.setCurrentStep("verify the bank transfer BK");
	}

	@Then("Click on purchase option in action dropdown BK")
	public void click_on_purchase_option_in_action_dropdown_bk() throws InterruptedException {
		bankactions.ClickonpurchaseoptioninactiondropdownBK();
	    StepTracker.setCurrentStep("Click on purchase option in action dropdown BK");
	}

	@Then("Click on match quick entry option in action dropdown BK")
	public void click_on_match_quick_entry_option_in_action_dropdown_bk() throws InterruptedException {
		bankactions.ClickonmatchquickentryoptioninactiondropdownBK();
	    StepTracker.setCurrentStep("Click on match quick entry option in action dropdown BK");
	}

	@Then("Click on multiple transaction option in action dropdown BK")
	public void click_on_multiple_transaction_option_in_action_dropdown_bk() throws InterruptedException {
		bankactions.ClickonmultipletransactionoptioninactiondropdownBK();
	    StepTracker.setCurrentStep("Click on multiple transaction option in action dropdown BK");
	}
	
	@Then("Click on multiple transaction option for journal in action dropdown BK")
	public void click_on_multiple_transaction_option_for_journal_in_action_dropdown_bk() throws InterruptedException {
		bankactions.ClickonmultipletransactionoptionforjournalinactiondropdownBK();
	    StepTracker.setCurrentStep("Click on multiple transaction option for journal in action dropdown BK");
	}

	@Then("Click on refund option in action dropdown BK")
	public void click_on_refund_option_in_action_dropdown_bk() throws InterruptedException {
		bankactions.ClickonrefundoptioninactiondropdownBK();
	    StepTracker.setCurrentStep("Click on refund option in action dropdown BK");
	}

	@Then("verify the refund BK")
	public void verify_the_refund_bk() throws InterruptedException {
		bankactions.verifytherefundBK();
	    StepTracker.setCurrentStep("verify the refund BK");
	}

	@Then("Click on invoice option in action dropdown BK")
	public void click_on_invoice_option_in_action_dropdown_bk() throws InterruptedException {
		bankactions.ClickoninvoiceoptioninactiondropdownBK();
	    StepTracker.setCurrentStep("Click on invoice option in action dropdown BK");
	}

	@Then("Click on receipts option in action dropdown BK")
	public void click_on_receipts_option_in_action_dropdown_bk() throws InterruptedException {
		bankactions.AndClickonreceiptsoptioninactiondropdownBK();
	    StepTracker.setCurrentStep("Click on receipts option in action dropdown BK");
	}

	@Then("verify the type dropdown BK")
	public void verify_the_type_dropdown_bk() throws InterruptedException {
		bankactions.verifythetypedropdownBK();
	    StepTracker.setCurrentStep("verify the type dropdown BK");
	}

	@Then("verify the period dropdown BK")
	public void verify_the_period_dropdown_bk() throws InterruptedException {
		bankactions.verifytheperioddropdownBK();
	    StepTracker.setCurrentStep("verify the period dropdown BK");
	}

	@Then("Verify download and edit options in journal id in cash in hand BK")
	public void verify_download_and_edit_options_in_journal_id_in_cash_in_hand_bk() throws InterruptedException {
		bankactions.VerifydownloadandeditoptionsinjournalidincashinhandBK();
	    StepTracker.setCurrentStep("Verify download and edit options in journal id in cash in hand BK");
	}

	@Then("verify export options under cash in hand BK")
	public void verify_export_options_under_cash_in_hand_bk() throws InterruptedException {
		bankactions.verifyexportoptionsundercashinhandBK();
	    StepTracker.setCurrentStep("verify export options under cash in hand BK");
	}

	@Then("verify the bank transfer details through bank tranfer id in particular bank BK")
	public void verify_the_bank_transfer_details_through_bank_tranfer_id_in_particular_bank_bk() {
		bankactions.verifythebanktransferdetailsthroughbanktranferidinparticularbankBK();
	    StepTracker.setCurrentStep("verify the bank transfer details through bank tranfer id in particular bank BK");
	}

	@Then("verify the receipt details through receipt id in particular bank BK")
	public void verify_the_receipt_details_through_receipt_id_in_particular_bank_bk() throws InterruptedException {
		bankactions.verifythereceiptdetailsthroughreceiptidinparticularbankBK();
	    StepTracker.setCurrentStep("verify the receipt details through receipt id in particular bank BK");
	}

	@Then("verify the customer details through customer id in particular bank BK")
	public void verify_the_customer_details_through_customer_id_in_particular_bank_bk() {
		bankactions.verifythecustomerdetailsthroughcustomeridinparticularbankBK();
	    StepTracker.setCurrentStep("verify the customer details through customer id in particular bank BK");
	}

	@Then("verify the quick entry details through quick entry id in particular bank BK")
	public void verify_the_quick_entry_details_through_quick_entry_id_in_particular_bank_bk() throws InterruptedException {
		bankactions.verifythequickentrydetailsthroughquickentryidinparticularbankBK();
	    StepTracker.setCurrentStep("verify the quick entry details through quick entry id in particular bank BK");
	}
	
	@Then("Click on refund option for credit note in action dropdown BK")
	public void click_on_refund_option_for_credit_note_in_action_dropdown_bk() throws InterruptedException {
		bankactions.ClickonrefundoptionforcreditnoteinactiondropdownBK();
	    StepTracker.setCurrentStep("Click on refund option for credit note in action dropdown BK");
	}

	@Then("verify the refund for credit note BK")
	public void verify_the_refund_for_credit_note_bk() throws InterruptedException {
		bankactions.verifytherefundforcreditnoteBK();
	    StepTracker.setCurrentStep("verify the refund for credit note BK");
	}
	
}
