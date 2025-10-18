package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW13_10 {
	public static void main(String[] args) throws InterruptedException
	{
		 String rss_url ="https://demowebshop.tricentis.com/news/rss/1" ;
		 
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
	     driver.navigate().to("https://demowebshop.tricentis.com/");
	     Thread.sleep(2000);
	     
	     List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
	      for(WebElement web : links)
	      {
	    	  String actual_url = driver.getCurrentUrl();
	    	  if(actual_url.equals(rss_url))
	    	  {
	    		  driver.navigate().back();
	    	  }
	    	  web.click();
	    	  Thread.sleep(1000);
	      }
	      driver.quit();
	}
}
