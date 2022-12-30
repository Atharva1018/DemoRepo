package demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize1 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.apple.com/in/");
		
		Dimension Size = new Dimension(1000, 500);
		
		driver.manage().window().setSize(Size);
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
