package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScript {
	public static void main(String[] args) {
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//enter into DWS
		driver.get("https://demowebshop.tricentis.com/");
		
		//close the browser
		driver.close();
	}
}
