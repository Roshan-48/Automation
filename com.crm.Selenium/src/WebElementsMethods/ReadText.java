package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadText {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		String text = driver.findElement(By.className("ico-cart")).getText();
		System.out.println(text);
		
//		String text1 = driver.findElement(By.linkText("Community poll")).getText();
//		System.out.println(text1);			//NoSuchElementException
		Thread.sleep(3000);
		
		driver.close();
	}
	
}
