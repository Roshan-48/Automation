package popUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilityClass.BaseClass;

public class MultipleChild extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		String expected_url = "https://x.com/nopCommerce";
		preConditions();
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		
		 List<WebElement> ecommerce_links = driver.findElements(By.xpath("//a[@target='_blank']"));
		 for (WebElement web : ecommerce_links) {
			web.click();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		Set<String> childHandles = driver.getWindowHandles();
		System.out.println(childHandles);
		
		for (String str : childHandles) {
			driver.switchTo().window(str);
			String actual_url = driver.getCurrentUrl();
			if(expected_url.equals(actual_url)) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
			}
			Thread.sleep(2000);
		}
		driver.close();
	}
}
