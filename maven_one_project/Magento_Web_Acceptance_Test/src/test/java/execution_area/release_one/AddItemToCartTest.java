package execution_area.release_one;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.guru99.live.pages.BasePage;
import com.guru99.live.pages.HomePage;



public class AddItemToCartTest {
	
	/*
	Requirement
	===========
	Do a test to add an item to a shopping cartlog => User must be authenticated, User have have searched to the item which means that the actual test is to simply add an item to the shopping cart. 

	Analysis
	========
	Precondition: 
	-------------
	1. User must be logged on to the Software 
	2. User must have searched for the item

	Test:
	-----
	Simply add an item to the shopping cart
	Verify that the item is actually added to the shopping cart 

	Post Condition
	--------------
	Close the browser
	*/
	
	private BasePage basePage;
	private HomePage homePage;


	
	@Before // Pre-Condition 
	public void setUp() { 
		WebDriver driver = new FirefoxDriver();
		this.basePage = new BasePage(driver);
		homePage = basePage.setupTest();
		
	}
	
	@Test
	public void addItemToCartTest(){
		String username = "234dotus@gmail.com";
		String password = "password123";
		String itemToBeSearched = "LG LCD";
		String confirmMessage = "LG LCD was added to your shopping cart.";
		
		
		this.homePage.goToMyAccount().loginWith(username, password);
		boolean ans = this.homePage.searchItemPage(itemToBeSearched).addItemToCart(itemToBeSearched).validateItemCartlog(confirmMessage);
		Assert.assertFalse("Does not contain "+confirmMessage, !ans);
	}
	
	@After // Post Condition 
	public void tearDown() {
		basePage.cleanUpTest();
	}

}
