package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW06_101 {

		public static void main(String[] args) throws InterruptedException
		 {
			 ChromeDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
		     driver.get("https://www.facebook.com/");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Roshan");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//select[@id='day']/option[@value='21']")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//select[@id='month']/option[@value='11']")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//select[@id='year']/option[@value='2025']")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//label[text()='Male']")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("roshan04@gmail.com");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("roshan");
		     Thread.sleep(1000);
		    
		     
		     driver.close();	 
		}
	
}

