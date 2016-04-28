package firstAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	
	private static WebDriver browser;
	
	
	public static void main(String[] args) {
		
		browser = new FirefoxDriver();
		
		SeleniumCodes myFirstCode = new SeleniumCodes(browser);
		
		myFirstCode.openWindow();
		myFirstCode.enterURL();
		myFirstCode.closeWindow();

	}

}
