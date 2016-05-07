package firstPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.BasePage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.MyDashboardPage;

public class FirstMagentoTest {

	private BasePage basePage;
	private HomePage homePage;
	private MyAccountPage myAccountPage;
	private MyDashboardPage myDashboardPage;
	
	@Before 
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\TrainCentre\\traincentre_gitlab_repo\\TrainSoftDump\\BatchA2016\\chromedriver_win32\\chromedriver.exe");
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
	
	
	
	@After
	public void tearDown() {
		basePage.cleanUpTest();
	}
	
}
