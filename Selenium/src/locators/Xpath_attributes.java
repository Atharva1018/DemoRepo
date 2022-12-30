package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_attributes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.amazon.in/");		// amazon page
		
		driver.get("https://www.flipkart.com/");	// Flipkart page
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8087992973");		// login ID
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("1234");	// password
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();			// Login button
	
		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[text()=\"Forgot?\"]")).click();
		
		Thread.sleep(4000);

		driver.close();
		
		
		
	}

}
