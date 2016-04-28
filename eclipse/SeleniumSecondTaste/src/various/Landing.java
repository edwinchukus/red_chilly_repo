package various;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Landing {
	
	private WebDriver driver;

	public Landing(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validateLogin() {
		boolean ans = driver.getPageSource().toLowerCase().contains("roy fielding");
		Assert.assertTrue(ans, "This does not contain Roy Fielding");
	}
	
	
	public void tearDown() {
		driver.close();
	}

}
