package pom.account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.BaseClass;

public class CreateAccountPage {

	@FindBy(id = "firstname")
	WebElement firstname;

	@FindBy(id = "lastname")
	WebElement lastname;

	@FindBy(id = "email_address")
	WebElement email_address;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "confirmation")
	WebElement confirmation;

	@FindBy(xpath = "//button[@title='Register']")
	WebElement btnRegister;

	public CreateAccountPage() {

		PageFactory.initElements(BaseClass.getWebDriver(), this);
	}

	public void setFirstName(String firstname) {
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
	}

	public void setLastname(String lastname) {
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
	}

	public void setEmailAddress(String email_address) {
		this.email_address.clear();
		this.email_address.sendKeys(email_address);
	}

	public void setPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	public void setConfirmation(String confirmation) {
		this.confirmation.clear();
		this.confirmation.sendKeys(confirmation);
	}

	public void clickRegister() {
		btnRegister.click();
	}

	public void register(String firstname, String lastname, String email_address, String password,
			String confirmation) {
		this.setFirstName(firstname);
		this.setLastname(lastname);
		this.setEmailAddress(email_address);
		this.setPassword(password);
		this.setConfirmation(confirmation);
		this.clickRegister();
	}
}