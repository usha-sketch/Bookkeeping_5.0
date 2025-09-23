package com.Capium.stepDefinations;

import com.Capium.Actions.BK_CIS_Subcontractor_Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BK_CIS_subcontractor_stepdefinition {

	BK_CIS_Subcontractor_Actions  subcontractorActions=new BK_CIS_Subcontractor_Actions();
	
	@Given("navigate to inside the client and verify SC")
	public void navigate_to_inside_the_client_and_verify_sc() throws InterruptedException {
	    subcontractorActions.navigatetoinsidetheclientandverifySC();
	}

	@Then("navigate to subcontractor in CIS and verify SC")
	public void navigate_to_subcontractor_in_cis_and_verify_sc() throws InterruptedException {
		subcontractorActions.navigatetosubcontractorinCISandverifySC();
	}

	@Then("add subcontractor and verify SC")
	public void add_subcontractor_and_verify_sc() throws InterruptedException {
	    subcontractorActions.addsubcontractorandverifySC();
	}

	@Then("Click on plus in subcontractr main menu and verify SC")
	public void click_on_plus_in_subcontractr_main_menu_and_verify_sc() throws InterruptedException {
	   subcontractorActions.ClickonplusinsubcontractrmainmenuandverifySC();
	}

	@Then("Click on plus symbol in edit subcontractor page SC")
	public void click_on_plus_symbol_in_edit_subcontractor_page_sc() throws InterruptedException {
	    subcontractorActions.ClickonplussymbolineditsubcontractorpageSC();
	}

	@Then("Verify search icon and cross mark in edit subcontractor page SC")
	public void verify_search_icon_and_cross_mark_in_edit_subcontractor_page_sc() throws InterruptedException {
		subcontractorActions.VerifysearchiconandcrossmarkineditsubcontractorpageSC();
	}

	@Then("Click on check box in edit subcontractor page and verify the enabling options SC")
	public void click_on_check_box_in_edit_subcontractor_page_and_verify_the_enabling_options_sc() throws InterruptedException {
		subcontractorActions.ClickoncheckboxineditsubcontractorpageandverifytheenablingoptionsSC();
	}

	@Then("verify search bar in main grid SC")
	public void verify_search_bar_in_main_grid_sc() throws InterruptedException {
		subcontractorActions.verifysearchbarinmaingridSC();
	}

	@Then("Click on checkbox in main grid and verify enabling options SC")
	public void click_on_checkbox_in_main_grid_and_verify_enabling_options_sc() throws InterruptedException {
		subcontractorActions.ClickoncheckboxinmaingridandverifyenablingoptionsSC();
	}

	@Then("Verify cancle selection and cross mark in the down SC")
	public void verify_cancle_selection_and_cross_mark_in_the_down_sc() throws InterruptedException {
		subcontractorActions.VerifycancleselectionandcrossmarkinthedownSC();
	}

	@Then("Verify pagination dropdown SC")
	public void verify_pagination_dropdown_sc() throws InterruptedException {
	    subcontractorActions.VerifypaginationdropdownSC();
	}

	@Then("Verify export options in main grid SC")
	public void verify_export_options_in_main_grid_sc() throws InterruptedException {
		subcontractorActions.VerifyexportoptionsinmaingridSC();
	}

	@Then("verify the column options in top row kebab SC")
	public void verify_the_column_options_in_top_row_kebab_sc() throws InterruptedException {
	    subcontractorActions.verifythecolumnoptionsintoprowkebabSC();
	}

	@Then("Click on certificate download and verify SC")
	public void click_on_certificate_download_and_verify_sc() throws InterruptedException {
	    subcontractorActions.ClickoncertificatedownloadandverifySC();
	}
}
