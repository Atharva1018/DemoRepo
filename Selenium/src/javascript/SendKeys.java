package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		
		WebElement pswd = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Click = driver.findElement(By.xpath("//button[@name=\"login\"]"));

		
		// first way
//		js.executeScript("arguments[0].value = 'hey';", username);
//		js.executeScript("arguments[0].value = 'hello';", pswd);
//		js.executeScript("arguments[0].click()", Click);
		
		//second way
		
		js.executeScript("document.getElementById('email').value = 'hello';");
		js.executeScript("document.getElementById('pass').value = 'hiiii';");
		js.executeScript("arguments[0].click()", Click);


		
	}

}
