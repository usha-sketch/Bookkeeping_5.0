package com.Capium.stepDefinations;

import com.Capium.Actions.BK_CIS_threehundrud_actions;
import com.Capium.Utilites.StepTracker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BK_CIS_threehundrud_stepdefinition {

	BK_CIS_threehundrud_actions  cis300Actions=new BK_CIS_threehundrud_actions();
	
	@Given("navigate to inside the client and verify COO")
	public void navigate_to_inside_the_client_and_verify_coo() throws InterruptedException {
	    cis300Actions.navigatetoinsidetheclientandverifyCOO();
	    StepTracker.setCurrentStep("navigate to inside the client and verify COO");
	}

	@Then("navigate to CIS threehundrud in CIS and verify COO")
	public void navigate_to_cis_threehundrud_in_cis_and_verify_coo() throws InterruptedException {
		cis300Actions.navigatetoCISthreehundrudinCISandverifyCOO();
	}

	@Then("add cis three hundrud COO")
	public void add_cis_three_hundrud_coo() throws InterruptedException {
	    cis300Actions.addcisthreehundrudCOO();
	}

	@Then("Click on plus in CIS threehundrud main menu and verify COO")
	public void click_on_plus_in_cis_threehundrud_main_menu_and_verify_coo() throws InterruptedException {
		cis300Actions.ClickonplusinCISthreehundrudmainmenuandverifyCOO();
	}

	@Then("verify search bar in main grid COO")
	public void verify_search_bar_in_main_grid_coo() throws InterruptedException {
	    cis300Actions.verifysearchbarinmaingridCOO();
	}

	@Then("Click on checkbox in main grid and verify enabling options COO")
	public void click_on_checkbox_in_main_grid_and_verify_enabling_options_coo() throws InterruptedException {
	    cis300Actions.ClickoncheckboxinmaingridandverifyenablingoptionsCOO();
	}

	@Then("Verify cancle selection and cross mark in the down COO")
	public void verify_cancle_selection_and_cross_mark_in_the_down_coo() throws InterruptedException {
	    cis300Actions.VerifycancleselectionandcrossmarkinthedownCOO();
	}

	@Then("Verify pagination dropdown COO")
	public void verify_pagination_dropdown_coo() throws InterruptedException {
	    cis300Actions.VerifypaginationdropdownCOO();
	}

	@Then("Verify export options in main grid COO")
	public void verify_export_options_in_main_grid_coo() throws InterruptedException {
	    cis300Actions.VerifyexportoptionsinmaingridCOO();
	}

	@Then("Click on period in period column and verify COO")
	public void click_on_period_in_period_column_and_verify_coo() {
	    cis300Actions.ClickonperiodinperiodcolumnandverifyCOO();
	}

	

}
