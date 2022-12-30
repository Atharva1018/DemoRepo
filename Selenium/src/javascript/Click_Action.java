package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Action {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("hiii");
		
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("hello");
		
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
		WebElement Click = driver.findElement(By.xpath("//button[@name=\"login\"]"));

		js1.executeScript("arguments[0].click()", Click); 		// we use JS executor as a alternate method for click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
