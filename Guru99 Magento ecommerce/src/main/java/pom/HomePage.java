package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(css = "div.page-title>h2")
	WebElement titlePage;

	public HomePage() {

		PageFactory.initElements(BaseClass.getWebDriver(), this);
	}

	public String getTitle() {

		return titlePage.getText();
	}
}
