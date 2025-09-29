package com.Capium.Actions;

import static org.testng.Assert.fail;

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

import com.Capium.Locators.BK_journal_locators;
import com.Capium.Utilies.HelperClass;

import net.bytebuddy.asm.Advice.Enter;


public class BK_journal_Actions {
	
	BK_journal_locators journallocators=null;
	
	WebDriver driver=HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	
	public BK_journal_Actions() {
		this.journallocators = new BK_journal_locators();
		PageFactory.initElements(HelperClass.getDriver(), journallocators);
		}
	
	public void navigatetoinsidetheclientindashboardandverifyJT() throws InterruptedException {
		HelperClass.waitForPageToLoad(driver);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), journallocators.searchTFindashboard);
		HelperClass.waitForPageToLoad(driver);
		journallocators.searchTFindashboard.sendKeys("Journal" + Keys.ENTER);
		HelperClass.waitForPageToLoad(driver);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.newclientid);
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
		
		public void navigatetojournalandverifyJT() throws InterruptedException {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.task);
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.journaltab);
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),'Add Journal')]"))) {
			        Assert.assertTrue(true,"Journal tab is navigated successfully");
			    } else {
			        Assert.fail("Journal tab is not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		}
		
		public void ClickonplusinjournalmainmenuJTandverify() throws InterruptedException {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.task);
			//Thread.sleep(3000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.plusinjournalmainmenu);
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
		
		public void addjournalandverifyJT() throws InterruptedException {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.addjournakbtn);
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
			
			HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), journallocators.accountDDinjournaldetails);
			HelperClass.waitForPageToLoad(driver);
			journallocators.accountDDinjournaldetails.sendKeys("1010");
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.salesCOA);
			journallocators.creditamountTF.sendKeys("500");
			journallocators.addnewlineinJT.click();
			HelperClass.waitForPageToLoad(driver);
			journallocators.secondaccountDDinjournaldetails.sendKeys("8045");
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.cashinhandCOA);
			journallocators.debitamountTF.sendKeys("500");
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.unknownele);
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.saveandexitinaddjournal);
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),'Add Journal')]"))) {
			        Assert.assertTrue(true,"Journal tab is navigated successfully");
			    } else {
			        Assert.fail("Journal tab is not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		}
		
		public void addnewlinesanddeletelinesforjournalandverifyJT() throws InterruptedException {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.addjournakbtn);
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
			
			HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), journallocators.accountDDinjournaldetails);
			HelperClass.waitForPageToLoad(driver);
			journallocators.accountDDinjournaldetails.sendKeys("1010");
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.salesCOA);
			//journallocators.creditamountTF.sendKeys("500");
			HelperClass.waitForPageToLoad(driver);
			journallocators.addnewlineinJT.click();
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("(//input[@aria-haspopup='listbox'])[2]"))) {
			        Assert.assertTrue(true,"secondline added succesfully");
			    } else {
			        Assert.fail("secondline not added");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			
			
			HelperClass.waitForPageToLoad(driver);
			journallocators.addnewlineinJT.click();
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("(//input[@aria-haspopup='listbox'])[3]"))) {
			        Assert.assertTrue(true,"Thirdline added succesfully");
			    } else {
			        Assert.fail("Thirdline not added");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			
			HelperClass.waitForPageToLoad(driver);
			journallocators.addnewlineinJT.click();
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("(//input[@aria-haspopup='listbox'])[4]"))) {
			        Assert.assertTrue(true,"fourthline added succesfully");
			    } else {
			        Assert.fail("fourthline not added");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			HelperClass.waitForPageToLoad(driver);
			journallocators.deletefour.click();
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("(//input[@aria-haspopup='listbox'])[4]"))) {
			        Assert.assertTrue(true,"fourthline not deleted");
			    } else {
			        Assert.fail("fourthline deleted");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		
			HelperClass.waitForPageToLoad(driver);
			journallocators.deletethree.click();
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("(//input[@aria-haspopup='listbox'])[3]"))) {
			        Assert.assertTrue(true,"Thirdline not deleted");
			    } else {
			        Assert.fail("Thirdline deleted");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			
			HelperClass.waitForPageToLoad(driver);
			journallocators.deletetwo.click();
			HelperClass.waitForPageToLoad(driver);
			try {
			    if (HelperClass.isElementPresent(By.xpath("(//input[@aria-haspopup='listbox'])[2]"))) {
			        System.out.println("second line not deleted");
			    } else {
			        Assert.fail("second line deleted");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			
			
				
			}
			
		public void ClickonplussymbolineditjournalpageJT() throws InterruptedException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.plusineditjournal);
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
		
		public void VerifysearchiconineditjournalpageJT() throws InterruptedException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.searchineditpage);
			HelperClass.waitForPageToLoad(driver);
			journallocators.searchTFineditpage.sendKeys("2");
			HelperClass.waitForPageToLoad(driver);
			 String actualText = HelperClass.getText(By.xpath("//a[normalize-space()='JNL - 2']")).trim();
				String expected = "2";
				try {
				if (actualText.contains(expected)) {
				    System.out.println(" Found the journal");
				} else {
				    System.out.println("Text not matched. Actual: " + actualText);
				}
				} catch (Exception e) {
				    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
				}
				HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.crossmarkinsearch);
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
		
		public void Clickoncheckboxineditjournalpageandverifytheenablingoptions() throws InterruptedException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.checkboxinedit);
			try {
				if (journallocators.deleteinedit.isDisplayed() && journallocators.copyinedit.isDisplayed() &&
						journallocators.exporttoexcelinedit.isDisplayed() && journallocators.exporttocsvinedit.isDisplayed() && 
						journallocators.exporttopdfinedit.isDisplayed() && journallocators.printinedit.isDisplayed() && 
						journallocators.inactiveinedit.isDisplayed() && journallocators.activeinedit.isDisplayed()) {
				    Assert.assertTrue(true," All option are displaying succesfully");
				} else {
				    Assert.fail(" All option are not displaying");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred " + e.getMessage());
				}
			
		}
		
		public void ClickondoublearrowsineditjournalpageandverifythedetailboxesareopeningorclosingJT() throws InterruptedException{
//			wait.until(ExpectedConditions.visibilityOf(journallocators.openarrowinaddjournal));
//			wait.until(ExpectedConditions.elementToBeClickable(journallocators.openarrowinaddjournal));
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.openarrowinaddjournal);
			
			try {
			if (journallocators.closerrowinaddjournal.isDisplayed()) {
			    Assert.assertTrue(true,"journal boxes are closed succssfully");
			} else {
			    Assert.fail("Boxed are not closed");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.closerrowinaddjournal);
			HelperClass.waitForPageToLoad(driver);
//			wait.until(ExpectedConditions.visibilityOf(journallocators.closerrowinaddjournal));
//			wait.until(ExpectedConditions.elementToBeClickable(journallocators.closerrowinaddjournal));
			try {
				if (journallocators.journalnoele.isDisplayed()) {
				    Assert.assertTrue(true,"journal boxes are opened succssfully");
				} else {
				    Assert.fail("Boxed are not opened");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred" + e.getMessage());
				}
		}
		
		public void ClickonsidesinglearrowsineditjournalpageandverifyJT() throws InterruptedException {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.singlearrow1);
			HelperClass.waitForPageToLoad(driver);
			try {
				if (journallocators.journalnoele.isDisplayed()) {
				    Assert.fail("Arrow 1 not clicked");
				} else {
				    Assert.assertTrue(true,"Arrow 1 is clicked");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred" + e.getMessage());
				}
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.singlearrow2);
			HelperClass.waitForPageToLoad(driver);
			try {
				if (journallocators.addnewlineinJT.isDisplayed()) {
				    Assert.fail("Arrow 2 not clicked");
				} else {
				    Assert.assertTrue(true,"Arrow 2 is clicked");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred" + e.getMessage());
				}
			
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.singlearrow3);
			HelperClass.waitForPageToLoad(driver);
			try {
				if (journallocators.chooseafile.isDisplayed()) {
				    Assert.assertTrue(true,"Arrow 3 is clicked");
				} else {
				    Assert.fail("Arrow 3 is not clicked");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred" + e.getMessage());
				}
		}
		
		public void verifysearchbarinmaingridJT() throws InterruptedException {
			HelperClass.waitForPageToLoad(driver);
			journallocators.searchbarinmaingrid.sendKeys("description1" + Keys.ENTER);
			HelperClass.waitForPageToLoad(driver);
			
			List<WebElement> referenceCells = HelperClass.getDriver()
					.findElements(By.xpath("//span[@title='description1']"));
			System.out.println(referenceCells);

			for (WebElement cell : referenceCells) {
				String actual = cell.getText().trim();
				if (actual.contains("description1")) {
					System.out.println("Matched: " + actual);
				} else {
					System.out.println("Mismatch: " + actual);
				}
			}
			
		}
		
		public void verifyperioddropdowninmaingridJT() throws InterruptedException {
//			Thread.sleep(5000);
//			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[@aria-haspopup='listbox']", "All Years");
//			Thread.sleep(2000);
			
			WebElement element3=driver.findElement(By.xpath("//mat-select[@aria-haspopup='listbox']"));
			  wait.until(ExpectedConditions.visibilityOf(element3));
			  element3.click();
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='All Years ']")));
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()='All Years ']"));
			  
			  
			String actualText = HelperClass.getText(By.xpath("//mat-select[@aria-haspopup='listbox']")).trim();
			String expected = "All Years";
	 
			if (actualText.equals(expected)) {
			    Assert.assertTrue(true,"Dropdown Selected all years option");
			} else {
			    Assert.fail("Dropdown not Selected all years option. Actual: " + actualText);
			}
			
//			Thread.sleep(2000);
//			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[@aria-haspopup='listbox']", "01-Jan-2025 - 31-Dec-2025");
//			Thread.sleep(2000);
			
			WebElement element4=driver.findElement(By.xpath("//mat-select[@aria-haspopup='listbox']"));
			  wait.until(ExpectedConditions.visibilityOf(element4));
			  element4.click();
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' 01-Jan-2025 - 31-Dec-2025 ']")));
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' 01-Jan-2025 - 31-Dec-2025 ']"));
			  
			
			String actualText1 = HelperClass.getText(By.xpath("//mat-select[@aria-haspopup='listbox']")).trim();
			String expected1 = "01-Jan-2025 - 31-Dec-2025";
	 
			if (actualText1.equals(expected1)) {
			    Assert.assertTrue(true,"Dropdown Selected 01-Jan-2025 - 31-Dec-2025 option");
			} else {
			    Assert.fail("Dropdown not Selected 01-Jan-2025 - 31-Dec-2025 option. Actual: " + actualText1);
			}	
		}
		
		public void ClickoncheckboxinmaingridandverifyenablingoptionsJT() throws InterruptedException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.checkboxinedit);
			try {
				if (journallocators.deleteinedit.isDisplayed() && journallocators.copyinedit.isDisplayed() &&
						journallocators.exporttoexcelinedit.isDisplayed() && journallocators.exporttocsvinedit.isDisplayed() && 
						journallocators.exporttopdfinedit.isDisplayed() && journallocators.printinedit.isDisplayed() && 
						journallocators.inactiveinedit.isDisplayed() && journallocators.activeinedit.isDisplayed()) {
				    Assert.assertTrue(true,"All option are displaying succesfully");
				} else {
				    Assert.fail(" All option are not displaying");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred " + e.getMessage());
				}
			
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.copyinedit);
			HelperClass.waitForPageToLoad(driver);
			try {
				if (journallocators.copysuccessmessage.isDisplayed()) {
				    Assert.assertTrue(true,"copy clicked successfully");
				} else {
				    Assert.fail("copy not clicked");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred" + e.getMessage());
				}
			HelperClass.waitForPageToLoad(driver);
		}
		
		public void VerifycancleselectionandcrossmarkinthedownJT() throws InterruptedException {
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.checkboxinedit);
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.cancelselection);
			HelperClass.waitForPageToLoad(driver);
			try {
				if (journallocators.checkboxinedit.isSelected()) {
				    Assert.fail("Cancel selection not clicked");
				} else {
				    Assert.assertTrue(true,"Cancel selection clicked successfully");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred " + e.getMessage());
				}
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.checkboxinedit);
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.crossmark);
			HelperClass.waitForPageToLoad(driver);
			try {
				if (journallocators.checkboxinedit.isSelected()) {
				    Assert.fail("Cross mark not clicked");
				} else {
				    Assert.assertTrue(true,"Cross mark clicked successfully");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred " + e.getMessage());
				}
		}
		
		public void VerifypaginationdropdownJT() throws InterruptedException {
//			Thread.sleep(5000);
//			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[@aria-label='dropdownlist']", "20");
			
			WebElement element4=driver.findElement(By.xpath("//span[@aria-label='dropdownlist']"));
			  wait.until(ExpectedConditions.visibilityOf(element4));
			  element4.click();
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' 01-Jan-2025 - 31-Dec-2025 ']")));
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' 01-Jan-2025 - 31-Dec-2025 ']"));
			  
			  HelperClass.waitForPageToLoad(driver);
			String actualText1 = HelperClass.getText(By.xpath("//span[@aria-label='dropdownlist']")).trim();
			String expected1 = "5";
	 
			if (actualText1.equals(expected1)) {
			    Assert.assertTrue(true,"Dropdown Selected 5 option");
			} else {
			    Assert.fail("Dropdown not Selected 5 option. Actual: " + actualText1);
			}	
		}
		
		public void VerifyexpottoexceloptionsinmaingridJT() throws InterruptedException {
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[text()='more_vert']")));
//			HelperClass.safeClick(By.xpath("//mat-icon[text()='more_vert']"));
//			
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Export As PDF ']")));
//			HelperClass.safeClick(By.xpath("//span[text()='Export As PDF ']"));
			
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.kebabinmaingrid);
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.exporttopdf);
			HelperClass.waitForPageToLoad(driver);
			
			//Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.kebabinmaingrid);
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.exporttoexcel);
			HelperClass.waitForPageToLoad(driver);
			
			//Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.kebabinmaingrid);
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.exporttocsv);
			HelperClass.waitForPageToLoad(driver);
		}
		
		public void addattachementforjournalandverifyJT() throws InterruptedException, AWTException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), journallocators.attachement);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.attachement);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.chooseafileone);
			
//			WebElement browser = driver.findElement(By.xpath("//button[@class='file-upload-button primary-button']"));
//	        browser.click();
			HelperClass.waitForPageToLoad(driver);
	 
	        // Path of file to upload
	        String filePath = "C:\\Users\\user\\Downloads\\Statement_186540 (3).pdf";
	 
	 
	        // Robot logic
	        Robot robot = new Robot();
	 
	        // Copy file path to clipboard
	        StringSelection selection = new StringSelection(filePath);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	 
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
	        HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.saveandexitinaddjournal);
	        HelperClass.waitForPageToLoad(driver);
	        try {
			    if (HelperClass.isElementPresent(By.xpath("//mat-icon[text()='attachment']"))) {
			        Assert.assertTrue(true,"Attachement attached succesfully");
			    } else {
			        Assert.fail("Attachement not attached");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		}
		
		public void verifyviewoptionthroughjournalidandiconJT() throws InterruptedException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.journalid);
			if (journallocators.journalele.isDisplayed()) {
			    Assert.assertTrue(true,"Details opened succesfully");
			} else {
			    Assert.fail("Details not opened");
			}	
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.downloadinpopup);
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconinpopup);
			if (journallocators.editjournalele.isDisplayed()){
			    Assert.assertTrue(true,"Successfully navigated to edit journal page");
			} else {
			    Assert.fail("not navigated to edit journal page");
			}	
		}
		public void Verifythepageviewanddownloadandeditandkebabintheparticularrow() throws InterruptedException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.pageview);
			if (journallocators.journalele.isDisplayed()) {
			    Assert.assertTrue(true,"Details opened succesfully");
			} else {
			    Assert.fail("Details not opened");
			}	
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.cancleforpopup);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.downloadinrow);
			HelperClass.waitForPageToLoad(driver);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			if (journallocators.editjournalele.isDisplayed()) {
			    Assert.assertTrue(true,"Successfully navigated to edit journal page");
			} else {
			    Assert.fail("not navigated to edit journal page");
			}	
		}
		
		public void EditthejournalandverifyJT() {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			if (journallocators.editjournalele.isDisplayed()) {
			    Assert.assertTrue(true,"Successfully navigated to edit journal page");
			} else {
			    Assert.fail("not navigated to edit journal page");
			}	
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.referenceTF);
			journallocators.referenceTF.clear();
			journallocators.referenceTF.sendKeys("description was ended here");
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.saveandexitinaddjournal);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[@title='description was ended here']"))) {
			        Assert.assertTrue(true,"Journal edited succesfully");
			    } else {
			        Assert.fail("Journal not edited");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			
		}
		
		public void VerifythecopyintherowkebabJT() {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.kebabinrow);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.copyinkebab);
		}
}
	
	


