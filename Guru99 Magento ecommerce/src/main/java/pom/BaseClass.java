package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pom.Util;

public class BaseClass {

	private static WebDriver driver;

	@BeforeClass
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		getWebDriver().get(Util.BASE_URL);
	}

	public static WebDriver getWebDriver() {

		return driver;
	}

	public void switchToNewWindow() {

		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
	}

	@AfterClass
	public void tearDown() {

		driver.close();
	}
}
