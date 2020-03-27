package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(css = "div.page-title>h2")
	WebElement titlePage;

	@FindBy(linkText = "MOBILE")
	WebElement btnMobileMenu;

	@FindBy(linkText = "TV")
	WebElement btnTvMenu;

	@FindBy(linkText = "MY ACCOUNT")
	WebElement btnMyAccount;

	public HomePage() {

		PageFactory.initElements(BaseClass.getWebDriver(), this);
	}

	public String getTitle() {

		return titlePage.getText();
	}

	public void clickMobileMenu() {

		btnMobileMenu.click();
	}

	public void clickTvMenu() {

		btnTvMenu.click();
	}

	public void clickMyAccount() {

		btnMyAccount.click();
	}
}
