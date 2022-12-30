package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {
	
	public static void main(String [] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/premium-subscription/user/login");
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("cb-user-mail"));
		email.sendKeys("ajndka");
		Thread.sleep(3000);
		email.clear();
	email.sendKeys("kakfal");
		
	}

}
