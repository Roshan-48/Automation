package listenersMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
@Listeners(com.crm.listeners.TestCaseFailSc.class)
public class ScreenshotOnTestCaseFail extends BaseClass{
	@Test
	public void assignLeave() throws InterruptedException {
		//driver.findElement(By.xpath("//p[text()='Assign Leave']")).click();
		String actual_url = driver.getCurrentUrl();
		assertEquals(actual_url, "https://opensource-demo.orangehrmlive.com/web/index.php/leave/assignLeave","Not in assign leave page");
		Reporter.log("Test case pass present is assign leave page",true);
		Thread.sleep(2000);
	}
}
