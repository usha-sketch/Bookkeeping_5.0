package com.Capium.Actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Bookkeeping_ClientDashboard_Locators;
import com.Capium.Utilies.HelperClass;

public class Bookkeeping_ClientDashboard_Actions {
	
	Bookkeeping_ClientDashboard_Locators ClientDashboardLocators = null;
	   WebDriverWait wait=HelperClass.getWait();
	   WebDriver driver=HelperClass.getDriver();
		public Bookkeeping_ClientDashboard_Actions() {
			this.ClientDashboardLocators = new Bookkeeping_ClientDashboard_Locators();
			PageFactory.initElements(HelperClass.getDriver(), ClientDashboardLocators);
		}

		public void clickonsearchboxinallclientsenterclientnameandclickonsearchicon() throws InterruptedException {
			ClientDashboardLocators=PageFactory.initElements(driver, Bookkeeping_ClientDashboard_Locators.class);
			HelperClass.scrollIntoView(ClientDashboardLocators.Searchherebox);
			Thread.sleep(4000);
		    HelperClass.searchingaClient(HelperClass.getDriver(), By.xpath("//input[contains(@data-placeholder,'Search here')]"), "BENUGU", By.xpath("(//mat-icon[text()='search'])[2]"));
		    Thread.sleep(5000);
			ClientDashboardLocators.Clickclientname.click();	
		}
		
		public void verifydashboarddisplayingornotsuccessfullyandtakescreenshot() throws InterruptedException {
			ClientDashboardLocators=PageFactory.initElements(driver, Bookkeeping_ClientDashboard_Locators.class);
			String actualtext = HelperClass.getText(By.xpath("//p[text()='Total Income']"));
			String expected = "Total Income";

			if (actualtext.equals(expected)) {
			    System.out.println("Matched");
			} else {
			    System.out.println("Not Matched");
			}
		}
		
		public void VerifyTotalincome() {
			String actualtext = HelperClass.getText(By.xpath("//p[text()='Total Income']"));
			String expected = "Total Income";

			if (actualtext.equals(expected)) {
			    System.out.println("Matched");
			} else {
			    System.out.println("Not Matched");
			}
		}
		
		public void VerifyTotalexpenditure() {
			String actualtext = HelperClass.getText(By.xpath("//p[text()='Total Expenditure']"));
			String expected = "Total Expenditure";

			if (actualtext.equals(expected)) {
			    System.out.println("Matched");
			} else {
			    System.out.println("Not Matched");
			}
		}


		public void VerifyBankbalance() {
			String actualtext = HelperClass.getText(By.xpath("//p[text()='Bank Balance']"));
			String expected = "Bank Balance";

			if (actualtext.equals(expected)) {
			    System.out.println("Matched");
			} else {
			    System.out.println("Not Matched");
            }
            }
		public void Clickonviewbankbookandverify() throws InterruptedException {
			Thread.sleep(4000);
			ClientDashboardLocators.Clickviewbankbooklink.click();
			String actualtext = HelperClass.getText(By.xpath("//span[contains(text(),'Add Bank Account')]"));
			String expected = "Add Bank Account";

			if (actualtext.equals(expected)) {
			    System.out.println("Matched");
			} else {
			    System.out.println("Not Matched");
            }
            }
		public void  Verifycashinhand() {
			String actualtext = HelperClass.getText(By.xpath("//p[text()='Cash in Hand']"));
			String expected = "Cash in Hand";

			if (actualtext.equals(expected)) {
			    System.out.println("Matched");
			} else {
			    System.out.println("Not Matched");
            }
            }
		public void Clickonviewcashbookandverify() throws InterruptedException {
			Thread.sleep(4000);
			ClientDashboardLocators.Clickviewcashbooklink.click();
			HelperClass.scrollUntilElementVisible(driver,ClientDashboardLocators.Clickviewcashbooklink );
			String actualtext = HelperClass.getText(By.xpath("//span[contains(text(),'Cash in Hand')]"));
			String expected = "Cash in Hand";

			if (actualtext.equals(expected)) {
			    System.out.println("Matched");
			} else {
			    System.out.println("Not Matched");
            }
            }
		
		public void Incomebycategory() {
		String actualtext = HelperClass.getText(By.xpath("//h3[contains(text(),'Income by Category')]"));
		String expected = "Income by Category";

		if (actualtext.equals(expected)) {
		    System.out.println("Matched");
		} else {
		    System.out.println("Not Matched");
        }
        }
		
		public void Expenditurebycategory() {
			String actualtext = HelperClass.getText(By.xpath("//h3[contains(text(),'Expenditure by Category')]"));
			String expected = "Expenditure by Category";

			if (actualtext.equals(expected)) {
			    System.out.println("Matched");
			} else {
			    System.out.println("Not Matched");
	        }
	        }
			
		public void  Incomevsexpenditure () throws InterruptedException {
			Thread.sleep(3000);
			HelperClass.scrollUntilElementVisible(driver, ClientDashboardLocators.Incomevsexpenditure);
			String actualtext = HelperClass.getText(By.xpath("//h3[contains(text(),'Income vs Expenditure')]"));
			String expected = "Income vs Expenditure";

			if (actualtext.equals(expected)) {
			    System.out.println("Matched");
			} else {
			    System.out.println("Not Matched");
	        }
	        }
		
		public void Ageingsummary() {
			HelperClass.scrollUntilElementVisible(driver, ClientDashboardLocators.Ageingsummary);
			String actualtext = HelperClass.getText(By.xpath("//h3[contains(text(),'Ageing Summary')]"));
			String expected = "Ageing Summary";

			if (actualtext.equals(expected)) {
			    System.out.println("Matched");
			} else {
			    System.out.println("Not Matched");
	        }
	        }	
		
		public void AgeingsummaryDD() throws IOException, InterruptedException {
	    //HelperClass.scrollUntilElementVisible(driver, ClientDashboardLocators.Ageingsummary);
	    Thread.sleep(5000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//mat-select[@role='combobox'])[2]/div/div/span/span", "Receivables");
		Thread.sleep(10000);
	    HelperClass.captureScreenshot("Ageing Summary Receivables");
	    HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//mat-select[@role='combobox'])[2]/div/div/span/span", "Payable");
		Thread.sleep(10000);
		HelperClass.captureScreenshot("Ageing Summary Payable");
		}
		


	   public void VATsummary() {
	   HelperClass.scrollUntilElementVisible(driver, ClientDashboardLocators.VATsummary);
		String actualtext = HelperClass.getText(By.xpath("//h3[text()='VAT Summary']"));
		String expected = "VAT Summary";

		if (actualtext.equals(expected)) {
		    System.out.println("Matched");
		} else {
		    System.out.println("Not Matched");
       }
       }	
	   
	   public void Cashflow() throws InterruptedException {
	   HelperClass.scrollUntilElementVisible(driver, ClientDashboardLocators.Cashflow);
	   Thread.sleep(20000);
	   String actualtext = HelperClass.getText(By.xpath("//h3[contains(text(),'Cash Flow')]"));
		String expected = "Cash Flow";

		if (actualtext.equals(expected)) {
		    System.out.println("Matched");
		} else {
		    System.out.println("Not Matched");
      }
      }	
	   
	   public void Yeardropdown() throws InterruptedException, IOException {
	   ClientDashboardLocators=PageFactory.initElements(driver, Bookkeeping_ClientDashboard_Locators.class);
	   Thread.sleep(10000);
	   HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//mat-select[@role='combobox' and @panelclass='myPanelClass'])[1]", "Last 30 days");
	   Thread.sleep(10000);
	   HelperClass.captureScreenshot("Last 30 days Dashboard Details");
	   
	   HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//mat-select[@role='combobox' and @panelclass='myPanelClass'])[1]", "This month");
	   Thread.sleep(10000);
	   HelperClass.captureScreenshot("This month Dashboard Details");
	   
	   HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//mat-select[@role='combobox' and @panelclass='myPanelClass'])[1]", "This quarter");
	   Thread.sleep(10000);
	   HelperClass.captureScreenshot("This quarter Dashboard Details");
	   
	   HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//mat-select[@role='combobox' and @panelclass='myPanelClass'])[1]", "This year");
	   Thread.sleep(10000);
	   HelperClass.captureScreenshot("This year Dashboard Details");
	   
	   HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//mat-select[@role='combobox' and @panelclass='myPanelClass'])[1]", "Last month");
	   Thread.sleep(10000);
	   HelperClass.captureScreenshot("Last month Dashboard Details");
	   
	   HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//mat-select[@role='combobox' and @panelclass='myPanelClass'])[1]", "Last quarter");
	   Thread.sleep(10000);
	   HelperClass.captureScreenshot("Last quarter Dashboard Details");
	   
	   HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//mat-select[@role='combobox' and @panelclass='myPanelClass'])[1]", "Last year");
	   Thread.sleep(10000);
	   HelperClass.captureScreenshot("Last year Dashboard Details");
	   
	   HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "(//mat-select[@role='combobox' and @panelclass='myPanelClass'])[1]", "Custom");
	   Thread.sleep(10000);
	   HelperClass.captureScreenshot("Custom Dashboard Details");
	   }
}

