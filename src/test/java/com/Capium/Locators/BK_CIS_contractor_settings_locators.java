package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BK_CIS_contractor_settings_locators{

	@FindBy(xpath = "//input[@aria-label='Username']")
	@CacheLookup
	public WebElement inputUsername;
	
	@FindBy(xpath = "//input[@placeholder='Search here...']")
	@CacheLookup
	public WebElement searchTFindashboard;
	
	@FindBy(xpath = "//span[normalize-space()='Journal client']")
	@CacheLookup
	public WebElement newclientid;
	
	@FindBy(xpath = "//a[normalize-space()='CIS']")
	@CacheLookup
	public WebElement CIS;
	
	@FindBy(xpath = "//a[@title='Contractor Settings']")
	@CacheLookup
	public WebElement contractorsettings;
	
	@FindBy(xpath = "//input[@formcontrolname='businessName']")
	@CacheLookup
	public WebElement businessnameTF;
	
	@FindBy(xpath = "//input[@formcontrolname='utrNumber']")
	@CacheLookup
	public WebElement UTRnoTF;

	@FindBy(xpath = "//input[@formcontrolname='payeReference']")
	@CacheLookup
	public WebElement payereferenceTF;
	
	@FindBy(xpath = "//input[@formcontrolname='accountOfficeRef']")
	@CacheLookup
	public WebElement accountreferenceTF;
	
	@FindBy(xpath = "//span[text()=' Save ']")
	@CacheLookup
	public WebElement savebutton;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='keyboard_double_arrow_up']")
	@CacheLookup
	public WebElement openarrowinaddjournal;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='keyboard_double_arrow_down']")
	@CacheLookup
	public WebElement closerrowinaddjournal;
	
	@FindBy(xpath = "(//span[@style='transform: rotate(180deg);'])[1]")
	@CacheLookup
	public WebElement singlearrow1;
	
	@FindBy(xpath = "(//span[contains(@class, 'mat-expansion-indicator') and contains(@class, 'ng-trigger-indicatorRotate')])[2]")
	@CacheLookup
	public WebElement singlearrow2;
	
	@FindBy(xpath = "(//span[contains(@class, 'mat-expansion-indicator') and contains(@class, 'ng-trigger-indicatorRotate')])[3]")
	@CacheLookup
	public WebElement singlearrow3;
	
	@FindBy(xpath = "//input[@formcontrolname='businessName']")
	@CacheLookup
	public WebElement eleindoublearrow;
}


