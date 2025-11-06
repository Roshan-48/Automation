package mouseAndkeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithFindEle {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		WebElement search = driver.findElement(By.id("small-searchterms"));
		
		
		act.sendKeys(search, "Tea").keyDown(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		driver.close();
	}
}
