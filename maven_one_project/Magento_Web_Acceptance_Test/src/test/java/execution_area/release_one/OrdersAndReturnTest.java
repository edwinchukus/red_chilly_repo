package execution_area.release_one;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.guru99.live.pages.BasePage;
import com.guru99.live.pages.HomePage;
import com.guru99.live.pages.MyAccountPage;
import com.guru99.live.pages.MyDashboardPage;
import com.guru99.live.pages.OrderInformationPage;
import com.guru99.live.pages.OrdersAndReturnsPage;

public class OrdersAndReturnTest {
	
	private BasePage basePage;
	private HomePage homePage;
	private OrdersAndReturnsPage ordersAndReturnsPage;
	private OrderInformationPage orderInformationPage;
	
	@Before // Pre Condition 
	public void setUp() { 
//		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		this.basePage = new BasePage(driver);
		this.homePage = new HomePage(driver);
		this.ordersAndReturnsPage = new OrdersAndReturnsPage(driver);
		this.orderInformationPage = new OrderInformationPage(driver);
		homePage = basePage.setupTest();
	}
	
	
	@Test
	public void searchForOrderAndReturnItem1() {
		String orderID = "100000976";
		String customerName = "Jonathan";
		String emailOrZip = "Email Address";
		String valueEmailOrZip = "234dotus@gmail.com";
		
		
		ordersAndReturnsPage = homePage.goToOrderAndReturn();
		ordersAndReturnsPage = ordersAndReturnsPage.populateOrderInformation(orderID, customerName,emailOrZip,valueEmailOrZip);
		orderInformationPage = ordersAndReturnsPage.searchForOrdersAndReturns();
		Assert.assertTrue("Does not contain Pending", orderInformationPage.validateStatus());	
	}
	
	@Test
	public void searchForOrderAndReturnItem2() {
		String orderID = "100000976";
		String customerName = "Jonathan";
		String emailOrZip = "ZIP Code";
		String valueEmailOrZip = "e13 0qe";
		
		
		homePage.goToOrderAndReturn();
		ordersAndReturnsPage.populateOrderInformation(orderID, customerName,emailOrZip,valueEmailOrZip);
		ordersAndReturnsPage.searchForOrdersAndReturns();
		Assert.assertTrue("Does not contain Pending", orderInformationPage.validateStatus());	
	}
	
	@Test
	public void searchForOrderAndReturnItem3() {
		String orderID = "100001402";
		String customerName = "Jonathan";
		String emailOrZip = "ZIP Code";
		String valueEmailOrZip = "e13 0qe";
		
		
		homePage.goToOrderAndReturn();
		ordersAndReturnsPage.populateOrderInformation(orderID, customerName,emailOrZip,valueEmailOrZip);
		ordersAndReturnsPage.searchForOrdersAndReturns();
		Assert.assertTrue("Does not contain Pending", orderInformationPage.validateStatus());	
	}
	
	@Test
	public void searchForOrderAndReturnItem4() {
		String orderID = "100001402";
		String customerName = "Jonathan";
		String emailOrZip = "ZIP Code";
		String valueEmailOrZip = "KT17 4NR";
		
		
		homePage.goToOrderAndReturn();
		ordersAndReturnsPage.populateOrderInformation(orderID, customerName,emailOrZip,valueEmailOrZip);
		ordersAndReturnsPage.searchForOrdersAndReturns();
//		Assert.assertTrue("Does not contain Pending", !orderInformationPage.validateStatus());
		Assert.assertSame(true, !orderInformationPage.validateStatus());
	}
	
	
	@After // Post Condition 
	public void tearDown() {
		basePage.cleanUpTest();
	}

}
