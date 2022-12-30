package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		
		Thread.sleep(2500);
		
		Alert text = driver.switchTo().alert();
		
		System.out.println("alert msg "+text.getText() );	//getText() --- to retrive text displayed on screen popup
		
		text.sendKeys("Hello");
		Thread.sleep(2500);

		text.accept();
		
		//driver.quit();
	}

}
