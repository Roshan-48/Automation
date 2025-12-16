package popUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilityClass.BaseClass;

public class ChildBrowser extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		preConditions();
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		Thread.sleep(1000);
		
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		Actions act = new Actions(driver);
		act.scrollToElement(facebook).perform();
		facebook.click();
		
		Set<String> childHandles = driver.getWindowHandles();
		System.out.println(childHandles);
		
		childHandles.remove(parentHandle);
		
		for (String str : childHandles) {
			driver.switchTo().window(str);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		BaseClass.postCondition2();
	}
}
