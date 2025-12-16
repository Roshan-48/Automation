package extentReports;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Report1 {
	@Test
	public void login() {
		ExtentSparkReporter spark = new ExtentSparkReporter(".\\src\\test\\resources\\Reports\\Sample.html");
		
		spark.config().setDocumentTitle("OrangeHRM");
		spark.config().setReportName("Roshan");
		spark.config().setTheme(Theme.DARK);
		
		ExtentReports report = new ExtentReports();
		
		report.setSystemInfo("System Brand", "HP Victus");
		report.setSystemInfo("OS", "Windows 11");
		report.setSystemInfo("Browser", "Chrome");
		
		report.attachReporter(spark);
		
		ExtentTest test = report.createTest("login");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username = driver.findElement(By.name("username"));
		assertTrue(username.isEnabled());
		driver.close();
		
		test.log(Status.INFO, "Username textfield is enabled");
		
		report.flush();
	}
}
