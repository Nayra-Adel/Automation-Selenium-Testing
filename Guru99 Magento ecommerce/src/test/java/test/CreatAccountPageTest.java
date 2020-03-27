package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.HomePage;
import pom.TVPage;
import pom.Util;
import pom.WishListPage;
import pom.account.CreateAccountPage;
import pom.account.DashboardPage;
import pom.account.LoginPage;

public class CreatAccountPageTest extends BaseClass {

	HomePage objHomePage;
	LoginPage objLoginPage;
	CreateAccountPage objCreateAccountPage;
	DashboardPage objDashboardPage;
	TVPage objTVPage;
	WishListPage objWishListPage;

	@BeforeMethod
	public void init() {

		objHomePage = new HomePage();
		objLoginPage = new LoginPage();
		objCreateAccountPage = new CreateAccountPage();
		objDashboardPage = new DashboardPage();
		objTVPage = new TVPage();
		objWishListPage = new WishListPage();
	}

	@Test
	public void VerifyCreateAccountAndShareWishList() {

		objHomePage.clickMyAccount();
		objLoginPage.clickCreateAccount();
		objCreateAccountPage.register(Util.FIRST_NAME, Util.LAST_NAME, Util.EMAIL_ADDRESS, Util.PASSWORD,
				Util.PASSWORD_CONFIRMATION);

		// Verify Registration is done. Expected account registration done.
		assertEquals(objDashboardPage.getWelcomeUserName().toLowerCase(),
				"welcome, " + Util.FIRST_NAME.toLowerCase() + " " + Util.LAST_NAME.toLowerCase() + "!");

		objHomePage.clickTvMenu();
		objTVPage.clickAddToWishListLGLCD();
		objWishListPage.clickBtnShareWishlist();
		objWishListPage.shareWishList(Util.WISHLIST_EMAIL, Util.WISHLIST_MESSAGE);

		// Check wishlist is shared. Expected wishlist shared successfully.
		assertEquals(objWishListPage.getWishlistSharedSuccessfullyMsg(), Util.WISHLIST_MESSAGE_SUCCESS);
	}
}
