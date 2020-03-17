package pom;

import org.openqa.selenium.By;

public class LoginPage {

	public void login(String email, String password) {
		
		BaseClass.getWebDriver().findElement(By.id("email")).sendKeys(email);
		BaseClass.getWebDriver().findElement(By.id("passwd")).sendKeys(password);
		BaseClass.getWebDriver().findElement(By.name("SubmitLogin")).click();
	}
	
	public String getErrorMessage() {
		
		return BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
	}
}
