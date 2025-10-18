package dropDownMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]")).click();
		
		WebElement singleEle = driver.findElement(By.id("products-orderby"));
		
//		driver.findElement(By.id("products-pagesize"));
//		driver.findElement(By.id("products-viewmode"));
	
		
		 Select sel = new Select(singleEle);
	        int i = 0;
	        List<WebElement> positions = sel.getOptions();
	        for (WebElement web : positions) {
	        	singleEle = driver.findElement(By.id("products-orderby"));
	        	sel = new Select(singleEle);
	        	sel.selectByIndex(i++);
				Thread.sleep(1000);
			}
	        Thread.sleep(2000);
	        driver.close();
	}
}
