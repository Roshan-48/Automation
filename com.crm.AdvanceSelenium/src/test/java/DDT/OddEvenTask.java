package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class OddEvenTask {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("OddEven");
		
		int row = sh.getPhysicalNumberOfRows();
		int column = sh.getRow(0).getPhysicalNumberOfCells();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				int data = (int)sh.getRow(i).getCell(j).getNumericCellValue();
				if(j==0 && data%2 != 0) {
					 System.out.print(data+"\t");
				 }
				 else if(j==1 && data%2 == 0){
					 System.out.print(data);
				 }
			}
			System.out.println();
		}
	}
}
