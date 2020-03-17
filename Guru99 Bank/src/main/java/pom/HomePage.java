package pom;

import org.openqa.selenium.By;

public class HomePage {

	public String getIdPattern() {
		
		String id = BaseClass.getWebDriver().findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();

		// Extract the dynamic text mngrXXXX on page		
		return id.split(Util.PATTERN)[1];
	}
}
