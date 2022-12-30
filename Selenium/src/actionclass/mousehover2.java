package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.infosys.com/careers/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class=\"burger\"]")).click();
		
		WebElement x = driver.findElement(By.xpath("//a[@class=\"burger1\"]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(x).build().perform();
		
		WebElement y = driver.findElement(By.xpath("(//a[@title=\"Experienced Professionals\"])[1]"));
		String z = y.getText();
		System.out.println(z);
		
	}

}
