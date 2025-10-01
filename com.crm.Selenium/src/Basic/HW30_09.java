package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW30_09 {
		
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("Roshan");
		Thread.sleep(1000);
		driver.findElement(By.name("LastName")).sendKeys("Pawar");
		Thread.sleep(1000);
		driver.findElement(By.name("Email")).sendKeys("roshanpawar482003@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("roshan");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("roshan");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
}
