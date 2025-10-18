package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		//Xpath By Attribute
//		driver.findElement(By.xpath("//label[@for='pollanswers-1']")).click();
//		Thread.sleep(1000);
//		
//		//Xpath by text function
//		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
//		System.out.println(poll.getText());
//		Thread.sleep(1000);
//		
//		//Xpath by contains function (Text)
//		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
//		Thread.sleep(1000);
//		
//		//Xpath by contains function(Attribute) //Facebook Website
//		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
//		Thread.sleep(1000);
		
		//Xpath by Group of index
		driver.findElement(By.xpath("(//input[@name='pollanswers-1'])[4]")).click();
		Thread.sleep(2000);
		
		//Independent & dependent Xpath
//		WebElement laptop14 = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../../div[3]/div/span"));
//		System.out.println(laptop14.getText());
		
		//By sibling Traversing (forward)
//		WebElement laptop14 = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/parent::h2/following-sibling::div[3]/div/span"));
//		System.out.println(laptop14.getText());
	
		//By sibling Traversing (backward)
		WebElement laptop15 = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/parent::h2/parent::div/preceding-sibling::div/a"));
		System.out.println(laptop15.getText());
		
		Thread.sleep(1000);
		
		driver.close();
	}
}
