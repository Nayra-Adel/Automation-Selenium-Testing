package pom.account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.BaseClass;

public class LoginPage {

	@FindBy(linkText = "CREATE AN ACCOUNT")
	WebElement btnCreateAccount;

	public LoginPage() {

		PageFactory.initElements(BaseClass.getWebDriver(), this);
	}

	public void clickCreateAccount() {

		btnCreateAccount.click();
	}

}
