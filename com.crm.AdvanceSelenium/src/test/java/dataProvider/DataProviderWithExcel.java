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

public class DataProviderWithExcel {
	
	@DataProvider(name = "user")
	public Object[][] sender() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Data");
		int row = sh.getPhysicalNumberOfRows();
		int column = sh.getRow(0).getPhysicalNumberOfCells();
		Object[][] obj = new Object[row][column];
		int j=0;
		for (int i = 0; i < row; i++) {
			obj[i][j] = sh.getRow(i).getCell(j).toString();
		}
		return obj;
	}
	
	@Test(dataProvider = "user")
	public void reciever(String username) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.close();
	}
}
