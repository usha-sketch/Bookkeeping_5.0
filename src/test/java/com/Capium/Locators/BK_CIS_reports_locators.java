package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BK_CIS_reports_locators {

	@FindBy(xpath = "//span[normalize-space()='Manage']")
	@CacheLookup
	public WebElement managetab;
	
	@FindBy(xpath = "//a[@title='Reports']")
	@CacheLookup
	public WebElement reports;
	
	@FindBy(xpath = "//a[@title='CIS Submission']")
	@CacheLookup
	public WebElement cissubmission;
	
	@FindBy(xpath = "//a[@title='Sub contractor YTD Details']")
	@CacheLookup
	public WebElement subcontractorytddetails;
	
	@FindBy(xpath = "//a[@title='CIS Invoice']")
	@CacheLookup
	public WebElement cisinvoice;
	
	@FindBy(xpath = "//input[@placeholder='Search here...']")
	@CacheLookup
	public WebElement searchTFindashboard;
	
	@FindBy(xpath = "//span[normalize-space()='Journal client']")
	@CacheLookup
	public WebElement newclientid;
	
	@FindBy(xpath = "//a[normalize-space()='CIS']")
	@CacheLookup
	public WebElement CIS;
	
	@FindBy(xpath = "//mat-icon[text()='add']")
	@CacheLookup
	public WebElement plusiconinCISsubmission;
	
	@FindBy(xpath = "(//mat-icon[text()='picture_as_pdf'])[2]")
	@CacheLookup
	public WebElement pdfinplusiconone;
	
	@FindBy(xpath = "(//mat-icon[text()='picture_as_pdf'])[3]")
	@CacheLookup
	public WebElement pdfinplusiconotwo;
	
	@FindBy(xpath = "//mat-icon[text()='mail']")
	@CacheLookup
	public WebElement mailinplus;
	
	@FindBy(xpath = "//h2[text()='Share']")
	@CacheLookup
	public WebElement shareele;
	
	@FindBy(xpath = "(//input[@maxlength='500'])[1]")
	@CacheLookup
	public WebElement toemailTF;
	
	@FindBy(xpath = "//span[text()=' Send ']")
	@CacheLookup
	public WebElement emailsendbtn;
	
	@FindBy(xpath = "//p[text()='Mail sent successfully!']")
	@CacheLookup
	public WebElement successmailmessage;
	
	@FindBy(xpath = "(//mat-icon[text()='picture_as_pdf'])[1]")
	@CacheLookup
	public WebElement pdfinplusiconothree;
	
	@FindBy(xpath = "//a[@title='CIS300']")
	@CacheLookup
	public WebElement CISthreehundrud;
	
	@FindBy(xpath = "//a[@title='Sub contractor YTD Details']")
	@CacheLookup
	public WebElement subcontractorYTDdetails;
	
	@FindBy(xpath = "//a[text()=' January - 2025 ']")
	@CacheLookup
	public WebElement submissionperiod;
	
	@FindBy(xpath = "//mat-icon[text()='close']")
	@CacheLookup
	public WebElement crossmarkinCIS;
	
	@FindBy(xpath = "//span[text()='01-Jan-2025 - 31-Dec-2025']")
	@CacheLookup
	public WebElement periodDD;
	
	@FindBy(xpath = "//span[text()='All Years ']")
	@CacheLookup
	public WebElement allyears;
	
	@FindBy(xpath = "//div[@aria-haspopup='listbox']")
	@CacheLookup
	public WebElement allsubcontractor;
	
	@FindBy(xpath = "//span[text()='Subcontractor  1']")
	@CacheLookup
	public WebElement subcontractorname;
	
	@FindBy(xpath = "//span[text()=' Subcontractor  1']")
	@CacheLookup
	public WebElement searchsubcontractor;
	
	@FindBy(xpath = "//mat-icon[text()='more_vert']")
	@CacheLookup
	public WebElement kebabinmaingrid;
	
	@FindBy(xpath = "//span[text()='Export As PDF ']")
	@CacheLookup
	public WebElement exporttopdf;
	
	@FindBy(xpath = "//span[text()='Export to Excel ']")
	@CacheLookup
	public WebElement exporttoexcel;
	
	@FindBy(xpath = "//span[text()='Export to CSV ']")
	@CacheLookup
	public WebElement exporttocsv;
	
	@FindBy(xpath = "//span[text()='Import ']")
	@CacheLookup
	public WebElement importicon;
	
	@FindBy(xpath = "//button[@class='file-upload-button primary-button']")
	@CacheLookup
	public WebElement browser;
	
	@FindBy(xpath = "//span[text()=' Next ']")
	@CacheLookup
	public WebElement nextbtn;
	
	@FindBy(xpath = "(//a[@title='CIS Invoice'])[2]")
	@CacheLookup
	public WebElement cisinvoivetab;
	
	@FindBy(xpath = "//mat-icon[text()='picture_as_pdf']")
	@CacheLookup
	public WebElement pdfincisinvoice;
	
	@FindBy(xpath = "//span[text()='01-Jan-2025 - 31-Dec-2025']")
	@CacheLookup
	public WebElement perioddropdown;
	
	@FindBy(xpath = "//span[text()='All Years ']")
	@CacheLookup
	public WebElement allyearsdd;
	
	@FindBy(xpath = "//div[@aria-haspopup='listbox']")
	@CacheLookup
	public WebElement allsubcontractorsdd;
	
	@FindBy(xpath = "(//span[@title='Subcontractor  1'])[2]")
	@CacheLookup
	public WebElement subcontractorone;

	
	
	
	
	
	
	
}
