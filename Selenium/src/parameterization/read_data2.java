package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_data2 {

	public static void main(String[] args) throws IOException {


		FileInputStream file = new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\Untitled spreadsheet (1).xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int Row = sheet.getLastRowNum();		// total row number are printed
		
		System.out.println(Row);
		
		int col = sheet.getRow(0).getLastCellNum(); 	// total col number are printed
		System.out.println(col);
		
	}

}
