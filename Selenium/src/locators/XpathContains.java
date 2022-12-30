package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[contains(text(),\" Select your address\")]")).click();
		
	//	driver.findElement(By.xpath("//input[@class=\"GLUX_Full_Width a-declarative\"]")).sendKeys("444607");
		
	driver.findElement(By.xpath("//span[contains(text(),\"Sign in to see your addresses\")]")).click();
		
	//	driver.findElement(By.xpath("//input[@class=\"GLUX_Full_Width a-declarative\"]")).click();		// dynamic ID - chnages at runtime

	//	driver.findElement(By.xpath("//a[contains(text(),\"See all deals\")]")).click();
		

		
	}

}
