package com.guru99.live.pages;


import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage {

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	
	public boolean validateSearchedItem(String name) {
		boolean ans = driver.getPageSource().contains(name);
		return ans;
	}
}
