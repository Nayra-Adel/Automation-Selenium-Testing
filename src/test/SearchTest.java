package test;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.HomePage;
import pom.LoginPage;
import pom.SearchClass;

public class SearchTest {
	
	@BeforeTest
	public void setup() {
	
		BaseClass bc = new BaseClass();
		bc.setup();
	}
	
	@Test (priority = 1)
	public void testCheckItemsInStock() {
		
		SearchClass sc = new SearchClass();
		sc.search("dress");
		
		List<WebElement> itemsList = sc.getInStockButtons();
		for(WebElement item:itemsList) {

			assertEquals(item.getText(), "In stock");
		}
	}
	
	@AfterTest
	public void tearDown() {
		BaseClass.getWebDriver().close();
	}
}