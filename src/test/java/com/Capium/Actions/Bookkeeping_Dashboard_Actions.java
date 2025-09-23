package com.Capium.Actions;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Bookkeeping_Dashboard_Locators;

import com.Capium.Utilies.HelperClass;


public class Bookkeeping_Dashboard_Actions {
	
	Bookkeeping_Dashboard_Locators DashboardLocators = null;
   WebDriverWait wait=HelperClass.getWait();
   WebDriver driver=HelperClass.getDriver();
	public Bookkeeping_Dashboard_Actions() {
		this.DashboardLocators = new Bookkeeping_Dashboard_Locators();
		PageFactory.initElements(HelperClass.getDriver(), DashboardLocators);
	}


public void verifyReturnsincurrentmonth() throws InterruptedException{
	
	String actualtext = HelperClass.getText(By.xpath("//h3[contains(text(),'Return(s) in Current Month')]"));
	String expected = "Return(s) in Current Month";

	if (actualtext.equals(expected)) {
	    System.out.println("Matched");
	} else {
	    System.out.println("Not Matched");
	}
	}

public void Verifymonthlysubmittedreturn() {
	
	String actualtext = HelperClass.getText(By.xpath("//h3[contains(text(),'Monthly Submitted Return(s)')]"));
	String expected = "Monthly Submitted Return(s)";

	if (actualtext.equals(expected)) {
	    System.out.println("Matched");
	} else {
	    System.out.println("Not Matched");
	}
	}


public void VerifyyearDD() throws InterruptedException, IOException {
	
	HelperClass.selectonebyoneinDD(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='myPanelClass']", "2024");
	Thread.sleep(10000);
    HelperClass.captureScreenshot("2024 Year Drop Down verified");
    HelperClass.selectonebyoneinDD(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='myPanelClass']", "2023");
	Thread.sleep(10000);
    HelperClass.captureScreenshot("2023 Year Drop Down verified");
    HelperClass.selectonebyoneinDD(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='myPanelClass']", "2022");
	Thread.sleep(10000);
    HelperClass.captureScreenshot("2022 Year Drop Down verified");
    HelperClass.selectonebyoneinDD(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='myPanelClass']", "2021");
	Thread.sleep(10000);
    HelperClass.captureScreenshot("2021 Year Drop Down verified");
    HelperClass.selectonebyoneinDD(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='myPanelClass']", "2020");
	Thread.sleep(10000);
    HelperClass.captureScreenshot("2020 Year Drop Down verified");
    HelperClass.selectonebyoneinDD(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='myPanelClass']", "2019");
	Thread.sleep(10000);
    HelperClass.captureScreenshot("2019 Year Drop Down verified");
        }

    public void ClickonAllclientsandtakescreenshot() throws IOException, InterruptedException {
	HelperClass.scrollIntoView(DashboardLocators.ClickAllClients);
	Thread.sleep(10000);
	//HelperClass.waitUntilVisible(HelperClass.getWait(), DashboardLocators.ClickAllClients);
	DashboardLocators.ClickAllClients.click();
	HelperClass.captureScreenshot("All clients screenshot");
    }

public void EnterclientnameandsearchandverifyAllclient() throws InterruptedException {
	HelperClass.scrollIntoView(DashboardLocators.Enterclientnameinsearchboxinallclients);
	Thread.sleep(15000);
	DashboardLocators.Enterclientnameinsearchboxinallclients.click();
	DashboardLocators.Enterclientnameinsearchboxinallclients.sendKeys("BENUGU");
	DashboardLocators.Clicksearchiconinallclients.click();

String actualtext = HelperClass.getText(By.xpath("//a[@class='link clamp wmx-100 fw-bold text-primary']"));
String expected = "BENUGU";

if (actualtext.equals(expected)) {
    System.out.println("Matched");
} else {
    System.out.println("Not Matched");
}
}

public void verifyclienttype() throws InterruptedException {
   HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickonclienttypelistDDinallclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@dropdownposition)='bottom']", "Limited");
	Thread.sleep(10000);
	HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Limited']", "Limited");
	
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickonclienttypelistDDinallclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@dropdownposition)='bottom']", "Sole Trader");
	Thread.sleep(10000);
	HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Sole Trader']", "Sole Trader");
	
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickonclienttypelistDDinallclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@dropdownposition)='bottom']", "LLP");
	Thread.sleep(10000);
	HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='LLP']", "LLP");
	
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickonclienttypelistDDinallclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@dropdownposition)='bottom']", "Partnership");
	Thread.sleep(20000);
	HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Partnership']", "Partnership");
	
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickonclienttypelistDDinallclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@dropdownposition)='bottom']", "Trust");
	Thread.sleep(10000);
	HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Trust']", "Trust");
	
}
	
public void SelectpaginationnumberinDDandtakescreenshot() throws IOException, InterruptedException {
	
	 HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickAllClients );
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='pagination']", "10");
		Thread.sleep(10000);
		HelperClass.verifyPaginationRecordCount(HelperClass.getDriver(), "//table/tbody/tr[normalize-space(@role)='row']", 10);
	
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickAllClients );
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='pagination']", "20");
		Thread.sleep(10000);
		HelperClass.verifyPaginationRecordCount(HelperClass.getDriver(), "//table/tbody/tr[normalize-space(@role)='row']", 20);
		
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickAllClients );
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='pagination']", "50");
		Thread.sleep(10000);
		HelperClass.verifyPaginationRecordCount(HelperClass.getDriver(), "//table/tbody/tr[normalize-space(@role)='row']", 50);
		
		HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickAllClients );
		Thread.sleep(2000);
		HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='pagination']", "100");
		Thread.sleep(10000);
		HelperClass.verifyPaginationRecordCount(HelperClass.getDriver(), "//table/tbody/tr[normalize-space(@role)='row']", 100);
}

public void clickonnextbutton() throws IOException, InterruptedException {
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickAllClients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='pagination']", "10");
	Thread.sleep(1000);
	HelperClass.navigateUntilEnd(HelperClass.getDriver(), "//button[contains(@class,'paginator-next')]", "next-disabled", "Next");
	Thread.sleep(1000);
	HelperClass.captureScreenshot("Next pagination button in all clients");
}

public void clickonPreviousbutton() throws IOException, InterruptedException {
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickAllClients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='pagination']", "10");
	Thread.sleep(10000);
	HelperClass.navigateUntilEnd(HelperClass.getDriver(), "//button[contains(@class,'paginator-previous')]", "previous-disabled", "Previous");
	Thread.sleep(1000);
	HelperClass.captureScreenshot("Previous pagination button in all clients");
}

public void clickonVATClients() throws IOException, InterruptedException {
	HelperClass.scrollIntoView(DashboardLocators.ClickVATclients);
	Thread.sleep(10000);
	DashboardLocators.ClickVATclients.click();
	HelperClass.captureScreenshot("VAT Clients screenshot");
	
		
}
   
public void EnterclientnameandsearchandverifyVATclient() throws InterruptedException {
	HelperClass.scrollIntoView(DashboardLocators.ClickVATclients);
	Thread.sleep(10000);
	DashboardLocators.ClickVATclients.click();
	//HelperClass.scrollIntoView(DashboardLocators.Enterclientnameinsearchboxinavatclients);
	Thread.sleep(15000);
	DashboardLocators.Enterclientnameinsearchboxinavatclients.click();
	DashboardLocators.Enterclientnameinsearchboxinavatclients.sendKeys("MTD_EDIT");
	DashboardLocators.Clickonsearchiconinvatclients.click();
	String actualtext= HelperClass.getText(By.xpath("//span[text()='MTD_EDIT']"));
	String expected = "MTD_EDIT";

	if (actualtext.equals(expected)) {
	    System.out.println("Matched");
	} else {
	    System.out.println("Not Matched");
	}
	}

public void VerifyClientTypeinVATclient() throws InterruptedException {
	HelperClass.scrollIntoView(DashboardLocators.ClickVATclients);
	Thread.sleep(10000);
	DashboardLocators.ClickVATclients.click();
	Thread.sleep(1000);
	
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickclienttypeDDinVATclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@dropdownposition)='bottom']", "Limited");
	Thread.sleep(10000);
	HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Limited']", "Limited");
	
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickclienttypeDDinVATclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@dropdownposition)='bottom']", "Sole Trader");
	Thread.sleep(10000);
	HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Sole Trader']", "Sole Trader");
	
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickclienttypeDDinVATclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@dropdownposition)='bottom']", "LLP");
	Thread.sleep(10000);
	HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='LLP']", "LLP");
	
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickclienttypeDDinVATclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@dropdownposition)='bottom']", "Partnership");
	Thread.sleep(20000);
	HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Partnership']", "Partnership");
	
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickclienttypeDDinVATclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//ng-select[normalize-space(@dropdownposition)='bottom']", "Trust");
	Thread.sleep(10000);
	HelperClass.verifyClientTypes(HelperClass.getDriver(), "//table/tbody/tr/td[normalize-space()='Trust']", "Trust");
	
}

	


public void SelectpaginationnumberinDDandtakescreenshotforvatclients() throws IOException, InterruptedException {
	
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickVATclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='pagination']", "10");
	Thread.sleep(10000);
	HelperClass.verifyPaginationRecordCount(HelperClass.getDriver(), "//table/tbody/tr[normalize-space(@role)='row']", 10);

	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickVATclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='pagination']", "20");
	Thread.sleep(10000);
	HelperClass.verifyPaginationRecordCount(HelperClass.getDriver(), "//table/tbody/tr[normalize-space(@role)='row']", 20);
	
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickVATclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='pagination']", "50");
	Thread.sleep(10000);
	HelperClass.verifyPaginationRecordCount(HelperClass.getDriver(), "//table/tbody/tr[normalize-space(@role)='row']", 50);
	
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickVATclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='pagination']", "100");
	Thread.sleep(10000);
	HelperClass.verifyPaginationRecordCount(HelperClass.getDriver(), "//table/tbody/tr[normalize-space(@role)='row']", 100);
}

public void clickonnextbuttoninvatclients() throws IOException, InterruptedException {
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickVATclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='pagination']", "10");
	Thread.sleep(1000);
	HelperClass.navigateUntilEnd(HelperClass.getDriver(), "//button[contains(@class,'paginator-next')]", "next-disabled", "Next");
	Thread.sleep(1000);
	HelperClass.captureScreenshot("Next pagination button in vat clients");
}

public void clickonPreviousbuttoninvatclients() throws IOException, InterruptedException {
	HelperClass.scrollUntilElementVisible(HelperClass.getDriver(), DashboardLocators.ClickVATclients );
	Thread.sleep(2000);
	HelperClass.selectFromCustomDropdown(HelperClass.getDriver(), "//mat-select[normalize-space(@panelclass)='pagination']", "10");
	Thread.sleep(10000);
	HelperClass.navigateUntilEnd(HelperClass.getDriver(), "//button[contains(@class,'paginator-previous')]", "previous-disabled", "Previous");
	Thread.sleep(1000);
	HelperClass.captureScreenshot("Previous pagination button in vat clients");
}
}

