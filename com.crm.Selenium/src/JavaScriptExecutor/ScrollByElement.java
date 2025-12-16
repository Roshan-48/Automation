package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement computer = driver.findElement(By.xpath("//a[text()='Build your own cheap computer']"));
		
		js.executeScript("arguments[0].scrollIntoView(false);", computer);
		
		driver.close();
	}
}
