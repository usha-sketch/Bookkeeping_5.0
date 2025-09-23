package com.Capium.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.BK_CIS_Subcontractor_Locators;
import com.Capium.Locators.BK_CIS_reports_locators;
import com.Capium.Utilies.HelperClass;

public class BK_CIS_reports_Actions {

	BK_CIS_reports_locators reportlocators=null;
	
	WebDriver driver=HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	
	public BK_CIS_reports_Actions(){
		this.reportlocators = new BK_CIS_reports_locators();
		PageFactory.initElements(HelperClass.getDriver(), reportlocators);
		}
	 String filePath = "C:\\Users\\user\\Downloads\\CIS_Import_Template_08092025_0208.xlsx";
	
	public void navigatetoinsidetheclientandverifyR() throws InterruptedException {
		Thread.sleep(3000);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.managetab);
//		journallocators.searchTFmanagetab.sendKeys("JJournal" + Keys.ENTER);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), reportlocators.searchTFindashboard);
		Thread.sleep(3000);
		reportlocators.searchTFindashboard.sendKeys("Journal" + Keys.ENTER);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.newclientid);
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
	
	public void navigatetocissubmissioninreportsandverifyR() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.CIS);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.reports);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.cissubmission);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()='January - 2025']"))) {
		        System.out.println("CIS submission tab is navigated successfully");
		    } else {
		        System.out.println("CIS submission tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void clickonplussymbolandverifypdfandmailiconsR() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.plusiconinCISsubmission);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.pdfinplusiconone);
		Thread.sleep(5000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.pdfinplusiconotwo);
		Thread.sleep(5000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.mailinplus);
		if(reportlocators.shareele.isDisplayed()) {
			System.out.println("Email  page opened successfully");
		} else {
			System.out.println("Email not page opened");
		}
		//HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.toemailTF);
		Thread.sleep(3000);
		reportlocators.toemailTF.sendKeys("ushagowri.katta@capium.com");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.emailsendbtn);
		Thread.sleep(3000);
		if(reportlocators.successmailmessage.isDisplayed()) {
			System.out.println("Email sent successfully");
		} else {
			System.out.println("Email not sent");
		}
	}
	
	public void VerifypdficoninactioncolumnR() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.pdfinplusiconothree);
		Thread.sleep(5000);
		
	}
	
	public void navigatetocis300inCISandandfetchthesubmissionperoidandverifythatperiodincissubmissionR() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.CIS);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.CISthreehundrud);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),'Add CIS300')]"))) {
		        System.out.println("CIS 300 tab is navigated successfully");
		    } else {
		        System.out.println("CIS 300 tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		String expected= HelperClass.getText(By.xpath("//a[text()=' January - 2025 ']")).trim();
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.reports);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.cissubmission);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()='January - 2025']"))) {
		        System.out.println("CIS submission tab is navigated successfully");
		    } else {
		        System.out.println("CIS submission tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		String actual= HelperClass.getText(By.xpath("//span[text()='January - 2025']")).trim();
		try {
		    if (actual.contains(expected)) {
		        System.out.println("Submission is showing successfully whic is submitted in cis 300");
		    } else {
		        System.out.println("not submitted");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void navigatetoSubcontractorYTDdetailsinreportsandverifyR() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.CIS);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.reports);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.subcontractorYTDdetails);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[@title='Subcontractor  1']"))) {
		        System.out.println("Subcontrator YTD details tab is navigated successfully");
		    } else {
		        System.out.println("Subcontrator YTD details tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void navigatetocis300inCISandandfetchthesubcontractornameandverifythesamecontractorinsubcontractorYTDdetailsR() throws InterruptedException {
		
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.CIS);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.CISthreehundrud);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),'Add CIS300')]"))) {
		        System.out.println("CIS 300 tab is navigated successfully");
		    } else {
		        System.out.println("CIS 300 tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.submissionperiod);
		String expected= HelperClass.getText(By.xpath(" //mat-cell[text()=' Subcontractor  1 ']")).trim();
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.crossmarkinCIS);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.reports);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.subcontractorYTDdetails);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[@title='Subcontractor  1']"))) {
		        System.out.println("Subcontrator YTD details tab is navigated successfully");
		    } else {
		        System.out.println("Subcontractor YTD details tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		String actual= HelperClass.getText(By.xpath("//span[text()=' Subcontractor  1']")).trim();
		try {
		    if (actual.contains(expected)) {
		        System.out.println("Subcontrator TTD details are showing successfully which is submitted in cis 300");
		    } else {
		        System.out.println("not showing");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifyperioddropdownR() {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.periodDD);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.allyears);
	}
	
	public void verifysubcontractorsdropdownR() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.allsubcontractor);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.subcontractorname);
		if(reportlocators.searchsubcontractor.isDisplayed()) {
			System.out.println("Subcontractor selected successfully");
		} else {
			System.out.println("Subcontractor not selected");
		}
	}
	
	public void VerifyexportoptionsR() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.exporttopdf);
		Thread.sleep(20000);
		
		//Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.exporttoexcel);
		Thread.sleep(20000);
		
		//Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.exporttocsv);
		Thread.sleep(20000);
	}
	
	public void verifyemailandimportoptionskebabR() throws InterruptedException, AWTException {
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.kebabinmaingrid);
//		Thread.sleep(5000);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.mailinplus);
//		if(reportlocators.shareele.isDisplayed()) {
//			System.out.println("Email  page opened successfully");
//		} else {
//			System.out.println("Email not page opened");
//		}
//		//HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.toemailTF);
//		Thread.sleep(3000);
//		reportlocators.toemailTF.sendKeys("ushagowri.katta@capium.com");
//		Thread.sleep(3000);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.emailsendbtn);
//		Thread.sleep(5000);
//		if(reportlocators.successmailmessage.isDisplayed()) {
//			System.out.println("Email sent successfully");
//		} else {
//			System.out.println("Email not sent");
//		}
		
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.kebabinmaingrid);
		Thread.sleep(5000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.importicon);
		
		// Click on the Choose File button
        WebElement browser = driver.findElement(By.xpath("//button[@class='file-upload-button primary-button']"));
        browser.click();
        Thread.sleep(2000);

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

        Thread.sleep(2000);

        // Press ENTER
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.nextbtn);
        Thread.sleep(3000);
	}
	
	public void navigatetoCISinvoiceinreportsandverifyR() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.CIS);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.reports);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.cisinvoivetab);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[@title='Subcontractor  1']"))) {
		        System.out.println("CIS invoice tab is navigated successfully");
		    } else {
		        System.out.println("CIS invoice tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void navigatetocis300inCISandandfetchthesubcontractornameandverifythesubcontratorincisinvoiceR() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.CIS);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.CISthreehundrud);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),'Add CIS300')]"))) {
		        System.out.println("CIS 300 tab is navigated successfully");
		    } else {
		        System.out.println("CIS 300 tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.submissionperiod);
		String expected= HelperClass.getText(By.xpath(" //mat-cell[text()=' Subcontractor  1 ']")).trim();
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.crossmarkinCIS);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.reports);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.cisinvoivetab);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[@title='Subcontractor  1']"))) {
		        System.out.println("Cis invoice tab is navigated successfully");
		    } else {
		        System.out.println("Cis invoice tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		String actual= HelperClass.getText(By.xpath("//span[text()=' Subcontractor  1']")).trim();
		try {
		    if (actual.contains(expected)) {
		        System.out.println("Cis invoice details are showing successfully which is submitted in cis 300");
		    } else {
		        System.out.println("not showing");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void VerifypdfandemailoptionsR() throws InterruptedException {
		Thread.sleep(5000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.pdfincisinvoice);
		Thread.sleep(5000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.mailinplus);
		if(reportlocators.shareele.isDisplayed()) {
			System.out.println("Email  page opened successfully");
		} else {
			System.out.println("Email not page opened");
		}
		//HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.toemailTF);
		Thread.sleep(5000);
		reportlocators.toemailTF.sendKeys("ushagowri.katta@capium.com");
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.emailsendbtn);
		Thread.sleep(4000);
		if(reportlocators.successmailmessage.isDisplayed()) {
			System.out.println("Email sent successfully");
		} else {
			System.out.println("Email not sent");
		}
	}
	
	public void VerifytheperioddropdownR() throws InterruptedException {
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.perioddropdown);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.allyearsdd);
		Thread.sleep(4000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[text()='01-Jan-2025 - 31-Dec-2025']", "All Years");
	}
	
	public void verifythesubcontractorsdropdownR() throws InterruptedException {
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.allsubcontractor);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), reportlocators.subcontractorone);
		Thread.sleep(6000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//div[@aria-haspopup='listbox']", "Subcontractor  1");
	}
}





















