package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
	String ExpectedResult = "Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India";
		
		Thread.sleep(3000);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		if(Title.equals(ExpectedResult)) {
			System.out.println("pass");
				}
		else {
			System.out.println("fail");
		}
		
		System.out.println();
//		
//		String CurrentURL = driver.getCurrentUrl(); 
//		System.out.println(CurrentURL);
//		
//		
//		if (CurrentURL.equals("https://www.facebook.com/")) {
//			System.out.println("correct URL");
//		}
//		
//		else {
//			System.out.println("incorrect URL");
//		}
		
	//	driver.close();	
		}

}




//package demo;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//public class example4_1
//{
//public static void main(String[] args) throws InterruptedException
//{
//	
//	String expResult="Google";
//	System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	Thread.sleep(2000);
//	driver.get("https://www.google.com/");
//	Thread.sleep(2000);
//	//getTitle()-->is use to get title of the web page as an output
//	String actResult=driver.getTitle();
//	System.out.println(actResult);
//	if(actResult.equals(expResult))
//	{
//	System.out.println("navigated to correct webpage");
//	}
//	else
//	{
//	System.out.println("navigated to wrong webpage");
//	}
//	}
//	}