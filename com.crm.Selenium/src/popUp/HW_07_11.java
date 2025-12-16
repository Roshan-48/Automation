package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_07_11 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.co/en");
        Thread.sleep(1000);
        
        driver.findElement(By.className("dateText")).click();
	}
}
	