package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.BaseClass;
import pom.Util;

public class HomePage {

	WebDriver driver;
	@FindBy(xpath = "//table//tr[@class='heading3']")
	WebElement homePageUserId;

	public HomePage() {
		this.driver = BaseClass.getWebDriver();
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	// Get the User id from Home Page
	public String getHomePageDashboardUserId() {
		return homePageUserId.getText();
	}

	public String getIdPattern() {
		String id = getHomePageDashboardUserId();
		// Extract the dynamic text mngrXXXX on page
		return id.split(Util.PATTERN)[1];
	}
}
