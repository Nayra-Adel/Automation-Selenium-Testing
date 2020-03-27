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
