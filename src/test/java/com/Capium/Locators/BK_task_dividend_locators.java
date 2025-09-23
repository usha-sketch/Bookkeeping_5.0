package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BK_task_dividend_locators {

	@FindBy(xpath = "//span[normalize-space()='Manage']")
	@CacheLookup
	public WebElement managetab;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	@CacheLookup
	public WebElement searchTFmanagetab;
	
	@FindBy(xpath = "//span[normalize-space()='Journal client']")
	@CacheLookup
	public WebElement newclientid;
	
	@FindBy(xpath = "//a[normalize-space()='Tasks']")
	@CacheLookup
	public WebElement task;
	
	@FindBy(xpath = "//a[normalize-space()='Dividends']")
	@CacheLookup
	public WebElement dividendtab;
	
	@FindBy(xpath = "//span[text()='Add Dividend']")
	@CacheLookup
	public WebElement adddividendbtn;
	
	@FindBy(xpath = "//input[@placeholder='Search here...']")
	@CacheLookup
	public WebElement searchTFindashboard;
	
	@FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add_circle_outline'])[16]")
	@CacheLookup
	public WebElement plusindividendmainmenu;
	
	@FindBy(xpath = "//span[normalize-space()='Add New Journal']")
	@CacheLookup
	public WebElement addnewjournalele;
	
	@FindBy(xpath = "//input[@aria-haspopup='listbox']")
	@CacheLookup
	public WebElement accountDDinjournaldetails;
	
	@FindBy(xpath = "(//input[@aria-haspopup='listbox'])[2]")
	@CacheLookup
	public WebElement secondaccountDDinjournaldetails;
	
	@FindBy(xpath = "//span[normalize-space()='1010 - Sales']")
	@CacheLookup
	public WebElement salesCOA;
	
	@FindBy(xpath = "//input[@formcontrolname='credit']")
	@CacheLookup
	public WebElement creditamountTF;
	
	@FindBy(xpath = "//a[normalize-space()='Add New Line']")
	@CacheLookup
	public WebElement addnewlineinJT;
	
	@FindBy(xpath = "//span[normalize-space()='8045 - Cash in hand']")
	@CacheLookup
	public WebElement cashinhandCOA;
	
	@FindBy(xpath = "(//input[@formcontrolname='debit'])[2]")
	@CacheLookup
	public WebElement debitamountTF;
	
	@FindBy(xpath = "//span[normalize-space()='Save and Exit']")
	@CacheLookup
	public WebElement saveandexitinaddjournal;
	
	@FindBy(xpath = "//span[text()=' Save and Exit ']")
	@CacheLookup
	public WebElement saveandexittwo;
	
	@FindBy(xpath = "//p[text()=' Total Credit ']")
	@CacheLookup
	public WebElement unknownele;
	
	@FindBy(xpath = "(//mat-icon[text()='delete_outline'])[4]")
	@CacheLookup
	public WebElement deletefour;
	
	@FindBy(xpath = "(//mat-icon[text()='delete_outline'])[3]")
	@CacheLookup
	public WebElement deletethree;
	
	@FindBy(xpath = "(//mat-icon[text()='delete_outline'])[2]")
	@CacheLookup
	public WebElement deletetwo;
	
	@FindBy(xpath = "//mat-icon[text()='delete_outline']")
	@CacheLookup
	public WebElement delete;
	
	@FindBy(xpath = "(//mat-icon[text()='add_circle_outline'])[32]")
	@CacheLookup
	public WebElement plusineditdividend;
	
	@FindBy(xpath = "(//mat-icon[text()='edit '])[1]")
	@CacheLookup
	public WebElement editicondividend;
	
	@FindBy(xpath = "(//mat-icon[text()='search'])[2]")
	@CacheLookup
	public WebElement searchineditpage;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	@CacheLookup
	public WebElement searchTFineditpage;
	
	@FindBy(xpath = "//a[normalize-space()='JNL - 2']")
	@CacheLookup
	public WebElement journaltwoforssearch;
	
	@FindBy(xpath = "//mat-icon[text()='highlight_off']")
	@CacheLookup
	public WebElement crossmarkinsearch;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	@CacheLookup
	public WebElement checkboxinedit;
	
	@FindBy(xpath = "//p[normalize-space()='Delete']")
	@CacheLookup
	public WebElement deleteinedit;
	
	@FindBy(xpath = "//p[normalize-space()='Copy']")
	@CacheLookup
	public WebElement copyinedit;
	
	@FindBy(xpath = "//p[normalize-space()='Excel']")
	@CacheLookup
	public WebElement exporttoexcelinedit;
	
	@FindBy(xpath = "//p[normalize-space()='CSV']")
	@CacheLookup
	public WebElement exporttocsvinedit;
	
	@FindBy(xpath = "//p[normalize-space()='PDF']")
	@CacheLookup
	public WebElement exporttopdfinedit;
	
	@FindBy(xpath = "//p[normalize-space()='Print']")
	@CacheLookup
	public WebElement printinedit;
	
	@FindBy(xpath = "//p[normalize-space()='Active']")
	@CacheLookup
	public WebElement activeinedit;
	
	@FindBy(xpath = "//p[normalize-space()='Inactive']")
	@CacheLookup
	public WebElement inactiveinedit;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='keyboard_double_arrow_up']")
	@CacheLookup
	public WebElement openarrowinadddividend;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='keyboard_double_arrow_down']")
	@CacheLookup
	public WebElement closerrowinadddividend;
	
	@FindBy(xpath = "//p[text()='Dividend per share']")
	@CacheLookup
	public WebElement dividendpershareoele;
	
	@FindBy(xpath = "(//span[@style='transform: rotate(180deg);'])[1]")
	@CacheLookup
	public WebElement singlearrow1;
	
	@FindBy(xpath = "(//span[contains(@class, 'mat-expansion-indicator') and contains(@class, 'ng-trigger-indicatorRotate')])[2]")
	@CacheLookup
	public WebElement singlearrow2;
	
	@FindBy(xpath = "(//span[contains(@class, 'mat-expansion-indicator') and contains(@class, 'ng-trigger-indicatorRotate')])[3]")
	@CacheLookup
	public WebElement singlearrow3;
	
	@FindBy(xpath = "//u[normalize-space()='choose a file']")
	@CacheLookup
	public WebElement chooseafile;
	
	@FindBy(xpath = "//input[@aria-required='false']")
	@CacheLookup
	public WebElement searchbarinmaingrid;
	
	@FindBy(xpath = "//p[@class='mb-0 text-success']")
	@CacheLookup
	public WebElement copysuccessmessage;
	
	@FindBy(xpath = "//a[normalize-space()='Cancel selection']")
	@CacheLookup
	public WebElement cancelselection;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='highlight_off']")
	@CacheLookup
	public WebElement crossmark;
	
	@FindBy(xpath = "//mat-icon[text()='more_vert']")
	@CacheLookup
	public WebElement kebabinmaingrid;
	
	@FindBy(xpath = "//span[text()='Export As PDF ']")
	@CacheLookup
	public WebElement exporttopdf;
	
	@FindBy(xpath = "//span[text()='Export to Excel ']")
	@CacheLookup
	public WebElement exporttoexcel;
	
	@FindBy(xpath = "//span[text()='Export to CSV ']")
	@CacheLookup
	public WebElement exporttocsv;
	
	@FindBy(xpath = "//span[text()=' Yes ']")
	@CacheLookup
	public WebElement yesforinactive;
	
	@FindBy(xpath = "//mat-icon[text()='archive']")
	@CacheLookup
	public WebElement inactiveinedittwo;
	
	@FindBy(xpath = "//mat-icon[text()='unarchive']")
	@CacheLookup
	public WebElement activeinedittwo;
	
	@FindBy(xpath = "(//button[@type='button'])[9]")
	@CacheLookup
	public WebElement yesforactive;
	
	@FindBy(xpath = "//span[@class='e-frame e-icons e-uncheck']")
	@CacheLookup
	public WebElement checkboxtwo;
	
	@FindBy(xpath = "//mat-icon[text()='border_all']")
	@CacheLookup
	public WebElement exporttoexceltwo;
	
	@FindBy(xpath = "//mat-icon[text()='description']")
	@CacheLookup
	public WebElement exporttocsvtwo;
	
	@FindBy(xpath = "//mat-icon[text()='picture_as_pdf']")
	@CacheLookup
	public WebElement exporttopdftwo;
	
	@FindBy(xpath = "(//a[text()=' shareholder 1 '])[1]")
	@CacheLookup
	public WebElement shareholdetid;
	
	@FindBy(xpath = "//b[text()='Dividend Voucher']")
	@CacheLookup
	public WebElement dividendele;
	
	@FindBy(xpath = "//mat-icon[text()='description']")
	@CacheLookup
	public WebElement downloadinpopup;
	
	@FindBy(xpath = "//mat-icon[text()='picture_as_pdf']")
	@CacheLookup
	public WebElement downloadpdfinpopup;
	
	@FindBy(xpath = "//mat-icon[text()='edit']")
	@CacheLookup
	public WebElement editiconinpopup;
	
	@FindBy(xpath = "//span[text()=' Edit Dividends ']")
	@CacheLookup
	public WebElement editdividendele;
	
	@FindBy(xpath = "(//mat-icon[text()='save_alt '])[1]")
	@CacheLookup
	public WebElement downloadinrow;
	
	@FindBy(xpath = "(//mat-icon[text()='pageview '])[1]")
	@CacheLookup
	public WebElement pageview;
	
	@FindBy(xpath = "//mat-icon[text()='close']")
	@CacheLookup
	public WebElement cancleforpopup;
	
	@FindBy(xpath = "//input[@formcontrolname='dividendPerShare']")
	@CacheLookup
	public WebElement dividendpershareTF;
	
	@FindBy(xpath = "//span[normalize-space()='JNL - 55']")
	@CacheLookup
	public WebElement journalid;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[23]")
	@CacheLookup
	public WebElement checkboxjournal;
	
	@FindBy(xpath = "(//mat-icon[text()='edit '])[3]")
	@CacheLookup
	public WebElement editiconforthreedividend;
	
	@FindBy(xpath = "(//div[@aria-haspopup='listbox'])[1]")
	@CacheLookup
	public WebElement shareholdetdd;
	
}
