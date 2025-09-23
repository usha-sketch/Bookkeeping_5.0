package com.Capium.stepDefinations;

import com.Capium.Actions.BK_task_dividend_actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BK_task_dividend_stepdefinition {

	BK_task_dividend_actions  dividendActions=new BK_task_dividend_actions();
	
	@Given("navigate to inside the client and verify DE")
	public void navigate_to_inside_the_client_and_verify_de() throws InterruptedException {
	   dividendActions.navigatetoinsidetheclientandverifyDE();
	}

	@Then("navigate to dividend in task and verify DE")
	public void navigate_to_dividend_in_task_and_verify_de() throws InterruptedException {
		dividendActions.navigatetodividendintaskandverifyDE();
	}

	@Then("Click on plus in budget main menu and verify DE")
	public void click_on_plus_in_budget_main_menu_and_verify_de() throws InterruptedException {
	    dividendActions.ClickonplusinbudgetmainmenuandverifyDE();
	}

	@Then("add dividend and verify DE")
	public void add_dividend_and_verify_de() throws InterruptedException {
	   dividendActions.adddividendandverifyDE();
	}

	@Then("Click on plus symbol in edit dividend page and verify DE")
	public void click_on_plus_symbol_in_edit_dividend_page_and_verify_de() throws InterruptedException {
	    dividendActions.ClickonplussymbolineditdividendpageandverifyDE();
	}

	@Then("Verify search icon and cross mark in edit dividend page DE")
	public void verify_search_icon_and_cross_mark_in_edit_dividend_page_de() throws InterruptedException {
	    dividendActions.VerifysearchiconandcrossmarkineditdividendpageDE();
	}

	@Then("Click on check box in edit dividend page and verify the enabling options DE")
	public void click_on_check_box_in_edit_dividend_page_and_verify_the_enabling_options_de() throws InterruptedException {
		dividendActions.ClickoncheckboxineditdividendpageandverifytheenablingoptionsDE();
	}

	@Then("Click on double arrows in edit dividend page and verify the detail boxes are opening or closing DE")
	public void click_on_double_arrows_in_edit_dividend_page_and_verify_the_detail_boxes_are_opening_or_closing_de() throws InterruptedException {
	    dividendActions.ClickondoublearrowsineditdividendpageandverifythedetailboxesareopeningorclosingDE();
	}

	@Then("verify search bar in main grid DE")
	public void verify_search_bar_in_main_grid_de() throws InterruptedException {
	    dividendActions.verifysearchbarinmaingridDE();
	}

	@Then("Click on checkbox in main grid and verify enabling options DE")
	public void click_on_checkbox_in_main_grid_and_verify_enabling_options_de() throws InterruptedException {
	    dividendActions.ClickoncheckboxinmaingridandverifyenablingoptionsDE();
	}

	@Then("Verify cancle selection and cross mark in the down DE")
	public void verify_cancle_selection_and_cross_mark_in_the_down_de() throws InterruptedException {
	   dividendActions.VerifycancleselectionandcrossmarkinthedownDE();
	}

	@Then("Verify pagination dropdown DE")
	public void verify_pagination_dropdown_de() throws InterruptedException {
	    dividendActions.VerifypaginationdropdownDE();
	}

	@Then("Verify export options in main grid DE")
	public void verify_export_options_in_main_grid_de() throws InterruptedException {
	    dividendActions.VerifyexportoptionsinmaingridDE();
	}

	@Then("verify view option through shareholder name and view icon DE")
	public void verify_view_option_through_shareholder_name_and_view_icon_de() throws InterruptedException {
	    dividendActions.verifyviewoptionthroughshareholdernameandviewiconDE();
	}

	@Then("Verify the page view and download and edit icons for particular dividend in the row DE")
	public void verify_the_export_option_for_the_particular_dividend_in_the_row_de() throws InterruptedException {
	    dividendActions.VerifytheexportoptionfortheparticulardividendintherowDE();
	}

	

}
