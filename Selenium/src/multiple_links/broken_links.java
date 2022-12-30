package multiple_links;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_links {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	List<WebElement> a1	= driver.findElements(By.tagName("a"));
	
	for (WebElement b1 : a1) {		// for loop to print all the links present on the page
		
		 String url = b1.getAttribute("href");
		 if(url == null || url.isEmpty()) {
			 System.out.println("null or empty link");
		 }
		 
		 URL link = new URL(url);
		 HttpsURLConnection httpcode = (HttpsURLConnection) link.openConnection();
		 httpcode.connect();
		 
		 if(httpcode.getResponseCode()>=400) {
			 System.out.println(" Invaid response code" + httpcode.getResponseCode()+ " url is Invalid " + url);
		 }
		 else {
			 System.out.println(" valid response code" + httpcode.getResponseCode()+ " url is valid " + url);

		 }
	}
		
	}

}
