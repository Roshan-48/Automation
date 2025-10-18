package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {
		
	public static void main(String[] args) throws Exception {
		
		String expected_title = "Demo Web Shop";
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String actual_title = driver.getTitle();
		
		System.out.println("Current Title : "+actual_title);
		
		if(expected_title.equals(actual_title)) {
			System.out.println("I am in my targeted title page");
			System.out.println("Ready to do actions");
		}
		else {
			System.out.println("I am not in targeted title page");
			System.out.println("I am finiding defects");
			driver.close();
			throw new Exception("IncorrectTitlePageException");
		}
		driver.close();
	}
}

