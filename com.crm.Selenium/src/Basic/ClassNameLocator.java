package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	//********************className Locator***************************
		public static void main(String[] args) throws InterruptedException {
//			ChromeDriver driver = new ChromeDriver();
	//	
//			driver.manage().window().maximize();
//			Thread.sleep(1000);
//			driver.get("https://demowebshop.tricentis.com/");
//			Thread.sleep(1000);
	//	
//			driver.findElement(By.className("ico-register")).click();
//			Thread.sleep(3000);
//			driver.close();
			
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(1000);
			WebElement searchField = driver.findElement(By.tagName("input"));
			
			searchField.sendKeys("PlayStation 5");
			Thread.sleep(1000);
			
			driver.findElement(By.className("button-1")).click();
			Thread.sleep(3000);
			driver.close();
		}	
}
