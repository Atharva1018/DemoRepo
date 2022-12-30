package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandle2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		//nested frame
		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'This page is displayed in an iframe')]")).getText());
		driver.switchTo().parentFrame();
		
		//parent iframe
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText());

		driver.switchTo().defaultContent();		//return to home page using defaultContent() method
		
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();	// return to home page
		
	}

}
