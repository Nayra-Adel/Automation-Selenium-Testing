package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pom.Util;

public class BaseClass {

	private static WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		getWebDriver().get(Util.BASE_URL);
	}

	public static WebDriver getWebDriver() {

		return driver;
	}

	@AfterTest
	public void tearDown() {

		driver.close();
	}
}
