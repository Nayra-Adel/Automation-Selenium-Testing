package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class LoginPage {

	public void login(String userId, String password) {
		
		BaseClass.getWebDriver().findElement(By.name("uid")).clear(); 
		BaseClass.getWebDriver().findElement(By.name("uid")).sendKeys(userId);
		
		BaseClass.getWebDriver().findElement(By.name("password")).clear();
		BaseClass.getWebDriver().findElement(By.name("password")).sendKeys(password);
		
		BaseClass.getWebDriver().findElement(By.name("btnLogin")).click();
	}
	
	public String getAlertMessageInvalidLogin(){
		
		Alert alert = BaseClass.getWebDriver().switchTo().alert();
		String error = alert.getText();
		alert.accept();
		return error;
	}
}
