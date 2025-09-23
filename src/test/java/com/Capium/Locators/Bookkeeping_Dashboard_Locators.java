package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Bookkeeping_Dashboard_Locators {
	
	@FindBy(xpath="//h3[contains(text(),'Return(s) in Current Month')]")
	@CacheLookup
	public WebElement Returnsincurrentmonth ;
	
	@FindBy(xpath="//h3[contains(text(),'Monthly Submitted Return(s)')]")
	@CacheLookup
	public WebElement Monthlysubmittedreturn ;
	
	@FindBy(xpath="(//*[@role='combobox']/div)[1]")
	@CacheLookup
	public WebElement MonthlysubmittedreturnyearDD ;
	
	@FindBy(xpath="//div[@role='tab']")
	@CacheLookup
	public WebElement ClickAllClients ;
	
	@FindBy(xpath="//input[@data-placeholder='Search here...' or @placeholder='Search here...' or @autocomplete='off']")
	@CacheLookup
	public WebElement Enterclientnameinsearchboxinallclients ;
	
	@FindBy(xpath="(//*[text()='search'])[2]")
	@CacheLookup
	public WebElement Clicksearchiconinallclients ;
	
	@FindBy(xpath="//ng-select[normalize-space(@dropdownposition)='bottom']")
	@CacheLookup
	public WebElement ClickonclienttypelistDDinallclients ;
	
	@FindBy(xpath="//mat-select[normalize-space(@panelclass)='pagination']")
	@CacheLookup
	public WebElement ClickshowDDinAllclients ;
	
	@FindBy(xpath="//span[text()='Next']")
	@CacheLookup
	public WebElement ClickNextinAllclients ;
	
	@FindBy(xpath="//span[text()='Previous']")
	@CacheLookup
	public WebElement ClickPreviousinAllclients ;
	
	@FindBy(xpath="//div[contains(text(),'VAT Clients')]")
	@CacheLookup
	public WebElement ClickVATclients ;
	
	@FindBy(xpath="//input[@id='mat-input-2' or @placeholder='Search here...']")
	@CacheLookup
	public WebElement Enterclientnameinsearchboxinavatclients ;
	
	@FindBy(xpath="(//*[text()='search'])[2]")
	@CacheLookup
	public WebElement Clickonsearchiconinvatclients ;
	
	@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]")
	@CacheLookup
	public WebElement ClickclienttypeDDinVATclients;
	
	
	
}
