package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedQspider {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		
		driver.findElement(By.linkText("Nested iframe")).click();
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		
		driver.close();
	}
}
