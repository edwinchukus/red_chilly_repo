package facebookWebTest;



import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import various.Base;
import various.Home;
import various.Landing;

public class FacebookLoginTest {
	

	
	private WebDriver driver;
	private Landing landing;

	@Before
	public void preCondition() {
		Base base = new Base();
		 this.driver = base.setupBrowser();	
		System.out.println("I have been executed before each test method");
		this.landing = new Landing(driver);
	}
	
	@After
	public void postCondition() {		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		landing.tearDown();
		System.out.println("I have been executed after each test method");
	}
	
	@Test
	public void testWithValidDateOfBirth() {
		System.out.println("Test EXECUTED");
		Home home = new Home(driver);		
		home.maximizeBrowser();
		home.loadFacebookApplication("https://www.facebook.com");
		home.enterBirthday(9, "8", "1983");		
	}
	
	@Test
	public void testWithDateOfBirthFromThisYear() {
		System.out.println("Test EXECUTED");
		Home home = new Home(driver);		
		home.maximizeBrowser();
		home.loadFacebookApplication("https://www.facebook.com");
		home.enterBirthday(20, "5", "2016");		
	}
	
	@Test(timeout = 10000) 
	public void testWithDateOfBirthFromLastYear() {	
		System.out.println("Test EXECUTED");
		Home home = new Home(driver);		
		home.maximizeBrowser();
		home.loadFacebookApplication("https://www.facebook.com");
		home.enterBirthday(9, "8", "2015"); 	
	}
	
	
	@Test
	public void testWith2013() {
		System.out.println("Test EXECUTED");
		Home home = new Home(driver);		
		home.maximizeBrowser();
		home.loadFacebookApplication("https://www.facebook.com");
		home.enterBirthday(9, "8", "2013"); 	
	}
	
	@Test
	public void testWith2014() {	
		System.out.println("Test EXECUTED");
		Home home = new Home(driver);		
		home.maximizeBrowser();
		home.loadFacebookApplication("https://www.facebook.com");
		home.enterBirthday(9, "8", "2014"); 		
	}
	
	@Test
	public void loginTest() {
		System.out.println("Test EXECUTED");
		Home home = new Home(driver);
		home.maximizeBrowser();
		home.loadFacebookApplication("https://www.facebook.com");
		home.logonToFacebook("234dotus@gmail.com", "manual123");
		this.landing.validateLogin();
	}
}
