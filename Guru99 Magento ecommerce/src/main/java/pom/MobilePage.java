package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MobilePage {

	@FindBy(css = "select[title=\"Sort By\"]")
	WebElement sortBy;

	@FindBy(id = "product-price-1")
	WebElement product_price_1;

	@FindBy(linkText = "SONY XPERIA")
	WebElement sony_product;

	@FindBy(linkText = "IPHONE")
	WebElement iPhone_product;

	@FindBy(xpath = "//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button")
	WebElement addToCartSony;

	@FindBy(xpath = "//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")
	WebElement addToCompareIphone;

	@FindBy(xpath = "//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a")
	WebElement addToCompareSony;

	@FindBy(xpath = "//button[@title='Compare']")
	WebElement btnCompare;

	@FindBy(xpath = ".//*[@id='top']/body/div[1]/div[1]/h1")
	WebElement actualCompareProductHeaer;

	@FindBy(xpath = "//button[@title='Close Window']")
	WebElement btnClosePopupWindow;

	public MobilePage() {

		PageFactory.initElements(BaseClass.getWebDriver(), this);
	}

	public void sortMenuBySpecificElement(String element) {

		new Select(sortBy).selectByVisibleText(element);
	}

	// check Sony price in list and details pages
	public boolean checkListAndDetailsPriceProduct() {

		String price_list_page = product_price_1.getText();
		sony_product.click();
		String price_Details_page = product_price_1.getText();
		return price_list_page.equals(price_Details_page);
	}

	public void clickAddToCartSony() {

		addToCartSony.click();
	}

	public void clickCompare() {

		btnCompare.click();
	}

	public String getIphoneText() {

		return iPhone_product.getText();
	}

	public void clickAddToCompareIphone() {

		addToCompareIphone.click();
	}

	public String getSonyText() {

		return sony_product.getText();
	}

	public void clickAddToCompareSony() {

		addToCompareSony.click();
	}

	public String getActualCompareProductHeader() {

		return actualCompareProductHeaer.getText();
	}

	public void closePopUpWindow() {

		btnClosePopupWindow.click();
	}
}
