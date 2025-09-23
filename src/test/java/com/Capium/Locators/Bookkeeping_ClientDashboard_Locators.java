package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Bookkeeping_ClientDashboard_Locators {
	
	@FindBy(xpath="//input[contains(@data-placeholder,'Search here')]")
	@CacheLookup
	public WebElement Searchherebox ;
    
	@FindBy(xpath="(//mat-icon[text()='search'])[2]")
	@CacheLookup
	public WebElement clicksearchicon ;

	@FindBy(xpath="(//table/tbody/tr/td[@role='cell'])[3]/div/a/span")
	@CacheLookup
	public WebElement Clickclientname ;

	@FindBy(xpath="//p[text()='Total Income']")
	@CacheLookup
	public WebElement Totalincome ;
	
	@FindBy(xpath="//p[text()='Total Expenditure']")
	@CacheLookup
	public WebElement Totalexpenditure ;
	
	@FindBy(xpath="//p[text()='Bank Balance']")
	@CacheLookup
	public WebElement Bankbalance ;
	
	@FindBy(xpath="//a[contains(text(),'View Bank Book')]")
	@CacheLookup
	public WebElement Clickviewbankbooklink ;
	
	@FindBy(xpath="//p[text()='Cash in Hand']")
	@CacheLookup
	public WebElement Cashinhand ;
	
	@FindBy(xpath="//a[contains(text(),'View Cash Book')]")
	@CacheLookup
	public WebElement Clickviewcashbooklink ;
	
	@FindBy(xpath="//h3[contains(text(),'Income by Category')]")
	@CacheLookup
	public WebElement Incomebycategory ;
	
	@FindBy(xpath="//h3[contains(text(),'Expenditure by Category')]")
	@CacheLookup
	public WebElement Expenditurebycategory ;
	
	@FindBy(xpath="//h3[contains(text(),'Income vs Expenditure')]")
	@CacheLookup
	public WebElement Incomevsexpenditure ;
	
	@FindBy(xpath="//h3[contains(text(),'Ageing Summary')]")
	@CacheLookup
	public WebElement Ageingsummary ;
	
	@FindBy(xpath="(//mat-select[@role='combobox'])[2]")
	@CacheLookup
	public WebElement AgeingsummaryDD ;
	
	@FindBy(xpath="//h3[text()='VAT Summary']")
	@CacheLookup
	public WebElement VATsummary ;
	
	@FindBy(xpath="//h3[contains(text(),'Cash Flow')]")
	@CacheLookup
	public WebElement Cashflow ;
	
	@FindBy(xpath="//mat-select[@panelclass='myPanelClass'])[1]")
	@CacheLookup
	public WebElement YearDD ;
	

}
