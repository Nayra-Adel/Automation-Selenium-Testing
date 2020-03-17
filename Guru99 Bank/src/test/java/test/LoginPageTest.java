package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.HomePage;
import pom.LoginPage;
import pom.Util;

public class LoginPageTest extends BaseClass{

	LoginPage LP = new LoginPage();
	HomePage  HP = new HomePage();
	
	@DataProvider(name = "TestLoginInvalidData")
    public static Object[][] addInvalidDataProvider() {

        return new Object[][] {
					        	{Util.VALID_USER_NAME, Util.INVALID}, 
					        	{Util.INVALID, Util.VALID_PASSWORD}, 
					        	{Util.INVALID, Util.INVALID}, 
					        	{Util.EMPTY, Util.EMPTY}
					          };
    }
	
    @Test(dataProvider = "TestLoginInvalidData", priority = 1) 
	public void testLoginWithInvalidData(String userId, String password) {
		
		LP.login(userId, password);		
		assertEquals(LP.getAlertMessageInvalidLogin(), Util.EXPECT_ERROR_INVALID_LOGIN);
	}

	@Test(priority = 2)
	public void testLoginWithValidData() {
		
		LP.login(Util.VALID_USER_NAME, Util.VALID_PASSWORD);
		assertEquals(Util.getTitle(), Util.EXPECT_TITLE_HOME_PAGE);
	}
	
	@Test(priority = 3)
	public void testIdPatternAfterLogin() {
		
		String dynamicId = HP.getIdPattern();
		// Check that the dynamic id is of pattern mngrXXXX
		// First 4 characters must be "mngr"
		assertTrue(dynamicId.substring(1, 5).equals(Util.FIRST_PATTERN));
		// remain stores the "XXXX" in pattern mngrXXXX
		String remain = dynamicId.substring(dynamicId.length() - 4);
		// Check remain string must be numbers;
		assertTrue(remain.matches(Util.SECOND_PATTERN));	
		
		Util.takeScreenshot("homepage");
	}
}