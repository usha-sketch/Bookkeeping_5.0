package com.Capium.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.BK_CIS_threehundrud_locators;
import com.Capium.Utilies.HelperClass;

public class BK_CIS_threehundrud_actions {

	BK_CIS_threehundrud_locators cis300locators=null;
	
	WebDriver driver=HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	
	public BK_CIS_threehundrud_actions(){
		this.cis300locators = new BK_CIS_threehundrud_locators();
		PageFactory.initElements(HelperClass.getDriver(), cis300locators);
		}
	
	public void navigatetoinsidetheclientandverifyCOO() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), cis300locators.searchTFindashboard);
		Thread.sleep(3000);
		cis300locators.searchTFindashboard.sendKeys("Journal" + Keys.ENTER);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.newclientid);
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
	
	public void navigatetoCISthreehundrudinCISandverifyCOO() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.CIS);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.CISthreehundrud);
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
	}
	
	public void ClickonplusinCISthreehundrudmainmenuandverifyCOO() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.CIS);
		//Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.plusincisthreehundrudmainmenu);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("(//mat-step-header[@aria-setsize='3'])[1]"))) {
		        System.out.println("successfully navigated to add cis 300 page");
		    } else {
		        System.out.println("add new cis 300 page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void verifysearchbarinmaingridCOO() throws InterruptedException {
		Thread.sleep(5000);
		cis300locators.searchbarinmaingrid.sendKeys("jan" + Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> referenceCells = HelperClass.getDriver()
				.findElements(By.xpath("//a[text()=' January - 2025 ']"));
		System.out.println(referenceCells);

		for (WebElement cell : referenceCells) {
			String actual = cell.getText().trim();
			if (actual.contains("Jan")) {
				System.out.println("Matched: " + actual);
			} else {
				System.out.println("Mismatch: " + actual);
			}
		}
	}
	
	public void ClickoncheckboxinmaingridandverifyenablingoptionsCOO() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.checkboxinedit);
		try {
			if (cis300locators.deleteinedit.isDisplayed() && cis300locators.copyinedit.isDisplayed() &&
					cis300locators.exporttoexcelinedit.isDisplayed() && cis300locators.exporttocsvinedit.isDisplayed() && 
					cis300locators.exporttopdfinedit.isDisplayed() && cis300locators.printinedit.isDisplayed()) {
			    System.out.println(" All option are displaying succesfully");
			} else {
			    System.out.println(" All option are not displaying");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
		
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.copyinedit);
		Thread.sleep(3000);
		try {
			if (cis300locators.copysuccessmessage.isDisplayed()) {
			    System.out.println("copy clicked successfully");
			} else {
			    System.out.println("copy not clicked");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
		Thread.sleep(2000);
	}
	
	public void VerifycancleselectionandcrossmarkinthedownCOO() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.checkboxinedit);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.cancelselection);
		Thread.sleep(2000);
		try {
			if (cis300locators.checkboxinedit.isSelected()) {
			    System.out.println("Cancel selection not clicked");
			} else {
			    System.out.println("Cancel selection clicked successfully");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.checkboxinedit);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.crossmark);
		Thread.sleep(2000);
		try {
			if (cis300locators.checkboxinedit.isSelected()) {
			    System.out.println("Cross mark not clicked");
			} else {
			    System.out.println("Cross mark clicked successfully");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
	}
	
	public void VerifypaginationdropdownCOO() throws InterruptedException {
		Thread.sleep(2000);
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
	
	public void VerifyexportoptionsinmaingridCOO() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.exporttopdf);
		Thread.sleep(20000);
		
		//Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.exporttoexcel);
		Thread.sleep(20000);
		
		//Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.exporttocsv);
		Thread.sleep(20000);
	}
	
	public void ClickonperiodinperiodcolumnandverifyCOO() {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.periodinperiodcolum);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//h2[text()='View CIS Monthly Return']"))) {
		        System.out.println("Details are opened successfully");
		    } else {
		        System.out.println("Details are not opened");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void addcisthreehundrudCOO() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.addcis300);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.saveandexitcis300);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), cis300locators.submittocapium);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//p[text()='The operation completed Successfully!']"))) {
		        System.out.println("Submission submitted successfully");
		    } else {
		        System.out.println("Submission not submitted");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
}
