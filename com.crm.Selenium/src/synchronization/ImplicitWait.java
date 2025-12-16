package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get("https://www.shoppersstack.com/");
	 
	     driver.findElement(By.id("loginBtn")).click();
	     driver.findElement(By.xpath("//span[text()='Create Account']")).click();
	    
	  }
}
