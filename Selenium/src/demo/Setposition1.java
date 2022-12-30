package demo;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition1 {

	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.drishtiias.com/");
		Thread.sleep(4000);
		
		Point a1 = new Point(800, 600);
		Thread.sleep(4000);

		driver.manage().window().setPosition(a1);
		
		
		
		// getPosition
		
		System.out.println(driver.manage().window().getPosition());
		driver.close();
	}
}
