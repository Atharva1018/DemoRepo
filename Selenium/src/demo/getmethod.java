package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethod {

	public static void main(String args []) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
	} 
}
