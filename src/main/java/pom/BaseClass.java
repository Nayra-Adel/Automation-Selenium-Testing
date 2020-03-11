package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	static WebDriver driver;
	
	@BeforeTest
	public void setup() {
	
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
	}
	
	public static WebDriver getWebDriver() {
		
		return driver;
	}
	
	@AfterTest
	public void tearDown() {
		BaseClass.getWebDriver().quit();
	}
}
