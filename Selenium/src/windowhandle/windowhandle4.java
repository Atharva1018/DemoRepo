package windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Set<String> ID = driver.getWindowHandles();		//returns the ID
		
		System.out.println(ID);
		
		Iterator<String> IT = ID.iterator();
		String a = IT.next();
		String b = IT.next();
		
		System.out.println(a);
		System.out.println(b);
		
		Thread.sleep(2000);
		driver.switchTo().window(a);
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		for (String a1: ID ) {
			String Title = driver.switchTo().window(a1).getTitle();
			
//			if
//				(Title.equals("OrangeHRM"))|| Title.equals("abcd"));
//			
//		
//		//	if(Title.equals("OrangeHRM")) || Title.equals("anfjan")+"");

		
		driver.close();

	}
	}
	
}
	

