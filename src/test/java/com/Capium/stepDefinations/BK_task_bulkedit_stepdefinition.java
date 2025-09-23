package com.Capium.stepDefinations;

import com.Capium.Actions.BK_task_bulkedit_actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BK_task_bulkedit_stepdefinition {

	BK_task_bulkedit_actions  bulkeditActions=new BK_task_bulkedit_actions();
	
	@Given("navigate to inside the client and verify BE")
	public void navigate_to_inside_the_client_and_verify_be() throws InterruptedException {
	   bulkeditActions.navigatetoinsidetheclientandverifyBE();
	}

	@Then("navigate to bulk edit in task and verify BE")
	public void navigate_to_bulk_edit_in_task_and_verify_be() throws InterruptedException {
	   bulkeditActions.navigatetobulkeditintaskandverifyBE();
	}

	@Then("select the check box in main grid and edit and verify BE")
	public void select_the_check_box_in_main_grid_and_edit_and_verify_be() throws InterruptedException {
	   bulkeditActions.selectthecheckboxinmaingridandeditandverifyBE();
	}

	@Then("Verify search bar in main grid and verify BE")
	public void verify_search_bar_in_main_grid_and_verify_be() throws InterruptedException {
	    bulkeditActions.VerifysearchbarinmaingridandverifyBE();
	}

	@Then("select the from and to date and verify BE")
	public void select_the_from_and_to_date_and_verify_be() throws InterruptedException {
	    bulkeditActions.selectthefromandtodateandverifyBE();
	}
	
	@Then("verify reference number and edit and download options BE")
	public void verify_reference_number_and_edit_and_download_options_be() throws InterruptedException {
	   bulkeditActions.verifyreferencenumberandeditanddownloadoptionsBE();
	}
}
