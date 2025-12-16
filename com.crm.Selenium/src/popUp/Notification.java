package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Notification {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		Robot ref = new Robot();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(1000);
		
		ref.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		ref.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		ref.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		ref.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		ref.keyPress(KeyEvent.VK_TAB);
		ref.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.close();
	}
}
