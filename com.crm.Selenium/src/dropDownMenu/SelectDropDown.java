package dropDownMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("file:///C:/Users/hp/AppData/Local/Microsoft/Windows/INetCache/IE/7SBX4KYL/demo[1].html");
		Thread.sleep(1000);
		
		WebElement singleSelect = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(singleSelect);
		sel.selectByIndex(2);
		Thread.sleep(1000);
		
		sel.selectByVisibleText("Jaguar");
		Thread.sleep(1000);
		
		sel.selectByValue("vol");
		Thread.sleep(1000);
		
		driver.close();
	}
}
