package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static WebDriver driver;
	
	public void setup() {
	
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
	}
	
	public static WebDriver getWebDriver() {
		
		return driver;
	}
}
