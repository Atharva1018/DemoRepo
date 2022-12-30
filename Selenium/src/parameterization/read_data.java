package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "C:\\Users\\User\\OneDrive\\Desktop\\Untitled spreadsheet.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		 String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
	}

}
