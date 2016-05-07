package execution_area.release_one;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.guru99.live.pages.BasePage;
import com.guru99.live.pages.HomePage;
import com.guru99.live.pages.MyAccountPage;
import com.guru99.live.pages.MyDashboardPage;



public class LoginTest {

	private BasePage basePage;
	private HomePage homePage;
	private MyDashboardPage myDashBoardPage;
	private MyAccountPage myAccountPage;

	
	@Before // Pre-Condition 
	public void setUp() { 
		WebDriver driver = new FirefoxDriver();
		this.basePage = new BasePage(driver);
		this.myAccountPage = new MyAccountPage(driver);
		this.myDashBoardPage = new MyDashboardPage(driver);
		homePage = basePage.setupTest();
	}
	
	
	
	@Test
	public void magentoLoginTest() {
		homePage
		.goToMyAccount()
		.loginWith("234dotus@gmail.com", "password123");
		
	}
	
	
	
	

	
	
	
	
//	@After // Post Condition 
//	public void tearDown() {
//		basePage.cleanUpTest();
	}
	
//}
