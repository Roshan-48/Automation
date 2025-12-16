package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.Login;

public class DirectReadByPOM {
	@Test
	public void main() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Login log = new Login(driver);
		log.getUsername("Admin");
		log.getPassword("admin123");
		log.getLogin_button();
		Thread.sleep(3000);
		driver.close();
	}
}
