package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select s = new Select(day);
		
		List<WebElement> listday = s.getOptions(); 	//getOptions()- use to get the all the options present in listbox...return type is List<WebElement>
		
		System.out.println(listday.size());
		
		System.out.println();
		
		for (int i =0; i<listday.size(); i++) {
			String DV = listday.get(i).getText();
			
			System.out.println(DV);		// prints all the date in the listbox
			
			if(DV.equals("15")) {
				listday.get(i).click();
				break;
			}
		}
		
		System.out.println();
		
		Select s1 = new Select(month);
		
		List<WebElement> listmonth = s1.getOptions();
		System.out.println("month size is: " + listmonth.size() );
		
		System.out.println();
		
		for (int i = 0; i<listmonth.size(); i++) {
			String M = listmonth.get(i).getText();
			
			System.out.println(M);
			
			if(M.equals("Jul")) {
				listmonth.get(i).click();
			}

		}
		Thread.sleep(2000);

		driver.quit();

		}
		
		
		
		
		

	}


