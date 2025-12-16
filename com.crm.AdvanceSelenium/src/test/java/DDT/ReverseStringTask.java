package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReverseStringTask {
	public static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("ReverseString");

        int row = sh.getPhysicalNumberOfRows();
        int column = sh.getRow(0).getPhysicalNumberOfCells();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int data = (int) sh.getRow(i).getCell(j).getNumericCellValue();
                if (j == 0) {     
                    System.out.print(data + "\t");
                    int reversed = reverseNumber(data);
                    System.out.print(reversed);  
                }
            }
            System.out.println(); 
        }
	}
}
