package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quitmethod {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		
		
		
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		
		Thread.sleep(3000);
		System.out.println("GM");
		driver.quit();
	}
}

//button[@class=\"btn btn-info\"]
//button[@class=\"btn btn-info\"]