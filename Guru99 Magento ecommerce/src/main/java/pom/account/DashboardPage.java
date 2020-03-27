package pom.account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.BaseClass;

public class DashboardPage {

	@FindBy(xpath = "//*[@id=\"top\"]/body/div[1]/div/div[1]/div/p")
	WebElement welcomeUserName;

	public DashboardPage() {

		PageFactory.initElements(BaseClass.getWebDriver(), this);
	}

	public String getWelcomeUserName() {

		return welcomeUserName.getText();
	}
}
