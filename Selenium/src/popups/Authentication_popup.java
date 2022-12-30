package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//https:username:password@link  	Syntax -- to handle popup that displays immediately after the screen is loaded
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String t = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')] ")).getText();
		System.out.println(t);
		
		
	}

}
