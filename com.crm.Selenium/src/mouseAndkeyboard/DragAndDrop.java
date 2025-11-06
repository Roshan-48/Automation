package mouseAndkeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("angular"));
		WebElement target = driver.findElement(By.id("droparea"));
		
		WebElement source1 = driver.findElement(By.id("mongo"));
		WebElement target1 = driver.findElement(By.id("droparea"));
		
		WebElement source2 = driver.findElement(By.id("node"));
		WebElement target2 = driver.findElement(By.id("droparea"));
		
		act.dragAndDrop(source, target).perform();
		Thread.sleep(500);
		act.dragAndDrop(source1, target1).perform();
		Thread.sleep(500);
		act.dragAndDrop(source2, target2).perform();
		Thread.sleep(1000);
		
		driver.close();
	}
}
