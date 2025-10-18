package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByURL {
	public static void main(String[] args) {
		
		String expected_url = "https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url = driver.getCurrentUrl();
		
		System.out.println("Current URL : "+actual_url);
		
		if(expected_url.equals(actual_url)) {
			System.out.println("I am in my taregeted Web page");
			System.out.println("Ready to do actions");
		}
		else {
			System.out.println("I am not in targeted Web page");
			System.out.println("I am finiding defects");
		}
		driver.close();
	}
}
