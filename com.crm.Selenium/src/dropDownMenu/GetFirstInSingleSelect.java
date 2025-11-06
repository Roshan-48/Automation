package dropDownMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstInSingleSelect {
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/hp/AppData/Local/Microsoft/Windows/INetCache/IE/7SBX4KYL/demo[1].html");
		
		WebElement singleSelect = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(singleSelect);
		
		sel.selectByValue("jgr");
		Thread.sleep(1000);
		sel.selectByIndex(3);
		Thread.sleep(1000);
		sel.selectByVisibleText("Mini");
		
		WebElement first = sel.getFirstSelectedOption();
		System.out.println("First Data is : "+first.getText());
		
		driver.close();
	}
}
