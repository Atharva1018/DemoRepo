package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		Thread.sleep(2000);
		
		WebElement input = driver.findElement(By.xpath("(//textarea[@class=\"inputText\"])[1]"));
		WebElement input1 = driver.findElement(By.xpath("(//textarea[@class=\"inputText\"])[2]"));
		
		input.sendKeys("hello there");
		
		Actions action = new Actions(driver);
		
		// ctrl + a
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		// ctrl + c
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		// tab
		action.keyDown(Keys.TAB);
		action.build().perform();
		
		// ctrl + v
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		
		
		
		
		
		
		
	}

}
