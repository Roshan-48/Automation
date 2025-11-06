package mouseAndkeyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).keyDown(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		for (int i = 1; i <= 24; i++) {
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(100);
		}
		
		act.keyDown(Keys.TAB).keyDown(Keys.SPACE).keyUp(Keys.SPACE).perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).sendKeys("Roshan").perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).sendKeys("Pawar").perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).sendKeys("roshan@gmail.com").perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).sendKeys("Roshan@04").perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).sendKeys("Roshan@04").perform();
		Thread.sleep(2000);
		
		act.keyDown(Keys.TAB).keyDown(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		driver.close();
	}
}
