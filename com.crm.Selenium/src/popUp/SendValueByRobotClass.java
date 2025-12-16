package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import utilityClass.BaseClass;

public class SendValueByRobotClass extends BaseClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		preConditions();
		
		Robot rob = new Robot();
		driver.findElement(By.id("small-searchterms")).click();
		
		rob.keyPress(KeyEvent.VK_P);
		Thread.sleep(500);
		rob.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		rob.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		
		rob.keyRelease(KeyEvent.VK_P);	
		rob.keyRelease(KeyEvent.VK_E);
		rob.keyRelease(KeyEvent.VK_N);
		
		postCondition1();	
	}
}
