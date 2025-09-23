package com.Capium.stepDefinations;

import com.Capium.Actions.BK_CIS_contractor_settings_actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BK_CIS_contractor_settings_stepdefinition {

	BK_CIS_contractor_settings_actions  contractorsettingsActions=new BK_CIS_contractor_settings_actions();
	
	@Given("navigate to inside the client and verify CS")
	public void navigate_to_inside_the_client_and_verify_cs() throws InterruptedException {
		contractorsettingsActions.navigatetoinsidetheclientandverifyCS();
	}

	@Then("navigate to contractor settings in CIS and verify CS")
	public void navigate_to_contractor_settings_in_cis_and_verify_cs() throws InterruptedException {
		contractorsettingsActions.navigatetocontractorsettingsinCISandverifyCS();
	}

	@Then("enter the data in settings and verify CS")
	public void enter_the_data_in_settings_and_verify_cs() throws InterruptedException {
		contractorsettingsActions.enterthedatainsettingsandverifyCS();
	}

	@Then("Click on double arrows in contractor settings page and verify the detail boxes are opening or closing CS")
	public void click_on_double_arrows_in_contractor_settings_page_and_verify_the_detail_boxes_are_opening_closing_cs() throws InterruptedException {
	    contractorsettingsActions.ClickondoublearrowsincontractorsettingspageandverifythedetailboxesareopeningorclosingCS();
	}

	@Then("Click on side single arrows in contractor settings page and verify CS")
	public void click_on_side_single_arrows_in_contractor_settings_page_and_verify_cs() {
		contractorsettingsActions.ClickonsidesinglearrowsincontractorsettingspageandverifyCS();
	}

}
