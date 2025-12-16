package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("singleframe");
		WebElement ele = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		driver.switchTo().frame(ele);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Roshan");
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Home")).click();
		
		driver.close();
	}
}
