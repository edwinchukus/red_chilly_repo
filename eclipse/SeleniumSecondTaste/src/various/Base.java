package various;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public WebDriver setupBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\TrainCentre\\TutorialCodes\\JavaCodes\\BatchA2016\\eclipse\\SeleniumSecondTaste\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();	
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
