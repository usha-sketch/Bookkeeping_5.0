package com.Capium.stepDefinations;

import com.Capium.Actions.BK_task_budget_actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BK_task_budget_stepdefinition {

	BK_task_budget_actions  budgetActions=new BK_task_budget_actions();
	
	@Given("navigate to inside the client and verify BB")
	public void navigate_to_inside_the_client_and_verify_bb() throws InterruptedException {
	    budgetActions.navigatetoinsidetheclientandverifyBB();
	}

	@Then("navigate to budget in task and verify BB")
	public void navigate_to_budget_in_task_and_verify_bb() throws InterruptedException {
	   budgetActions.navigatetobudgetintaskandverifyBB();
	}

	@Then("Click on plus in budget main menu and verify BB")
	public void click_on_plus_in_budget_main_menu_and_verify_bb() throws InterruptedException {
	   budgetActions.ClickonplusinbudgetmainmenuandverifyBB();
	}

	@Then("add budget and verify BB")
	public void add_budget_and_verify_bb() throws InterruptedException {
		budgetActions.addbudgetandverifyBB();
	}

	@Then("Click on plus symbol in edit budget page BB")
	public void click_on_plus_symbol_in_edit_budget_page_bb() throws InterruptedException {
		budgetActions.ClickonplussymbolineditbudgetpageBB();
	}

	@Then("Verify search icon and cross mark in edit journal page BB")
	public void verify_search_icon_and_cross_mark_in_edit_journal_page_bb() throws InterruptedException {
	    budgetActions.VerifysearchiconandcrossmarkineditjournalpageBB();
	    
	}

	@Then("Click on check box in edit budget page and verify the enabling options BB")
	public void click_on_check_box_in_edit_budget_page_and_verify_the_enabling_options_bb() throws InterruptedException {
	    budgetActions.ClickoncheckboxineditbudgetpageandverifytheenablingoptionsBB();
	}

	@Then("Click on double arrows in edit budget page and verify the detail boxes are opening or closing BB")
	public void click_on_double_arrows_in_edit_budget_page_and_verify_the_detail_boxes_are_opening_or_closing_bb() throws InterruptedException {
	    budgetActions.ClickondoublearrowsineditbudgetpageandverifythedetailboxesareopeningorclosingBB();
	}

	@Then("verify search bar in main grid BB")
	public void verify_search_bar_in_main_grid_bb() throws InterruptedException {
	    budgetActions.verifysearchbarinmaingridBB();
	}

	@Then("Click on checkbox in main grid and verify enabling options BB")
	public void click_on_checkbox_in_main_grid_and_verify_enabling_options_bb() throws InterruptedException {
	   budgetActions.ClickoncheckboxinmaingridandverifyenablingoptionsBB();
	}

	@Then("Verify cancle selection and cross mark in the down BB")
	public void verify_cancle_selection_and_cross_mark_in_the_down_bb() throws InterruptedException {
	    budgetActions.VerifycancleselectionandcrossmarkinthedownBB();
	}

	@Then("Verify pagination dropdown BB")
	public void verify_pagination_dropdown_bb() throws InterruptedException {
	    budgetActions.VerifypaginationdropdownBB();
	}

	@Then("Verify export options in main grid BB")
	public void verify_export_options_in_main_grid_bb() throws InterruptedException {
	    budgetActions.VerifyexportoptionsinmaingridBB();
	}

	@Then("Verify the export option for the particular budget in the row BB")
	public void verify_the_export_option_for_the_particular_budget_in_the_row_bb() throws InterruptedException {
	   budgetActions.VerifytheexportoptionfortheparticularbudgetintherowBB();
	}

	@Then("Edit the budget and verify BB")
	public void edit_the_budget_and_verify_bb() throws InterruptedException {
	    budgetActions.EditthebudgetandverifyBB();
	}

	@Then("verify view option BB")
	public void verify_view_option_bb() {
	    budgetActions.verifyviewoptionBB();
	}

	@Then("Verify the download and edit and close options through the view icon BB")
	public void verify_the_download_edit_and_close_options_through_the_view_icon_bb() throws InterruptedException {
	    budgetActions.VerifythedownloadandeditandcloseoptionsthroughtheviewiconBB();
	}

	
}
