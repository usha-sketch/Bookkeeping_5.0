package com.Capium.stepDefinations;

import java.io.IOException;

import com.Capium.Actions.Bookkeeping_Dashboard_Actions;

import io.cucumber.java.en.Given;

public class Bookkeeping_Dashboard_Stepdef {
	
	Bookkeeping_Dashboard_Actions  DashboardActions=new Bookkeeping_Dashboard_Actions();
	
	@Given("Verify returns in current month")
	public void verify_returns_in_current_month() throws InterruptedException {
	    DashboardActions.verifyReturnsincurrentmonth();
	}

	@Given("Verify monthly submitted return")
	public void verify_monthly_submitted_return() {
	    DashboardActions.Verifymonthlysubmittedreturn();
	}

	@Given("Verify Year drop down")
	public void verify_year_drop_down() throws Throwable {
	   DashboardActions.VerifyyearDD();
	  
	}
	@Given("Click on All Clients and take screenshot")
	public void click_on_all_clients_and_take_screenshot() throws IOException, InterruptedException {
	    DashboardActions.ClickonAllclientsandtakescreenshot();
	}
	@Given("Enter client name, search client name and verify")
	public void enter_client_name_search_client_name_and_verify() throws InterruptedException {
		DashboardActions.EnterclientnameandsearchandverifyAllclient();
	   
	}

	@Given("Verify Client Type")
	public void verify_client_type() throws InterruptedException {
	    DashboardActions.verifyclienttype();
	    
	}

	@Given("Select pagination number in drop down and take screenshot")
	public void select_pagination_number_in_drop_down_and_take_screenshot() throws IOException, InterruptedException {
	    DashboardActions.SelectpaginationnumberinDDandtakescreenshot();
	}

	@Given("click on Next button and take screenshot")
	public void click_on_next_button_and_take_screenshot() throws IOException, InterruptedException {
	    DashboardActions.clickonnextbutton();
	}

	@Given("click on Previous button and take screenshot")
	public void click_on_previous_button_and_take_screenshot() throws IOException, InterruptedException {
	    DashboardActions.clickonPreviousbutton();
	}

	@Given("Click on VAT Clients and take screenshot")
	public void click_on_vat_clients_and_take_screenshot() throws IOException, InterruptedException {
	  DashboardActions.clickonVATClients();  
	}
	@Given("Enter client name,search client name and verify VAT clients")
	public void enter_client_name_search_client_name_and_verify_vat_clients() throws InterruptedException {
	  DashboardActions.EnterclientnameandsearchandverifyVATclient();  
	}
	
	@Given("Verify Client Type in VAT client")
	public void verify_client_type_in_vat_client() throws InterruptedException {
	    DashboardActions.VerifyClientTypeinVATclient();
	}

	@Given("Select pagination number in drop down and take screenshot in VAT client")
	public void select_pagination_number_in_drop_down_and_take_screenshot_in_vat_client() throws IOException, InterruptedException {
	    DashboardActions.SelectpaginationnumberinDDandtakescreenshotforvatclients();
	}

	@Given("click on Next button and take screenshot in VAT client")
	public void click_on_next_button_and_take_screenshot_in_vat_client() throws IOException, InterruptedException {
	   DashboardActions.clickonnextbuttoninvatclients();
	}

	@Given("click on Previous button and take screenshot in VAT client")
	public void click_on_previous_button_and_take_screenshot_in_vat_client() throws IOException, InterruptedException {
	    DashboardActions.clickonPreviousbuttoninvatclients();
	}



}


