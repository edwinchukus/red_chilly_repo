package com.guru99.live.pages;

import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	public boolean validateItemCartlog(String confirmMessage) {
		boolean ans = driver.getPageSource().contains(confirmMessage);
		return ans;
	}

}
