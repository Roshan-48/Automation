package mouseAndkeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("node"));
		WebElement target = driver.findElement(By.id("droparea"));
		
		//act.scrollByAmount(0, 400).perform();
		act.scrollToElement(target).perform();
		Thread.sleep(500);
		
		act.clickAndHold(source).release(target).perform();
		Thread.sleep(1000);
		
		driver.close();
	}
}

