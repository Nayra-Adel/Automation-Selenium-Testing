package pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Util {

	public static final String BASE_URL = "http://www.demo.guru99.com/";

	// Valid account for login
	public static final String VALID_USER_NAME = "mngr250802";
	public static final String VALID_PASSWORD = "rEqUhep";
	
	public static final String EXPECT_TITLE_HOME_PAGE = "Guru99 Bank Manager HomePage";
    public static final String EXPECT_ERROR_INVALID_LOGIN = "User or Password is not valid";

	public static final String VALID = "valid";
	public static final String INVALID = "invalid";
	public static final String EMPTY = "";
	
	public static final int WAIT_TIME = 30; // Delay time to wait the website

    public static final String PATTERN = ":";
    public static final String FIRST_PATTERN = "mngr";
    public static final String SECOND_PATTERN = "[0-9]+";
	
	public static void takeScreenshot(String fileName) {
		
		File scrFile = ((TakesScreenshot)BaseClass.getWebDriver()).getScreenshotAs(OutputType.FILE);
		// Code to save screenshot at desired location
		try {
			FileUtils.copyFile(scrFile, new File(fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getTitle(){
		
		return BaseClass.getWebDriver().getTitle();
	}
}
