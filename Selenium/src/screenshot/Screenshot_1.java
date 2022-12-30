package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	//	File dest = new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\screenshot\\homepage.png");
		
	//	File dest = new File ("D:\\Velocity\\SS\\ScreenShot\\hp.png"); 
		
		File dest1 = new File ("D:\\Velocity\\SS\\a.png");
		
		File dest2 = new File ("D:\\Velocity\\SS\\a.png");
		
		
		FileHandler.copy(src, dest1);
		FileHandler.copy(src, dest2);

	}

}
