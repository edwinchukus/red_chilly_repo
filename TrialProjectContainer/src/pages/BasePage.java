package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	
	protected WebDriver driver;


	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setupTest() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://live.guru99.com/");
	}

	public void cleanUpTest() {
		driver.quit();
	}
	
	

}
