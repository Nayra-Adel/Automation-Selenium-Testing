package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchClass {

	public void search(String searchKeyWord) {
		
		BaseClass.getWebDriver().findElement(By.id("search_query_top")).sendKeys(searchKeyWord);
		BaseClass.getWebDriver().findElement(By.name("submit_search")).click();
	}
	
	public List<WebElement> getInStockButtons() {
		
		List<WebElement> itemsList = BaseClass.getWebDriver().findElements(By.xpath("//*[@class = 'available-now']"));
		return itemsList;
	}
}
