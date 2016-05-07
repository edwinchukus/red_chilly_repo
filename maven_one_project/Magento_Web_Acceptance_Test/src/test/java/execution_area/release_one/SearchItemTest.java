package execution_area.release_one;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.guru99.live.pages.BasePage;
import com.guru99.live.pages.HomePage;

public class SearchItemTest {
	
	private BasePage basePage;
	private HomePage homePage;


	
	@Before // Pre-Condition 
	public void setUp() { 
		WebDriver driver = new FirefoxDriver();
		this.basePage = new BasePage(driver);
		homePage = basePage.setupTest();
	}
	
	
	@Test 
	public void magentoSearchTVTest() { 
		String itemToBeSearched = "LCD TV";		
//		String itemAmount = "$615.00";
		
		boolean processedResult = homePage.searchItemPage(itemToBeSearched).validateSearchedItem(itemToBeSearched);
		Assert.assertTrue("Does not contain "+itemToBeSearched, processedResult);	
	}
	
	@After // Post Condition 
	public void tearDown() {
		basePage.cleanUpTest();
	}

}
