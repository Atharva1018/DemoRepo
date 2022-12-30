package POM_WithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_1 {

	@FindBy(xpath = "//input[@name=\"username\"]") private WebElement username;
	
	@FindBy(xpath = "//input[@name=\"password\"]") public WebElement password;

	@FindBy(xpath = "//button[@type=\"submit\"]") private WebElement Login;

	
	// initialize constructor using PageFactory
	
	public OrangeHRM_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ID(String UserID) {
		username.sendKeys(UserID);
	}
	
	public void pass(String pswd) {
		password.sendKeys(pswd);
	}
	
	public void login() {
		Login.click();
	}
}
