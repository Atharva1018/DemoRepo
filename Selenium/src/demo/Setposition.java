package demo;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		
		
		
		Point p1 = new Point(500, 600);
		Thread.sleep(4000);

		driver.manage().window().setPosition(p1);
		
		
		//getposition
		Thread.sleep(4000);

		System.out.println(driver.manage().window().getPosition());
		
		
		
	}

}
