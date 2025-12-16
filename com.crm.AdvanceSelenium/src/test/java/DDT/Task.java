package DDT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Task {
	@Test
	public void register() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Roshan");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Pawar");
		driver.findElement(By.xpath("//textarea[contains(@class, 'form-control ng-pristine ng-untouched ng-valid')]")).sendKeys("Nashik");
		driver.findElement(By.xpath("//input[contains(@class, 'form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required')]")).sendKeys("admin04@gmail.com");
		driver.findElement(By.xpath("//input[contains(@class, 'form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern')]")).sendKeys("9860017548");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("checkbox1")).click();
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement lang = driver.findElement(By.id("msdd"));
		js.executeScript("arguments[0].value='English'", lang);
		
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select sel1 = new Select(skills);
		sel1.selectByVisibleText("Java");
		
//		WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
//		Select sel2 = new Select(country);
//		sel2.selectByIndex(0);
		
		WebElement selCoun = driver.findElement(By.xpath("//span[@role='combobox']"));
		js.executeScript("arguments[0].value='India'", selCoun);
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select sel3 = new Select(year);
		sel3.selectByVisibleText("2003");
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel4 = new Select(month);
		sel4.selectByVisibleText("August");
		WebElement day = driver.findElement(By.id("daybox"));
		Select sel5 = new Select(day);
		sel5.selectByVisibleText("4");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("admin123");
		
		WebElement img = driver.findElement(By.id("imagesrc"));
		img.sendKeys("C:\\Users\\rosha\\Documents\\RoshanPass.jpeg");
		
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
