package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnDisableButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement jdk = driver.findElement(By.linkText("jdk-17.0.17_linux-aarch64_bin.tar.gz"));
		js.executeScript("arguments[0].scrollIntoView(false)", jdk);
		jdk.click();
		Thread.sleep(1000);
		WebElement disableButt = driver.findElement(By.linkText("Download jdk-17.0.17_linux-aarch64_bin.tar.gz"));
		
		js.executeScript("arguments[0].click()", disableButt);
		
		
		driver.close();
	}
}
