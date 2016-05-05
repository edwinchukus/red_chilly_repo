package com.guru99.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{

	private By emailAddressFieeld = By.id("email");
	private By passwordField = By.id("pass");
	private By submitLoginField = By.id("send2");
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public MyDashboardPage loginWith(String username, String password) {
		driver.findElement(emailAddressFieeld).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(submitLoginField).click();
		return new MyDashboardPage(driver);
	}
	
	public void loginWithoutUsername(String password) {
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(submitLoginField).click();
	}
	
	public void loginWithOutClicking() {
		driver.findElement(emailAddressFieeld).sendKeys();
		driver.findElement(passwordField).sendKeys();		
	}

	
	public void loginWith1(String username, String password) {
		driver.findElement(emailAddressFieeld).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(submitLoginField).click();
	}
	
	public void loginWithoutUsername1(String password) {
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(submitLoginField).click();
	}
	
	public void loginWithOutClicking1() {
		driver.findElement(emailAddressFieeld).sendKeys();
		driver.findElement(passwordField).sendKeys();		
	}
}
