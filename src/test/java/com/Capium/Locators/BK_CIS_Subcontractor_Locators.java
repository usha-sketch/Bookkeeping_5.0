package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BK_CIS_Subcontractor_Locators {
	
	@FindBy(xpath = "//span[normalize-space()='Manage']")
	@CacheLookup
	public WebElement managetab;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	@CacheLookup
	public WebElement searchTFmanagetab;
	
	@FindBy(xpath = "//span[normalize-space()='Journal client']")
	@CacheLookup
	public WebElement newclientid;
	
	@FindBy(xpath = "//a[normalize-space()='CIS']")
	@CacheLookup
	public WebElement CIS;
	
	@FindBy(xpath = "//a[normalize-space()='Subcontractor']")
	@CacheLookup
	public WebElement Subcontractor;
	
	@FindBy(xpath = "//span[contains(text(),'Add Journal')]")
	@CacheLookup
	public WebElement addjournakbtn;
	
	@FindBy(xpath = "//input[@placeholder='Search here...']")
	@CacheLookup
	public WebElement searchTFindashboard;
	
	@FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add_circle_outline'])[28]")
	@CacheLookup
	public WebElement plusinsubcontractormainmenu;
	
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
	public WebElement plusineditjournal;
	
	@FindBy(xpath = "//mat-icon[text()='edit ']")
	@CacheLookup
	public WebElement editiconsubcontractor;
	
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
	public WebElement openarrowinaddjournal;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='keyboard_double_arrow_down']")
	@CacheLookup
	public WebElement closerrowinaddjournal;
	
	@FindBy(xpath = "//div[@class='form-field']//p[1]")
	@CacheLookup
	public WebElement journalnoele;
	
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
	
	@FindBy(xpath = "(//li[@role='menuitem'])[7]")
	@CacheLookup
	public WebElement columnsoption;
	
	@FindBy(xpath = "(//div[@class='e-icons e-columnmenu'])[7]")
	@CacheLookup
	public WebElement kebabintoprow;
	
	@FindBy(xpath = "(//span[text()='Name'])[2]")
	@CacheLookup
	public WebElement namecolumn;
	
	@FindBy(xpath = "(//span[text()='Name'])[1]")
	@CacheLookup
	public WebElement namecolumnone;
	
	@FindBy(xpath = " (//span[text()='Verification Status'])[2]")
	@CacheLookup
	public WebElement verificationstatus;
	
	@FindBy(xpath = " (//span[text()='Verification Status'])[1]")
	@CacheLookup
	public WebElement verificationstatusone;
	
	@FindBy(xpath = "//mat-icon[text()='approval ']")
	@CacheLookup
	public WebElement downloadcertificate;
	
	@FindBy(xpath = "//span[text()='Add Subcontractor']")
	@CacheLookup
	public WebElement addsubcontractorbtn;
	
	@FindBy(xpath = "//input[@formcontrolname='name']")
	@CacheLookup
	public WebElement contactnameTF;
	
	@FindBy(xpath = "//span[text()='CIS Information']")
	@CacheLookup
	public WebElement cisinformation;
	
	@FindBy(xpath = "(//div[@aria-haspopup='listbox'])[2]")
	@CacheLookup
	public WebElement companydd;
	
	@FindBy(xpath = "//input[@formcontrolname='tradingName']")
	@CacheLookup
	public WebElement tradingnameTF;
	
	@FindBy(xpath = "//button[text()=' Ok ']")
	@CacheLookup
	public WebElement popupok;
	
	@FindBy(xpath = "//input[@formcontrolname='verificationNumber']")
	@CacheLookup
	public WebElement verificationnumberTF;

}
