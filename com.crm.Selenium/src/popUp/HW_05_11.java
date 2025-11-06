package popUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilityClass.BaseClass;

public class HW_05_11 extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		String expected_url = "https://x.com/nopCommerce";
		String expected_url1 = "https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";
		String expected_url2 = "https://www.youtube.com/user/nopCommerce";
		String expected_url3 = "https://www.facebook.com/nopCommerce";
		String expected_url4 = "https://demowebshop.tricentis.com/";
		
		preConditions();
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		Thread.sleep(1000);
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
			}
			
			
			if (expected_url1.equals(actual_url)) {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@class = 'nav__check-availability-button nav__button glue-button glue-button--high-emphasis']")).click();
			}
			
			
			if(expected_url2.equals(actual_url)) {
				Thread.sleep(1000);
				 WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
				 search.sendKeys("codehunt");
				 search.sendKeys(Keys.ENTER);
			}
			
			if(expected_url3.equals(actual_url)) {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text()= 'Create new account']")).click();
			}
			
			if(expected_url4.equals(actual_url)) {
				Thread.sleep(1000);
				WebElement dwsSearch = driver.findElement(By.xpath("//input[@id = 'small-searchterms']"));
				dwsSearch.sendKeys("Book");
				dwsSearch.sendKeys(Keys.ENTER);
			}
			Thread.sleep(2000);
		}
		driver.switchTo().window(parentHandle);
		driver.quit();
	}
}
