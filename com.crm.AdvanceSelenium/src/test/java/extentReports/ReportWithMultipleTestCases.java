package extentReports;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.LoginBase;
@Listeners(com.crm.listeners.ExtentReportWithListeners.class)
public class ReportWithMultipleTestCases extends LoginBase {
	@Test
	public void tc_001() {
		WebElement username = driver.findElement(By.name("username"));
		assertTrue(username.isEnabled());
	}
	
	@Test
	public void tc_002() {
		String name = "Admin";
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(name);
		assertEquals(username.getAttribute("value"), name);
	}
	
	@Test(dependsOnMethods = "tc_004")
	public void tc_003() {
		WebElement password = driver.findElement(By.name("password"));
		assertTrue(password.isEnabled());
	}
	
	@Test
	public void tc_004() {
		String pass = "admin123";
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pass);
		assertEquals(password.getAttribute("value"), pass);
		fail();
	}
	
}
