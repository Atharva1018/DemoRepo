package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.infosys.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class=\"burger\"]")).click();
		Thread.sleep(1000);
		
		WebElement a = driver.findElement(By.xpath("//a[@class=\"industries\"]"));
		Actions action = new Actions(driver);
		
		action.moveToElement(a).build().perform();
		
		WebElement b= driver.findElement(By.xpath("//a[contains(text(),'Oil and Gas')]"));
		System.out.println(b.getText());

		
		
	}
}
