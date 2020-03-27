package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.HomePage;
import pom.MobilePage;
import pom.ShoppingCartPage;
import pom.Util;

public class ShoppingCartPageTest extends BaseClass {

	MobilePage objMobilePage;
	HomePage objHomePage;
	ShoppingCartPage objShoppingCartPage;

	@BeforeMethod
	public void init() {

		objHomePage = new HomePage();
		objMobilePage = new MobilePage();
		objHomePage.clickMobileMenu();
		objShoppingCartPage = new ShoppingCartPage();
	}

	@Test
	public void VerifyCantAddProductInCartThanAvailableInStore() {

		objMobilePage.clickAddToCartSony();
		objShoppingCartPage.updateQuantity("1000");
		objShoppingCartPage.clickUpdateBtn();
		assertEquals(objShoppingCartPage.getErrorRequestQty(), Util.ERROR_MAX_ALLOWED_QUANTITY);
		objShoppingCartPage.clickEmptyCart();
		assertEquals(objShoppingCartPage.getPageTitleCart(), Util.SHOPPING_CART_EMPTY);
	}
}
