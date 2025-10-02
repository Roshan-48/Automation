package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01_10 {
		
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		WebElement poll = driver.findElement(By.cssSelector(".block.block-poll"));
		System.out.println(poll.getText());
		 
		Thread.sleep(2000);
		
		driver.close();
	}

}
