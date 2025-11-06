package mouseAndkeyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPress {
	public static void main(String[] args) throws Exception {
		String expected_url = "https://demowebshop.tricentis.com/register";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(500);
		act.keyDown(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		String actual_url = driver.getCurrentUrl();
		if(expected_url.equals(actual_url)) {
			System.out.println("Test Case Pass");
		}
		else {
			driver.close();
			throw new Exception("TestCaseFailException");
		}
		
		driver.close();
	}
}
