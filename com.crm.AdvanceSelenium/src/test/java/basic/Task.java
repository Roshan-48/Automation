package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;

public class Task extends BaseClass {
	@Test(priority = 0)
	public void verifyEle() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//p[text()='Assign Leave']"));
		if(ele.isDisplayed()) {
			System.out.println("Element is displaying");
		}
		else {
			driver.close();
			throw new Exception("Element is not displaying");
		}
	}
	
	@Test(priority = 1)
	public void search() throws Exception {
		WebElement seachfield = driver.findElement(By.cssSelector("input[class='oxd-input oxd-input--active']"));
		seachfield.sendKeys("Admin");
		WebElement admin = driver.findElement(By.xpath("//span[text()='Admin']"));
		if(admin.isDisplayed()) {
			System.out.println("Admin is displayed");
			admin.click();
		}
		else {
			driver.close();
			throw new Exception("Admin Element is not displayed");
		}
	}
	
	@Test(priority = 2)
	public void checkEleEnabled() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//p[text()='Apply Leave']"));
		if(ele.isEnabled()) {
			System.out.println("Element is Enabled");
			ele.click();
		}
		else {
			driver.close();
			throw new Exception("Element is not enabled");
		}
	}
}
