package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyID {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	//	driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\"]")).sendKeys("8087992973");
		driver.findElement(By.id("pass")).sendKeys("1234");
		
		driver.findElement(By.xpath("//button[contains(@id,\"u_0_5_\")]")).click();
		
		//driver.close();
		
		
	}

}
