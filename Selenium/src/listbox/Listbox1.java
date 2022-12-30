package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		
		WebElement d = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		WebElement m = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		WebElement y = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		
		
//		listbox(d, "18");
//		listbox(m, "7");
//		listbox(y, "1995");
		
		String dob = "18/7/1995";
		String date[] = dob.split("/");
		
		listbox(d, date[0]);
		listbox(m, date[1]);
		listbox(y, date[2]);

	}
	public static void listbox(WebElement elements, String value) {
		
		Select s1 = new Select(elements);
		s1.selectByValue(value);
	}
	
}
