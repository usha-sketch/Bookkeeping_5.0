package com.Capium.Actions;
 
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;
 
public class Capium_Login_Actions {
	
	WebDriver driver=HelperClass.getDriver();
	WebDriverWait wait=HelperClass.getWait();
	
	public Capium_Login_Actions() {
		PageFactory.initElements(driver, this);
	}
 
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
	
	@FindBy(xpath="//p[normalize-space()='Track your clients finances in real time']/ancestor::a")
	public WebElement bk5in_c_icon;
	
	@FindBy(xpath = "//p[text()='Track your clients finances in real time']//parent::a")
	public WebElement Homepage_BK_module;
	
	@FindBy(xpath="//div[normalize-space()='Charity Accounts']/parent::div")
	public WebElement Charity;
 
 
	public void EnterUsername(String username) throws InterruptedException {
	     inputUsername.clear();
		inputUsername.sendKeys(username);
 
	}
 
	public void EnterPassword(String password) {
        inputPassword.clear();
		inputPassword.sendKeys(password);
	}
 
	public void ClickLoginbtn() throws Exception {
		btnLoginpage.click();
		Thread.sleep(5000);
	}
 
	public boolean isHomePage() {
		try {
			return Homepage_Element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
 
	public void Navigate_to_bookkeeping_module() {
 
		WebDriver driver = HelperClass.getDriver();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 
	    try {
	        // Case 1: Direct access
	        if (isElementVisible(Homepage_BK_module, wait)) {
	            HelperClass.safeClick(Homepage_BK_module, "Bookkeeping module from homepage");
	            Log.info("Navigated directly to Bookkeeping module.");
	            return;
	        }
	        // Case 2: Old Eco modules
	        List<WebElement> oldEcoModules = HelperClass.getDriver().findElements(
	                By.xpath("//a/div[contains(@class,'circle') and " +
	                         "(normalize-space()='Accounts Production' " +
	                         "or normalize-space()='Self Assessment' " +
	                         "or normalize-space()='Corporation Tax' " +
	                         "or normalize-space()='Bookkeeping')]")
	            );
 
	            if (!oldEcoModules.isEmpty()) {
	                System.out.println("Old Eco space detected. Found " + oldEcoModules.size() + " modules.");
 
	                boolean clickedModule = false;
 
	                for (WebElement module : oldEcoModules) {
	                    String classAttr = module.getAttribute("class");
	                    if (classAttr != null && (classAttr.contains("disabled") || classAttr.contains("lock"))) {
	                        System.out.println("Skipping locked module: " + module.getText());
	                        continue;
	                    }
 
	                    if (module.isDisplayed() && module.isEnabled()) {
	                        System.out.println("Clicking Old Eco module: " + module.getText());
	                        module.click();
	                        clickedModule = true;
	                        break;
	                    }
	                }
 
	                if (clickedModule) {
	                    try {
	                        HelperClass.safeClick(C_icon_inside_modules, null);
	                        HelperClass.safeClick(Charity, "Capium 365 inside Cicon");
	                        wait.until(ExpectedConditions.visibilityOf(CapiumLogo));
	        	            HelperClass.safeClick(CapiumLogo, "Capium Logo");
	        	            HelperClass.safeClick(bk5in_c_icon, "Bookkeeping module inside Cicon");
 
	                        System.out.println("Clicked Home from C icon inside Old Eco module.");
	                    } catch (StaleElementReferenceException sere) {
	                        System.out.println("Stale element detected for C icon. Retrying in next loop...");
	                    } catch (TimeoutException te) {
	                        System.out.println("C icon or Home icon not clickable yet. Will retry in next loop.");
	                    }
	                }
	            }
 
	        
	        if (isElementVisible(C_icon_inside_modules, wait)) {
	            HelperClass.safeClick(C_icon_inside_modules, "C-icon");
	            HelperClass.safeClick(Charity, "Capium 365 inside Cicon");
	            wait.until(ExpectedConditions.visibilityOf(CapiumLogo));
	            HelperClass.safeClick(CapiumLogo, "Capium Logo");
	            HelperClass.safeClick(bk5in_c_icon, "Bookkeeping module inside Cicon");
	            Log.info("Navigated to Bookkeeping module via C-icon flow.");
	            return;
	        }
 
	        Log.warn("Bookkeeping module could not be found in any known location.");
 
	    } catch (Exception e) {
	        Log.error("Error while navigating to Bookkeeping module: " + e.getMessage());
//	        HelperClass.captureScreenshot("BookkeepingNavigationError");
	    }
	}
	
	public void Logout() throws IOException {
	    WebDriver driver = HelperClass.getDriver();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	    wait.pollingEvery(Duration.ofMillis(300));
 
	    boolean logoutClicked = false;
 
	    try {
	        // Try 5.0 Profile Icon logout
	        if (isElementVisible(FivePointProfileIcon, wait)) {
	            HelperClass.clickWithRetry(FivePointProfileIcon, driver, wait);
	            Log.info("Clicked 5.0 Profile Icon.");
 
	            if (isElementVisible(SignoutFivePointZero, wait)) {
	                HelperClass.clickWithRetry(SignoutFivePointZero, driver, wait);
	                Log.info("Clicked 5.0 Sign Out.");
	                logoutClicked = true;
	            }
	        }
 
	        // Try homepage logo logout
	        if (!logoutClicked && isElementVisible(Logo_in_homepage, wait)) {
	            HelperClass.clickWithRetry(Logo_in_homepage, driver, wait);
	            Log.info("Clicked homepage logo.");
 
	            if (isElementVisible(Logout_inside_logo, wait)) {
	                HelperClass.clickWithRetry(Logout_inside_logo, driver, wait);
	                Log.info("Clicked logout inside logo.");
	                logoutClicked = true;
	            }
	        }
 
	        // Try direct logout element
	        if (!logoutClicked && isElementVisible(Logout_element, wait)) {
	            HelperClass.clickWithRetry(Logout_element, driver, wait);
	            Log.info("Clicked direct logout element.");
	            logoutClicked = true;
	        }
 
	        if (logoutClicked) {
	            // Wait until login screen is visible
	            wait.until(ExpectedConditions.or(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[normalize-space()='365']")),
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Receipts, Invoices & Bankfeeds']"))
	            ));
	            Log.info("Successfully redirected to login page after logout.");
	        } else {
	            Log.warn("No logout option available. Skipping logout.");
	        }
 
	    } catch (Exception e) {
	        Log.error("Logout failed: " + e.getMessage());
	        HelperClass.captureScreenshot("LogoutFailure");
	    }
	}
 
 
	public boolean isElementVisible(WebElement element, WebDriverWait wait) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void waitForPageToLoad(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			wait.until(webDriver -> (Boolean) js.executeScript("return (window.angular !== undefined) && "
					+ "(angular.element(document).injector() !== undefined) && "
					+ "(angular.element(document).injector().get('$http').pendingRequests.length === 0);"));
		} catch (Exception e) {
			//Log.warn("Angular wait skipped: " + e.getMessage());
		}
 
		wait.until(webDriver -> js.executeScript("return document.readyState").toString().equals("complete"));
	}
}