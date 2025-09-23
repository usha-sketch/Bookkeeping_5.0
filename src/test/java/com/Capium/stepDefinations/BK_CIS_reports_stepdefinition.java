package com.Capium.stepDefinations;

import java.awt.AWTException;

import com.Capium.Actions.BK_CIS_reports_Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BK_CIS_reports_stepdefinition {
	BK_CIS_reports_Actions  reportActions=new BK_CIS_reports_Actions();
	
	@Given("navigate to inside the client and verify R")
	public void navigate_to_inside_the_client_and_verify_r() throws InterruptedException {
	   reportActions.navigatetoinsidetheclientandverifyR();
	}

	@Then("navigate to cis submission in reports and verify R")
	public void navigate_to_cis_submission_in_reports_and_verify_r() throws InterruptedException {
	    reportActions.navigatetocissubmissioninreportsandverifyR();
	}

	@Then("navigate to cis300 in CIS and and fetch the submission peroid and verify that period in cis submission R")
	public void navigate_to_cis300_in_cis_and_and_fetch_the_subcontractor_name_r() throws InterruptedException {
		reportActions.navigatetocis300inCISandandfetchthesubmissionperoidandverifythatperiodincissubmissionR();
	}

	@Then("click on plus symbol and verify pdf and mail icons R")
	public void click_on_plus_symbol_and_verify_pdf_and_mail_icons_r() throws InterruptedException {
		reportActions.clickonplussymbolandverifypdfandmailiconsR();
	}

	@Then("Verify pdf icon in action column R")
	public void verify_pdf_icon_in_action_column_r() throws InterruptedException {
		reportActions.VerifypdficoninactioncolumnR();
	}

	@Then("navigate to Subcontractor YTD details in reports and verify R")
	public void navigate_to_subcontractor_ytd_details_in_reports_and_verify_r() throws InterruptedException {
	    reportActions.navigatetoSubcontractorYTDdetailsinreportsandverifyR();
	}

	@Then("navigate to cis300 in CIS and and fetch the subcontractor name and verify the same contractor in subcontractor YTD details R")
	public void verify_the_subcontractor_details_in_subcontrator_ytd_details_in_reports_r() throws InterruptedException {
	    reportActions.navigatetocis300inCISandandfetchthesubcontractornameandverifythesamecontractorinsubcontractorYTDdetailsR();
	}

	@Then("verify period dropdown R")
	public void verify_period_dropdown_r() {
	    reportActions.verifyperioddropdownR();
	}

	@Then("verify subcontractors dropdown R")
	public void verify_subcontractors_dropdown_r() throws InterruptedException {
	    reportActions.verifysubcontractorsdropdownR();
	}

	@Then("Verify export options R")
	public void verify_export_options_r() throws InterruptedException {
	    reportActions.VerifyexportoptionsR();
	}

	@Then("verify email and import options kebab R")
	public void verify_email_and_import_options_kebab_r() throws InterruptedException, AWTException {
	    reportActions.verifyemailandimportoptionskebabR();
	}

	
	@Then("navigate to CIS invoice in reports and verify R")
	public void navigate_to_cis_invoice_in_reports_and_verify_r() throws InterruptedException {
		reportActions.navigatetoCISinvoiceinreportsandverifyR();
	}
	
	@Then("navigate to cis300 in CIS and and fetch the subcontractor name and verify the subcontrator in cis invoice R")
	public void navigate_to_cis300_in_CIS_and_and_fetch_the_subcontractor_name_and_verify_the_subcontrator_in_cis_invoice_R() throws InterruptedException {
		reportActions.navigatetocis300inCISandandfetchthesubcontractornameandverifythesubcontratorincisinvoiceR();
	}
	
	@Then("Verify pdf and email options R")
	public void verify_pdf_and_email_options_r() throws InterruptedException {
	    reportActions.VerifypdfandemailoptionsR();
	}

	@Then("Verify the period dropdown R")
	public void verify_the_period_dropdown_r() throws InterruptedException {
	    reportActions.VerifytheperioddropdownR();
	}

	@Then("verify the subcontractors dropdown R")
	public void verify_the_subcontractors_dropdown_r() throws InterruptedException {
	    reportActions.verifythesubcontractorsdropdownR();
	}

}
