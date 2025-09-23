package com.Capium.stepDefinations;

import java.awt.AWTException;

import com.Capium.Actions.BK_journal_Actions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BK_journal_stepdefinition {
	
	BK_journal_Actions  journalActions=new BK_journal_Actions();
	
	@Given("navigate to inside the client and verify JT")
	public void go_to_manage_and_navigate_to_inside_the_client_and_verify() throws InterruptedException {
	   journalActions.navigatetoinsidetheclientindashboardandverifyJT();
	}
	
	@Then("navigate to journal and verify JT")
	public void navigate_to_journal_and_verify_jt() throws InterruptedException {
	    journalActions.navigatetojournalandverifyJT();
	}

	@Then("Click on plus in journal main menu JT and verify")
	public void click_on_plus_in_journal_main_menu_jt_and_verify() throws InterruptedException {
	    journalActions.ClickonplusinjournalmainmenuJTandverify();
	}

	@Then("add journal and verify JT")
	public void add_journal_and_verify_jt() throws InterruptedException {
	    journalActions.addjournalandverifyJT();
	}

	@Then("add attachement for journal and verify JT")
	public void add_attachement_for_journal_and_verify_jt() throws InterruptedException, AWTException {
	   journalActions.addattachementforjournalandverifyJT();
	}

	@Then("add new lines and delete lines for journal and verify JT")
	public void add_new_lines_and_delete_lines_for_journal_and_verify_jt() throws InterruptedException {
	    journalActions.addnewlinesanddeletelinesforjournalandverifyJT();
	}

	@Then("Click on plus symbol in edit journal page JT")
	public void click_on_plus_symbol_in_edit_journal_page_jt() throws InterruptedException {
	    journalActions.ClickonplussymbolineditjournalpageJT();
	}

	@Then("Verify search icon and cross mark in edit journal page JT")
	public void verify_search_icon_in_edit_journal_page_jt() throws InterruptedException {
	    journalActions.VerifysearchiconineditjournalpageJT();
	}

	@Then("Click on check box in edit journal page and verify the enabling options")
	public void click_on_check_box_in_edit_journal_page_and_verify_the_enabling_options() throws InterruptedException {
		journalActions.Clickoncheckboxineditjournalpageandverifytheenablingoptions();
	}

	@Then("Click on double arrows in edit journal page and verify the detail boxes are opening or closing JT")
	public void click_on_double_arrows_in_edit_journal_page_and_verify_the_detail_boxes_are_opening_closing_jt() throws InterruptedException {
	    journalActions.ClickondoublearrowsineditjournalpageandverifythedetailboxesareopeningorclosingJT();
	}

	@Then("Click on side single arrows in edit journal page and verify JT")
	public void click_on_side_single_arrows_in_edit_journal_page_and_verify_jt() throws InterruptedException {
	    journalActions.ClickonsidesinglearrowsineditjournalpageandverifyJT();
	}

	@Then("verify search bar in main grid JT")
	public void verify_search_bar_in_main_grid_jt() throws InterruptedException {
	    journalActions.verifysearchbarinmaingridJT();
	}

	@Then("verify period dropdown in main grid JT")
	public void verify_period_dropdown_in_main_grid_jt() throws InterruptedException {
	    journalActions.verifyperioddropdowninmaingridJT();
	}

	@Then("Click on checkbox in main grid and verify enabling options JT")
	public void click_on_checkbox_in_main_grid_and_verify_enabling_options_jt() throws InterruptedException {
	    journalActions.ClickoncheckboxinmaingridandverifyenablingoptionsJT();
	}

	@Then("Verify cancle selection and cross mark in the down JT")
	public void verify_cancle_selection_and_cross_mark_in_the_down_jt() throws InterruptedException {
	    journalActions.VerifycancleselectionandcrossmarkinthedownJT();
	}

	@Then("Verify pagination dropdown JT")
	public void verify_pagination_dropdown_jt() throws InterruptedException {
	    journalActions.VerifypaginationdropdownJT();
	}

	@Then("Verify export options in main grid JT")
	public void verify_expot_to_excel_options_in_main_grid_jt() throws InterruptedException {
	    journalActions.VerifyexpottoexceloptionsinmaingridJT();
	}

	@Then("verify view option through journal id and icon JT")
	public void verify_view_option_through_journal_id_and_icon_jt() throws InterruptedException {
	   journalActions.verifyviewoptionthroughjournalidandiconJT();
	}

	@Then("Verify the page view and download and edit in the particular row")
	public void verify_the_export_option_for_the_particular_journal_in_the_row() throws InterruptedException {
	    journalActions.Verifythepageviewanddownloadandeditandkebabintheparticularrow();
	}

	@Then("Edit the journal and verify JT")
	public void edit_the_journal_and_verify_jt() {
	    journalActions.EditthejournalandverifyJT();
	}

	@Then("Verify the copy in the row kebab JT")
	public void verify_the_copy_in_the_row_kebab_jt() {
	    journalActions.VerifythecopyintherowkebabJT();
	}


}
