package functionalTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.LoginBase;
import com.crm.FileUtility.ExcelUtility;
import com.crm.Pom.Login;
import com.crm.SeleniumUtility.WaitFactory;
@Listeners(com.crm.Listeners.ExtentReportWithListeners.class)
public class LoginTest extends LoginBase {
	@Test(priority = 0)
	public void tc_001() {
		assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", "Not in login page");
		Login log = new Login(driver);
		log.getLogin_header();
		log.getOrangeHrm_logo();
	}
	
	@Test(priority = 1)
	public void tc_002() {
		Login log = new Login(driver);
		assertTrue(log.getUsername().isEnabled(), "Username textfield is not enabled");
	}
	
	@Test(priority = 2)
	public void tc_003() {
		Login log = new Login(driver);
		assertTrue(log.getPassword().isEnabled(), "Password textfield is not enabled");
	}
	
	@Test(priority = 3, dataProvider = "loginData", dataProviderClass = ExcelUtility.class)
	public void tc_004(String username, String password, String expectedResult) throws Exception {
		  if (!expectedResult.equalsIgnoreCase("invalid")) {
		        throw new SkipException("Skipping error message check for valid login");
		    }
		  	Login log = new Login(driver);
		  	WaitFactory.waitForVisibility(driver, log.getUsername());
		    log.getUsername(username);
		    WaitFactory.waitForVisibility(driver, log.getPassword());
		    log.getPassword(password);
		    log.getLogin_button();
		    WaitFactory.waitForVisibility(driver, log.getErrorMsg());
		    Assert.assertTrue(log.getErrorMsg().isDisplayed(), "Error message not displayed for invalid input");
	}
	
	@Test(priority = 4, dataProvider = "loginData", dataProviderClass = ExcelUtility.class)
	public void tc_005(String username, String password, String expectedResult) {	
		 Login log = new Login(driver);
		 WaitFactory.waitForVisibility(driver, log.getUsername());
		 log.getUsername(username);
		 WaitFactory.waitForVisibility(driver, log.getPassword());
		 log.getPassword(password);
		 log.getLogin_button();
		 if (expectedResult.equalsIgnoreCase("valid")) {
		     Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Valid login failed"); 
		 } else {
		     Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Invalid login validation failed");
		 }
	}
}
