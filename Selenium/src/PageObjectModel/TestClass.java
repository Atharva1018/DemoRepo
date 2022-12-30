package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		OrangeHRM_Page1 OHP = new OrangeHRM_Page1(driver);
		
		OHP.Username();
		OHP.Pass();
		OHP.Login();
		
		OrangeHRM_Page2 OHP1 = new OrangeHRM_Page2(driver);
		OHP1.time();
		OHP1.Name();
		
		
	}

}
