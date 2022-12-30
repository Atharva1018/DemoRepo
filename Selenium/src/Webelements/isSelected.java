package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		boolean b = driver.findElement(By.xpath("//input[@name=\"radiooptions\"]")).isSelected();
		System.out.println(b);
		
		driver.findElement(By.xpath("//input[@name=\"radiooptions\"]")).click();	// first perform click(); method only then we will get true o/p for isSelected(); method 
		
		boolean b1 = driver.findElement(By.xpath("//input[@name=\"radiooptions\"]")).isSelected();
		System.out.println(b1);
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
