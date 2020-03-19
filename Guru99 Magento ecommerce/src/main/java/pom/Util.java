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
	public static final Boolean TRUE = true;

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