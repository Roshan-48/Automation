package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import utilityClass.BaseClass;

public class SimpleAlert extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		preConditions();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		
		postCondition1();
	}
}
