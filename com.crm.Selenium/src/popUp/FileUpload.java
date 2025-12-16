package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(1000);
		
		WebElement selectWordFile = driver.findElement(By.xpath("//input[@type='file']"));
		selectWordFile.sendKeys("C:\\Users\\rosha\\Downloads\\Roshan_Pawar_Resume.pdf");
		Thread.sleep(3000);
		
		driver.close();
	}
}
