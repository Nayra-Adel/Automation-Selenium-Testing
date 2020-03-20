package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.HomePage;
import pom.MobilePage;
import pom.Util;

public class MobilePageTest extends BaseClass {

	MobilePage objMobilePage;
	HomePage objHomePage;

	@BeforeMethod
	public void init() {

		objMobilePage = new MobilePage();
		objMobilePage.clickMobileMenu();
	}

	@Test(priority = 0)
	public void verifyAllProductsSortedByName() {

		objMobilePage.sortMenuBySpecificElement(Util.SORT_BY_NAME);
		// Verify items in Mobile List Page can be sorted by Name
		Util.takeScreenshot("Mobile Products are sorted by " + Util.SORT_BY_NAME);
	}

	@Test(priority = 1)
	public void verifyCostOfProductInListAndDetalisEqual() {

		assertEquals(objMobilePage.checkListAndDetailsPriceProduct(), Util.TRUE);
	}
}
