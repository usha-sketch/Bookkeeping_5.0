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
		Thread.sleep(3000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), journallocators.searchTFindashboard);
		Thread.sleep(3000);
		journallocators.searchTFindashboard.sendKeys("Journal" + Keys.ENTER);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.newclientid);
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
		
		public void navigatetojournalandverifyJT() throws InterruptedException {
			Thread.sleep(3000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.task);
			Thread.sleep(3000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.journaltab);
			Thread.sleep(3000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),'Add Journal')]"))) {
			        System.out.println("Journal tab is navigated successfully");
			    } else {
			        System.out.println("Journal tab is not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		}
		
		public void ClickonplusinjournalmainmenuJTandverify() throws InterruptedException {
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.task);
			//Thread.sleep(3000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.plusinjournalmainmenu);
			Thread.sleep(3000);
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
		
		public void addjournalandverifyJT() throws InterruptedException {
			Thread.sleep(3000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.addjournakbtn);
			Thread.sleep(3000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Journal']"))) {
			        System.out.println("successfully navigated to add new journal page");
			    } else {
			        System.out.println("add new journal page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			
			HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), journallocators.accountDDinjournaldetails);
			Thread.sleep(2000);
			journallocators.accountDDinjournaldetails.sendKeys("1010");
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.salesCOA);
			journallocators.creditamountTF.sendKeys("500");
			journallocators.addnewlineinJT.click();
			Thread.sleep(3000);
			journallocators.secondaccountDDinjournaldetails.sendKeys("8045");
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.cashinhandCOA);
			journallocators.debitamountTF.sendKeys("500");
			Thread.sleep(3000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.unknownele);
			Thread.sleep(3000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.saveandexitinaddjournal);
			Thread.sleep(3000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),'Add Journal')]"))) {
			        System.out.println("Journal tab is navigated successfully");
			    } else {
			        System.out.println("Journal tab is not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		}
		
		public void addnewlinesanddeletelinesforjournalandverifyJT() throws InterruptedException {
			Thread.sleep(3000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.addjournakbtn);
			Thread.sleep(3000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Journal']"))) {
			        System.out.println("successfully navigated to add new journal page");
			    } else {
			        System.out.println("add new journal page not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			
			HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), journallocators.accountDDinjournaldetails);
			Thread.sleep(2000);
			journallocators.accountDDinjournaldetails.sendKeys("1010");
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.salesCOA);
			//journallocators.creditamountTF.sendKeys("500");
			Thread.sleep(3000);
			journallocators.addnewlineinJT.click();
			Thread.sleep(3000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("(//input[@aria-haspopup='listbox'])[2]"))) {
			        System.out.println("secondline added succesfully");
			    } else {
			        System.out.println("secondline not added");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			
			
			Thread.sleep(4000);
			journallocators.addnewlineinJT.click();
			Thread.sleep(3000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("(//input[@aria-haspopup='listbox'])[3]"))) {
			        System.out.println("Thirdline added succesfully");
			    } else {
			        System.out.println("Thirdline not added");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			
			Thread.sleep(4000);
			journallocators.addnewlineinJT.click();
			Thread.sleep(3000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("(//input[@aria-haspopup='listbox'])[4]"))) {
			        System.out.println("fourthline added succesfully");
			    } else {
			        System.out.println("fourthline not added");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			Thread.sleep(2000);
			journallocators.deletefour.click();
			Thread.sleep(3000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("(//input[@aria-haspopup='listbox'])[4]"))) {
			        System.out.println("fourthline not deleted");
			    } else {
			        System.out.println("fourthline deleted");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		
			Thread.sleep(2000);
			journallocators.deletethree.click();
			Thread.sleep(3000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("(//input[@aria-haspopup='listbox'])[3]"))) {
			        System.out.println("Thirdline not deleted");
			    } else {
			        System.out.println("Thirdline deleted");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			
			Thread.sleep(2000);
			journallocators.deletetwo.click();
			Thread.sleep(3000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("(//input[@aria-haspopup='listbox'])[2]"))) {
			        System.out.println("second line not deleted");
			    } else {
			        System.out.println("second line deleted");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
			
			
				
			}
			
		public void ClickonplussymbolineditjournalpageJT() throws InterruptedException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.plusineditjournal);
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
		
		public void VerifysearchiconineditjournalpageJT() throws InterruptedException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.searchineditpage);
			Thread.sleep(2000);
			journallocators.searchTFineditpage.sendKeys("2");
			Thread.sleep(2000);
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
		
		public void Clickoncheckboxineditjournalpageandverifytheenablingoptions() throws InterruptedException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			Thread.sleep(4000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.checkboxinedit);
			try {
				if (journallocators.deleteinedit.isDisplayed() && journallocators.copyinedit.isDisplayed() &&
						journallocators.exporttoexcelinedit.isDisplayed() && journallocators.exporttocsvinedit.isDisplayed() && 
						journallocators.exporttopdfinedit.isDisplayed() && journallocators.printinedit.isDisplayed() && 
						journallocators.inactiveinedit.isDisplayed() && journallocators.activeinedit.isDisplayed()) {
				    System.out.println(" All option are displaying succesfully");
				} else {
				    System.out.println(" All option are not displaying");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred " + e.getMessage());
				}
			
		}
		
		public void ClickondoublearrowsineditjournalpageandverifythedetailboxesareopeningorclosingJT() throws InterruptedException{
//			wait.until(ExpectedConditions.visibilityOf(journallocators.openarrowinaddjournal));
//			wait.until(ExpectedConditions.elementToBeClickable(journallocators.openarrowinaddjournal));
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.openarrowinaddjournal);
			
			try {
			if (journallocators.closerrowinaddjournal.isDisplayed()) {
			    System.out.println("journal boxes are closed succssfully");
			} else {
			    System.out.println("Boxed are not closed");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.closerrowinaddjournal);
			Thread.sleep(2000);
//			wait.until(ExpectedConditions.visibilityOf(journallocators.closerrowinaddjournal));
//			wait.until(ExpectedConditions.elementToBeClickable(journallocators.closerrowinaddjournal));
			try {
				if (journallocators.journalnoele.isDisplayed()) {
				    System.out.println("journal boxes are opened succssfully");
				} else {
				    System.out.println("Boxed are not opened");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred" + e.getMessage());
				}
		}
		
		public void ClickonsidesinglearrowsineditjournalpageandverifyJT() throws InterruptedException {
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.singlearrow1);
			Thread.sleep(2000);
			try {
				if (journallocators.journalnoele.isDisplayed()) {
				    System.out.println("Arrow 1 not clicked");
				} else {
				    System.out.println("Arrow 1 is clicked");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred" + e.getMessage());
				}
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.singlearrow2);
			Thread.sleep(2000);
			try {
				if (journallocators.addnewlineinJT.isDisplayed()) {
				    System.out.println("Arrow 2 not clicked");
				} else {
				    System.out.println("Arrow 2 is clicked");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred" + e.getMessage());
				}
			
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.singlearrow3);
			Thread.sleep(2000);
			try {
				if (journallocators.chooseafile.isDisplayed()) {
				    System.out.println("Arrow 3 is clicked");
				} else {
				    System.out.println("Arrow 3 is not clicked");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred" + e.getMessage());
				}
		}
		
		public void verifysearchbarinmaingridJT() throws InterruptedException {
			Thread.sleep(5000);
			journallocators.searchbarinmaingrid.sendKeys("description1" + Keys.ENTER);
			Thread.sleep(2000);
			
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
			    System.out.println("Dropdown Selected all years option");
			} else {
			    System.out.println("Dropdown not Selected all years option. Actual: " + actualText);
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
			    System.out.println("Dropdown Selected 01-Jan-2025 - 31-Dec-2025 option");
			} else {
			    System.out.println("Dropdown not Selected 01-Jan-2025 - 31-Dec-2025 option. Actual: " + actualText1);
			}	
		}
		
		public void ClickoncheckboxinmaingridandverifyenablingoptionsJT() throws InterruptedException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.checkboxinedit);
			try {
				if (journallocators.deleteinedit.isDisplayed() && journallocators.copyinedit.isDisplayed() &&
						journallocators.exporttoexcelinedit.isDisplayed() && journallocators.exporttocsvinedit.isDisplayed() && 
						journallocators.exporttopdfinedit.isDisplayed() && journallocators.printinedit.isDisplayed() && 
						journallocators.inactiveinedit.isDisplayed() && journallocators.activeinedit.isDisplayed()) {
				    System.out.println("All option are displaying succesfully");
				} else {
				    System.out.println(" All option are not displaying");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred " + e.getMessage());
				}
			
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.copyinedit);
			Thread.sleep(3000);
			try {
				if (journallocators.copysuccessmessage.isDisplayed()) {
				    System.out.println("copy clicked successfully");
				} else {
				    System.out.println("copy not clicked");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred" + e.getMessage());
				}
			Thread.sleep(2000);
		}
		
		public void VerifycancleselectionandcrossmarkinthedownJT() throws InterruptedException {
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.checkboxinedit);
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.cancelselection);
			Thread.sleep(2000);
			try {
				if (journallocators.checkboxinedit.isSelected()) {
				    System.out.println("Cancel selection not clicked");
				} else {
				    System.out.println("Cancel selection clicked successfully");
				}
				} catch (Exception e) {
				    System.out.println("An error occurred " + e.getMessage());
				}
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.checkboxinedit);
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.crossmark);
			Thread.sleep(2000);
			try {
				if (journallocators.checkboxinedit.isSelected()) {
				    System.out.println("Cross mark not clicked");
				} else {
				    System.out.println("Cross mark clicked successfully");
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
			  
			Thread.sleep(2000);
			String actualText1 = HelperClass.getText(By.xpath("//span[@aria-label='dropdownlist']")).trim();
			String expected1 = "5";
	 
			if (actualText1.equals(expected1)) {
			    System.out.println("Dropdown Selected 5 option");
			} else {
			    System.out.println("Dropdown not Selected 5 option. Actual: " + actualText1);
			}	
		}
		
		public void VerifyexpottoexceloptionsinmaingridJT() throws InterruptedException {
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[text()='more_vert']")));
//			HelperClass.safeClick(By.xpath("//mat-icon[text()='more_vert']"));
//			
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Export As PDF ']")));
//			HelperClass.safeClick(By.xpath("//span[text()='Export As PDF ']"));
			
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.kebabinmaingrid);
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.exporttopdf);
			Thread.sleep(20000);
			
			//Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.kebabinmaingrid);
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.exporttoexcel);
			Thread.sleep(20000);
			
			//Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.kebabinmaingrid);
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.exporttocsv);
			Thread.sleep(20000);
		}
		
		public void addattachementforjournalandverifyJT() throws InterruptedException, AWTException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), journallocators.attachement);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.attachement);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.chooseafileone);
			
//			WebElement browser = driver.findElement(By.xpath("//button[@class='file-upload-button primary-button']"));
//	        browser.click();
	        Thread.sleep(2000);
	 
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
	 
	        Thread.sleep(3000);
	 
	        // Press ENTER
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        Thread.sleep(3000);
	        HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.saveandexitinaddjournal);
	        Thread.sleep(3000);
	        try {
			    if (HelperClass.isElementPresent(By.xpath("//mat-icon[text()='attachment']"))) {
			        System.out.println("Attachement attached succesfully");
			    } else {
			        System.out.println("Attachement not attached");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
		}
		
		public void verifyviewoptionthroughjournalidandiconJT() throws InterruptedException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.journalid);
			if (journallocators.journalele.isDisplayed()) {
			    System.out.println("Details opened succesfully");
			} else {
			    System.out.println("Details opened succesfully");
			}	
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.downloadinpopup);
			Thread.sleep(5000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconinpopup);
			if (journallocators.editjournalele.isDisplayed()){
			    System.out.println("Successfully navigated to edit dividend page");
			} else {
			    System.out.println("not navigated to edit dividend page");
			}	
		}
		public void Verifythepageviewanddownloadandeditandkebabintheparticularrow() throws InterruptedException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.pageview);
			if (journallocators.journalele.isDisplayed()) {
			    System.out.println("Details opened succesfully");
			} else {
			    System.out.println("Details opened succesfully");
			}	
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.cancleforpopup);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.downloadinrow);
			Thread.sleep(5000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			if (journallocators.editjournalele.isDisplayed()) {
			    System.out.println("Successfully navigated to edit dividend page");
			} else {
			    System.out.println("not navigated to edit dividend page");
			}	
		}
		
		public void EditthejournalandverifyJT() {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.editiconjournal);
			if (journallocators.editjournalele.isDisplayed()) {
			    System.out.println("Successfully navigated to edit dividend page");
			} else {
			    System.out.println("not navigated to edit dividend page");
			}	
			
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.referenceTF);
			journallocators.referenceTF.clear();
			journallocators.referenceTF.sendKeys("description was ended here");
			HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.saveandexitinaddjournal);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[@title='description was ended here']"))) {
			        System.out.println("Journal edited succesfully");
			    } else {
			        System.out.println("Journal not edited");
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
	
	


