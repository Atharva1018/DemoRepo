package listbox;		// using select class

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox5 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		WebElement day = driver.findElement(By.id("day"));		// findElement -- return type is WebElement
		WebElement month = driver.findElement(By.id("month"));
		WebElement year =	driver.findElement(By.id("year"));
		
		Select a = new Select(year);
		
		List<WebElement> dd = a.getOptions();
		
		System.out.println(dd.size());
		
		System.out.println();
		
		for (int i =0; i<dd.size(); i++) {
			String YV = dd.get(i).getText();
			System.out.println(YV);
			
			if(YV.equals("10")) {
				dd.get(i).click();
				break;
			}
		}
	}

}
