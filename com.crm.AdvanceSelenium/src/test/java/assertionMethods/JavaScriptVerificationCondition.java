package assertionMethods;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class JavaScriptVerificationCondition {
	@Test
	public void main() throws Exception {
		String expected_landPage = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String actual_landPage = driver.getCurrentUrl();
		assertEquals(actual_landPage, expected_landPage, "I am not in login page");
			Reporter.log("I am in login");
			WebElement usernameTextField = driver.findElement(By.name("username"));
			usernameTextField.sendKeys("Admin");
			WebElement passwordTextField = driver.findElement(By.name("password"));
			passwordTextField.sendKeys("admin123");
			//driver.findElement(By.cssSelector("button[type='submit']")).click();
			Thread.sleep(1000);
			String actual_homePage = driver.getCurrentUrl();
			assertEquals(actual_homePage, expected_landPage, "Login is Unsuccessful");
				Reporter.log("Login is Successful",true);
				driver.close();
	}
}
