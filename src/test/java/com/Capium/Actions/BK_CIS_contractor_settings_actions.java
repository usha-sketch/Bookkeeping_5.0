package com.Capium.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.BK_CIS_contractor_settings_locators;
import com.Capium.Utilies.HelperClass;

public class BK_CIS_contractor_settings_actions {

	BK_CIS_contractor_settings_locators contractorsettinglocators=null;
	
	WebDriver driver=HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	
	public BK_CIS_contractor_settings_actions(){
		this.contractorsettinglocators = new BK_CIS_contractor_settings_locators();
		PageFactory.initElements(HelperClass.getDriver(), contractorsettinglocators);
		}
	
	public void navigatetoinsidetheclientandverifyCS() throws InterruptedException {
		Thread.sleep(3000);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.managetab);
//		journallocators.searchTFmanagetab.sendKeys("JJournal" + Keys.ENTER);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), contractorsettinglocators.searchTFindashboard);
		Thread.sleep(3000);
		contractorsettinglocators.searchTFindashboard.sendKeys("Journal" + Keys.ENTER);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), contractorsettinglocators.newclientid);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//a[@class='mat-mdc-menu-trigger company-list']"))) {
		        System.out.println("Client navigated successully");
		    } else {
		        System.out.println("Client is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void navigatetocontractorsettingsinCISandverifyCS() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), contractorsettinglocators.CIS);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), contractorsettinglocators.contractorsettings);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),' Contractor Settings ')]"))) {
		        System.out.println("Contractor Settings tab is navigated successfully");
		    } else {
		        System.out.println("Contractor Settings tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void enterthedatainsettingsandverifyCS() throws InterruptedException {
		Thread.sleep(3000);
		contractorsettinglocators.businessnameTF.clear();
		contractorsettinglocators.businessnameTF.sendKeys("business name 111");
		
		contractorsettinglocators.UTRnoTF.clear();
		contractorsettinglocators.UTRnoTF.sendKeys("4253744355");
		
		contractorsettinglocators.accountreferenceTF.clear();
		contractorsettinglocators.accountreferenceTF.sendKeys("475PN01681589");
		
		contractorsettinglocators.payereferenceTF.clear();
		contractorsettinglocators.payereferenceTF.sendKeys("475/VE67979");
		
		contractorsettinglocators.savebutton.click();
		Thread.sleep(3000);
	}
	
	public void ClickondoublearrowsincontractorsettingspageandverifythedetailboxesareopeningorclosingCS() throws InterruptedException {
	Thread.sleep(2000);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), contractorsettinglocators.openarrowinaddjournal);
	
	try {
	if (contractorsettinglocators.closerrowinaddjournal.isDisplayed()) {
	    System.out.println("Contracor setting detials are closed successfully");
	} else {
	    System.out.println("Boxed are not closed");
	}
	} catch (Exception e) {
	    System.out.println("An error occurred " + e.getMessage());
	}
	Thread.sleep(2000);
	HelperClass.ClickUsingJS(HelperClass.getDriver(), contractorsettinglocators.closerrowinaddjournal);
	Thread.sleep(2000);

	try {
		if (contractorsettinglocators.eleindoublearrow.isDisplayed()) {
		    System.out.println("Contracor setting detials are opened successfully");
		} else {
		    System.out.println("Contracor setting detials are not opened");
		}
		} catch (Exception e) {
		    System.out.println("An error occurred" + e.getMessage());
		}
	}
	
	public void ClickonsidesinglearrowsincontractorsettingspageandverifyCS() {
		
	}



}
