package utilityClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {
	
	public static WebDriver driver = null;
	public static void diffEnvirnoment() {
		String browser = PreConditions.browser;
		if(browser.equals("chrome")) {
			 driver = new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			 driver = new EdgeDriver();
		}
		else if(browser.equals("safari")) {
			 driver = new SafariDriver();
		}
		else if(browser.equals("internetexplorer")) {
			 driver = new InternetExplorerDriver();
		}
		else if(browser.equals("firefox")) {
			 driver = new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
	}
	
	public static void main(String[] args) {
		diffEnvirnoment();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.close();
	}
}
