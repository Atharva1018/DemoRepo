package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Page2 {

	@FindBy (xpath = "//p[@class=\"oxd-userdropdown-name\"]") private WebElement name;

	@FindBy (xpath = "(//p[@class=\"oxd-text oxd-text--p\"])[1]") public WebElement Time;
	
	public OrangeHRM_Page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Name() {
		String text = name.getText();
		System.out.println(text);
		
		if(text.equals("lahari Collings")) {
			System.out.println("correct name");
		}
		
		else {
			System.out.println("incorrect username");
		}
	}
	
	public void time() {
		boolean t = Time.isDisplayed();
		System.out.println(t);
	}

}

