package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcontains {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),\"Sign up for Faceb\")]")).click();
		
	//	driver.findElement(By.xpath("//input[@placeholder=\"Email address or mobile number\"]")).sendKeys("8087992973");
	}

}
