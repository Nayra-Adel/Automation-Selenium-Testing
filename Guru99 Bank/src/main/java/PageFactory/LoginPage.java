package PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.BaseClass;

public class LoginPage {

	WebDriver driver;
	@FindBy(name = "uid")
	WebElement userId;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(className = "barone")
	WebElement titleText;

	@FindBy(name = "btnLogin")
	WebElement login;

	public LoginPage() {
		this.driver = BaseClass.getWebDriver();
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	// Set user name in text box
	public void setUserId(String userId) {
		this.userId.sendKeys(userId);

	}

	// Set password in password text box
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void clickLogin() {
		login.click();
	}

	// Get the title of Login Page
	public String getLoginTitle() {
		return titleText.getText();
	}

	public void login(String userId, String password) {
		this.setUserId(userId);
		this.setPassword(password);
		this.clickLogin();
	}

	public String getAlertMessageInvalidLogin() {
		Alert alert = BaseClass.getWebDriver().switchTo().alert();
		String error = alert.getText();
		alert.accept();
		return error;
	}
}
