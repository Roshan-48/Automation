package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		       
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'MuiBackdrop-root')]")));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		driver.findElement(By.id("loginBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create Account']")));
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		driver.close();
	}
}
