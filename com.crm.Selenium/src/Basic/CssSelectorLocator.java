package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
//		WebElement searchField = driver.findElement(By.id("small-searchterms"));
		WebElement searchField = driver.findElement(By.cssSelector("#small-searchterms"));
		searchField.sendKeys("Laptop");
		Thread.sleep(1000);
		
//		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
}
