package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_background {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement name= driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		WebElement username = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		WebElement pswd = driver.findElement(By.id("passContainer"));
		Thread.sleep(2000);
		
		HL(name, driver);
		HL(username, driver);
		HL(pswd, driver);	
		
	}

	public static void HL(WebElement element, WebDriver driver) {
		
		JavascriptExecutor JS1 = (JavascriptExecutor) driver;
		JS1.executeScript("arguments[0].style.background = 'yellow' ", element);
	}
}
