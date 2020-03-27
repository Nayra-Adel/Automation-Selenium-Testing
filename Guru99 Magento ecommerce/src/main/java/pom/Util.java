package pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pom.BaseClass;

public class Util {

	public static final String BASE_URL = "http://live.demoguru99.com/";
	public static final int WAIT_TIME = 30; // Delay time to wait the web site

	public static final String EXPECT_TITLE_HOME_PAGE = "THIS IS DEMO SITE FOR   ";
	public static final String SORT_BY_NAME = "Name";
	public static final boolean TRUE = true;
	public static final String ERROR_MAX_ALLOWED_QUANTITY = "* The maximum quantity allowed for purchase is 500.";
	public static final String SHOPPING_CART_EMPTY = "SHOPPING CART IS EMPTY";
	public static final String COMPARE_PRODUCTS_HEADER = "COMPARE PRODUCTS";

	// New Account
	public static final String FIRST_NAME = "Nayra";
	public static final String LAST_NAME = "Adel";
	public static final String EMAIL_ADDRESS = "nayra_@gmail.com";
	public static final String PASSWORD = "password2password";
	public static final String PASSWORD_CONFIRMATION = "password2password";

	// Wishlist Message
	public static final String WISHLIST_EMAIL = "support@guru99.com";
	public static final String WISHLIST_MESSAGE = "Hey Mary!! this LCD TV looks ok, check it out !!";
	public static final String WISHLIST_MESSAGE_SUCCESS = "Your Wishlist has been shared.";

	public static void takeScreenshot(String fileName) {

		File scrFile = ((TakesScreenshot) BaseClass.getWebDriver()).getScreenshotAs(OutputType.FILE);

		// Code to save screenshot at desired location
		try {
			FileUtils.copyFile(scrFile, new File(fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
