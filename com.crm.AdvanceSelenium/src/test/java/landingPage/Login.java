package landingPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test(priority = 0)
	public void tc_001() throws Exception {
		String username = "Admin";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.sendKeys("Admin");
		String currentData = usernameTextField.getAttribute("value");
		
		if(username.equals(currentData)) {
			System.out.println("Username Data Successfully passed");
		}
		else {
			driver.close();
			throw new Exception("Data is not passed inside username textfield and test case fail");
		}
		driver.close();
	}
	
	@Test(priority = 1)
	public void tc_002() throws Exception {
		String password = "admin123";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.sendKeys("admin123");
		String currentData = passwordTextField.getAttribute("value");
		
		if(password.equals(currentData)) {
			System.out.println(" Password Data Successfully passed");
		}
		else {
			driver.close();
			throw new Exception("Data is not passed inside password textfield and test case fail");
		}
		driver.close();
	}
	
	@Test(priority = 2)
	public void tc_003() throws Exception {
		String actualUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String username = "Admin";
		String password = "admin123";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.sendKeys(username);
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.sendKeys(password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		String currentUrl = driver.getCurrentUrl();
		if(actualUrl.equals(currentUrl)) {
			System.out.println("Successfully login and test case pass");
		}
		else {
			driver.close();
			throw new Exception("Login is unsuccessful and test case failed");
		}
		driver.close();
	}
}
