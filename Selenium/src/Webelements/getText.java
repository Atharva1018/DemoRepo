package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

public static void main(String [] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/premium-subscription/user/login");
		Thread.sleep(3000);
		String ExpectedResult = "We will send OTP your email id";
		
		String text = driver.findElement(By.xpath("//div[contains(text(),\"We will send OTP to your email id\")]")).getText();
		System.out.println(text.equals(ExpectedResult));
}
}
