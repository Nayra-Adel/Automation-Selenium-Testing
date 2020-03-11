package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {

	public void chooseSubjectHeading() {
		
		new Select(BaseClass.getWebDriver().findElement(By.id("id_contact"))).selectByVisibleText("Webmaster");
	}

	public void fillEmailAddress() {
		
		BaseClass.getWebDriver().findElement(By.id("email")).sendKeys("test@gmail.com");
	}
	
	public void filOrderReference() {
		
		BaseClass.getWebDriver().findElement(By.id("id_order")).sendKeys("123");
	}
	
	public void filMessage() {
		
		BaseClass.getWebDriver().findElement(By.id("message")).sendKeys("Test Message");
	}
	
	public void submitForm() {
		
		BaseClass.getWebDriver().findElement(By.id("submitMessage")).click();
	}
	
	public String getMessage() {
		
		return BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
	}
}
