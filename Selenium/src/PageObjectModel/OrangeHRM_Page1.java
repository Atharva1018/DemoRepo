package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Page1 {

	// data members should be declared globally and private by using @findby annotations
	
	@FindBy(xpath = "//input[@name=\"username\"]") private WebElement Username;		// alternate method to find xpath
	
		//@FindBy is an interface
	
	@FindBy(xpath = "//input[@name=\"password\"]") public WebElement Password;		// public will also work and if we dont give any access modifier it will also work
	
	@FindBy(xpath = "//button[@type=\"submit\"]") public WebElement Login;

	
	// Initialize within a constructor with access level public using pagefactory
	
	public OrangeHRM_Page1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	// Utilize within a method with access level public
	
	public void Username() {
		Username.sendKeys("Admin");
	}
	
	public void Pass() {
		Password.sendKeys("admin123");
	}
	
	public void Login() {
		Login.click();
	}
}
