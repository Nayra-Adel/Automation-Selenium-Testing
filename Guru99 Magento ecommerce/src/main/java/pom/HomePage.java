package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div[1]/div/div/h2")
	WebElement titlePage;

	public HomePage() {

		PageFactory.initElements(BaseClass.getWebDriver(), this);
	}

	public String getTitle() {

		return titlePage.getText();
	}
}
