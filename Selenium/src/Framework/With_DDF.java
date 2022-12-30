package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		FileInputStream file = new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\Book1.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		//enter username
		String username= sh.getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);

		//enter password
		
		String pswd = sh.getRow(1).getCell(1).getStringCellValue();		
		
		driver.findElement(By.id("pass")).sendKeys(pswd);
		Thread.sleep(2000);

		//click on the login button
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		Thread.sleep(2000);
		
		// check if expected name matches actual name
		
//		String Expectedname = sh.getRow(0).getCell(2).getStringCellValue();
//		
//		String Actualname = driver.findElement(By.xpath("//p[contains(text(),'Paul Singh')]")).getText();
//		
//		if(Expectedname.equals(Actualname)) {
//			System.out.println("correct name");
//		}
//		else {
//			System.out.println("incorrect name");
//		}
			
	}

}
