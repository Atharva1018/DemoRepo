package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.cssSelector("#signin-block")).click();
		driver.findElement(By.cssSelector("#hc")).click();
	//	driver.findElement(By.cssSelector("input#mobileNoInp")).sendKeys("8087992973");
		driver.findElement(By.cssSelector("div.mobileInput.clearfix")).sendKeys("2123546");
		
		driver.manage().window().minimize();
		
		
		
	}

}
