package assertionMethods;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertTrueAndFalse {
	@Test
	public void main() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		WebElement usernameTextField = driver.findElement(By.name("username"));
		assertTrue(usernameTextField.isEnabled(),"Username textfield is disabled");
		usernameTextField.sendKeys("Admin");
	}

}
