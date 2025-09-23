package com.Capium.Locators;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
 
public class Capium_Login_Locators {
 
	@FindBy(xpath = "//input[@id='txtusername']")
	public WebElement inputUsername;
 
	@FindBy(xpath = "//input[@id='txtpassword']")
	public WebElement inputPassword;
 
	@FindBy(xpath = "//button[@id='btnLogin']")
	public WebElement btnLoginpage;
 
	@FindBy(xpath = "//h1")
	public WebElement Headingtag;
   // C module
	@FindBy(xpath = "//a[@title='Modules']")
	public WebElement C_icon_inside_modules;
 
	@FindBy(xpath = "(//h6[text()='Corporation Tax']/parent::a)[2]")
	public WebElement CorporationTax_Module;
	
	@FindBy(xpath="//a[@href='/' and contains(@class,'my')]")
	public WebElement InsideCiconHome;
	
	@FindBy(xpath="//a[@class='my-capium']")
	public WebElement InsideCiconHomebutton;
 
	@FindBy(xpath = "//p[normalize-space()='Welcome to your Capium EcoSystem']")
	public WebElement Homepage_Element;
	
	@FindBy(xpath="//i[@class='icon fa fa-power-off']")
	public WebElement Logout_element;
	
	@FindBy(xpath="//div[@class='profile-logo']//label")
	public WebElement Logo_in_homepage;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	public WebElement Logout_inside_logo;
	
	@FindBy(xpath="//div[@title='User Image']")
	public WebElement FivePointProfileIcon;
	
	@FindBy(xpath="//a[normalize-space()='Sign Out']")
	public WebElement SignoutFivePointZero;
	
	
	@FindBy(xpath = "//h6[text()='365']//parent::a")
	public WebElement Capiuum365_Module;
	
	@FindBy(xpath="//h6[text()='365']//parent::div")
	public WebElement InsideCicon5_0_365Module;
	
	@FindBy(xpath="//div[normalize-space()='Capium 365']")
	public WebElement insideCicon3_0_365Module;
	
	@FindBy(xpath="//img[@alt='Capium Logo']//parent::div//parent::a")
	public WebElement CiconFivepoint_o;
	
	@FindBy(xpath = "//button[@id='btnLogin']")
	@CacheLookup
	public WebElement btnLogin;
	
	@FindBy(xpath = "//a[@href='/'][@class='my-capium']")
	@CacheLookup
	public WebElement Bookkeeping_Module;
 
	@FindBy(xpath="//div[@class='card-body-list']//div//h6[contains(text(),'Corporation Tax')]")
	public WebElement CorporationTax_Home;
	
	@FindBy(xpath="//h6[normalize-space()='Corporation Tax']")
	public WebElement CorporationTax_InsideCicon;
	
	@FindBy(xpath="//img[@alt='Capium Logo']/ancestor::a")
	public WebElement CiconFivePointO;
	
	@FindBy(xpath="//p[normalize-space()='Easily submit files to HMRC for corporations']/ancestor::a")
	public WebElement CorporationTaxInsideC;
	
	@FindBy(xpath="//div[normalize-space()='Capium 365']/parent::div")
	public WebElement Capium365InsideCicon;
	
	@FindBy(xpath="//img[@alt='Capium Logo']/ancestor::a")
	public WebElement CapiumLogo;
 
}