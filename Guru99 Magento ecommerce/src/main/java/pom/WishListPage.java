package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {

	@FindBy(xpath = "//button[@title='Share Wishlist']")
	WebElement btnShareWishlist;

	@FindBy(id = "email_address")
	WebElement email_address;

	@FindBy(id = "message")
	WebElement message;

	@FindBy(xpath = "//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span")
	WebElement wishlistSharedSuccessfullyMsg;

	public WishListPage() {

		PageFactory.initElements(BaseClass.getWebDriver(), this);
	}

	public void clickBtnShareWishlist() {

		btnShareWishlist.click();
	}

	public void setEmailAddress(String email_address) {

		this.email_address.clear();
		this.email_address.sendKeys(email_address);
	}

	public void setMessage(String message) {

		this.message.clear();
		this.message.sendKeys(message);
	}

	public void shareWishList(String email_address, String message) {

		this.setEmailAddress(email_address);
		this.setMessage(message);
		this.clickBtnShareWishlist();
	}

	public String getWishlistSharedSuccessfullyMsg() {

		return wishlistSharedSuccessfullyMsg.getText();
	}
}
