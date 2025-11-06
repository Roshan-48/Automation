package mouseAndkeyboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass_28_10 {
	 public static void main(String[] args) throws InterruptedException {	
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		  Thread.sleep(2000);
		  Actions act = new Actions(driver);
		  WebElement DoubleClickme = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		  act.doubleClick(DoubleClickme).perform();
		  Thread.sleep(2000);
		  driver.close();
		}
}
