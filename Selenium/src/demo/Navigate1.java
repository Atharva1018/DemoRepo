package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		String s1 = driver.getTitle();
		System.out.println(s1);
		
		driver.navigate().to("https://www.apple.com/in/");
		Thread.sleep(3000);
		
		String s2 = driver.getTitle();
		System.out.println(s2);
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.close();
		
		
		
	}

}
