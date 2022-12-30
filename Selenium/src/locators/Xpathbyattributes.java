package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyattributes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("iPhone");
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
//		Thread.sleep(4000);
//
//		driver.close();
	}

}
