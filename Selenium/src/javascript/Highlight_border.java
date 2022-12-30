package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_border {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement name= driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		WebElement username = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		WebElement pswd = driver.findElement(By.id("passContainer"));
		Thread.sleep(2000);
		
	//	Highlight_border HL1 = new Highlight_border();		// for non-static method
		
			Highlight(name, driver);
			Highlight(username, driver);
			Highlight(pswd, driver);
		
//		JavascriptExecutor JS = (JavascriptExecutor)driver;
//		JS.executeScript("arguments[0].style.border = '7px solid red'", name);
	
}
	// we declared the static method Highlight();
	
	public static void Highlight(WebElement element, WebDriver driver) {
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("arguments[0].style.border = '7px solid red'", element);
	}
}
