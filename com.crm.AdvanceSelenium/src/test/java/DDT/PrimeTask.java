package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrimeTask {
	public static boolean isPrime(int n) {
        if (n <= 1) 
        		return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) 
            		return false;
        }
        return true;
    }
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

        FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("Prime");

        int row = sh.getPhysicalNumberOfRows();
        int column = sh.getRow(0).getPhysicalNumberOfCells();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int data = (int) sh.getRow(i).getCell(j).getNumericCellValue();
                if (isPrime(data)) {
                    System.out.print(data + "\t");
                }
            }
            System.out.println();  
        }
    }
}
