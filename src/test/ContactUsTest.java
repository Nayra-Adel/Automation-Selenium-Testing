package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.ContactUs;
import pom.HomePage;
import pom.LoginPage;

public class ContactUsTest {

	@BeforeTest
	public void setup() {
	
		BaseClass bc = new BaseClass();
		bc.setup();
	}
	
	@Test (priority = 1)
	public void testLoginMissingPassword() throws InterruptedException {
		
		HomePage hp = new HomePage();
		hp.clickOnContactUs();
		
		ContactUs cu = new ContactUs();
		
		cu.chooseSubjectHeading();
		cu.fillEmailAddress();
		cu.filOrderReference();
		cu.filMessage();
		cu.submitForm();
				
		assertEquals(cu.getMessage(), "Your message has been successfully sent to our team.");
	}
	
	@AfterTest
	public void tearDown() {
		BaseClass.getWebDriver().close();
	}
}
