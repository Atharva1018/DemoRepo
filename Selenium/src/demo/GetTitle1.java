package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle1 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
	//	String ExptResult = "YouTube";
		Thread.sleep(2000);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		if(Title.equals("YouTube")) {
			System.out.println("correct Title");
			
		}
		
		else
			System.out.println("incorrect title");
		
	}

}
