package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageFactory.HomePage;
import PageFactory.LoginPage;
import pom.BaseClass;
import PageFactory.Util;

public class LoginPageTestWithPageFactory extends BaseClass {

	LoginPage objLogin;
	HomePage objHomePage;

	@DataProvider(name = "TestLoginInvalidData")
	public static Object[][] addInvalidDataProvider() {

		return new Object[][] { { Util.VALID_USER_ID, Util.INVALID }, { Util.INVALID, Util.VALID_PASSWORD },
				{ Util.INVALID, Util.INVALID }, { Util.EMPTY, Util.EMPTY } };
	}

	@Test(dataProvider = "TestLoginInvalidData", priority = 0)
	public void testLoginWithInvalidData(String userId, String password) {

		objLogin = new LoginPage();
		objLogin.login(userId, password);
		assertEquals(objLogin.getAlertMessageInvalidLogin(), Util.EXPECT_ERROR_INVALID_LOGIN);
	}

	@Test(priority = 1)
	public void testLoginWithValidData() {

		objLogin = new LoginPage();
		objLogin.login(Util.VALID_USER_ID, Util.VALID_PASSWORD);
		objHomePage = new HomePage();
		assertEquals(Util.getTitle(), Util.EXPECT_TITLE_HOME_PAGE);
	}

	@Test(priority = 2)
	public void testIdPatternAfterLogin() {

		objHomePage = new HomePage();
		String dynamicId = objHomePage.getIdPattern();
		// Check that the dynamic id is of pattern mngrXXXX
		// First 4 characters must be "mngr"
		assertTrue(dynamicId.substring(1, 5).equals(Util.FIRST_PATTERN));
		// remain stores the "XXXX" in pattern mngrXXXX
		String remain = dynamicId.substring(dynamicId.length() - 4);
		// Check remain string must be numbers;
		assertTrue(remain.matches(Util.SECOND_PATTERN));

		Util.takeScreenshot("homepage");
	}

	// Verify the home page using Dashboard message
	@Test(priority = 3)
	public void testHomePageAppearCorrect() {

		// Verify home page
		assertTrue(objHomePage.getHomePageDashboardUserId().toLowerCase().contains("manger id : " + Util.VALID_USER_ID));
	}
}