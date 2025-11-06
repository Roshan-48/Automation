package utilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver = null;
	public static void preConditions() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	public static void login()
	{
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("roshan04@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Roshan@04");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
	}
	
	public static void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
	
	public static void postCondition1()
	{
		driver.close();
	}
	
	public static void postCondition2()
	{
		driver.quit();
	}
}

