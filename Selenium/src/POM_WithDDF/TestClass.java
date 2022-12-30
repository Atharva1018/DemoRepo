package POM_WithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// fetch the data from excel sheet
		
		FileInputStream file = new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\POM_DDF.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		// create an object of POM class with DDF 
		
		OrangeHRM_1 OHP = new OrangeHRM_1(driver);
		
		// fetch username from excel sheet
		String a = sh.getRow(1).getCell(0).getStringCellValue();
		OHP.ID(a);
		
		
		// fetch password from excel sheet
		
		String b = sh.getRow(1).getCell(1).getStringCellValue();
		OHP.pass(b);
		
		// click on the login tab
		OHP.login();
		
		
	}

}
