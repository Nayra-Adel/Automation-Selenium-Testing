package test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.HomePage;
import pom.LoginPage;

public class LoginPageTest {
		
	@BeforeTest
	public void setup() {
	
		BaseClass bc = new BaseClass();
		bc.setup();
	}
	
	@Test (priority = 1)
	public void testLoginMissingPassword() {
		
		HomePage hp = new HomePage();
		hp.clickOnSignIn();
		
		
		LoginPage lp = new LoginPage();
		lp.login("test@gmail.com", "");
		
		assertEquals(lp.getErrorMessage(), "Password is required.");
	}
	
	@Test (priority = 2)
	public void testLoginWithIncorrectPassword() {
				
		HomePage hp = new HomePage();
		hp.clickOnSignIn();
		
		LoginPage lp = new LoginPage();
		lp.login("test@gmail.com", "123456789");

		assertEquals(lp.getErrorMessage(), "Authentication failed.");
	}
	
	@AfterTest
	public void tearDown() {
		BaseClass.getWebDriver().close();
	}
}
