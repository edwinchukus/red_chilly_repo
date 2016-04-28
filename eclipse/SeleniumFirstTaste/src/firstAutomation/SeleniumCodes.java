package firstAutomation;

import org.openqa.selenium.WebDriver;

public class SeleniumCodes {
	
	private WebDriver edwin;


	public SeleniumCodes(WebDriver edwin) {
		this.edwin = edwin;
	}	
		
	
	public void openWindow() {
		edwin.manage().window().maximize();
	}
	
	
	public void enterURL() {
		edwin.navigate().to("https://www.facebook.com/");
	}
	
	
	public void closeWindow() {
		edwin.close();
	}

}
