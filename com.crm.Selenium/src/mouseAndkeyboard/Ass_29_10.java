package mouseAndkeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass_29_10 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//*[@id=\"optionsBody\"]/a[1]/div/main")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		Thread.sleep(1000);
		
		WebElement source = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		act.dragAndDrop(source, target).perform();
		Thread.sleep(1000);
		
		WebElement source1 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement target1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		act.dragAndDrop(source1, target1).perform();
		Thread.sleep(1000);
		
		WebElement source2 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		act.dragAndDrop(source2, target2).perform();
		Thread.sleep(1000);
		
		WebElement source3 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement target3 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		act.dragAndDrop(source3, target3).perform();
		Thread.sleep(1000);
		driver.close();
	}
}
