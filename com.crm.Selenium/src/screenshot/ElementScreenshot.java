package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenshot {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/");
        
        WebElement ts = driver.findElement(By.xpath("//img[@alt='Picture of $25 Virtual Gift Card']"));
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\rosha\\Pictures\\Screenshots\\giftcard.jpg");
        FileHandler.copy(src, dest);
        
        driver.close();
	}
}
