package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TVPage {

	@FindBy(xpath = "//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")
	WebElement addToWishListLGLCD;

	public TVPage() {

		PageFactory.initElements(BaseClass.getWebDriver(), this);
	}

	public void clickAddToWishListLGLCD() {

		addToWishListLGLCD.click();
	}
}
