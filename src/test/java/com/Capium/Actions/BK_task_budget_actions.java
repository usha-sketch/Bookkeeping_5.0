package com.Capium.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.BK_task_budget_locators;
import com.Capium.Utilies.HelperClass;

public class BK_task_budget_actions {

	BK_task_budget_locators budgetlocators=null;
	
	WebDriver driver=HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	
	public BK_task_budget_actions(){
		this.budgetlocators = new BK_task_budget_locators();
		PageFactory.initElements(HelperClass.getDriver(), budgetlocators);
		}
	
	public void navigatetoinsidetheclientandverifyBB() throws InterruptedException {
		Thread.sleep(3000);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), journallocators.managetab);
//		journallocators.searchTFmanagetab.sendKeys("JJournal" + Keys.ENTER);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), budgetlocators.searchTFindashboard);
		Thread.sleep(3000);
		budgetlocators.searchTFindashboard.sendKeys("Journal" + Keys.ENTER);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.newclientid);
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
	
	public void navigatetobudgetintaskandverifyBB() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.task);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.budgettab);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[contains(text(),'Add Budgeting')]"))) {
		        System.out.println("budget tab is navigated successfully");
		    } else {
		        System.out.println("budget tab is not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonplusinbudgetmainmenuandverifyBB() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),  budgetlocators.task);
		//Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),  budgetlocators.plusinbudgetmainmenu);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Budget']"))) {
		        System.out.println("successfully navigated to add new budget page");
		    } else {
		        System.out.println("add new budget page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	public void addbudgetandverifyBB() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.addbudgetbtn);
		Thread.sleep(3000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Budget']"))) {
		        System.out.println("successfully navigated to add new budget page");
		    } else {
		        System.out.println("add new budget page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
		
		budgetlocators.budgetnameTF.sendKeys("sales budget");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.saveandexitbtn);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Add New Budget ']"))) {
		        System.out.println("successfully clicked on save and exit");
		    } else {
		        System.out.println("Not clicked on save and exit");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void ClickonplussymbolineditbudgetpageBB() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.editiconbudget);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.plusineditjournal);
		Thread.sleep(2000);
		try {
		    if (HelperClass.isElementPresent(By.xpath("//span[normalize-space()='Add New Budget']"))) {
		        System.out.println("successfully navigated to add new budget page");
		    } else {
		        System.out.println("add new budget page not navigated");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
		}
	}
	
	public void VerifysearchiconandcrossmarkineditjournalpageBB() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.editiconbudget);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.searchineditpage);
		Thread.sleep(2000);
		budgetlocators.searchTFineditpage.sendKeys("budget");
		Thread.sleep(2000);
		List<WebElement> referenceCells = HelperClass.getDriver()
				.findElements(By.xpath("//span[@title='budget business']"));
		System.out.println(referenceCells);

		for (WebElement cell : referenceCells) {
			String actual = cell.getText().trim();
			if (actual.contains("budget")) {
				System.out.println("Matched: " + actual);
			} else {
				System.out.println("Mismatch: " + actual);
			}
		}
			HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.crossmarkinsearch);
			Thread.sleep(2000);
			String actualText1 = HelperClass.getText(By.xpath("//input[@placeholder='Search']")).trim();
			String expected1 = "budget";
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
	
	public void ClickoncheckboxineditbudgetpageandverifytheenablingoptionsBB() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.editiconbudget);
//		wait.until(ExpectedConditions.visibilityOf(journallocators.checkboxinedit));
//		wait.until(ExpectedConditions.elementToBeClickable(journallocators.checkboxinedit));
		Thread.sleep(4000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.checkboxinedit);
		try {
			if (budgetlocators.deleteinedit.isDisplayed() && budgetlocators.copyinedit.isDisplayed() &&
					budgetlocators.exporttoexcelinedit.isDisplayed() && budgetlocators.exporttocsvinedit.isDisplayed() && 
					budgetlocators.exporttopdfinedit.isDisplayed() && budgetlocators.printinedit.isDisplayed() && 
					budgetlocators.inactiveinedit.isDisplayed() && budgetlocators.activeinedit.isDisplayed()) {
			    System.out.println(" All option are displaying succesfully");
			} else {
			    System.out.println(" All option are not displaying");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
	}
	
	public void  ClickondoublearrowsineditbudgetpageandverifythedetailboxesareopeningorclosingBB() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.addbudgetbtn);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(),budgetlocators.openarrowinaddjournal);
		
		try {
		if (budgetlocators.closerrowinaddjournal.isDisplayed()) {
		    System.out.println("budget detail boxes are closed succssfully");
		} else {
		    System.out.println("Boxed are not closed");
		}
		} catch (Exception e) {
		    System.out.println("An error occurred " + e.getMessage());
		}
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.closerrowinaddjournal);
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.visibilityOf(journallocators.closerrowinaddjournal));
//		wait.until(ExpectedConditions.elementToBeClickable(journallocators.closerrowinaddjournal));
		try {
			if (budgetlocators.budgetnameTF.isDisplayed()) {
			    System.out.println("budget detail boxes are opened successfully");
			} else {
			    System.out.println("Boxed are not opened");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
		
	}
	
	public void verifysearchbarinmaingridBB() throws InterruptedException {
		Thread.sleep(5000);
		budgetlocators.searchbarinmaingrid.sendKeys("active" + Keys.ENTER);
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
	
	public void ClickoncheckboxinmaingridandverifyenablingoptionsBB() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.checkboxinedit);
		try {
			if (budgetlocators.deleteinedit.isDisplayed() && budgetlocators.copyinedit.isDisplayed() &&
					budgetlocators.exporttoexcelinedit.isDisplayed() && budgetlocators.exporttocsvinedit.isDisplayed() && 
					budgetlocators.exporttopdfinedit.isDisplayed() && budgetlocators.printinedit.isDisplayed() && 
					budgetlocators.inactiveinedit.isDisplayed() && budgetlocators.activeinedit.isDisplayed()) {
			    System.out.println(" All option are displaying succesfully");
			} else {
			    System.out.println("All option are not displaying");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
		
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.copyinedit);
		Thread.sleep(3000);
		try {
			if (budgetlocators.copysuccessmessage.isDisplayed()) {
			    System.out.println("copy clicked successfully");
			} else {
			    System.out.println("copy not clicked");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred" + e.getMessage());
			}
		Thread.sleep(2000);
	}
	
	public void VerifycancleselectionandcrossmarkinthedownBB() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.checkboxinedit);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.cancelselection);
		Thread.sleep(2000);
		try {
			if (budgetlocators.checkboxinedit.isSelected()) {
			    System.out.println("Cancel selection not clicked");
			} else {
			    System.out.println("Cancel selection clicked successfully");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.checkboxinedit);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.crossmark);
		Thread.sleep(2000);
		try {
			if (budgetlocators.checkboxinedit.isSelected()) {
			    System.out.println("Cross mark not clicked");
			} else {
			    System.out.println("Cross mark clicked successfully");
			}
			} catch (Exception e) {
			    System.out.println("An error occurred " + e.getMessage());
			}
	}
	
	public void VerifypaginationdropdownBB() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//span[@aria-label='dropdownlist']", "5");
		
		Thread.sleep(2000);
		String actualText1 = HelperClass.getText(By.xpath("//span[@aria-label='dropdownlist']")).trim();
		String expected1 = "5";
 
		if (actualText1.equals(expected1)) {
		    System.out.println("Dropdown Selected 5 option");
		} else {
		    System.out.println("Dropdown not Selected 5 option. Actual: " + actualText1);
		}	
	}
	
	public void VerifyexportoptionsinmaingridBB() throws InterruptedException {
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.exporttopdf);
		Thread.sleep(20000);
		
		//Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.exporttoexcel);
		Thread.sleep(20000);
		
		//Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.kebabinmaingrid);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.exporttocsv);
		Thread.sleep(20000);
	}

	
	public void VerifytheexportoptionfortheparticularbudgetintherowBB() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.downloadicon);
		Thread.sleep(2000);
	}
	
	public void verifyviewoptionBB() {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.pageviewicon);
		if(budgetlocators.budgetele.isDisplayed()) {
			System.out.println("pageview opened successfully");
		} else {
			System.out.println("pageview not opened");
		}
	}
	
	public void VerifythedownloadandeditandcloseoptionsthroughtheviewiconBB() throws InterruptedException{
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.downloadinpageview);
		Thread.sleep(20000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.editinpageview);
		Thread.sleep(2000);
		if(budgetlocators.editbudgetele.isDisplayed()) {
			System.out.println("edit budget page navigated succesfully");
		} else {
			System.out.println("edit budget page not navigated");
		}
	}
	
	public void EditthebudgetandverifyBB() throws InterruptedException {
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.editiconbudget);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.singlearrowforbudgetinglist);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.includeorexcludeaccount);
		Thread.sleep(2000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.accountcheckbox);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.save);
		budgetlocators.accountTF.sendKeys("100");
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.saveandexit);
		Thread.sleep(10000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.editiconbudgettwo);
		Thread.sleep(2000);
//		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), budgetlocators.singlearrowforbudgetinglisttwo);
//		HelperClass.ClickUsingJS(HelperClass.getDriver(), budgetlocators.singlearrowforbudgetinglisttwo);
//		Thread.sleep(2000);
//		String actualText1 = HelperClass.getText(By.xpath("(//input[@maxlength='10'])[1]")).trim();
//		String expected1 = "100";
// 
//		if (actualText1.equals(expected1)) {
//		    System.out.println("Budget Edited Successfully");
//		} else {
//		    System.out.println("Budget not edited. Actual: " + actualText1);
//		}	
	}
		
	
}
