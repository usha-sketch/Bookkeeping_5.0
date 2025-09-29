
package com.Capium.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.BK_task_Bulkedit_locators;
import com.Capium.Utilies.HelperClass;

public class BK_task_bulkedit_actions {

	BK_task_Bulkedit_locators bulkeditlocators=null;
	
	WebDriver driver=HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	
	public BK_task_bulkedit_actions(){
		this.bulkeditlocators = new BK_task_Bulkedit_locators();
		PageFactory.initElements(HelperClass.getDriver(), bulkeditlocators);
		}
	
	public void  navigatetoinsidetheclientandverifyBE() throws InterruptedException {
		Thread.sleep(3000);
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), bulkeditlocators.searchTFindashboard);
		Thread.sleep(3000);
		bulkeditlocators.searchTFindashboard.sendKeys("Journal" + Keys.ENTER);
		Thread.sleep(3000);
		HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.newclientid);
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
		
		public void navigatetobulkeditintaskandverifyBE() throws InterruptedException {
			Thread.sleep(3000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.task);
			Thread.sleep(3000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.bulkedittab);
			Thread.sleep(3000);
			try {
			    if (HelperClass.isElementPresent(By.xpath("//span[text()=' Account ']"))) {
			        System.out.println("Bulk edit tab is navigated successfully");
			    } else {
			        System.out.println("Bulk edit tab tab is not navigated");
			    }
			} catch (Exception e) {
			    System.out.println("An error occurred while verifying Confirm Delete: " + e.getMessage());
			}
	}
		
		public void selectthecheckboxinmaingridandeditandverifyBE() throws InterruptedException {
			
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.fromcalender);
			Thread.sleep(4000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' 23 ']"));
			
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.searchicon);
			
			Thread.sleep(2000);
			WebElement element3=driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[1]"));
			  wait.until(ExpectedConditions.visibilityOf(element3));
			  element3.click();
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='1012 - Domestic Sales']")));
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='1012 - Domestic Sales']"));
			
//			Thread.sleep(2000);
//			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[1]", "1012-Domestic Sales");
			Thread.sleep(4000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.checkboxinedittwotwo);
			Thread.sleep(2000);
			
			WebElement element4=driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[2]"));
			  wait.until(ExpectedConditions.visibilityOf(element4));
			  element4.click();
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' 1010 - Sales']")));
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//span[text()=' 1010 - Sales']"));
			
//			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[2]", "1010-Sales");
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.savebtn);
			Thread.sleep(4000);
//			HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//div[@aria-haspopup='listbox'])[1]", "1010-Sales");
			
			WebElement element5=driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[1]"));
			  wait.until(ExpectedConditions.visibilityOf(element5));
			  element5.click();
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='1010 - Sales']")));
			  HelperClass.ClickUsingJS(HelperClass.getDriver(), By.xpath("//div[text()='1010 - Sales']"));
			  
			Thread.sleep(4000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.checkboxinedit);
			Thread.sleep(2000);
			if(bulkeditlocators.checkboxinedittwo.isSelected()) {
				System.out.println("account name edited succesfully");
			}
			else {
				System.out.println("account name not edited");
			}
		}
		
		public void VerifysearchbarinmaingridandverifyBE() throws InterruptedException {
			Thread.sleep(5000);
			bulkeditlocators.searchbarinmaingrid.sendKeys("cus 1");
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.searchicon);
			List<WebElement> referenceCells = HelperClass.getDriver()
					.findElements(By.xpath("//div[text()=' cus 1 ']"));
			System.out.println(referenceCells);

			for (WebElement cell : referenceCells) {
				String actual = cell.getText().trim();
				if (actual.contains("cus 1")) {
					System.out.println("Matched: " + actual);
				} else {
					System.out.println("Mismatch: " + actual);
				}
			}
			
		}
		
		public void selectthefromandtodateandverifyBE() throws InterruptedException {
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.fromcalender);
			Thread.sleep(4000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.dateinfromcalender);
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.tocalender);
			Thread.sleep(4000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.dateintocalender);
//			
//			String actualText = HelperClass.getText(By.xpath("(//input[@aria-haspopup='dialog'])[1]")).trim();
//			String expected = "11/09/2025";
//	 
//			if (actualText.contains(expected)) {
//			    System.out.println("Calender selected customized date");
//			} else {
//			    System.out.println("Calender not selected. Actual: " + actualText);
//			}
//			
//			String actualText1 = HelperClass.getText(By.xpath("(//input[@aria-haspopup='dialog'])[2]")).trim();
//			String expected1 = "17/09/2025";
//	 
//			if (actualText1.contains(expected1)) {
//			    System.out.println("Calender selected customized date");
//			} else {
//			    System.out.println("Calender not selected. Actual: " + actualText1);
//			}
			
			
		}
		
		public void verifyreferencenumberandeditanddownloadoptionsBE() throws InterruptedException {
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.searchicon);
			Thread.sleep(2000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.invref);
			if(bulkeditlocators.invoiceele.isDisplayed()) {
				System.out.println("invoice details are displaying");
			} else {
				System.out.println("invoice details are not displaying");
			}
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.download);
			Thread.sleep(5000);
			HelperClass.ClickUsingJS(HelperClass.getDriver(), bulkeditlocators.edit);
			if(bulkeditlocators.editinvoiceele.isDisplayed()) {
				System.out.println("Successfully navigated to edit invoice page");
			} else {
				System.out.println("Not navigated to edit invoice page");
			}
		}
}
