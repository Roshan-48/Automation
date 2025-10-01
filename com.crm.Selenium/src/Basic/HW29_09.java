package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW29_09 {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.className("ico-cart")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.className("ico-wishlist")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
