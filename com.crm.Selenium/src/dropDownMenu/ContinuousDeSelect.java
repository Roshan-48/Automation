package dropDownMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContinuousDeSelect {
	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/hp/AppData/Local/Microsoft/Windows/INetCache/IE/7SBX4KYL/demo[1].html");
		
		WebElement multiSelect = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(multiSelect);
		
		List<WebElement> cars = sel.getOptions();
		int i = 0;
		for (WebElement web : cars) {
			sel.selectByIndex(i++);
			Thread.sleep(1000);
		}
		
		if(sel.isMultiple()) {
			sel.deselectAll();
			Thread.sleep(500);
			System.out.println("Pass");
		}
		else {
			driver.close();
			throw new Exception("FailException");
		}
		driver.close();
	}
}
