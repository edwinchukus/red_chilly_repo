package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MyDashboardPage extends BasePage{

	public MyDashboardPage(WebDriver driver) {
		super(driver);
	}

	public void validateLogin(String name) {
		boolean ans = driver.getPageSource().contains(name);
		Assert.assertTrue("Does not contain "+name, ans);		
	}

}
