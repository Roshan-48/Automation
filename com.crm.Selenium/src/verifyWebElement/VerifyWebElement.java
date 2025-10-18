package verifyWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebElement {
	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement excellent = driver.findElement(By.id("pollanswers-1"));
		
		if(excellent.isEnabled()) {
			System.out.println("Excellent radio button is enabled");
			excellent.click();
			System.out.println("Pass");
		}
		else {
			driver.close();
			throw new Exception("ElementNotExistException");
		}
		driver.close();
	}
	
	
}
