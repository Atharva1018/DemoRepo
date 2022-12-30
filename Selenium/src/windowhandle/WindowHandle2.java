package windowhandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Set<String> id = driver.getWindowHandles(); 	//getWindowHandles() return type is Set<String>
		
		System.out.println(id);
		
		// read ID using Iterator
		
		Iterator<String> it= id.iterator();
		String parentwindow = it.next();		// gives first window
		String childwindow = it.next();			// gives second window
		
		System.out.println(parentwindow);
		System.out.println(childwindow);
		
		// read ID usind ArrayList
		
		ArrayList<String> list  = new ArrayList(id);
		String p = list.get(0);
		String c = list.get(1);
		
		System.out.println(p);
		System.out.println(c);

	}

}
