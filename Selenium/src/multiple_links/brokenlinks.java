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

public class brokenlinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		int brokenlinks =0;
		
		for(WebElement element : links) {
			
			 String url= element.getAttribute("href");
			 
			 if(url== null || url.isEmpty()) {
				 System.out.println("url is null or empty");
				 continue;
			 }
			  URL link = new URL(url);
			  HttpsURLConnection httpcode = (HttpsURLConnection) link.openConnection();
			  httpcode.connect();
			  
			  if(httpcode.getResponseCode()>=400) {
				  System.out.println(httpcode.getResponseCode()+ url);
				  brokenlinks++; 
			  }
			  
			  else {
				  System.out.println(httpcode.getResponseCode()+ url);
			  }
		}
	}

}
