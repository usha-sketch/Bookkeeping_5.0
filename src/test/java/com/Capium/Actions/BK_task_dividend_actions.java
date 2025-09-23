package com.Capium.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.BK_task_dividend_locators;
import com.Capium.Utilies.HelperClass;

public class BK_task_dividend_actions {

	BK_task_dividend_locators dividendlocators=null;
	
	WebDriver driver=HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	
	public BK_task_dividend_actions(){
		this.dividendlocators = new BK_task_dividend_locators();
		PageFactory.initElements(HelperClass.getDriver(), dividendlocators);
		}
	
	public void navigatetoinsidetheclientandverifyDE() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), dividendlocators.searchTFindashboard);
		Thread.sleep(3000);
		dividendlocators.searchTFindashboard.sendKeys("Journal" + Keys.ENTER);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.newclientid);
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
	public void navigatetodividendintaskandverifyDE() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.task);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.dividendtab);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),'Add Dividend')]"))) {
		        System.out.println("Dividend tab is navigated successfully");
		    } else {
		        System.out.println("Dividend tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonplusinbudgetmainmenuandverifyDE() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.task);
		//Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.plusindividendmainmenu);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),'Add Dividend')]"))) {
		        System.out.println("successfully navigated to add new dividend page");
		    } else {
		        System.out.println("add new dividend page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonplussymbolineditdividendpageandverifyDE() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.editicondividend);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.plusineditdividend);
		Thread.sleep(2000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Dividends']"))) {
		        System.out.println("successfully navigated to add new dividend page");
		    } else {
		        System.out.println("add new dividend page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void VerifysearchiconandcrossmarkineditdividendpageDE() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.editicondividend);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.searchineditpage);
		Thread.sleep(2000);
		dividendlocators.searchTFineditpage.sendKeys("DIV");
		Thread.sleep(2000);
		List<WebElement> referenceCells = HelperClass.getDriver()
				.findElements(By.xpath("//a[@class='list-name clamp']"));
		System.out.println(referenceCells);

		for (WebElement cell : referenceCells) {
			String actual = cell.getText().trim();
			if (actual.contains("DIV")) {
				System.out.println("Matched: " + actual);
			} else {
				System.out.println("Mismatch: " + actual);
			}
		}
			HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.crossmarkinsearch);
			Thread.sleep(2000);
			String actualText1 = HelperClass.getText(By.xpath("//input[@placeholder='Search']")).trim();
			String expected1 = "DIV";
			try {
			if (actualText1.contains(expected1)) {
			    System.out.println(" Cross mark not clicked");
			} else {
			    System.out.println(" cross mark clicked. Actual: " + actualText1);
			}
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
	}
	
	public void ClickoncheckboxineditdividendpageandverifytheenablingoptionsDE() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.editicondividend);	
		Thread.sleep(4000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.checkboxinedit);
		try {
			if (dividendlocators.deleteinedit.isDisplayed() && dividendlocators.copyinedit.isDisplayed() &&
					dividendlocators.exporttoexcelinedit.isDisplayed() && dividendlocators.exporttocsvinedit.isDisplayed() && 
					dividendlocators.exporttopdfinedit.isDisplayed() && dividendlocators.printinedit.isDisplayed() && 
					dividendlocators.inactiveinedit.isDisplayed() && dividendlocators.activeinedit.isDisplayed()) {
			    System.out.println(" All option are displaying succesfully");
			} else {
			    System.out.println(" All option are not displaying");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
		
	}
	
	public void ClickondoublearrowsineditdividendpageandverifythedetailboxesareopeningorclosingDE() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.adddividendbtn);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.openarrowinadddividend);
		
		try {
		if (dividendlocators.closerrowinadddividend.isDisplayed()) {
		    System.out.println("Dividend boxes are closed succssfully");
		} else {
		    System.out.println("Boxed are not closed");
		}
		} catch (Exception e) {
		    System.out.println("An error occurred " + e.getMessage());
		}
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.closerrowinadddividend);
		Thread.sleep(2000);
//		
		try {
			if (dividendlocators.dividendpershareoele.isDisplayed()) {
			    System.out.println("Dividend boxes are opened successfully");
			} else {
			    System.out.println("Boxed are not opened");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
	}
	
	public void verifysearchbarinmaingridDE() throws InterruptedException {
		Thread.sleep(5000);
		dividendlocators.searchbarinmaingrid.sendKeys("equity" + Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> referenceCells = HelperClass.getDriver()
				.findElements(By.xpath("//span[@title='Equity']"));
		System.out.println(referenceCells);

		for (WebElement cell : referenceCells) {
			String actual = cell.getText().trim();
			if (actual.contains("Equity")) {
				System.out.println("Matched: " + actual);
			} else {
				System.out.println("Mismatch: " + actual);
			}
		}
	}
	
	public void ClickoncheckboxinmaingridandverifyenablingoptionsDE() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.checkboxinedit);
		try {
			if (dividendlocators.deleteinedit.isDisplayed() && dividendlocators.copyinedit.isDisplayed() &&
					dividendlocators.exporttoexcelinedit.isDisplayed() && dividendlocators.exporttocsvinedit.isDisplayed() && 
					dividendlocators.exporttopdfinedit.isDisplayed() && dividendlocators.printinedit.isDisplayed() && 
					dividendlocators.inactiveinedit.isDisplayed() && dividendlocators.activeinedit.isDisplayed()) {
			    System.out.println("All option are displaying succesfully");
			} else {
			    System.out.println("All option are not displaying");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
		
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.copyinedit);
		Thread.sleep(3000);
		try {
			if (dividendlocators.copysuccessmessage.isDisplayed()) {
			    System.out.println("copy clicked successfully");
			} else {
			    System.out.println("copy not clicked");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
		Thread.sleep(10000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.checkboxinedit);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.exporttoexceltwo);
		Thread.sleep(10000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.exporttocsvtwo);
		Thread.sleep(10000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.exporttopdftwo);
		Thread.sleep(5000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.checkboxinedit);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.inactiveinedittwo);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.yesforinactive);
		List<WebElement> referenceCells = HelperClass.getDriver()
				.findElements(By.xpath("//div[@title='Inactive']"));
		System.out.println(referenceCells);

		for (WebElement cell : referenceCells) {
			String actual = cell.getText().trim();
			if (actual.contains("Inactive")) {
				System.out.println("Matched: " + actual);
			} else {
				System.out.println("Mismatch: " + actual);
			}
		}
		Thread.sleep(4000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.checkboxtwo);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.activeinedittwo);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.yesforactive);
		Thread.sleep(2000);
		List<WebElement> referenceCells1 = HelperClass.getDriver()
				.findElements(By.xpath("//div[@title='Active']"));
		System.out.println(referenceCells);

		for (WebElement cell : referenceCells1) {
			String actual = cell.getText().trim();
			if (actual.contains("Active")) {
				System.out.println("Matched: " + actual);
			} else {
				System.out.println("Mismatch: " + actual);
			}
		}
	}
	
	public void VerifycancleselectionandcrossmarkinthedownDE() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.checkboxinedit);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.cancelselection);
		Thread.sleep(2000);
		try {
			if (dividendlocators.checkboxinedit.isSelected()) {
			    System.out.println("Cancel selection not clicked");
			} else {
			    System.out.println("Cancel selection clicked successfully");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.checkboxinedit);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.crossmark);
		Thread.sleep(2000);
		try {
			if (dividendlocators.checkboxinedit.isSelected()) {
			    System.out.println("Cross mark not clicked");
			} else {
			    System.out.println("Cross mark clicked successfully");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
	}
	
	public void VerifypaginationdropdownDE() throws InterruptedException {
		Thread.sleep(5000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[@aria-label='dropdownlist']", "20");
		
		Thread.sleep(2000);
		String actualText1 = HelperClass.getText(By.xpath("//span[@aria-label='dropdownlist']")).trim();
		String expected1 = "5";
 
		if (actualText1.equals(expected1)) {
		    System.out.println("Dropdown Selected 5 option");
		} else {
		    System.out.println("Dropdown not Selected 5 option. Actual: " + actualText1);
		}	
	}
	
	public void VerifyexportoptionsinmaingridDE() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.exporttopdf);
		Thread.sleep(20000);
		
		//Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.exporttoexcel);
		Thread.sleep(20000);
		
		//Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.exporttocsv);
		Thread.sleep(20000);
	}
	
	public void verifyviewoptionthroughshareholdernameandviewiconDE() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.shareholdetid);
		if (dividendlocators.dividendele.isDisplayed()) {
		    System.out.println("Details opened succesfully");
		} else {
		    System.out.println("Details opened succesfully");
		}	
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.downloadinpopup);
		Thread.sleep(5000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.downloadpdfinpopup);
		Thread.sleep(5000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.editiconinpopup);
		if (dividendlocators.editdividendele.isDisplayed()) {
		    System.out.println("Successfully navigated to edit dividend page");
		} else {
		    System.out.println("not navigated to edit dividend page");
		}	
	}
	
	public void VerifytheexportoptionfortheparticulardividendintherowDE() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.pageview);
		if (dividendlocators.dividendele.isDisplayed()) {
		    System.out.println("Details opened succesfully");
		} else {
		    System.out.println("Details opened succesfully");
		}	
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.cancleforpopup);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.downloadinrow);
		Thread.sleep(5000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.editicondividend);
		if (dividendlocators.editdividendele.isDisplayed()) {
		    System.out.println("Successfully navigated to edit dividend page");
		} else {
		    System.out.println("not navigated to edit dividend page");
		}	
	}
	
	public void EditthedividendandverifyDE() {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.editiconforthreedividend);
		dividendlocators.dividendpershareTF.sendKeys("100");
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), dividendlocators.checkboxjournal);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.checkboxjournal);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.saveandexittwo);
		if(dividendlocators.journalid.isDisplayed()) {
			System.out.println("Journal created for dividend successfully");
		} else {
			System.out.println("Journal not created for dividend");
		}
	}
	
	public void adddividendandverifyDE() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.adddividendbtn);
		Thread.sleep(10000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[1]", "shareholder 1");
		Thread.sleep(10000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "Ordinary Share Class 5");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), dividendlocators.saveandexitinaddjournal);
		Thread.sleep(3000);
//		try {
//		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' DIV - 266']"))) {
//		        System.out.println("Dividend created succesfully");
//		    } else {
//		        System.out.println("Dividend not created");
//		    }
//		} catch (Exception e) {
//		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
//		}
	}
}
























