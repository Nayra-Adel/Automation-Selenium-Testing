package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.HomePage;
import pom.Util;

public class HomePageTest extends BaseClass {

	HomePage objHomePage;

	@BeforeTest
	public void init() {

		objHomePage = new HomePage();
	}

	@Test(priority = 0)
	public void verifyTitleHomePage() {

		assertEquals(objHomePage.getTitle(), Util.EXPECT_TITLE_HOME_PAGE);
	}
}
