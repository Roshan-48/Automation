package utilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchField extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		preConditions();
		Thread.sleep(2000);
		login();
		driver.findElement(By.id("small-searchterms"));
		WebElement field.sendKeys("Mobiles");
	}
}
