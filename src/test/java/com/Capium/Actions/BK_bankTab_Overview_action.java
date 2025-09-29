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
import org.testng.Assert;

import com.Capium.Locators.BK_banktab_locators;
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
		HelperClass.waitForPageToLoad(driver);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.searchTFindashboard);
		HelperClass.waitForPageToLoad(driver);
		banklocators.searchTFindashboard.sendKeys("Journal" + Keys.ENTER);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.newclientid);
		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//a[@class='mat-mdc-menu-trigger company-list']"))) {
		        Assert.assertTrue(true,"Client navigated successully");
		    } else {
		        Assert.fail("Client is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void navigatetobankandverifyBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.banktab);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.overviewtab);
		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Add Bank Account']"))) {
		        Assert.assertTrue(true,"Bank overview tab is navigated successfully");
		    } else {
		        Assert.fail("Bank overview tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void addbankBK() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.addbankbtn);
		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[text()='Add Custom Accounts']"))) {
		   
		        Assert.assertTrue(true,"add bank popup opened successfully");
		    } else {
		        Assert.fail("add bank popup not  opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		HelperClass.waitForPageToLoad(driver);
		banklocators.accountnameTF.sendKeys("baroda bank");
//		HelperClass.waitForPageToLoad(driver);
		banklocators.nominalTF.sendKeys("1234567");
//		HelperClass.waitForPageToLoad(driver);
		
		WebElement element3=driver.findElement(By.xpath("//ng-select[@formcontrolname='bankAccountType']"));
		  wait.until(ExpectedConditions.visibilityOf(element3));
		  element3.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Savings ']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()=' Savings ']"));
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.bankaccounttypeDD);
		  HelperClass.waitForPageToLoad(driver);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.savingsoption);
		banklocators.accountnumber.sendKeys("23456789");
		HelperClass.waitForPageToLoad(driver);
		banklocators.accountnameTF.sendKeys("baroda bank");
		banklocators.savebtn.click();
		
	}
	
	public void verifyaddedbankBK() throws InterruptedException {
		Thread.sleep(1000);
//		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//p[text()='The operation completed Successfully!']"))) {
		    	Assert.assertTrue(true,"Bank added successfully");
		       
		    } else {
		        Assert.fail("Bank not added ");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void editthebankBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.editicon);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Edit Custom Account ']"))) {
		    	Assert.assertTrue(true,"edit bank page opened successfully");
		        
		    } else {
		        Assert.fail("edit bank page not  opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		HelperClass.waitForPageToLoad(driver);
		banklocators.accountnameTF.clear();
		HelperClass.waitForPageToLoad(driver);
		banklocators.accountnameTF.sendKeys("union bank");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.saveandexit);
		HelperClass.waitForPageToLoad(driver);
	}
	
	public void  verifytheeditedbank() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//p[text()='union bank']"))) {
		    	Assert.assertTrue(true,"bank edited successfully");
		        
		    } else {
		        Assert.fail("bank not edited");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifyenableoptionsineditbankpageBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.editicon);
		
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.checkboxinedit);
		try {
			if (banklocators.deleteinedit.isDisplayed() && banklocators.copyinedit.isDisplayed() &&
					banklocators.exporttoexcelinedit.isDisplayed() && banklocators.exporttocsvinedit.isDisplayed() && 
					banklocators.exporttopdfinedit.isDisplayed() && banklocators.printinedit.isDisplayed() && 
					banklocators.inactiveinedit.isDisplayed() && banklocators.activeinedit.isDisplayed()) {
			    Assert.assertTrue(true," All option are displaying succesfully");
			} else {
			    Assert.fail(" All option are not displaying");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}	
	}
	
	public void ClickonplussymbolinbankmainmenuBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.banktab);
		//Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.plusinmainmenu);
		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[text()='Add Custom Accounts']"))) {
		        Assert.assertTrue(true,"successfully navigated to add new bank page");
		    } else {
		        Assert.fail("add new bank page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[text()='close']"));
	}
	
	public void VerifysearchiconandcrossmarkineditbankpageBK() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.editicon);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.searchineditpage);
		HelperClass.waitForPageToLoad(driver);
		banklocators.searchTFineditpage.sendKeys("union");
		HelperClass.waitForPageToLoad(driver);
		 String actualText = HelperClass.getText(By.xpath("//a[normalize-space()='union bank']")).trim();
			String expected = "union";
			try {
			if (actualText.contains(expected)) {
			    Assert.assertTrue(true," Found the bank");
			} else {
			    Assert.fail("Text not matched. Actual: " + actualText);
			}
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.crossmarkinsearch);
			HelperClass.waitForPageToLoad(driver);
			String actualText1 = HelperClass.getText(By.xpath("//input[@placeholder='Search']")).trim();
			String expected1 = "2";
			try {
			if (actualText1.contains(expected1)) {
			    Assert.fail(" Cross mark not clicked");
			} else {
			    Assert.assertTrue(true,"cross mark clicked. Actual: " + actualText1);
			}
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
	}
	
	public void ClickondoublearrowsineditbankpageandverifythedetailboxesareopeningorclosingBK() throws InterruptedException {
		Thread.sleep(3000);
//		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.openarrowinaddjournal);
		
		try {
		if (banklocators.closerrowinaddjournal.isDisplayed()) {
		    Assert.assertTrue(true,"bank detail boxes are closed succssfully");
		} else {
		    Assert.fail("Boxed are not closed");
		}
		} catch (Exception e) {
		    System.out.println("An error occurred " + e.getMessage());
		}
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.closerrowinaddjournal);
		HelperClass.waitForPageToLoad(driver);

		try {
			if (banklocators.accountgrpele.isDisplayed()) {
			    Assert.assertTrue(true,"Bank detail boxes are opened successfully");
			} else {
			    Assert.fail("Boxed are not opened");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
	}
	
	public void verifysearchbarinmaingridBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.cashinhandeles);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.cashinhandeles);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.searchbarinmaingrid);
		HelperClass.waitForPageToLoad(driver);
		banklocators.searchbarinmaingrid.sendKeys("JNL - 8" + Keys.ENTER);
		HelperClass.waitForPageToLoad(driver);
		
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
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.kebabinmaingrid);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.manualimport);
		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//p[contains(@class,'header')]"))) {
		        Assert.assertTrue(true,"manual import page opened succesfully");
		    } else {
		        Assert.fail("manual import page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		banklocators.descriptionTF.sendKeys("description for payment");
		banklocators.paidoutTF.sendKeys("500");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.addnewline);
		HelperClass.waitForPageToLoad(driver);
		banklocators.descriptionTF2.sendKeys("description for receipt");
		banklocators.paidinTF2.sendKeys("500");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.saveandexit);
		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Add Bank Account']"))) {
		        Assert.assertTrue(true,"Bank overview tab is navigated successfully");
		    } else {
		        Assert.fail("Bank overview tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
	}
	
	public void exportthetransactionBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		banklocators=PageFactory.initElements(driver, BK_banktab_locators.class);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.kebabinmaingrid);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.exporttopdf);
		HelperClass.waitForPageToLoad(driver);
		
		//Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.kebabinmaingrid);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.exporttoexcel);
		HelperClass.waitForPageToLoad(driver);
	}
	
	
	public void importthetransactionsBK() throws InterruptedException, AWTException {
		Thread.sleep(3000);
//		HelperClass.waitForPageToLoad(driver);
		banklocators=PageFactory.initElements(driver, BK_banktab_locators.class);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.kebabinmaingrid);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.importoption);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.browser);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.browser);
		WebElement browser = driver.findElement(By.xpath("//button[@class='file-upload-button primary-button']"));
        browser.click();
        HelperClass.waitForPageToLoad(driver);
 
        // Path of file to upload
        String filePath = "C:\\Users\\user\\Downloads\\BankEntry_16092025_0212.xlsx";
 
 
        // Robot logic
        Robot robot = new Robot();
 
        // Copy file path to clipboard
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        HelperClass.waitForPageToLoad(driver);
        // Paste path using CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
 
        HelperClass.waitForPageToLoad(driver);
 
        // Press ENTER
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        HelperClass.waitForPageToLoad(driver);
        HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.savebtn);
        HelperClass.waitForPageToLoad(driver);
	}
	
	public void addquickjournalfromthekebabBK() throws InterruptedException {
		
		HelperClass.waitForPageToLoad(driver);
		banklocators=PageFactory.initElements(driver, BK_banktab_locators.class);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.kebabinmaingrid);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.quickjournal);
		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[text()='Quick Journal']"))) {
		        Assert.assertTrue(true,"Quick journal popup opened successfully");
		    } else {
		        Assert.fail("Quick journal popup not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		HelperClass.waitForPageToLoad(driver);
		WebElement element=driver.findElement(By.xpath("//ng-select[@bindlabel='name']"));
		  wait.until(ExpectedConditions.visibilityOf(element));
		  element.click();
		  HelperClass.waitForPageToLoad(driver);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='1510 - Amortisation of Goodwill']")));
		 // HelperClass.waitUntilVisible(By.xpath("//mat-form-field[contains(@class,'w-200')]"));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='1510 - Amortisation of Goodwill']"));
		
		  HelperClass.waitForPageToLoad(driver);
		banklocators.amountreceivedTF.sendKeys("3000");
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.saveandexit);
	}
	
	public void verifythejournalBK() throws InterruptedException {
		Thread.sleep(2000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//p[text()='The operation completed Successfully!']"))) {
		        Assert.assertTrue(true,"Quick journal added succesfully");
		    } else {
		        Assert.fail("Quick journal not added");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	
	public void docashcodingBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		banklocators=PageFactory.initElements(driver, BK_banktab_locators.class);
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.kebabinmaingrid);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.cashcoding);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Cash Coding ']"))) {
		        Assert.assertTrue(true,"cash coding page opened successfully");
		    } else {
		        Assert.fail("cash coding page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		HelperClass.waitForPageToLoad(driver);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//input[@type='checkbox']"));
		banklocators.checkboxcashcode.click();
		HelperClass.waitForPageToLoad(driver);
		
		WebElement element=driver.findElement(By.xpath("(//div[contains(@class,'ng-select-container')])[3]"));
		  wait.until(ExpectedConditions.visibilityOf(element));
		  element.click();
		  HelperClass.waitForPageToLoad(driver);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='1510 - Amortisation of Goodwill']")));
		 // HelperClass.waitUntilVisible(By.xpath("//mat-form-field[contains(@class,'w-200')]"));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='1510 - Amortisation of Goodwill']"));
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.saveandexit);
	}
	
	public void VerifythecashcodingBK() throws InterruptedException {
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//p[text()='The operation completed Successfully!']"))) {
		        Assert.assertTrue(true,"Cash coding added succesfully");
		    } else {
		        Assert.fail("cash coding not added");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void clickonbankreconcilationiconBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.reconcileicon);
		
	}
	
	public void verifybankreconcilationBK() {
		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//p[text()='Select Bank:']"))) {
		        Assert.assertTrue(true,"Navigated to reconcile page");
		    } else {
		        Assert.fail("Not navigated to reconcile page");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonjournaloptioninactiondropdownBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		WebElement element1=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[2]"));
		  wait.until(ExpectedConditions.visibilityOf(element1));
		  element1.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Journals']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Journals']"));
	}
		

	
	public void verifythejournaltabfromactiondropdownintaskBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Journal']"))) {
		        Assert.assertTrue(true,"successfully navigated to add new journal page");
		    } else {
		        Assert.fail("add new journal page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonpaymentoptioninactiondropdownBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.datecolumn);
		HelperClass.waitForPageToLoad(driver);
		String actualText = HelperClass.getText(By.xpath("(//table/tbody/tr/td[ng-select]//preceding-sibling::td[5])[1]")).trim();
		String expected = " £ 0.00";
		try {
		if (actualText.contains(expected)) {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Payment");
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Create New Payment']"))) {
			        Assert.assertTrue(true,"Create payment page navigated successfully");
			    } else {
			        Assert.fail("Create payment page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred : " + e.getMessage());
			}
		} else {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Receipt");
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Create New Receipt']"))) {
			        Assert.assertTrue(true,"Create receipt page navigated succesfully");
			    } else {
			        Assert.fail("Create receipt page not navigated");
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
		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Create New Payment']"))) {
		        Assert.assertTrue(true,"Create payment page navigated succesfully");
		    } else {
		        Assert.fail("Create payment page is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonbanktransferoptioninactiondropdownBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		WebElement element1=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[2]"));
		  wait.until(ExpectedConditions.visibilityOf(element1));
		  element1.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Bank Transfer']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Bank Transfer']"));
	}
	
	public void verifythebanktransferBK () throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Bank Transfer']"))) {
		        Assert.assertTrue(true,"Bank transfer page navigated succesfully");
		    } else {
		        Assert.fail("Bank transfer page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonpurchaseoptioninactiondropdownBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.datecolumn);
		HelperClass.waitForPageToLoad(driver);
		String actualText = HelperClass.getText(By.xpath("(//table/tbody/tr/td[ng-select]//preceding-sibling::td[5])[1]")).trim();
		String expected = " £ 0.00";
		try {
		if (actualText.contains(expected)) {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Purchase");
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Purchase']"))) {
			        Assert.assertTrue(true,"add invoice page navigated successfully");
			    } else {
			        Assert.fail("add invoice page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		} else {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Invoices");
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Invoice']"))) {
			        Assert.assertTrue(true,"add invoice page navigated succesfully");
			    } else {
			        Assert.fail("add invoice page not navigated");
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
		HelperClass.waitForPageToLoad(driver);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Match Journal");
		HelperClass.waitForPageToLoad(driver);
	}
	
	public void ClickonmatchquickentryoptioninactiondropdownBK() throws InterruptedException {
		String netamountpayment = HelperClass.getText(By.xpath("(//table/tbody/tr/td[ng-select]//preceding-sibling::td[4])[1]")).trim();
		HelperClass.waitForPageToLoad(driver);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.invoicescrollelement);
		HelperClass.waitForPageToLoad(driver);
		String invoicedate = HelperClass.getText(By.xpath("(//table/tbody/tr/td[ng-select]//preceding-sibling::td[9])[1]")).trim();
		HelperClass.waitForPageToLoad(driver);
		String actualText = HelperClass.getText(By.xpath("(//table/tbody/tr/td[ng-select]//preceding-sibling::td[5])[1]")).trim();
		String expected = "£ 0.00";
		
		System.out.println(netamountpayment);
		System.out.println(invoicedate);
		if (actualText.contains(expected)) {
			
			HelperClass.waitForPageToLoad(driver);
		
//			HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.quickentrytab);
//			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.quickentrytab);
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[normalize-space(text())='Add Quick Entry']"));
			String actualtext1 = HelperClass.getText(By.xpath("//span[normalize-space(text())='Add New Quick Entry']"));
			String expected1 = "Add New Quick Entry";
			try {
			    if (actualtext1.equals(expected1)) {
			        Assert.assertTrue(true,"Add New Quick Entry verified");
			    } else {
			        Assert.fail("Add New Quick Entry not verified");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Add New Quick Entry: " + e.getMessage());
			}
			
			HelperClass.waitForPageToLoad(driver);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//mat-form-field[@appearance='fill'])[1]", "Payment");
			HelperClass.waitForPageToLoad(driver);
			  
//			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-select[normalize-space(@formcontrolname)='type']"));
//			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[normalize-space(text())='Receipt']//parent::span"));
//			  Thread.sleep(2000);
//			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-form-field[contains(@class,'w-200')]", "1670 - Amortisation of Intellectual property");
//			  Thread.sleep(2000);
			  WebElement element=driver.findElement(By.xpath("//mat-form-field[contains(@class,'w-200')]"));
			  wait.until(ExpectedConditions.visibilityOf(element));
			  element.click();
			  HelperClass.waitForPageToLoad(driver);
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
		  	      Assert.assertTrue(true,"The operation completed Successfully!");
		  	    } else {
		  	      Assert.fail("The operation not completed");
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
			        Assert.assertTrue(true,"Bank overview tab is navigated successfully");
			    } else {
			        Assert.fail("Bank overview tab is not navigated");
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

		HelperClass.waitForPageToLoad(driver);
		WebElement element1=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[2]"));
		  wait.until(ExpectedConditions.visibilityOf(element1));
		  element1.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Multiple Transactions']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Multiple Transactions']"));
		  
		  HelperClass.waitForPageToLoad(driver);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.multipletransactioninDD);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[normalize-space()='Multiple Transactions']"))) {
		        Assert.assertTrue(true,"Multiple transaction popup is opened succesfully");
		    } else {
		        Assert.fail("Multiple transaction popup is not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		HelperClass.waitForPageToLoad(driver);
		WebElement element=driver.findElement(By.xpath("(//mat-form-field[@appearance='fill'])[4]"));
		  wait.until(ExpectedConditions.visibilityOf(element));
		  element.click();
		 
		  try {
			    if (HelperClass.isElementPresent(By.xpath("//span[text()='Receipt']"))) {
			    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Receipt']")));
					  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Receipt']"));
					  
					  HelperClass.waitForPageToLoad(driver);
					  if (HelperClass.isElementPresent(By.xpath("//h2[text()='Add Receipt']"))) {
					    	Assert.assertTrue(true,"add receipt popup opened successfully");
					    } else {
					    	Assert.fail("add receipt popup not opened");
					    }
					  HelperClass.waitForPageToLoad(driver);
						WebElement element2=driver.findElement(By.xpath("//ng-select[@formcontrolname='contact']"));
						  wait.until(ExpectedConditions.visibilityOf(element2));
						  element2.click();
						  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='cus 1']")));
						  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='cus 1']"));
						  HelperClass.waitForPageToLoad(driver);
						  HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.amountnameTFinmultidd);
						  banklocators.amountnameTFinmultidd.sendKeys("1000");
						  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' Add ']"));
						  banklocators.savebtn.click();
						  Thread.sleep(1000);
						  if (HelperClass.isElementPresent(By.xpath("//p[text()='Balance amount should be 0']"))) {
						    	Assert.assertTrue(true,"adding receipt for under multi transaction is proccessing");
						    } else {
						    	Assert.fail("adding receipt for under multi transaction is not proccessing");
						    }
			    } else {
			    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Payment']")));
					  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Payment']"));
					  HelperClass.waitForPageToLoad(driver);
					  if (HelperClass.isElementPresent(By.xpath("//h2[text()='Add Payment']"))) {
					    	Assert.assertTrue(true,"add payment popup opened successfully");
					    } else {
					    	Assert.fail("add payment popup not opened");
					    }
					  HelperClass.waitForPageToLoad(driver);
						WebElement element3=driver.findElement(By.xpath("//ng-select[@formcontrolname='contact']"));
						  wait.until(ExpectedConditions.visibilityOf(element3));
						  element3.click();
						  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Subcontractor  1']")));
						  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Subcontractor  1']"));
						  HelperClass.waitForPageToLoad(driver);
						  HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.amountnameTFinmultidd);
						  banklocators.amountnameTFinmultidd.sendKeys("1000");
						  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' Add ']"));
						  banklocators.savebtn.click();
						  Thread.sleep(1000);
						  if (HelperClass.isElementPresent(By.xpath("//p[text()='Balance amount should be 0']"))) {
						    	Assert.assertTrue(true,"adding payment for under multi transaction is proccessing");
						    } else {
						    	Assert.fail("adding payment for under multi transaction is not proccessing");
						    }
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		  
	}
	
	public void ClickonmultipletransactionoptionforjournalinactiondropdownBK() throws InterruptedException {
		
		HelperClass.waitForPageToLoad(driver);
		WebElement element1=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[2]"));
		  wait.until(ExpectedConditions.visibilityOf(element1));
		  element1.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Multiple Transactions']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Multiple Transactions']"));
		  
		  HelperClass.waitForPageToLoad(driver);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.multipletransactioninDD);
		
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[normalize-space()='Multiple Transactions']"))) {
		        Assert.assertTrue(true,"Multiple transaction popup is opened succesfully");
		    } else {
		        Assert.fail("Multiple transaction popup is not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		HelperClass.waitForPageToLoad(driver);
		WebElement element=driver.findElement(By.xpath("(//mat-form-field[@appearance='fill'])[4]"));
		  wait.until(ExpectedConditions.visibilityOf(element));
		  element.click();
		  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Journal']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Journal']"));
		  
		  HelperClass.waitForPageToLoad(driver);
		  if (HelperClass.isElementPresent(By.xpath("//h2[text()='Add Journal']"))) {
		    	Assert.assertTrue(true,"add journal popup opened successfully");
		    } else {
		    	Assert.fail("add journal popup not opened");
		    }
		  
		  
		  HelperClass.waitForPageToLoad(driver);
			WebElement element2=driver.findElement(By.xpath("(//mat-form-field[@appearance='fill'])[5]"));
			  wait.until(ExpectedConditions.visibilityOf(element2));
			  element2.click();
			  HelperClass.waitForPageToLoad(driver);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' 8450 - Accrued expenses ']")));
			 // HelperClass.waitUntilVisible(By.xpath("//mat-form-field[contains(@class,'w-200')]"));
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' 8450 - Accrued expenses ']"));
			  
			  
			  HelperClass.waitForPageToLoad(driver);
			  HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.amountnameTFinmultidd);
			  banklocators.amountnameTFinmultidd.sendKeys("1000");
			  
			  WebElement element3=driver.findElement(By.xpath("//ng-select[@formcontrolname='vatrate']"));
			  wait.until(ExpectedConditions.visibilityOf(element3));
			  element3.click();
			  HelperClass.waitForPageToLoad(driver);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Standard Rated(20.00%) ']")));
			 // HelperClass.waitUntilVisible(By.xpath("//mat-form-field[contains(@class,'w-200')]"));
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' Standard Rated(20.00%) ']"));
			  
			  
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' Add ']"));
			  banklocators.savebtn.click();
//			  HelperClass.waitForPageToLoad(driver);
			  Thread.sleep(1000);
			  if (HelperClass.isElementPresent(By.xpath("(//p[text()='Balance amount should be 0'])[1]"))) {
			    	Assert.assertTrue(true,"adding journal for under multi transaction is proccessing");
//			    	System.out.println("adding journal for under multi transaction is proccessing");
			    } else {	
			    	Assert.fail("adding journal for under multi transaction is not proccessing");
//			    	System.out.println("adding journal for under multi transaction is not proccessing");
			    }
			  HelperClass.waitForPageToLoad(driver);
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[text()='close']"));
	}
	
	public void ClickoninvoiceoptioninactiondropdownBK() throws InterruptedException {
		
		HelperClass.waitForPageToLoad(driver);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.datecolumn);
		HelperClass.waitForPageToLoad(driver);
		String actualText = HelperClass.getText(By.xpath("//table/tbody/tr/td[6]/div")).trim();
		String expected = " £ 0.00";
		try {
		if (actualText.contains(expected)) {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Purchase");
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Purchase']"))) {
			        Assert.assertTrue(true,"add invoice page navigated successfully");
			    } else {
			        Assert.fail("add invoice page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		} else {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Invoices");
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Invoice']"))) {
			        Assert.assertTrue(true,"add invoice page navigated succesfully");
			    } else {
			        Assert.fail("add invoice page not navigated");
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
		HelperClass.waitForPageToLoad(driver);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.datecolumn);
		HelperClass.waitForPageToLoad(driver);
		String actualText = HelperClass.getText(By.xpath("//table/tbody/tr/td[6]/div")).trim();
		String expected = " £ 0.00";
		try {
		if (actualText.contains(expected)) {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Payment");
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Create New Payment']"))) {
			        Assert.assertTrue(true,"Create payment page navigated successfully");
			    } else {
			        Assert.fail("Create payment page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		} else {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Receipt");
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Create New Receipt']"))) {
			        Assert.assertTrue(true,"Create receipt page navigated succesfully");
			    } else {
			        Assert.fail("Create receipt page not navigated");
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
//		Thread.sleep(5000);
//		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[text()='01-Jan-2025 - 31-Dec-2025']", "All Years");
		HelperClass.waitForPageToLoad(driver);
		WebElement element1=driver.findElement(By.xpath("//span[text()='01-Jan-2025 - 31-Dec-2025']"));
		  wait.until(ExpectedConditions.visibilityOf(element1));
		  element1.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='All Years ']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='All Years ']"));
	}
	
	public void verifythetypedropdownBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
//		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@role='combobox'])[1]", "Journals");
		
		HelperClass.waitForPageToLoad(driver);
		WebElement element1=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[1]"));
		  wait.until(ExpectedConditions.visibilityOf(element1));
		  element1.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Journals']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Journals']"));
		  HelperClass.waitForPageToLoad(driver);
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
		
		HelperClass.waitForPageToLoad(driver);
		WebElement element2=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[1]"));
		  wait.until(ExpectedConditions.visibilityOf(element2));
		  element2.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Receipts']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Receipts']"));
		  HelperClass.waitForPageToLoad(driver);
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
		
		

		HelperClass.waitForPageToLoad(driver);
		  wait.until(ExpectedConditions.visibilityOf(element2));
		  element2.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Payment']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Payment']"));
		  HelperClass.waitForPageToLoad(driver);
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
		
		HelperClass.waitForPageToLoad(driver);
		  wait.until(ExpectedConditions.visibilityOf(element2));
		  element2.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Bank Transfers']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='Bank Transfers']"));
		  HelperClass.waitForPageToLoad(driver);
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
		
		
//		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.cashinhandeles);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.cashinhandeles);
		
		
		HelperClass.waitForPageToLoad(driver);
		banklocators.searchTFoverview.sendKeys("jnl - 2");
		HelperClass.waitForPageToLoad(driver);
		banklocators.searchineditpage.click();
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()=' JNL - 2 ']"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//b[text()='Journal']"))) {
		        Assert.assertTrue(true,"Journal details page opened successfully");
		    } else {
		        Assert.fail("Journal details page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[text()='save_alt']"));
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//mat-icon[text()='edit'])[2]"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Edit Journal ']"))) {
		        Assert.assertTrue(true,"Edit Journal page opened successfully");
		    } else {
		        Assert.fail("Edit Journal page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifyexportoptionsundercashinhandBK() throws InterruptedException {
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.cashinhandeles);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), banklocators.cashinhandeles);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[text()='picture_as_pdf']"));
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[text()='border_all']"));
		HelperClass.waitForPageToLoad(driver);
	}
	
	public void verifythebanktransferdetailsthroughbanktranferidinparticularbankBK() {
		
		HelperClass.waitForPageToLoad(driver);
		banklocators.searchTFoverview.sendKeys("bnk - 1");
		HelperClass.waitForPageToLoad(driver);
		banklocators.searchineditpage.click();
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()=' BNK - 1 ']"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[text()='Bank Detail']"))) {
		        Assert.assertTrue(true,"Bank tranfer details opened successfully");
		    } else {
		        Assert.fail("Bank tranfer details not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifythereceiptdetailsthroughreceiptidinparticularbankBK() throws InterruptedException {
		
		HelperClass.waitForPageToLoad(driver);
		banklocators.searchTFoverview.clear();
		banklocators.searchTFoverview.sendKeys("rec-1");
		HelperClass.waitForPageToLoad(driver);
		banklocators.searchineditpage.click();
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()=' REC-1 ']"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//b[text()='Receipt']"))) {
		        Assert.assertTrue(true,"Receipt details opened successfully");
		    } else {
		        Assert.fail("Receipt details not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[text()='save_alt']"));
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//mat-icon[text()='edit'])[3]"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()='Edit Receipt']"))) {
		        Assert.assertTrue(true,"Edit receipt page opened successfully");
		    } else {
		        Assert.fail("Edit receipt page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifythecustomerdetailsthroughcustomeridinparticularbankBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		banklocators.searchTFoverview.clear();
		banklocators.searchTFoverview.sendKeys("cus 1");
		HelperClass.waitForPageToLoad(driver);
		banklocators.searchineditpage.click();
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()=' cus 1 ']"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Edit Customer ']"))) {
		        Assert.assertTrue(true,"Edit customer page opened successfully");
		    } else {
		        Assert.fail("Edit customer page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifythequickentrydetailsthroughquickentryidinparticularbankBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		banklocators.searchTFoverview.clear();
		banklocators.searchTFoverview.sendKeys("qe - 1");
		HelperClass.waitForPageToLoad(driver);
		banklocators.searchineditpage.click();
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//a[text()=' QE - 1 ']"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//b[text()='QuickEntry']"))) {
		        Assert.assertTrue(true,"Quick entry details page opened successfully");
		    } else {
		        Assert.fail("Quick entry details page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//mat-icon[text()='save_alt']"));
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("(//mat-icon[text()='edit'])[2]"));
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Edit Quick Entry ']"))) {
		        Assert.assertTrue(true,"Edit quick entry page opened successfully");
		    } else {
		        Assert.fail("Edit quick entry page not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonrefundoptioninactiondropdownBK() throws InterruptedException {
		
		HelperClass.waitForPageToLoad(driver);
		WebElement element1=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[2]"));
		  wait.until(ExpectedConditions.visibilityOf(element1));
		  element1.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Refund']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Refund']"));
		  
		  HelperClass.waitForPageToLoad(driver);
//		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.multipletransactioninDD);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[normalize-space()='Amount Refund To Supplier']"))) {
		        Assert.assertTrue(true,"Refund popup is opened succesfully");
		    } else {
		        Assert.fail("Refund popup is not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		
		WebElement element3=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[5]"));
		  wait.until(ExpectedConditions.visibilityOf(element3));
		  element3.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='supp 1']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='supp 1']"));
		  
		  HelperClass.waitForPageToLoad(driver);
		  banklocators.savebtn.click();
		  
		 
	}
	
	public void verifytherefundBK() throws InterruptedException {
		 
		HelperClass.waitForPageToLoad(driver);
		  try {
			    if (HelperClass.isElementPresent(By.xpath("//p[text()='You have to allocate total amount to Debit Note.']"))) {
			        Assert.assertTrue(true,"Refund is processing");
			    } else {
			        Assert.fail("Refund is not processing");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
	}
	
	public void ClickonrefundoptionforcreditnoteinactiondropdownBK() throws InterruptedException {
		
		HelperClass.waitForPageToLoad(driver);
		WebElement element1=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[2]"));
		  wait.until(ExpectedConditions.visibilityOf(element1));
		  element1.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Refund']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='Refund']"));
		  
		  HelperClass.waitForPageToLoad(driver);
//		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), banklocators.multipletransactioninDD);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[normalize-space()='Amount Refund To Supplier']"))) {
		        Assert.assertTrue(true,"Refund popup is opened succesfully");
		    } else {
		        Assert.fail("Refund popup is not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		
		WebElement element3=driver.findElement(By.xpath("(//ng-select[@panelclass='mat-select-position'])[5]"));
		  wait.until(ExpectedConditions.visibilityOf(element3));
		  element3.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='supp 1']")));
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='supp 1']"));
		  
		  HelperClass.waitForPageToLoad(driver);
		  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' New Credit Note ']"));
	}
	
	public void verifytherefundforcreditnoteBK() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Add New Credit Note ']"))) {
		        Assert.assertTrue(true,"Add credit note page navigated successfully");
		    } else {
		        Assert.fail("Add credit note page is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
}














