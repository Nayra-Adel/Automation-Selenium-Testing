package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

	public void clickOnSignIn() {

		BaseClass.getWebDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	}
	
	public void clickOnContactUs() {

		BaseClass.getWebDriver().findElement(By.id("contact-link")).click();
	}
	
	public int getHomePageItemsCount() {
		
		List<WebElement> itemsList = BaseClass.getWebDriver().findElements(By.xpath("//*[@class = 'product-container']"));
		return itemsList.size();
	}
}
