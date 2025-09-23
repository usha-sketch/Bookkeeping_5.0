package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BK_banktransfer_andbankfeed_locators {

	@FindBy(xpath="//a[@title='Bank Transfers']")
	public WebElement BankTransfers;
	
	@FindBy(xpath="//span[text()=' Add Bank Transfer ']")
	public WebElement AddBankTranferbtn;
	
	@FindBy(xpath="//input[@formcontrolname='amount']")
	public WebElement Amountinbanktransfer;
	
	@FindBy(xpath="//input[@formcontrolname='reference']")
	public WebElement reference;
	
	@FindBy(xpath="//span[text()=' Clear Form ']")
	public WebElement clearform;
	
	@FindBy(xpath="//span[text()=' Save and Exit ']")
	public WebElement saveandexit;
	
	
	@FindBy(xpath="(//span[normalize-space()='union bank'])[1]")
	public WebElement unionbank;
	
	
	@FindBy(xpath = "//input[@placeholder='Search here...']")
	@CacheLookup
	public WebElement searchTFindashboard;
	
	@FindBy(xpath="//span[normalize-space()='Cash in hand']")
	public WebElement cashinhand;
	
	@FindBy(xpath="//div[@class='d-flex gap-40']//div[1]//div[1]//p[1]")
	public WebElement Fundname;
	
	
	@FindBy(xpath="//span[@class='ng-option-label ng-star-inserted']/div")
	public WebElement Restrictedfund;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	@CacheLookup
	public WebElement searchTFmanagetab;
	
	@FindBy(xpath = "//span[normalize-space()='Journal client']")
	@CacheLookup
	public WebElement newclientid;
	
	@FindBy(xpath = "//mat-icon[text()='edit ']")
	@CacheLookup
	public WebElement editiconjournal;
	
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
	
	@FindBy(xpath = "//p[@class='mb-0 text-success']")
	@CacheLookup
	public WebElement copysuccessmessage;
	
	@FindBy(xpath = "//mat-icon[text()='highlight_off']")
	@CacheLookup
	public WebElement crossmarkinsearch;
	
	@FindBy(xpath = "(//mat-icon[text()='search'])[2]")
	@CacheLookup
	public WebElement searchineditpage;
	
	@FindBy(xpath = "//input[@formcontrolname='transferDate']")
	@CacheLookup
	public WebElement tranferdateele;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	@CacheLookup
	public WebElement searchTFineditpage;
	
	@FindBy(xpath = "//input[@aria-required='false']")
	@CacheLookup
	public WebElement searchbarinmaingrid;
	
	@FindBy(xpath = "(//mat-icon[text()='add_circle_outline'])[32]")
	@CacheLookup
	public WebElement plusineditjournal;
}
