package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarPopUp {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disalbe-notifications");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(700);
		driver.findElement(By.id("ddate")).click();
		Thread.sleep(700);
		driver.findElement(By.id("07/11/2025")).click();
		Thread.sleep(700);
		driver.findElement(By.id("divRtnCal")).click();
		Thread.sleep(700);
		for (;;) {
			try {
				driver.findElement(By.id("fst_3_01/07/2026")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.id("img2nex")).click();
			}
			Thread.sleep(1000);
		}
		
		driver.close();
	}
}
