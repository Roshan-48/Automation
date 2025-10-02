package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01_10 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("$25 Virtual Gift Card")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Roshan Pawar");
		Thread.sleep(500);
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("roshan04@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("Roshan Pawar");
		Thread.sleep(500);
		driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("roshan04@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("Nothing");
		Thread.sleep(500);
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear(); 
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".button-1.add-to-cart-button")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
}
