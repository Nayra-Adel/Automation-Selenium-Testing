package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	@FindBy(xpath = ".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")
	WebElement qty;

	@FindBy(xpath = ".//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button")
	WebElement btnUpdateQty;

	@FindBy(xpath = ".//*[@id='shopping-cart-table']/tbody/tr/td[2]/p")
	WebElement reqQty;

	@FindBy(id = "empty_cart_button")
	WebElement btnEmptyCart;

	@FindBy(className = "page-title")
	WebElement pageTitleCart;

	public ShoppingCartPage() {

		PageFactory.initElements(BaseClass.getWebDriver(), this);
	}

	public void updateQuantity(String quantaty) {

		qty.clear();
		qty.sendKeys(quantaty);
	}

	public void clickUpdateBtn() {

		btnUpdateQty.click();
	}

	public String getErrorRequestQty() {

		return reqQty.getText();
	}

	public void clickEmptyCart() {

		btnEmptyCart.click();
	}

	public String getPageTitleCart() {

		return pageTitleCart.getText();
	}
}
