package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathattributes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		//Xpath by attributes
		
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("asm123@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("asm123@gmail.com");
		
		driver.manage().window().minimize();
		
	}

}
