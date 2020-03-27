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

		objHomePage = new HomePage();
		objMobilePage = new MobilePage();
	}

	@Test(priority = 0)
	public void verifyAllProductsSortedByName() {

		assertEquals(objHomePage.getTitle(), Util.EXPECT_TITLE_HOME_PAGE); // Verify Home Page
		objMobilePage.clickMobileMenu();
		objMobilePage.sortMenuBySpecificElement(Util.SORT_BY_NAME);
		// Verify items in Mobile List Page can be sorted by Name
		Util.takeScreenshot("Mobile Products are sorted by " + Util.SORT_BY_NAME);
	}

	@Test(priority = 1)
	public void verifyCostOfProductInListAndDetalisEqual() {

		objMobilePage.clickMobileMenu();
		assertEquals(objMobilePage.checkListAndDetailsPriceProduct(), Util.TRUE);
	}

	@Test(priority = 2)
	public void verifyCompareTwoProducts() {

		objMobilePage.clickMobileMenu();

		objMobilePage.clickAddToCompareIphone();
		String mainIphoneMobile = objMobilePage.getIphoneText();
		objMobilePage.clickAddToCompareSony();
		String mainSonyMobile = objMobilePage.getSonyText();

		objMobilePage.clickCompare();
		switchToNewWindow();

		assertEquals(Util.COMPARE_PRODUCTS_HEADER, objMobilePage.getActualCompareProductHeader());
		assertEquals(mainIphoneMobile, objMobilePage.getIphoneText());
		assertEquals(mainSonyMobile, objMobilePage.getSonyText());

		objMobilePage.closePopUpWindow();
		switchToNewWindow();
	}
}
