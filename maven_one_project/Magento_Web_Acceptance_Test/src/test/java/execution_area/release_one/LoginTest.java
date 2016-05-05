package execution_area.release_one;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.guru99.live.pages.BasePage;
import com.guru99.live.pages.HomePage;
import com.guru99.live.pages.MyAccountPage;
import com.guru99.live.pages.MyDashboardPage;



public class LoginTest {

	private BasePage basePage;
	private HomePage homePage;

	
	@Before // Pre-Condition 
	public void setUp() { 
		WebDriver driver = new ChromeDriver();
		this.basePage = new BasePage(driver);
		homePage = basePage.setupTest();
	}
	
	
	
	@Test
	public void magentoLoginTest() {
		homePage
		.goToMyAccount()
		.loginWith("234dotus@gmail.com", "password123")
		.validateLogin("Hello, Donald Jonathan!");	
	}
	
	
	
	
	@Test 
	public void magentoSearchTVTest() { 
		System.out.println("Search for LG LCD TV");
		System.out.println("Validate that LG LCD TV exist");
	}
	
	
	
	
	@After // Post Condition 
	public void tearDown() {
		basePage.cleanUpTest();
	}
	
}
