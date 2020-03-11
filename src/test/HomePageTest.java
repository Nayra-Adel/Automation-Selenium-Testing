package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.ContactUs;
import pom.HomePage;

public class HomePageTest {

	@BeforeTest
	public void setup() {
	
		BaseClass bc = new BaseClass();
		bc.setup();
	}
	
	@Test (priority = 1)
	public void checkHomePageItemsCount() throws InterruptedException {
		
		HomePage hp = new HomePage();
				
		assertEquals(hp.getHomePageItemsCount(), 7);
	}
	
	@AfterTest
	public void tearDown() {
		BaseClass.getWebDriver().close();
	}
}
