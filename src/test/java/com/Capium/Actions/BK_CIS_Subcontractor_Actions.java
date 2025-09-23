package com.Capium.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.BK_CIS_Subcontractor_Locators;
import com.Capium.Utilies.HelperClass;

public class BK_CIS_Subcontractor_Actions {

	BK_CIS_Subcontractor_Locators subcontractorlocators=null;
	
	WebDriver driver=HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	
	public BK_CIS_Subcontractor_Actions(){
		this.subcontractorlocators = new BK_CIS_Subcontractor_Locators();
		PageFactory.initElements(HelperClass.getDriver(), subcontractorlocators);
		}
	
	public void navigatetoinsidetheclientandverifySC() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), subcontractorlocators.searchTFindashboard);
		Thread.sleep(3000);
		subcontractorlocators.searchTFindashboard.sendKeys("Journal" + Keys.ENTER);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.newclientid);
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
	
	public void navigatetosubcontractorinCISandverifySC() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.CIS);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.Subcontractor);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),'Add Subcontractor')]"))) {
		        System.out.println("Subcontractor tab is navigated successfully");
		    } else {
		        System.out.println("Subcontractor tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonplusinsubcontractrmainmenuandverifySC() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.CIS);
		//Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.plusinsubcontractormainmenu);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),' Add New Subcontractor ')]"))) {
		        System.out.println("successfully navigated to add new subcontractor page");
		    } else {
		        System.out.println("add new subcontractor page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonplussymbolineditsubcontractorpageSC() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.editiconsubcontractor);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.plusineditjournal);
		Thread.sleep(2000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Subcontractor']"))) {
		        System.out.println("successfully navigated to add new subcontractor page");
		    } else {
		        System.out.println("add new subcontractor page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void  VerifysearchiconandcrossmarkineditsubcontractorpageSC() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.editiconsubcontractor);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.searchineditpage);
		subcontractorlocators.searchTFineditpage.sendKeys("1");
		Thread.sleep(2000);
		 String actualText = HelperClass.getText(By.xpath("//span[normalize-space()='subcontractor 1']")).trim();
			String expected = "1";
			try {
			if (actualText.contains(expected)) {
			    System.out.println(" Found the subcontractor");
			} else {
			    System.out.println(" Text not matched. Actual: " + actualText);
			}
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.crossmarkinsearch);
			Thread.sleep(2000);
			String actualText1 = HelperClass.getText(By.xpath("//input[@placeholder='Search']")).trim();
			String expected1 = "1";
			try {
			if (actualText1.contains(expected1)) {
			    System.out.println(" Cross mark not clicked");
			} else {
			    System.out.println("cross mark clicked. Actual: " + actualText1);
			}
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
	}
	
	public void ClickoncheckboxineditsubcontractorpageandverifytheenablingoptionsSC() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.editiconsubcontractor);
//		wait.until(ExpectedConditions.visibilityOf(journallocators.checkboxinedit));
//		wait.until(ExpectedConditions.elementToBeClickable(journallocators.checkboxinedit));
		Thread.sleep(4000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.checkboxinedit);
		try {
			if (subcontractorlocators.deleteinedit.isDisplayed() && subcontractorlocators.copyinedit.isDisplayed() &&
					subcontractorlocators.exporttoexcelinedit.isDisplayed() && subcontractorlocators.exporttocsvinedit.isDisplayed() && 
					subcontractorlocators.exporttopdfinedit.isDisplayed() && subcontractorlocators.printinedit.isDisplayed() && 
					subcontractorlocators.inactiveinedit.isDisplayed() && subcontractorlocators.activeinedit.isDisplayed()) {
			    System.out.println(" All option are displaying succesfully");
			} else {
			    System.out.println(" All option are not displaying");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
		
	}
	
	public void verifysearchbarinmaingridSC() throws InterruptedException {
		Thread.sleep(5000);
		subcontractorlocators.searchbarinmaingrid.sendKeys("Active" + Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> referenceCells = HelperClass.getDriver()
				.findElements(By.xpath("//div[@title='Active']"));
		System.out.println(referenceCells);

		for (WebElement cell : referenceCells) {
			String actual = cell.getText().trim();
			if (actual.contains("Active")) {
				System.out.println("Matched: " + actual);
			} else {
				System.out.println("Mismatch: " + actual);
			}
		}
	}
	
	public void ClickoncheckboxinmaingridandverifyenablingoptionsSC() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.checkboxinedit);
		try {
			if (subcontractorlocators.deleteinedit.isDisplayed() && subcontractorlocators.copyinedit.isDisplayed() &&
					subcontractorlocators.exporttoexcelinedit.isDisplayed() && subcontractorlocators.exporttocsvinedit.isDisplayed() && 
					subcontractorlocators.exporttopdfinedit.isDisplayed() && subcontractorlocators.printinedit.isDisplayed() && 
					subcontractorlocators.inactiveinedit.isDisplayed() && subcontractorlocators.activeinedit.isDisplayed()) {
			    System.out.println(" All option are displaying succesfully");
			} else {
			    System.out.println(" All option are not displaying");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
		
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.copyinedit);
		Thread.sleep(3000);
		try {
			if (subcontractorlocators.copysuccessmessage.isDisplayed()) {
			    System.out.println("copy clicked successfully");
			} else {
			    System.out.println("copy not clicked");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
		Thread.sleep(2000);
		
	}
	
	public void VerifycancleselectionandcrossmarkinthedownSC() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.checkboxinedit);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.cancelselection);
		Thread.sleep(2000);
		try {
			if (subcontractorlocators.checkboxinedit.isSelected()) {
			    System.out.println("Cancel selection not clicked");
			} else {
			    System.out.println("Cancel selection clicked successfully");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.checkboxinedit);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.crossmark);
		Thread.sleep(2000);
		try {
			if (subcontractorlocators.checkboxinedit.isSelected()) {
			    System.out.println("Cross mark not clicked");
			} else {
			    System.out.println("Cross mark clicked successfully");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
	}
	
	 public void VerifypaginationdropdownSC() throws InterruptedException {
		 Thread.sleep(5000);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[@aria-label='dropdownlist']", "10");
			
			Thread.sleep(2000);
			String actualText1 = HelperClass.getText(By.xpath("//span[@aria-label='dropdownlist']")).trim();
			String expected1 = "10";
	 
			if (actualText1.equals(expected1)) {
			    System.out.println("Dropdown Selected 10 option");
			} else {
			    System.out.println("Dropdown not Selected 10 option. Actual: " + actualText1);
			}	
	 }
	 
	 public void VerifyexportoptionsinmaingridSC() throws InterruptedException {

			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.kebabinmaingrid);
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.exporttopdf);
			Thread.sleep(20000);
			
			//Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.kebabinmaingrid);
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.exporttoexcel);
			Thread.sleep(20000);
			
			//Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.kebabinmaingrid);
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.exporttocsv);
			Thread.sleep(20000);
		 
	 }
	 
	 public void verifythecolumnoptionsintoprowkebabSC() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.kebabintoprow);
		 Thread.sleep(2000);
		 HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), subcontractorlocators.columnsoption);
		 Thread.sleep(2000);
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.namecolumn);
		 Thread.sleep(2000);
		 if(subcontractorlocators.namecolumnone.isDisplayed()) {
			 System.out.println("name column not unselected");
		 }
		 else {
			 System.out.println("name column selected");
		 }
		 
		 
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.verificationstatus);
		 Thread.sleep(2000);
		 if(subcontractorlocators.verificationstatusone.isDisplayed()) {
			 System.out.println("verification status column not unselected");
		 }
		 else {
			 System.out.println("verification status column selected");
		 }
	 }
	 
	 public void ClickoncertificatedownloadandverifySC() throws InterruptedException {
		 Thread.sleep(3000);
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.downloadcertificate);
		 Thread.sleep(10000);
	 }
	 
	 public void addsubcontractorandverifySC() throws InterruptedException {
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.addsubcontractorbtn);
		 try {
			    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),' Add New Subcontractor ')]"))) {
			        System.out.println("successfully navigated to add new subcontractor page");
			    } else {
			        System.out.println("add new subcontractor page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		 Thread.sleep(3000);
		 subcontractorlocators.contactnameTF.sendKeys("Subcontractor 12");
		 Thread.sleep(3000);
		 HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), subcontractorlocators.cisinformation);
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.cisinformation);
		 subcontractorlocators.tradingnameTF.sendKeys("trading name 3");
		 
		 Thread.sleep(5000);
		 HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@role='combobox'])[4]", "Already Verified");
		 
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.popupok);
		 HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@role='combobox'])[4]", "Already Verified");
		 
		 subcontractorlocators.verificationnumberTF.sendKeys("123456789");
		 HelperClass.ClickUsingJS(HelperClass.getDriver(), subcontractorlocators.saveandexitinaddjournal);
		 Thread.sleep(3000);
		 
	 }
}
