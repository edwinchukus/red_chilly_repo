package com.guru99.live.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage {
	
	private By addLgLcdTv = By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/ul/li[1]/div/div[2]/button");
	private By addSamsungLcdTv = By.xpath("//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/div/div[2]/button");
	
	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	
	public boolean validateSearchedItem(String name) {
		boolean ans = driver.getPageSource().contains(name);
		return ans;
	}


	public ShoppingCartPage addItemToCart(String itemToBeSearched) {
		if(itemToBeSearched.toLowerCase().contains("lg")){
			driver.findElement(addLgLcdTv).click();	
		}else if(itemToBeSearched.toLowerCase().contains("samsung")){
			driver.findElement(addSamsungLcdTv).click();	
		}
		return new ShoppingCartPage(driver);
	}
}
