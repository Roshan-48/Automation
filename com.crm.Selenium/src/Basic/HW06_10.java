package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW06_10 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@href=\"/digital-downloads\"])[3]")).click();
		Thread.sleep(1000);
		
		String str = driver.findElement(By.xpath("//a[contains(text(),'3rd Album')]/../../div[3]/div/span")).getText();
		System.out.println(str);
		Thread.sleep(1000);
		
	    WebElement music1 = driver.findElement(By.xpath("//a[text()='Music 2']/../../div[3]/div/span"));
	    System.out.println(music1.getText());
	    Thread.sleep(2000);
	    
	    WebElement music2 = driver.findElement(By.xpath("//a[text()='Music 2']/../../div[3]/div/span"));
	    System.out.println(music2.getText());
	    Thread.sleep(2000);
		
		driver.close();
	}
}
