package com.Capium.stepDefinations;

import java.io.IOException;

import com.Capium.Actions.Bookkeeping_ClientDashboard_Actions;
import io.cucumber.java.en.Given;

public class Bookkeeping_ClientDashboard_Stepdef {
	Bookkeeping_ClientDashboard_Actions  ClientDashboardActions=new Bookkeeping_ClientDashboard_Actions();
	
	@Given("Click on search box in all Clients,enter client name and Click on search icon and Click on searched client")
	public void click_on_search_box_in_all_clients_enter_client_name_and_click_on_search_icon_and_click_on_searched_client() throws InterruptedException {
	ClientDashboardActions.clickonsearchboxinallclientsenterclientnameandclickonsearchicon();
	}
	
	@Given("Verify dashboard displaying or not successfully and take screenshot")
	public void verify_dashboard_displaying_or_not_successfully_and_take_screenshot() throws InterruptedException {
	ClientDashboardActions.verifydashboarddisplayingornotsuccessfullyandtakescreenshot();   
	}

	@Given("Verify Total Income")
	public void verify_total_income() {
	ClientDashboardActions.VerifyTotalincome();   
	}

	@Given("Verify Total Expenditure")
	public void verify_total_expenditure() {
	ClientDashboardActions.VerifyTotalexpenditure();
	   
	}
	

	@Given("Verify Bank Balance")
	public void verify_bank_balance() {
    ClientDashboardActions.VerifyBankbalance();
	    
	}

	@Given("Click on View Bank Book and verify")
	public void click_on_view_bank_book_and_verify() throws InterruptedException {
	ClientDashboardActions.Clickonviewbankbookandverify();
	    
	}

	@Given("Verify Cash in Hand")
	public void verify_cash_in_hand() {
    ClientDashboardActions.Verifycashinhand();
	    
	}

	@Given("Click on View Cash Book and verify")
	public void click_on_view_cash_book_and_verify() throws InterruptedException {
	ClientDashboardActions.Clickonviewcashbookandverify();
	}

	@Given("Verify Income by Category")
	public void verify_income_by_category() {
	ClientDashboardActions.Incomebycategory();
	}
	@Given("Verify Expenditure by Category")
	public void verify_expenditure_by_category() {
	ClientDashboardActions.Expenditurebycategory();
	}


	@Given("Verify Income vs Expenditure")
	public void verify_income_vs_expenditure() throws InterruptedException {
	 ClientDashboardActions.Incomevsexpenditure();  
	}

	@Given("Verify Ageing Summary")
	public void verify_ageing_summary() {
	ClientDashboardActions.Ageingsummary();
	}

	@Given("Verify Ageing Summary Dropdown")
	public void verify_ageing_summary_dropdown() throws IOException, InterruptedException {
	ClientDashboardActions.AgeingsummaryDD();
	}

	@Given("Verify VAT Summary")
	public void verify_vat_summary() {
	ClientDashboardActions.VATsummary();
	    
	}

	@Given("Verify Cash Flow")
	public void verify_cash_flow() throws InterruptedException {
	ClientDashboardActions.Cashflow();
	    
	}

	@Given("Verify year drop down")
	public void verify_year_drop_down() throws InterruptedException, IOException {
	ClientDashboardActions.Yeardropdown();
	  
	}

}
