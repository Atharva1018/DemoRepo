package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.croma.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("MuiAutocomplete-input MuiAutocomplete-inputFocused search-field ")).sendKeys("iphone 14 pro");
		
	}

}
