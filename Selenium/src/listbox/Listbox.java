package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

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
		
		//select by VisibleText
		
//		Select s1 = new Select(d);
//		s1.selectByVisibleText("25");
//		
//		Select s2 = new Select(m);
//		s2.selectByVisibleText("Apr");
//		
//		Select s3 = new Select(y);
//		s3.selectByVisibleText("1996");
//		
//		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
//		boolean a1 = driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
//		System.out.println(a1);

//=====================================================================================================================		
		
		//select by Index
		
//		Select s4 = new Select(d);
//		s4.selectByIndex(10);
//		
//		Select s5 = new Select(m);
//		s5.selectByIndex(6);
//		
//		Select s6 = new Select(y);
//		s6.selectByIndex(50);

//=====================================================================================================================		

		// Select ByValue
		
		Select s7 = new Select(d);
		s7.selectByValue("18");
		
		Select s8 = new Select(m);
		s8.selectByValue("7");
		
		Select s9 = new Select(y);
		s9.selectByValue("1995");
		
		driver.findElement(By.xpath("//label[contains(text(),\"Male\")]")).click();
		boolean a2 = driver.findElement(By.xpath("//label[contains(text(),\"Male\")]")).isSelected();
		System.out.println(a2);

	}

}
