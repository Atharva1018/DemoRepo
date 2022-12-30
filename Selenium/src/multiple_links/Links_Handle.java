package multiple_links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Handle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> links	= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		// print all the links
		
		for(WebElement link : links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));		// getAttribute() -- to print all the links present on the page
		}
	
		driver.quit();
	
	}

}
