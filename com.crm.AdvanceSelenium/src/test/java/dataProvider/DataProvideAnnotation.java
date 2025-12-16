package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideAnnotation {
	@DataProvider(name = "user")
	public Object[][] sender(){
		Object[][] obj = new Object[5][1];
		obj[0][0] = "Admin";
		obj[1][0] = "Roshan";
		obj[2][0] = "Mani";
		obj[3][0] = "Pratik";
		obj[4][0] = "Unnati";
		return obj;
	}
	
	@Test(dataProvider = "user")
	public void reciever(String username) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.close();
	}
}
