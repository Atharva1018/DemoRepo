package windowhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String ID = driver.getWindowHandle();
		System.out.println(ID);
		
		driver.quit();
		
		//CDwindow-F06659E94891144690F8AE1039EA2F77
		//CDwindow-0F868499E43020984D54A42441312379

		//getWindowHandle() is used to store the single window ID of the browser

	}

}
