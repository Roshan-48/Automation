package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByWebElement {
	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/books");
		
		try {
			driver.findElement(By.xpath("//strong[text() = 'Community poll']"));
			System.out.println("Pass");
		} catch (Exception e) {
			driver.close();
			System.out.println("Fail");
			throw new Exception("ElementNotFoundException");
		}
		driver.close();
	}
}
