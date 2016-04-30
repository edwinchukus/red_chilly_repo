package execution_area;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.guru99.live.pages.BasePage;
import com.guru99.live.pages.HomePage;
import com.guru99.live.pages.MyAccountPage;
import com.guru99.live.pages.MyDashboardPage;



public class FirstMagentoTest {

	private BasePage basePage;
	private HomePage homePage;
	private MyAccountPage myAccountPage;
	private MyDashboardPage myDashboardPage;
	
	@Before 
	public void setUp() { 
//		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		this.basePage = new BasePage(driver);
		this.homePage = new HomePage(driver);
		this.myAccountPage = new MyAccountPage(driver);
		this.myDashboardPage = new MyDashboardPage(driver);
		basePage.setupTest();
	}
	
	@Test
	public void magentoLoginTest() {
		homePage.goToMyAccount();
		myAccountPage.loginWith("234dotus@gmail.com", "password123");
		myDashboardPage.validateLogin("Hello, Donald Jonathan!");		
	}
	
	
	@Test 
	public void magentoSearchTVTest() { 
		System.out.println("Search for LG LCD TV");
		System.out.println("Validate that LG LCD TV exist");
	}
	
	@After
	public void tearDown() {
		basePage.cleanUpTest();
	}
	
}
