package facebookWebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;



public class FacebookUITest {

	public static void main(String[] args) {


//		ProfilesIni profile = new ProfilesIni();	 
//		FirefoxProfile webDriverProfile = profile.getProfile("WebDriver");		
//		WebDriver driver = new FirefoxDriver(webDriverProfile);
		
		System.setProperty("webdriver.chrome.driver", "C:\\TrainCentre\\TutorialCodes\\JavaCodes\\BatchA2016\\eclipse\\SeleniumSecondTaste\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		

		
		driver.close();
		
	}

}
