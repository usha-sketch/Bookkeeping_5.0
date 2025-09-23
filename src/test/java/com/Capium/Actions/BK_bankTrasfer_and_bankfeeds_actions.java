package com.Capium.Actions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.BK_banktransfer_andbankfeed_locators;
import com.Capium.Utilies.HelperClass;

import ch.qos.logback.core.util.Duration;

public class BK_bankTrasfer_and_bankfeeds_actions {

	BK_banktransfer_andbankfeed_locators banktransferlocators=null;
	
	WebDriver driver=HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	
	public BK_bankTrasfer_and_bankfeeds_actions() {
		this.banktransferlocators = new BK_banktransfer_andbankfeed_locators();
		PageFactory.initElements(HelperClass.getDriver(), banktransferlocators);
		}
	
	
	public void navigatetoinsidetheclientandverifyBT() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banktransferlocators.searchTFindashboard);
		Thread.sleep(3000);
		banktransferlocators.searchTFindashboard.sendKeys("Journal" + Keys.ENTER);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banktransferlocators.newclientid);
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
	
	public void ClickonBankTranferandverify() throws InterruptedException {
		
		HelperClass.ClickUsingJS(driver, By.xpath("//a[text()=' Bank ']"));
		Thread.sleep(2000);
		HelperClass.waitForPageToLoad(driver);
		banktransferlocators.BankTransfers.click();
		HelperClass.waitForPageToLoad(driver);
		Thread.sleep(1000);
		try {
	 		    String actualText = HelperClass.getText(By.xpath("//span[text()='Add Bank Transfer']"));
	 		    System.out.println(actualText.equals("Add Bank Transfer") ? "Bank Tranfer Page" : "Not a BanTranfer page");
	 		} catch (Exception e) {
	 		    System.out.println("Error finding or comparing text: " + e.getMessage());
	 		}	
	}	
	
	public void ClickonAddBankTranferAndverify() throws InterruptedException {
		Thread.sleep(4000);
		HelperClass.waitForPageToLoad(driver);
//		banktransferlocators.AddBankTranferbtn.click();
		HelperClass.ClickUsingJS(driver, By.xpath("//mat-icon[text()='add']"));
		HelperClass.waitForPageToLoad(driver);
		Thread.sleep(2000);
		try {
	 		    String actualText = HelperClass.getText(By.xpath("//span[text()=' Add New Bank Transfer ']"));
	 		    System.out.println(actualText.equals("Add New Bank Transfer") ? "Add Bank Tranfer Page" : "Not a AddBanTranfer page");
	 		} catch (Exception e) {
	 		    System.out.println("Error finding or comparing text: " + e.getMessage());
	 		}	
	}
	
	
	public void EnterthedataInBankTransfer() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		//Thread.sleep(2000);
//	    HelperClass.setValueUsingJS(By.xpath("//input[@formcontrolname='transferDate']"), "17/09/2025");
//	    HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='transferFrom']"), "union bank");
//	    banktransferlocators.unionbank.click();
//	 	HelperClass.safeSendKeys(By.xpath("//input[@formcontrolname='transferTo']"), "Cash in hand");
//	 	banktransferlocators.cashinhand.click();
		
		WebElement element3=driver.findElement(By.xpath("//input[@formcontrolname='transferFrom']"));
		  wait.until(ExpectedConditions.visibilityOf(element3));
		  element3.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()='union bank'])[1]")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//span[normalize-space()='union bank'])[1]"));
		  
		  WebElement element4=driver.findElement(By.xpath("//input[@formcontrolname='transferTo']"));
		  wait.until(ExpectedConditions.visibilityOf(element4));
		  element4.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()='union bank'])[1]")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[normalize-space()='Cash in hand']"));
	 	
	 	
//	 	HelperClass.safeSendKeys(By.xpath("//ng-select[@formcontrolname='fromfundId']"), "Restricted income funds");
//	 	banktransferlocators.Restrictedfund.click();
//	 	HelperClass.safeSendKeys(By.xpath("//ng-select[@formcontrolname='fundId']"), "Restricted income funds");
//	 	banktransferlocators.Restrictedfund.click();

	 	banktransferlocators.Amountinbanktransfer.sendKeys("1000");
	 	banktransferlocators.reference.sendKeys("RF1");
	}
	
	public void Clearformandvalidate() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
//		Thread.sleep(1000);
		banktransferlocators.clearform.click();
		try {
	 		    String actualText = HelperClass.getText(By.xpath("//input[@formcontrolname='amount']"));
	 		    System.out.println(actualText.equals("") ? "Clear form is done" : "clear form is not done");
	 		} catch (Exception e) {
	 		    System.out.println("Error finding or comparing text: " + e.getMessage());
	 		}	
	}
	
	public void clickonsaveandExit_BankTransfer() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
//		Thread.sleep(1000);
		banktransferlocators.saveandexit.click();
		Thread.sleep(2000);
		try {
	 		    String actualText = HelperClass.getText(By.xpath("//span[text()='Add Bank Transfer']"));
	 		    System.out.println(actualText.equals("Add Bank Transfer") ? "Bank Tranfer Page" : "Not a BanTranfer page");
	 		} catch (Exception e) {
	 		    System.out.println("Error finding or comparing text: " + e.getMessage());
	 		}	
	}
	public void ClickonExportsonBankTransfer() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	 Thread.sleep(2000);
	 HelperClass.ClickUsingJS(driver, By.xpath("(//mat-icon[text()='more_vert']/parent::button)[1]"));
	// HelperClass.ClickDropdown(By.xpath("(//button[@aria-haspopup='menu']/span/mat-icon[normalize-space()='more_vert'])[1]"));
//    Thread.sleep(2000);
	 HelperClass.ClickUsingJS(driver, By.xpath("//span[text()='Export As PDF ']"));

	 Thread.sleep(3000);
	 HelperClass.ClickUsingJS(driver, By.xpath("(//mat-icon[text()='more_vert']/parent::button)[1]"));
//	 Thread.sleep(1000);
  	 HelperClass.ClickUsingJS(driver,By.xpath("//span[text()='Export to Excel ']"));
  	 Thread.sleep(6000);
	 HelperClass.ClickUsingJS(driver, By.xpath("(//mat-icon[text()='more_vert']/parent::button)[1]"));
//    Thread.sleep(1000);
	    HelperClass.ClickUsingJS(driver, By.xpath("//span[text()='Export to CSV ']"));
}
	
public void ValidateStatusAllDropdown() throws InterruptedException {
	 HelperClass.selectFromNgSelectDropdown(HelperClass.getDriver(), "//ng-select[@panelclass='mat-select-position']", "Active");
  	 Thread.sleep(2000);
     HelperClass.verifyStatusTypes(HelperClass.getDriver(), "//td/div/div[normalize-space()='Active']", "Active");
     Thread.sleep(2000);
     HelperClass.waitForPageToLoad(driver);
  	 HelperClass.selectFromNgSelectDropdown(HelperClass.getDriver(), "//ng-select[@panelclass='mat-select-position']", "Inactive");
  	 Thread.sleep(2000);
      HelperClass.verifyStatusTypes(HelperClass.getDriver(), "//td/div/div[normalize-space()='Active']", "Inactive");
}
	
public void clickonBankFeed() throws InterruptedException {
	HelperClass.ClickUsingJS(driver, By.xpath("//a[text()=' Bank ']"));
	Thread.sleep(2000);
	HelperClass.waitForPageToLoad(driver);
	 Thread.sleep(2000);
//	 HelperClass.scrollToElement(By.xpath("//a[text()=' Bank Feed ']"));
	 HelperClass.ClickUsingJS(driver, By.xpath("//a[text()=' Bank Feed ']"));
	 Thread.sleep(2000);
	 try {
	 		    String actualText = HelperClass.getText(By.xpath("//span[text()=' Link Bank Account']"));
	 		    System.out.println(actualText.contains("Link") ? "Bank Feed Page" : "Not a Feed page");
	 		} catch (Exception e) {
	 		    System.out.println("Error finding or comparing text: " + e.getMessage());
	 		}	
}

public void ClickonLinkBankAccount() throws InterruptedException {
	HelperClass.waitForPageToLoad(driver);
	 Thread.sleep(2000);
	 HelperClass.ClickUsingJS(driver, By.xpath("//span[text()=' Link Bank Account']"));
	 try {
	 		    String actualText = HelperClass.getText(By.xpath("//h2[text()='Link Bank Account']"));
	 		    System.out.println(actualText.contains("Link Bank Account") ? "Link Bank Account Page" : "Not a Link Bank Account page");
	 		} catch (Exception e) {
	 		    System.out.println("Error finding or comparing text: " + e.getMessage());
	 		}	
}
//Step8:Verify the Dropdown
	public void ValidateTypeDropdown() {
	WebDriver driver = HelperClass.getDriver();
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // increased wait

	By dropdownXpath = By.xpath(
			"(//ng-select[@panelclass='mat-select-position']//div[contains(@class,'ng-select-container')])[1]");
	By optionsXpath = By.xpath("//ng-dropdown-panel//div[@role='option']/span");
	By spinnerOverlay = By.xpath("//div[contains(@class,'ngx-spinner-overlay')]");

	try {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(spinnerOverlay));
	} catch (Exception e) {
		System.out.println("Spinner overlay still visible, continuing anyway...");
	}

	WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownXpath));
	try {
		wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
	} catch (Exception e) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", dropdown);
	}

	wait.until(ExpectedConditions.visibilityOfElementLocated(optionsXpath));
	List<WebElement> optionElements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(optionsXpath));

	List<String> optionTexts = new ArrayList<>();
	for (WebElement option : optionElements) {
		optionTexts.add(option.getText().trim());
	}

	for (String text : optionTexts) {
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(spinnerOverlay));
		} catch (Exception e) {
		}

		WebElement dropdownAgain = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownXpath));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(dropdownAgain)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", dropdownAgain);
		}

		By specificOption = By
				.xpath("//ng-dropdown-panel//span/div[normalize-space(text())='" + text + "']");
		WebElement optionToSelect = wait.until(ExpectedConditions.elementToBeClickable(specificOption));
		optionToSelect.click();

//		HelperClass.sleep2(2);
//		Hooks.captureScreenshotBase64(driver, Hooks.getScenarioTest(), "Chart view for: " + text);
//		Log.info("Selected filter: " + text, "Pratham", "Jobs Filter");
		System.out.println("Dropdown verified Successfully.");
		}
	}
	
	public void ClickoncheckboxineditbanktranferpageandverifytheenablingoptionsBT() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banktransferlocators.editiconjournal);
		Thread.sleep(4000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banktransferlocators.checkboxinedit);
		try {
			if (banktransferlocators.deleteinedit.isDisplayed() && banktransferlocators.copyinedit.isDisplayed() &&
					banktransferlocators.exporttoexcelinedit.isDisplayed() && banktransferlocators.exporttocsvinedit.isDisplayed() && 
					banktransferlocators.exporttopdfinedit.isDisplayed() && banktransferlocators.printinedit.isDisplayed() && 
					banktransferlocators.inactiveinedit.isDisplayed() && banktransferlocators.activeinedit.isDisplayed()) {
			    System.out.println(" All option are displaying succesfully");
			} else {
			    System.out.println(" All option are not displaying");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
		
	}
	
	public void ClickoncheckboxinmaingridandverifytheenablingoptionsBT() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banktransferlocators.checkboxinedit);
		try {
			if (banktransferlocators.deleteinedit.isDisplayed() && banktransferlocators.copyinedit.isDisplayed() &&
					banktransferlocators.exporttoexcelinedit.isDisplayed() && banktransferlocators.exporttocsvinedit.isDisplayed() && 
					banktransferlocators.exporttopdfinedit.isDisplayed() && banktransferlocators.printinedit.isDisplayed() && 
					banktransferlocators.inactiveinedit.isDisplayed() && banktransferlocators.activeinedit.isDisplayed()) {
			    System.out.println("All option are displaying succesfully");
			} else {
			    System.out.println(" All option are not displaying");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
		
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banktransferlocators.copyinedit);
		Thread.sleep(3000);
		try {
			if (banktransferlocators.copysuccessmessage.isDisplayed()) {
			    System.out.println("copy clicked successfully");
			} else {
			    System.out.println("copy not clicked");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
		Thread.sleep(2000);
	}
	
	
	public void ClickonbanktranferidandverifythepopupBT() throws InterruptedException {
	
		HelperClass.ClickUsingJS(driver, By.xpath("//a[text()=' BNK - 1 ']"));
		Thread.sleep(2000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[text()='Bank Detail']"))) {
		        System.out.println("Bank details are opened successfully");
		    } else {
		        System.out.println("Bank details are not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickondoublearrowsineditbanktranferpageandverifythedetailboxesareopeningorclosingBT() throws InterruptedException {
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banktransferlocators.editiconjournal);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banktransferlocators.openarrowinaddjournal);
		
		try {
		if (banktransferlocators.closerrowinaddjournal.isDisplayed()) {
		    System.out.println("bank transfer boxes are closed succssfully");
		} else {
		    System.out.println("Boxed are not closed");
		}
		} catch (Exception e) {
		    System.out.println("An error occurred " + e.getMessage());
		}
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banktransferlocators.closerrowinaddjournal);
		Thread.sleep(2000);
		
		try {
			if (banktransferlocators.tranferdateele.isDisplayed()) {
			    System.out.println("bank transfer boxes are opened succssfully");
			} else {
			    System.out.println("Boxed are not opened");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
	}
	
	public void verifysearchbarinmaingridBT() throws InterruptedException {
		
		Thread.sleep(5000);
		banktransferlocators.searchbarinmaingrid.sendKeys("cash in hand" + Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> referenceCells = HelperClass.getDriver()
				.findElements(By.xpath("//span[text()=' Cash in hand']"));
		System.out.println(referenceCells);

		for (WebElement cell : referenceCells) {
			String actual = cell.getText().trim();
			if (actual.contains("Cash in hand")) {
				System.out.println("Matched: " + actual);
			} else {
				System.out.println("Mismatch: " + actual);
			}
		}
	}
	
	public void ClickonplussymbolineditbanktransferpageBT() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banktransferlocators.editiconjournal);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banktransferlocators.plusineditjournal);
		Thread.sleep(2000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Bank Transfer']"))) {
		        System.out.println("successfully navigated to add new bank transfer page");
		    } else {
		        System.out.println("add new bank transfer page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void VerifysearchiconandcrossmarkineditbanktransferpageBT() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banktransferlocators.editiconjournal);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banktransferlocators.searchineditpage);
		Thread.sleep(2000);
		banktransferlocators.searchTFineditpage.sendKeys("1");
		Thread.sleep(2000);
		 String actualText = HelperClass.getText(By.xpath("//a[@class='list-name clamp']")).trim();
			String expected = "1";
			try {
			if (actualText.contains(expected)) {
			    System.out.println(" Found the bank transfer");
			} else {
			    System.out.println("Text not matched. Actual: " + actualText);
			}
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			HelperClass.ClickUsingJS(HelperClass.getDriver(), banktransferlocators.crossmarkinsearch);
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

}




















