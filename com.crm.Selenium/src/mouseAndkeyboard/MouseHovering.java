package mouseAndkeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(500);
		
		Actions act = new Actions(driver);
		WebElement kids = driver.findElement(By.xpath("//a[@data-group='kids']"));
		
		act.moveToElement(kids).perform();
		
		WebElement ethnic_wear = driver.findElement(By.xpath("//a[text()='Ethnic Wear' and @data-reactid='357']"));
		Thread.sleep(1000);
		
		act.click(ethnic_wear).perform();
		Thread.sleep(2000);
		driver.close();
	}
}
