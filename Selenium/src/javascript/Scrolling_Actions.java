package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Actions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		//Scroll down by pixel
//		JS.executeScript("window.scrollBy(0,4000)", "");
//		
		Thread.sleep(2000);
//		
//		//Scroll up by pixel
//		JS.executeScript("window.scrollBy(0,-2000)", "");

		//Scroll till bottom
		JS.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		Thread.sleep(2000);

		//Scroll till top
		JS.executeScript("document.documentElement.scrollTop=0", "");
		
		//scroll till desired element
		
		WebElement a = driver.findElement(By.xpath("//h2[contains(text(),'Save up to 15% on daily essentials')]"));

		JS.executeScript("arguments[0].scrollIntoView();", a);

		
	}

}
