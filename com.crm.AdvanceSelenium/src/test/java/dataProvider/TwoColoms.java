package dataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoColoms {
	@DataProvider
	public Object[][] dwsLogin() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int row = sh.getPhysicalNumberOfRows();
		int column = sh.getRow(0).getPhysicalNumberOfCells();
		Object[][] obj = new Object[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				obj[i][j] = sh.getRow(i).getCell(j).toString();
			}
		}
		return obj;
	}
	
	@Test(dataProvider = "dwsLogin")
	public void reciever(String username, String pass) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
