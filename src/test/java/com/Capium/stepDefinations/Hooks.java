package com.Capium.stepDefinations;

import com.Capium.Actions.Capium_Login_Actions;
import com.Capium.Utilies.HelperClass;
import com.Capium.Utilies.Log;
import com.Capium.Utilies.StepTracker;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.java.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Hooks {

	private static ExtentReports extent = ExtentService.getInstance();
	private static ExtentTest scenarioTest;
	private static ExtentTest stepNode;

	@BeforeAll
	public static void setup() {
		HelperClass.setUpDriver();
		Log.info("Driver setup successfully");
		System.out.println("Starting the Test Execution...");

	}

	@Before
	public void beforeScenario(Scenario scenario) {
		scenarioTest = extent.createTest("Scenario: " + scenario.getName());
		System.out.println("Starting Scenario: " + scenario.getName());
		Log.info("Scenario:" + scenario.getName());
	}
//
//	@AfterStep
//	public void afterStep(Scenario scenario) {
//		WebDriver driver = HelperClass.getDriver();
//		String currentStep = StepTracker.getCurrentStep();
//
//		if (scenario.isFailed()) {
//			try {
//				TakesScreenshot ts = (TakesScreenshot) driver;
//				File src = ts.getScreenshotAs(OutputType.FILE);
//				String screenshotPath = "screenshots/" + currentStep.replace(" ", "_") + "_" + timestamp() + ".png";
//				FileUtils.copyFile(src, new File(screenshotPath));
//
//				final byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
//				scenario.attach(screenshotBytes, "image/png", currentStep);
//
//				scenarioTest.log(Status.FAIL, "❌ Step Failed: " + currentStep,
//						MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
//				// Log.error("Scenario FAILED: " + scenario.getName());
//				Log.info("Scenario FAILED:");
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} else {
//			scenarioTest.log(Status.PASS, "✅ Step Passed: " + currentStep);
//			// Log.info("Scenario PASSED: " + scenario.getName());
//		}
//	}

//	@AfterStep
//	public void afterStep(Scenario scenario) {
//		WebDriver driver = HelperClass.getDriver();
//		String currentStep = StepTracker.getCurrentStep();
//
//		if (scenario.isFailed()) {
//			Hooks.captureScreenshotBase64(driver, scenarioTest, "❌ Step Failed: " + currentStep);
//			scenario.attach(
//					driver instanceof TakesScreenshot ? ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)
//							: new byte[0],
//					"image/png", currentStep);
//			scenarioTest.log(Status.FAIL, "❌ Step Failed: " + currentStep);
//		} else {
//			scenarioTest.log(Status.PASS, "✅ Step Passed: " + currentStep);
//		}
//	}

//	@AfterStep
//	public void addScreenshot(Scenario scenario){
//
//	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	      scenario.attach(screenshot, "image/png", "image"); 
//		
//	}

//	@AfterStep
//	public void afterStep(Scenario scenario) {
//		WebDriver driver = HelperClass.getDriver();
//
//		String stepName = getStepNameFromStackTrace();
//
//		if (stepName == null || stepName.isEmpty()) {
//			stepName = "Unnamed Step";
//		}
//
//		String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//
//		if (scenario.isFailed()) {
//			scenario.attach(Base64.getDecoder().decode(base64Screenshot), "image/png", stepName);
//			scenarioTest.log(Status.FAIL, stepName,
//					MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//		} else {
//			scenarioTest.log(Status.PASS, stepName,
//					MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//		}
//	}
	
	@AfterStep
	public void afterStep(Scenario scenario) {
	    WebDriver driver = HelperClass.getDriver();
	    String stepName = StepTracker.getCurrentStep();

	    if (stepName == null || stepName.isEmpty()) {
	        stepName = "Unnamed Step";
	    }

	    String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

	    if (scenario.isFailed()) {
	        scenario.attach(Base64.getDecoder().decode(base64Screenshot), "image/png", stepName);
	        Hooks.scenarioTest.log(Status.FAIL, stepName,
	                MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
	    } else {
	        Hooks.scenarioTest.log(Status.PASS, stepName,
	                MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
	    }
	}

//	@AfterStep
//	public void afterStep(Scenario scenario) {
//	    WebDriver driver = HelperClass.getDriver();
//	    String stepName = StepTracker.getCurrentStep();
//	    if (stepName == null || stepName.isEmpty()) {
//	        stepName = "Unnamed Step";
//	    }
//
//	    String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//
//	    // For Allure
//	    scenario.attach(Base64.getDecoder().decode(base64Screenshot), "image/png", stepName);
//
//	    // For ExtentReports
//	    if (scenario.isFailed()) {
//	        scenarioTest.log(Status.FAIL, stepName,
//	            MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//	    } else {
//	        scenarioTest.log(Status.PASS, stepName,
//	            MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//	    }
//	}

	@After // This for After Scenario  In this After each scenario Logout will perform
	public void afterScenario(Scenario scenario) {
		WebDriver driver = HelperClass.getDriver();
		WebDriverWait wait = HelperClass.getWait();
 
		try {
			if (scenario.isFailed()) {
				scenarioTest.log(Status.FAIL, "Scenario Failed.");
				Log.info("Scenario Failed.");
			} else {
				scenarioTest.log(Status.PASS, "Scenario Passed.");
				Log.info("Scenario Passed.");
			}
			Capium_Login_Actions loginPage = new Capium_Login_Actions();
	        loginPage.Logout();
	        HelperClass.tearDown();
	       // Log.info("Successfully logged out and redirected to login page.");
		}
			catch (Exception e) {
			//Log.error("Logout failed: " + e.getMessage());
			System.out.println("Logout failed: " + e.getMessage());
		}
	}
 
	@AfterAll  // This method for After Feature file  In this Browser close Action will perform
	public static void tearDown() {
		System.out.println("Ending Test Execution...");
		try {
			// close browser
			//Log.info("Browser closed.");
		} catch (Exception e) {
			Log.error("Error during browser teardown: " + e.getMessage());
		}
 
		try {
			extent.flush(); // flush report
			System.out.println("Extent report flushed.");
		} catch (Exception e) {
			System.out.println("Error flushing extent report: " + e.getMessage());
		}
	}
 

	private static String timestamp() {
		return new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	}

	public static ExtentTest getScenarioTest() {
		return scenarioTest;
	}

	public static void captureScreenshotBase64(WebDriver driver, ExtentTest scenarioTest, String message) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			String base64Screenshot = ts.getScreenshotAs(OutputType.BASE64);

			scenarioTest.log(Status.INFO, "📸 Screenshot: " + message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());

			Log.info("Successfully captured screenshot: " + message);

		} catch (Exception e) {
			Log.error("Failed to capture screenshot: " + message + " | Error: " + e.getMessage());
		}
	}

	private String getStepNameFromStackTrace() {
		for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
			String methodName = element.getMethodName();

			// Find your step definition package
			if (element.getClassName().contains("com.Capium.stepDefinations")) {
				return methodName.replace("_", " ");
			}
		}
		return null;
	}
	
	private String getCurrentStepName(Scenario scenario) {
        try {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                if (element.getClassName().contains("StepDefinitions")) {
                    return element.getMethodName(); // fallback: step definition method name
                }
            }
        } catch (Exception e) {
            // Ignore
        }
        return null;
    }

	private static Map<String, Object> scenarioContext = new HashMap<>();

	public static void setScenarioContext(String key, Object value) {
		scenarioContext.put(key, value);
	}

	public static Object getScenarioContext(String key) {
		return scenarioContext.get(key);
	}

	public static void clearScenarioContext() {
		scenarioContext.clear();
	}

}
