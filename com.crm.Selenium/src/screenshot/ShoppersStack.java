package screenshot;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ShoppersStack {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.id("men")).click();
		
		try {
			driver.findElement(By.xpath("//div[contains(@class, 'MuiPaper-root')]"));
			System.out.println("Product is found and testcase pass");
		} catch (Exception e) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
	        String timestamp = LocalDateTime.now().format(dtf);
	        
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        String fileName = "ShoppersStackMen" + timestamp + ".png";
	        File dest = new File("C:\\Users\\rosha\\Pictures\\Screenshots\\"+fileName); 
	        FileHandler.copy(src, dest);
	        driver.close();
	        throw new Exception("Product is not found and Testcase fail");
		}
		driver.close();
	}
}
