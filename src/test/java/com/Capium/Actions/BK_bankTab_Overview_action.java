package com.Capium.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.BK_banktab_locators;
import com.Capium.Utilies.ExcelUtils;
import com.Capium.Utilies.HelperClass;

public class BK_bankTab_Overview_action {

	BK_banktab_locators banklocators=null;
	
	String Quickentrypath="C:\\Users\\user\\Downloads\\Bookkeeping_5.0 (2)\\Bookkeeping_5.0\\Bookkeeping_5.0\\src\\test\\resources\\Files\\Quick entry.xlsx";
	WebDriver driver=HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	
	public BK_bankTab_Overview_action() {
		this.banklocators = new BK_banktab_locators();
		PageFactory.initElements(HelperClass.getDriver(), banklocators);
		}
	
	public void navigatetoinsidetheclientandverifyBK() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.searchTFindashboard);
		Thread.sleep(3000);
		banklocators.searchTFindashboard.sendKeys("Journal" + Keys.ENTER);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.newclientid);
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
	
	public void navigatetobankandverifyBK() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.banktab);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.overviewtab);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Add Bank Account']"))) {
		        System.out.println("Bank overview tab is navigated successfully");
		    } else {
		        System.out.println("Bank overview tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void addbankBK() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.addbankbtn);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[text()='Add Custom Accounts']"))) {
		        System.out.println("add bank popup opened successfully");
		    } else {
		        System.out.println("add bank popup not  opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		Thread.sleep(4000);
		banklocators.accountnameTF.sendKeys("baroda bank");
		Thread.sleep(4000);
		banklocators.nominalTF.sendKeys("1234567");
		Thread.sleep(4000);
		
		WebElement element3=driver.findElement(By.xpath("//ng-select[@formcontrolname='bankAccountType']"));
		  wait.until(ExpectedConditions.visibilityOf(element3));
		  element3.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Savings ']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()=' Savings ']"));
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.bankaccounttypeDD);
		Thread.sleep(2000);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.savingsoption);
		banklocators.accountnumber.sendKeys("23456789");
		Thread.sleep(3000);
		banklocators.accountnameTF.sendKeys("baroda bank");
		banklocators.savebtn.click();
		Thread.sleep(3000);
	}
	
	public void verifyaddedbankBK() throws InterruptedException {
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//p[text()='baroda bank']"))) {
		        System.out.println("add bank popup opened successfully");
		    } else {
		        System.out.println("add bank popup not  opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void editthebankBK() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.editicon);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Edit Custom Account ']"))) {
		        System.out.println("edit bank page opened successfully");
		    } else {
		        System.out.println("edit bank page not  opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		Thread.sleep(3000);
		banklocators.accountnameTF.clear();
		Thread.sleep(3000);
		banklocators.accountnameTF.sendKeys("union bank");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.saveandexit);
		Thread.sleep(3000);
	}
	
	public void  verifytheeditedbank() throws InterruptedException {
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//p[text()='union bank']"))) {
		        System.out.println("bank edited successfully");
		    } else {
		        System.out.println("bank not edited");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifyenableoptionsineditbankpageBK() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.editicon);
		
		Thread.sleep(4000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.checkboxinedit);
		try {
			if (banklocators.deleteinedit.isDisplayed() && banklocators.copyinedit.isDisplayed() &&
					banklocators.exporttoexcelinedit.isDisplayed() && banklocators.exporttocsvinedit.isDisplayed() && 
					banklocators.exporttopdfinedit.isDisplayed() && banklocators.printinedit.isDisplayed() && 
					banklocators.inactiveinedit.isDisplayed() && banklocators.activeinedit.isDisplayed()) {
			    System.out.println(" All option are displaying succesfully");
			} else {
			    System.out.println(" All option are not displaying");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}	
	}
	
	public void ClickonplussymbolinbankmainmenuBK() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.banktab);
		//Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.plusinmainmenu);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[text()='Add Custom Accounts']"))) {
		        System.out.println("successfully navigated to add new bank page");
		    } else {
		        System.out.println("add new bank page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void VerifysearchiconandcrossmarkineditbankpageBK() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.editicon);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.searchineditpage);
		Thread.sleep(2000);
		banklocators.searchTFineditpage.sendKeys("union");
		Thread.sleep(2000);
		 String actualText = HelperClass.getText(By.xpath("//a[normalize-space()='union bank']")).trim();
			String expected = "union";
			try {
			if (actualText.contains(expected)) {
			    System.out.println(" Found the bank");
			} else {
			    System.out.println("Text not matched. Actual: " + actualText);
			}
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.crossmarkinsearch);
			Thread.sleep(2000);
			String actualText1 = HelperClass.getText(By.xpath("//input[@placeholder='Search']")).trim();
			String expected1 = "2";
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
	
	public void ClickondoublearrowsineditbankpageandverifythedetailboxesareopeningorclosingBK() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.editicon);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.openarrowinaddjournal);
		
		try {
		if (banklocators.closerrowinaddjournal.isDisplayed()) {
		    System.out.println("bank detail boxes are closed succssfully");
		} else {
		    System.out.println("Boxed are not closed");
		}
		} catch (Exception e) {
		    System.out.println("An error occurred " + e.getMessage());
		}
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.closerrowinaddjournal);
		Thread.sleep(2000);

		try {
			if (banklocators.accountgrpele.isDisplayed()) {
			    System.out.println("Bank detail boxes are opened succssfully");
			} else {
			    System.out.println("Boxed are not opened");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
	}
	
	public void verifysearchbarinmaingridBK() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.cashinhandeles);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.cashinhandeles);
		Thread.sleep(5000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.searchbarinmaingrid);
		Thread.sleep(2000);
		banklocators.searchbarinmaingrid.sendKeys("JNL - 8" + Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> referenceCells = HelperClass.getDriver()
				.findElements(By.xpath("//span[@title='JNL - 8']"));
		System.out.println(referenceCells);

		for (WebElement cell : referenceCells) {
			String actual = cell.getText().trim();
			if (actual.contains("JNL - 8")) {
				System.out.println("Matched: " + actual);
			} else {
				System.out.println("Mismatch: " + actual);
			}
		}
	}
	
	public void addonetransactionfrommanualimportBK() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.manualimport);
		Thread.sleep(2000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//p[contains(@class,'header')]"))) {
		        System.out.println("manual import page opened succesfully");
		    } else {
		        System.out.println("manual import page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		banklocators.descriptionTF.sendKeys("description for payment");
		banklocators.paidoutTF.sendKeys("500");
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.addnewline);
		Thread.sleep(2000);
		banklocators.descriptionTF2.sendKeys("description for receipt");
		banklocators.paidinTF2.sendKeys("500");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.saveandexit);
		Thread.sleep(7000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Add Bank Account']"))) {
		        System.out.println("Bank overview tab is navigated successfully");
		    } else {
		        System.out.println("Bank overview tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
	}
	
	public void exportthetransactionBK() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.exporttopdf);
		Thread.sleep(20000);
		
		//Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.exporttoexcel);
		Thread.sleep(20000);
	}
	
	
	public void importthetransactionsBK() throws InterruptedException, AWTException {
		
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.importoption);
		Thread.sleep(20000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.browser);
		Thread.sleep(20000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.browser);
		WebElement browser = driver.findElement(By.xpath("//button[@class='file-upload-button primary-button']"));
        browser.click();
        Thread.sleep(2000);
 
        // Path of file to upload
        String filePath = "C:\\Users\\user\\Downloads\\BankEntry_16092025_0212.xlsx";
 
 
        // Robot logic
        Robot robot = new Robot();
 
        // Copy file path to clipboard
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        Thread.sleep(3000);
        // Paste path using CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
 
        Thread.sleep(3000);
 
        // Press ENTER
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(20000);
        HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.savebtn);
        Thread.sleep(3000);
	}
	
	public void addquickjournalfromthekebabBK() throws InterruptedException {
		
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.quickjournal);
		Thread.sleep(2000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[text()='Quick Journal']"))) {
		        System.out.println("Quick journal popup opened successfully");
		    } else {
		        System.out.println("Quick journal popup not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		Thread.sleep(4000);
		WebElement element=driver.findElement(By.xpath("//ng-select[@bindlabel='name']"));
		  wait.until(ExpectedConditions.visibilityOf(element));
		  element.click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='1510 - Amortisation of Goodwill']")));
		 // HelperClass.waitUntilVisible(By.xpath("//mat-form-field[contains(@class,'w-200')]"));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='1510 - Amortisation of Goodwill']"));
		
		
//		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[@bindlabel='name']", "1510-Amortisation Of Goodwill");
		Thread.sleep(5000);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.entryforaccountDD);
//		Thread.sleep(5000);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.accountcodeoption);
		Thread.sleep(2000);
		banklocators.amountreceivedTF.sendKeys("3000");
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.saveandexit);
	}
	
	public void verifythejournalBK() throws InterruptedException {
		Thread.sleep(2000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//p[text()='The operation completed Successfully!']"))) {
		        System.out.println("Quick journal added succesfully");
		    } else {
		        System.out.println("Quick journal not added");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	
	public void docashcodingBK() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.cashcoding);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Cash Coding ']"))) {
		        System.out.println("cash coding page opened successfully");
		    } else {
		        System.out.println("cash coding page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		Thread.sleep(5000);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//input[@type='checkbox']"));
		banklocators.checkboxcashcode.click();
		Thread.sleep(4000);
		
		WebElement element=driver.findElement(By.xpath("(//div[contains(@class,'ng-select-container')])[3]"));
		  wait.until(ExpectedConditions.visibilityOf(element));
		  element.click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='1510 - Amortisation of Goodwill']")));
		 // HelperClass.waitUntilVisible(By.xpath("//mat-form-field[contains(@class,'w-200')]"));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='1510 - Amortisation of Goodwill']"));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.saveandexit);
	}
	
	public void VerifythecashcodingBK() throws InterruptedException {
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//p[text()='The operation completed Successfully!']"))) {
		        System.out.println("Cash coding added succesfully");
		    } else {
		        System.out.println("cash coding not added");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void clickonbankreconcilationiconBK() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.reconcileicon);
		Thread.sleep(2000);
	}
	
	public void verifybankreconcilationBK() {
		try {
		    if (HelperClass.isElementPresent(By.xpath("//p[text()='Select Bank:']"))) {
		        System.out.println("cash coding page opened successfully");
		    } else {
		        System.out.println("cash coding page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonjournaloptioninactiondropdownBK() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.actiondropdown);
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Journals");
		
	}
	
	public void verifythejournaltabfromactiondropdownintaskBK() throws InterruptedException {
		Thread.sleep(2000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Journal']"))) {
		        System.out.println("successfully navigated to add new journal page");
		    } else {
		        System.out.println("add new journal page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonpaymentoptioninactiondropdownBK() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.datecolumn);
		Thread.sleep(3000);
		String actualText = HelperClass.getText(By.xpath("(//table/tbody/tr/td[ng-select]//preceding-sibling::td[5])[1]")).trim();
		String expected = " £ 0.00";
		try {
		if (actualText.contains(expected)) {
			Thread.sleep(5000);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Payment");
			Thread.sleep(2000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Create New Payment']"))) {
			        System.out.println("Create payment page navigated successfully");
			    } else {
			        System.out.println("Create payment page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred : " + e.getMessage());
			}
		} else {
			Thread.sleep(5000);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Receipt");
			Thread.sleep(2000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Create New Receipt']"))) {
			        System.out.println("Create receipt page navigated succesfully");
			    } else {
			        System.out.println("Create receipt page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		}
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifythepaymentforpaymentsBK() throws InterruptedException {
		Thread.sleep(2000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Create New Payment']"))) {
		        System.out.println("Create payment page navigated succesfully");
		    } else {
		        System.out.println("Create payment page is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonbanktransferoptioninactiondropdownBK() throws InterruptedException {
		Thread.sleep(5000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[3]", "Bank Transfer");
	}
	
	public void verifythebanktransferBK () throws InterruptedException {
		Thread.sleep(2000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Bank Transfer']"))) {
		        System.out.println("Bank transfer page navigated succesfully");
		    } else {
		        System.out.println("Bank transfer page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonpurchaseoptioninactiondropdownBK() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.datecolumn);
		Thread.sleep(3000);
		String actualText = HelperClass.getText(By.xpath("(//table/tbody/tr/td[ng-select]//preceding-sibling::td[5])[1]")).trim();
		String expected = " £ 0.00";
		try {
		if (actualText.contains(expected)) {
			Thread.sleep(5000);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Purchase");
			Thread.sleep(2000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Purchase']"))) {
			        System.out.println("add invoice page navigated successfully");
			    } else {
			        System.out.println("add invoice page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		} else {
			Thread.sleep(5000);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Invoices");
			Thread.sleep(2000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Invoice']"))) {
			        System.out.println("add invoice page navigated succesfully");
			    } else {
			        System.out.println("add invoice page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		}
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonmatchjournaloptioninactiondropdownBK() throws InterruptedException {
		Thread.sleep(5000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Match Journal");
		Thread.sleep(2000);
	}
	
	public void ClickonmatchquickentryoptioninactiondropdownBK() throws InterruptedException {
		String netamountpayment = HelperClass.getText(By.xpath("(//table/tbody/tr/td[ng-select]//preceding-sibling::td[4])[1]")).trim();
		Thread.sleep(3000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.invoicescrollelement);
		Thread.sleep(2000);
		String invoicedate = HelperClass.getText(By.xpath("(//table/tbody/tr/td[ng-select]//preceding-sibling::td[9])[1]")).trim();
		Thread.sleep(2000);
		String actualText = HelperClass.getText(By.xpath("(//table/tbody/tr/td[ng-select]//preceding-sibling::td[5])[1]")).trim();
		String expected = "£ 0.00";
		
		System.out.println(netamountpayment);
		System.out.println(invoicedate);
		if (actualText.contains(expected)) {
			
			Thread.sleep(2000);
		
//			HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.quickentrytab);
//			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.quickentrytab);
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[normalize-space(text())='Add Quick Entry']"));
			String actualtext1 = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Quick Entry']"));
			String expected1 = "Add New Quick Entry";
			try {
			    if (actualtext1.equals(expected1)) {
			        System.out.println("Add New Quick Entry verified");
			    } else {
			        System.out.println("Add New Quick Entry not verified");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Add New Quick Entry: " + e.getMessage());
			}
			
			Thread.sleep(2000);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//mat-form-field[@appearance='fill'])[1]", "Payment");
			  Thread.sleep(5000);
			  
//			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-select[normalize-space(@formcontrolname)='type']"));
//			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[normalize-space(text())='Receipt']//parent::span"));
//			  Thread.sleep(2000);
//			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-form-field[contains(@class,'w-200')]", "1670 - Amortisation of Intellectual property");
//			  Thread.sleep(2000);
			  WebElement element=driver.findElement(By.xpath("//mat-form-field[contains(@class,'w-200')]"));
			  wait.until(ExpectedConditions.visibilityOf(element));
			  element.click();
			  Thread.sleep(5000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//mat-optgroup//mat-option/span)[2]")));
			 // HelperClass.waitUntilVisible(By.xpath("//mat-form-field[contains(@class,'w-200')]"));
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//mat-optgroup//mat-option/span)[2]"));
			  
			  
			  
		      banklocators.Netamountinquickentry.sendKeys(netamountpayment +Keys.ENTER);
		      banklocators.invoicedate.clear();
		      banklocators.invoicedate.sendKeys(invoicedate);
		      banklocators.paymentdates.clear();
		      banklocators.paymentdates.sendKeys(invoicedate);
		      
		      WebElement element1=driver.findElement(By.xpath("(//mat-form-field[contains(@class,'w-120')])[3]"));
			  wait.until(ExpectedConditions.visibilityOf(element1));
			  element1.click();
			  Thread.sleep(5000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option/span/div[normalize-space()='sbi']")));
			 // HelperClass.waitUntilVisible(By.xpath("//mat-form-field[contains(@class,'w-200')]"));
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-option/span/div[normalize-space()='sbi']"));
			  Thread.sleep(2000);
		     
		  	banklocators.saveandexit.click();
		  	Thread.sleep(1000);
		  	String actualtext3 = HelperClass.getText(By.xpath("//p[normalize-space(text())='The operation completed Successfully!']"));
		  	String expected3 = "The operation completed Successfully!";
		  	try {
		  	    if (actualtext3.equals(expected3)) {
		  	        System.out.println("The operation completed Successfully!");
		  	    } else {
		  	        System.out.println("The operation not completed");
		  	    }
		  	} catch (Exception e) {
		  	    System.out.println("An error occurred while verifying success message: " + e.getMessage());
		  	}
		  	
		  	Thread.sleep(3000);
//			HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.banktab);
//			Thread.sleep(3000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.overviewtab);
			Thread.sleep(3000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Add Bank Account']"))) {
			        System.out.println("Bank overview tab is navigated successfully");
			    } else {
			        System.out.println("Bank overview tab is not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			
			Thread.sleep(2000);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//table/tbody/tr/td//ng-select[@panelclass='mat-select-position'])[1]", "Match Quick entry");
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.addlinkforquickentry);
		}
		
		
		
		
		
		
		
		
//		Thread.sleep(2000);
//		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//table/tbody/tr/td//ng-select[@panelclass='mat-select-position'])[1]", "Match Quick Entry");
//		Thread.sleep(2000);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.addlinkforquickentry);
	}


	public void ClickonmultipletransactionoptioninactiondropdownBK() throws InterruptedException {

		Thread.sleep(4000);
		WebElement element1=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[2]"));
		  wait.until(ExpectedConditions.visibilityOf(element1));
		  element1.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Multiple Transactions']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Multiple Transactions']"));
		  
		Thread.sleep(2000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.multipletransactioninDD);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[normalize-space()='Multiple Transactions']"))) {
		        System.out.println("Multiple transaction popup is opened succesfully");
		    } else {
		        System.out.println("Multiple transaction popup is not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		Thread.sleep(4000);
		WebElement element=driver.findElement(By.xpath("//div[contains(@class,'mat-mdc-form-field-infix ng-tns-c20-62')]"));
		  wait.until(ExpectedConditions.visibilityOf(element));
		  element.click();
		 
		  try {
			    if (HelperClass.isElementPresent(By.xpath("//span[text()='Receipt']"))) {
			    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Receipt']")));
					  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Receipt']"));
					  
					  Thread.sleep(2000);
					  if (HelperClass.isElementPresent(By.xpath("//h2[text()='Add Receipt']"))) {
					    	System.out.println("add receipt popup opened successfully");
					    } else {
					    	System.out.println("add receipt popup not opened");	
					    }
					  Thread.sleep(4000);
						WebElement element2=driver.findElement(By.xpath("//ng-select[@formcontrolname='contact']"));
						  wait.until(ExpectedConditions.visibilityOf(element2));
						  element2.click();
						  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='cus 1']")));
						  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='cus 1']"));
						  Thread.sleep(2000);
						  HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.amountnameTFinmultidd);
						  banklocators.amountnameTFinmultidd.sendKeys("1000");
						  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' Add ']"));
						  banklocators.savebtn.click();
						  Thread.sleep(1000);
						  if (HelperClass.isElementPresent(By.xpath("//p[text()='Balance amount should be 0']"))) {
						    	System.out.println("adding receipt for under multi transaction is proccessing");
						    } else {
						    	System.out.println("adding receipt for under multi transaction is not proccessing");	
						    }
			    } else {
			    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Payment']")));
					  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Payment']"));
					  Thread.sleep(2000);
					  if (HelperClass.isElementPresent(By.xpath("//h2[text()='Add Payment']"))) {
					    	System.out.println("add payment popup opened successfully");
					    } else {
					    	System.out.println("add payment popup not opened");	
					    }
					  Thread.sleep(4000);
						WebElement element3=driver.findElement(By.xpath("//ng-select[@formcontrolname='contact']"));
						  wait.until(ExpectedConditions.visibilityOf(element3));
						  element3.click();
						  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Subcontractor  1']")));
						  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Subcontractor  1']"));
						  Thread.sleep(2000);
						  HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.amountnameTFinmultidd);
						  banklocators.amountnameTFinmultidd.sendKeys("1000");
						  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' Add ']"));
						  banklocators.savebtn.click();
						  Thread.sleep(1000);
						  if (HelperClass.isElementPresent(By.xpath("//p[text()='Balance amount should be 0']"))) {
						    	System.out.println("adding payment for under multi transaction is proccessing");
						    } else {
						    	System.out.println("adding payment for under multi transaction is not proccessing");	
						    }
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		  
	}
	
	public void ClickonmultipletransactionoptionforjournalinactiondropdownBK() throws InterruptedException {
		
		Thread.sleep(4000);
		WebElement element1=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[2]"));
		  wait.until(ExpectedConditions.visibilityOf(element1));
		  element1.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Multiple Transactions']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Multiple Transactions']"));
		  
		Thread.sleep(2000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.multipletransactioninDD);
		
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[normalize-space()='Multiple Transactions']"))) {
		        System.out.println("Multiple transaction popup is opened succesfully");
		    } else {
		        System.out.println("Multiple transaction popup is not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		Thread.sleep(4000);
		WebElement element=driver.findElement(By.xpath("//div[contains(@class,'mat-mdc-form-field-infix ng-tns-c20-62')]"));
		  wait.until(ExpectedConditions.visibilityOf(element));
		  element.click();
		  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Journal']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Journal']"));
		  
		  Thread.sleep(2000);
		  if (HelperClass.isElementPresent(By.xpath("//h2[text()='Add Journal']"))) {
		    	System.out.println("add journal popup opened successfully");
		    } else {
		    	System.out.println("add journal popup not opened");	
		    }
		  
		  
		  Thread.sleep(4000);
			WebElement element2=driver.findElement(By.xpath("(//mat-form-field[@appearance='fill'])[5]"));
			  wait.until(ExpectedConditions.visibilityOf(element2));
			  element2.click();
			  Thread.sleep(5000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' 8450 - Accrued expenses ']")));
			 // HelperClass.waitUntilVisible(By.xpath("//mat-form-field[contains(@class,'w-200')]"));
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' 8450 - Accrued expenses ']"));
			  
			  
			  Thread.sleep(2000);
			  HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.amountnameTFinmultidd);
			  banklocators.amountnameTFinmultidd.sendKeys("1000");
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' Add ']"));
			  banklocators.savebtn.click();
			  Thread.sleep(1000);
			  if (HelperClass.isElementPresent(By.xpath("//p[text()='Balance amount should be 0']"))) {
			    	System.out.println("adding journal for under multi transaction is proccessing");
			    } else {
			    	System.out.println("adding journal for under multi transaction is not proccessing");	
			    }
	}
	
	public void ClickoninvoiceoptioninactiondropdownBK() throws InterruptedException {
		
		Thread.sleep(3000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.datecolumn);
		Thread.sleep(3000);
		String actualText = HelperClass.getText(By.xpath("//table/tbody/tr/td[6]/div")).trim();
		String expected = " £ 0.00";
		try {
		if (actualText.contains(expected)) {
			Thread.sleep(5000);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Purchase");
			Thread.sleep(2000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Purchase']"))) {
			        System.out.println("add invoice page navigated successfully");
			    } else {
			        System.out.println("add invoice page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		} else {
			Thread.sleep(5000);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Invoices");
			Thread.sleep(2000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Invoice']"))) {
			        System.out.println("add invoice page navigated succesfully");
			    } else {
			        System.out.println("add invoice page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		}
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void AndClickonreceiptsoptioninactiondropdownBK() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.datecolumn);
		Thread.sleep(3000);
		String actualText = HelperClass.getText(By.xpath("//table/tbody/tr/td[6]/div")).trim();
		String expected = " £ 0.00";
		try {
		if (actualText.contains(expected)) {
			Thread.sleep(5000);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Payment");
			Thread.sleep(2000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Create New Payment']"))) {
			        System.out.println("Create payment page navigated successfully");
			    } else {
			        System.out.println("Create payment page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		} else {
			Thread.sleep(5000);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Receipt");
			Thread.sleep(2000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Create New Receipt']"))) {
			        System.out.println("Create receipt page navigated succesfully");
			    } else {
			        System.out.println("Create receipt page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		}
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifytheperioddropdownBK() throws InterruptedException {
		Thread.sleep(5000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[text()='01-Jan-2025 - 31-Dec-2025']", "All Years");
	}
	
	public void verifythetypedropdownBK() throws InterruptedException {
		Thread.sleep(5000);
//		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@role='combobox'])[1]", "Journals");
		
		Thread.sleep(4000);
		WebElement element1=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[1]"));
		  wait.until(ExpectedConditions.visibilityOf(element1));
		  element1.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Journals']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Journals']"));
		Thread.sleep(2000);
		List<WebElement> referenceCells = HelperClass.getDriver()
				.findElements(By.xpath("//a[@class='link wmx-100 clamp ng-star-inserted']"));
		System.out.println(referenceCells);

		for (WebElement cell : referenceCells) {
			String actual = cell.getText().trim();
			if (actual.contains("JNL")) {
				System.out.println("Matched: " + actual);
			} else {
				System.out.println("Mismatch: " + actual);
			}
		}
		
		Thread.sleep(4000);
		WebElement element2=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[1]"));
		  wait.until(ExpectedConditions.visibilityOf(element2));
		  element2.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Receipts']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Receipts']"));
		Thread.sleep(2000);
		List<WebElement> referenceCells2 = HelperClass.getDriver()
				.findElements(By.xpath("//a[@class='link wmx-100 clamp ng-star-inserted']"));
		System.out.println(referenceCells2);

		for (WebElement cell : referenceCells2) {
			String actual = cell.getText().trim();
			if (actual.contains("REC")) {
				System.out.println("Matched: " + actual);
			} else {
				System.out.println("Mismatch: " + actual);
			}
		}
		
		

		Thread.sleep(4000);
		  wait.until(ExpectedConditions.visibilityOf(element2));
		  element2.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Payment']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Payment']"));
		Thread.sleep(2000);
		List<WebElement> referenceCells3 = HelperClass.getDriver()
				.findElements(By.xpath("//a[@class='link wmx-100 clamp ng-star-inserted']"));
		System.out.println(referenceCells3);

		for (WebElement cell : referenceCells3) {
			String actual = cell.getText().trim();
			if (actual.contains("PAY")) {
				System.out.println("Matched: " + actual);
			} else {
				System.out.println("Mismatch: " + actual);
			}
		}
		
		Thread.sleep(4000);
		  wait.until(ExpectedConditions.visibilityOf(element2));
		  element2.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Bank Transfers']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Bank Transfers']"));
		Thread.sleep(2000);
		List<WebElement> referenceCells4 = HelperClass.getDriver()
				.findElements(By.xpath("//a[@class='link wmx-100 clamp ng-star-inserted']"));
		System.out.println(referenceCells4);

		for (WebElement cell : referenceCells4) {
			String actual = cell.getText().trim();
			if (actual.contains("BNK")) {
				System.out.println("Matched: " + actual);
			} else {
				System.out.println("Mismatch: " + actual);
			}
		}
		
	}
	
	public void VerifydownloadandeditoptionsinjournalidincashinhandBK() throws InterruptedException {
		
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.cashinhandeles);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.cashinhandeles);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()=' JNL - 8 ']"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//b[text()='Journal']"))) {
		        System.out.println("Journal details page opened successfully");
		    } else {
		        System.out.println("Journal details page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[text()='save_alt']"));
		Thread.sleep(5000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//mat-icon[text()='edit'])[17]"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Edit Journal ']"))) {
		        System.out.println("Edit Journal page opened successfully");
		    } else {
		        System.out.println("Edit Journal page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifyexportoptionsundercashinhandBK() throws InterruptedException {
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.cashinhandeles);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.cashinhandeles);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[text()='picture_as_pdf']"));
		Thread.sleep(9000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[text()='border_all']"));
		Thread.sleep(5000);
	}
	
	public void verifythebanktransferdetailsthroughbanktranferidinparticularbankBK() {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()=' BNK - 1 ']"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[text()='Bank Detail']"))) {
		        System.out.println("Bank tranfer details opened successfully");
		    } else {
		        System.out.println("Bank tranfer details not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifythereceiptdetailsthroughreceiptidinparticularbankBK() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()=' REC-1 ']"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//b[text()='Receipt']"))) {
		        System.out.println("Receipt details opened successfully");
		    } else {
		        System.out.println("Receipt details not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[text()='save_alt']"));
		Thread.sleep(5000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//mat-icon[text()='edit'])[17]"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()='Edit Receipt']"))) {
		        System.out.println("Edit receipt page opened successfully");
		    } else {
		        System.out.println("Edit receipt page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifythecustomerdetailsthroughcustomeridinparticularbankBK() {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()=' cus 1 ']"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Edit Customer ']"))) {
		        System.out.println("Edit customer page opened successfully");
		    } else {
		        System.out.println("Edit customer page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifythequickentrydetailsthroughquickentryidinparticularbankBK() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()=' QE - 3 ']"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//b[text()='QuickEntry']"))) {
		        System.out.println("Quick entry details page opened successfully");
		    } else {
		        System.out.println("Quick entry details page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[text()='save_alt']"));
		Thread.sleep(5000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//mat-icon[text()='edit'])[17]"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Edit Quick Entry ']"))) {
		        System.out.println("Edit quick entry page opened successfully");
		    } else {
		        System.out.println("Edit quick entry page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonrefundoptioninactiondropdownBK() throws InterruptedException {
		
		Thread.sleep(4000);
		WebElement element1=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[2]"));
		  wait.until(ExpectedConditions.visibilityOf(element1));
		  element1.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Refund']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Refund']"));
		  
		Thread.sleep(2000);
//		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.multipletransactioninDD);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[normalize-space()='Amount Refund To Supplier']"))) {
		        System.out.println("Refund popup is opened succesfully");
		    } else {
		        System.out.println("Refund popup is not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		
		WebElement element3=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[7]"));
		  wait.until(ExpectedConditions.visibilityOf(element3));
		  element3.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Subcontractor  1']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Subcontractor  1']"));
		  
		  Thread.sleep(2000);
		  banklocators.savebtn.click();
		  
		 
	}
	
	public void verifytherefundBK() throws InterruptedException {
		 
		 Thread.sleep(1000);
		  try {
			    if (HelperClass.isElementPresent(By.xpath("//p[text()='You have to allocate total amount to Debit Note.']"))) {
			        System.out.println("Refund is processing");
			    } else {
			        System.out.println("Refund is not processing");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
	}
	
	public void ClickonrefundoptionforcreditnoteinactiondropdownBK() throws InterruptedException {
		
		Thread.sleep(4000);
		WebElement element1=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[2]"));
		  wait.until(ExpectedConditions.visibilityOf(element1));
		  element1.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Refund']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Refund']"));
		  
		Thread.sleep(2000);
//		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.multipletransactioninDD);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[normalize-space()='Amount Refund To Supplier']"))) {
		        System.out.println("Refund popup is opened succesfully");
		    } else {
		        System.out.println("Refund popup is not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		
		WebElement element3=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[7]"));
		  wait.until(ExpectedConditions.visibilityOf(element3));
		  element3.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Subcontractor  1']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Subcontractor  1']"));
		  
		  Thread.sleep(2000);
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' New Credit Note ']"));
	}
	
	public void verifytherefundforcreditnoteBK() throws InterruptedException {
		Thread.sleep(2000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Add New Credit Note ']"))) {
		        System.out.println("Add credit note page navigated successfully");
		    } else {
		        System.out.println("Add credit note page is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
}














