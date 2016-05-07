package com.guru99.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	private By myAccountField = By.xpath("//*[@id='top']/body/div[1]/div/div[3]/div/div[4]/ul/li[1]/a");
	private By ordersAndReturnsField = By.xpath("//*[@id='top']/body/div/div/div[3]/div/div[4]/ul/li[2]/a");
	private By searchField = By.id("search");
	private By searchButtonField = By.xpath("//*[@id='search_mini_form']/div[1]/button");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	public MyAccountPage goToMyAccount() {
		driver.findElement(myAccountField).click();
		return new MyAccountPage(driver);
	}


	public OrdersAndReturnsPage goToOrderAndReturn() {
		driver.findElement(ordersAndReturnsField).click();	
		return new OrdersAndReturnsPage(driver);
	}


	public SearchResultPage searchItemPage(String itemToBeSearched) {
		driver.findElement(searchField).sendKeys(itemToBeSearched);
	    driver.findElement(searchButtonField).click();
	    return new SearchResultPage(driver);
	}
	
	
	
	

}
