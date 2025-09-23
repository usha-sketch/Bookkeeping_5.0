package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BK_banktab_locators {

	@FindBy(xpath = "//span[normalize-space()='Manage']")
	@CacheLookup
	public WebElement managetab;
	
	@FindBy(xpath = "//input[@placeholder='Search here...']")
	@CacheLookup
	public WebElement searchTFindashboard;
	
	@FindBy(xpath = "//span[normalize-space()='Journal client']")
	@CacheLookup
	public WebElement newclientid;
	
	@FindBy(xpath = "//a[normalize-space()='Bank']")
	@CacheLookup
	public WebElement banktab;
	
	@FindBy(xpath = "(//a[normalize-space()='Overview'])[3]")
	@CacheLookup
	public WebElement overviewtab;
	
	@FindBy(xpath = "//span[text()=' Add Bank Account']")
	@CacheLookup
	public WebElement addbankbtn;
	
	@FindBy(xpath = "//input[@formcontrolname='accountName']")
	@CacheLookup
	public WebElement accountnameTF;
	
	@FindBy(xpath = "//input[@formcontrolname='accountCode']")
	@CacheLookup
	public WebElement nominalTF;
	
	@FindBy(xpath = "//input[@formcontrolname='accountNo']")
	@CacheLookup
	public WebElement accountnumber;
	
	@FindBy(xpath = "//span[text()=' Save ']")
	@CacheLookup
	public WebElement savebtn;
	
	@FindBy(xpath = "//mat-icon[text()='edit']")
	@CacheLookup
	public WebElement editicon;
	
	@FindBy(xpath = "//span[text()=' Save and Exit ']")
	@CacheLookup
	public WebElement saveandexit;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	@CacheLookup
	public WebElement checkboxinedit;
	

	@FindBy(xpath = "//p[normalize-space()='Delete']")
	@CacheLookup
	public WebElement deleteinedit;
	
	@FindBy(xpath = "//p[normalize-space()='Copy']")
	@CacheLookup
	public WebElement copyinedit;
	
	@FindBy(xpath = "//p[normalize-space()='Excel']")
	@CacheLookup
	public WebElement exporttoexcelinedit;
	
	@FindBy(xpath = "//p[normalize-space()='CSV']")
	@CacheLookup
	public WebElement exporttocsvinedit;
	
	@FindBy(xpath = "//p[normalize-space()='PDF']")
	@CacheLookup
	public WebElement exporttopdfinedit;
	
	@FindBy(xpath = "//p[normalize-space()='Print']")
	@CacheLookup
	public WebElement printinedit;
	
	@FindBy(xpath = "//p[normalize-space()='Active']")
	@CacheLookup
	public WebElement activeinedit;
	
	@FindBy(xpath = "//p[normalize-space()='Inactive']")
	@CacheLookup
	public WebElement inactiveinedit;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='keyboard_double_arrow_up']")
	@CacheLookup
	public WebElement openarrowinaddjournal;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='keyboard_double_arrow_down']")
	@CacheLookup
	public WebElement closerrowinaddjournal;
	
	@FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add_circle_outline'])[23]")
	@CacheLookup
	public WebElement plusinmainmenu;
	
	@FindBy(xpath = "(//mat-icon[text()='search'])[2]")
	@CacheLookup
	public WebElement searchineditpage;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	@CacheLookup
	public WebElement searchTFineditpage;
	
	@FindBy(xpath = "//a[normalize-space()='JNL - 2']")
	@CacheLookup
	public WebElement journaltwoforssearch;
	
	@FindBy(xpath = "//mat-icon[text()='highlight_off']")
	@CacheLookup
	public WebElement crossmarkinsearch;
	
	@FindBy(xpath = "(//input[normalize-space(@aria-autocomplete)='list'])[2]")
	@CacheLookup
	public WebElement bankaccounttypeDD;
	
	@FindBy(xpath = "//div[text()=' Savings ']")
	@CacheLookup
	public WebElement savingsoption;
	
	@FindBy(xpath = "//p[text()='Account Group']")
	@CacheLookup
	public WebElement accountgrpele;
	
	@FindBy(xpath = "//span[text()='Cash in Hand']")
	@CacheLookup
	public WebElement cashinhandeles;
	
	@FindBy(xpath = "//input[@aria-required='false']")
	@CacheLookup
	public WebElement searchbarinmaingrid;
	
	@FindBy(xpath = "//mat-icon[text()='more_vert']")
	@CacheLookup
	public WebElement kebabinmaingrid;
	
	@FindBy(xpath = "//span[text()='Manual Import ']")
	@CacheLookup
	public WebElement manualimport;
	
	@FindBy(xpath = "//input[@formcontrolname='description']")
	@CacheLookup
	public WebElement descriptionTF;
	
	@FindBy(xpath = "(//input[@formcontrolname='description'])[2]")
	@CacheLookup
	public WebElement descriptionTF2;
	
	@FindBy(xpath = "//input[@formcontrolname='paidOut']")
	@CacheLookup
	public WebElement paidoutTF;
	
	@FindBy(xpath = "(//input[@formcontrolname='paidIn'])[2]")
	@CacheLookup
	public WebElement paidinTF2;
	
	@FindBy(xpath = "//a[text()='Add New Line']")
	@CacheLookup
	public WebElement addnewline;
	
	@FindBy(xpath = "//span[text()='Export As PDF ']")
	@CacheLookup
	public WebElement exporttopdf;
	
	@FindBy(xpath = "//span[text()='Export to Excel ']")
	@CacheLookup
	public WebElement exporttoexcel;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	@CacheLookup
	public WebElement checkboxcashcode;
	
	@FindBy(xpath = "//span[text()='Import ']")
	@CacheLookup
	public WebElement importoption;
	
	@FindBy(xpath = "//input[@type='file']")
	@CacheLookup
	public WebElement browser;
	
	@FindBy(xpath = "//span[text()='Quick Journal ']")
	@CacheLookup
	public WebElement quickjournal;
	
	@FindBy(xpath = "//input[@formcontrolname='amountReceived']")
	@CacheLookup
	public WebElement amountreceivedTF;
	
	@FindBy(xpath = "//input[@formcontrolname='amountReceived']")
	@CacheLookup
	public WebElement entryforaccountDD;
	
	@FindBy(xpath = "//span[text()='1510 - Amortisation of Goodwill']")
	@CacheLookup
	public WebElement accountcodeoption;
	
	@FindBy(xpath = "//span[text()='Cash Coding ']")
	@CacheLookup
	public WebElement cashcoding;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	@CacheLookup
	public WebElement checkbox2;
	
	@FindBy(xpath = "(//mat-icon[text()='handshake'])[1]")
	@CacheLookup
	public WebElement reconcileicon;
	
	@FindBy(xpath = "//div[text()='Payment']")
	@CacheLookup
	public WebElement paymentinaction;
	
	@FindBy(xpath = "//table/tbody/tr/td[6]/div")
	@CacheLookup
	public WebElement receiptcolumn;
	
	@FindBy(xpath = "(//div[text()='Date'])[1]")
	@CacheLookup
	public WebElement datecolumn;
	
	@FindBy(xpath = "//mat-icon[text()='add_link']")
	@CacheLookup
	public WebElement addlinkforquickentry;
	
	@FindBy(xpath = "//div[contains(@class,'mat-mdc-form-field-infix ng-tns-c20-431')]")
	@CacheLookup
	public WebElement typeDDmultipletransaction;
	
	@FindBy(xpath = "//span[text()='Receipt']")
	@CacheLookup
	public WebElement receiptinDD;
	
	@FindBy(xpath = "//div[text()='Multiple Transactions']")
	@CacheLookup
	public WebElement multipletransactioninDD;
	
	@FindBy(xpath = "//span[text()='01-Jan-2025 - 31-Dec-2025']")
	@CacheLookup
	public WebElement periodDD;
	
	@FindBy(xpath = "(//span[text()='All'])[1]")
	@CacheLookup
	public WebElement typeDD;
	
	@FindBy(xpath = "//span[text()='Journals']")
	@CacheLookup
	public WebElement journaloption;
	
	@FindBy(xpath = "(//table/tbody/tr/td//ng-select[@panelclass='mat-select-position'])[1]")
	@CacheLookup
	public WebElement actiondropdown;
	
	@FindBy(xpath = "(//table/tbody/tr/td[ng-select]//preceding-sibling::td[5])[1]")
	@CacheLookup
	public WebElement receiptamount;

	@FindBy(xpath = "//a[text()=' Quick Entry ']")
	@CacheLookup
	public WebElement quickentrytab;
	
	@FindBy(xpath = "//input[normalize-space(@formcontrolname)='netAmount']")
	@CacheLookup
	public WebElement Netamountinquickentry;
	
	@FindBy(xpath = "//input[@formcontrolname='invoiceDate']")
	@CacheLookup
	public WebElement invoicedate;
	
	@FindBy(xpath = "//input[@formcontrolname='paymentDate']")
	@CacheLookup
	public WebElement paymentdates;
	
	@FindBy(xpath = "(//table/tbody/tr/td[ng-select]//preceding-sibling::td[9])[1]")
	@CacheLookup
	public WebElement invoicescrollelement;
	
	@FindBy(xpath = "(//input[@name='amount'])[2]")
	@CacheLookup
	public WebElement amountnameTFinmultidd;
}
