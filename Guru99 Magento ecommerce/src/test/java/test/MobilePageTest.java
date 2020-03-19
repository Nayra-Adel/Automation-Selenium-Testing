package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pom.BaseClass;
import pom.HomePage;
import pom.MobilePage;
import pom.Util;

public class MobilePageTest extends BaseClass {

	MobilePage objMobilePage;
	HomePage objHomePage;

	@Test(priority = 0)
	public void verifyAllProductsSortedByName() {

		// Verify Home Page Title
		objHomePage = new HomePage();
		assertEquals(objHomePage.getTitle(), Util.EXPECT_TITLE_HOME_PAGE);
		// click on mobile menu then sort items by name
		objMobilePage = new MobilePage();
		objMobilePage.clickMobileMenu();
		objMobilePage.sortMenuBySpecificElement(Util.SORT_BY_NAME);
		// Verify items in Mobile List Page can be sorted by Name
		Util.takeScreenshot("Mobile Products are sorted by " + Util.SORT_BY_NAME);
	}

	@Test(priority = 1)
	public void verifyCostOfProductInListAndDetalisEqual() {

		// click on mobile menu then check cost in list and details
		objMobilePage = new MobilePage();
		objMobilePage.clickMobileMenu();
		assertEquals(objMobilePage.checkListAndDetailsPriceProduct(), Util.TRUE);
	}
}
