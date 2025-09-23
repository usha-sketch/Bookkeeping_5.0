package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BK_task_Bulkedit_locators {

	@FindBy(xpath = "//span[normalize-space()='Manage']")
	@CacheLookup
	public WebElement managetab;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	@CacheLookup
	public WebElement searchTFmanagetab;
	
	@FindBy(xpath = "//span[normalize-space()='Journal client']")
	@CacheLookup
	public WebElement newclientid;
	
	@FindBy(xpath = "//a[normalize-space()='Tasks']")
	@CacheLookup
	public WebElement task;
	
	@FindBy(xpath = "//a[@title='Bulk Edit']")
	@CacheLookup
	public WebElement bulkedittab;
	
	@FindBy(xpath = "//input[@placeholder='Search here...']")
	@CacheLookup
	public WebElement searchTFindashboard;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	@CacheLookup
	public WebElement checkboxinedit;
	
	@FindBy(xpath = "(//div[@aria-haspopup='listbox'])[1]")
	@CacheLookup
	public WebElement accountsdropdown;
	
	@FindBy(xpath = "(//div[@aria-haspopup='listbox'])[3]")
	@CacheLookup
	public WebElement accountsdropdowninrow;
	
	@FindBy(xpath = "//span[text()=' Save ']")
	@CacheLookup
	public WebElement savebtn;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	@CacheLookup
	public WebElement checkboxinedittwo;
	
	@FindBy(xpath = "//input[@aria-required='false']")
	@CacheLookup
	public WebElement searchbarinmaingrid;
	
	@FindBy(xpath = "//input[@data-mat-calendar='mat-datepicker-2']")
	@CacheLookup
	public WebElement fromdate;
	
	@FindBy(xpath = "//input[@data-mat-calendar='mat-datepicker-3']")
	@CacheLookup
	public WebElement todate;
	
	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[20]")
	@CacheLookup
	public WebElement fromcalender;
	
	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[21]")
	@CacheLookup
	public WebElement tocalender;
	
	@FindBy(xpath = "//span[text()=' 11 ']")
	@CacheLookup
	public WebElement dateinfromcalender;
	
	@FindBy(xpath = "//span[text()=' 17 ']")
	@CacheLookup
	public WebElement dateintocalender;
	
	@FindBy(xpath = "(//mat-icon[text()='search'])[3]")
	@CacheLookup
	public WebElement searchicon;
	
	@FindBy(xpath = "//a[text()=' INV-1']")
	@CacheLookup
	public WebElement invref;
	
	@FindBy(xpath = "//h2[text()='Invoices']")
	@CacheLookup
	public WebElement invoiceele;
	
	@FindBy(xpath = "//mat-icon[text()='save_alt']")
	@CacheLookup
	public WebElement download;
	
	@FindBy(xpath = "//mat-icon[text()='edit']")
	@CacheLookup
	public WebElement edit;
	
	@FindBy(xpath = "//mat-icon[text()='close']")
	@CacheLookup
	public WebElement crossmark;
	
	@FindBy(xpath = "//span[text()=' Edit Invoice ']")
	@CacheLookup
	public WebElement editinvoiceele;
	
	
}
