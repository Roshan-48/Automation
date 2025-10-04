package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW03_10 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
		Thread.sleep(1000);
		
		WebElement gender = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div/div/label"));
		gender.click();
		Thread.sleep(500);
		
		WebElement fName = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input"));
		fName.sendKeys("Roshan");
		Thread.sleep(500);
		
		WebElement lName = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input"));
		lName.sendKeys("Pawar");
		Thread.sleep(500);
		
		WebElement email = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input"));
		email.sendKeys("roshanpawar482003@gmail.com");
		Thread.sleep(500);
		
		WebElement pass = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div/input"));
		pass.sendKeys("roshan");
		Thread.sleep(500);
		
		WebElement conPass = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input"));
		conPass.sendKeys("roshan");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
		Thread.sleep(1000);
		
		//************************************LOGIN************************************************
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(1000);
		
		WebElement lEmail = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/input"));
		lEmail.sendKeys("roshanpawar482003@gmail.com");
		Thread.sleep(500);
		
		WebElement lpass = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[3]/input"));
		lpass.sendKeys("roshan");
		Thread.sleep(500);
		
		WebElement rememberMe = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[4]/input"));
		rememberMe.click();
		Thread.sleep(500);
		
		WebElement submit = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/input"));
		submit.click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
