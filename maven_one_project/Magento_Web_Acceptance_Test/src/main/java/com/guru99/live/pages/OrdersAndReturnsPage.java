package com.guru99.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrdersAndReturnsPage extends BasePage{
	private By orderIdField = By.id("oar_order_id");
	private By customerLastNameField = By.id("oar_billing_lastname");
	private By quickSearchIdField = By.id("quick_search_type_id");
	private By emailField = By.id("oar_email");;
	private By zipCodeField = By.id("oar_zip");
	private By searchOrdersAndReturns = By.xpath("//*[@id='oar_widget_orders_and_returns_form']/div[2]/button");

	
	public OrdersAndReturnsPage(WebDriver driver) {
		super(driver);
	}

	public OrdersAndReturnsPage populateOrderInformation(String orderID, String customerLastName, String emailOrZip, String valueOfEmailOrZip) {
		driver.findElement(orderIdField).sendKeys(orderID);
		driver.findElement(customerLastNameField).sendKeys(customerLastName);
		WebElement selectEmailOrZipElement = driver.findElement(quickSearchIdField);
		Select selectEmailOrZip = new Select(selectEmailOrZipElement);
		if(emailOrZip.contains("Email")) {
			selectEmailOrZip.selectByVisibleText(emailOrZip);
			driver.findElement(emailField).sendKeys(valueOfEmailOrZip);
		}else if(emailOrZip.contains("ZIP")) {
			selectEmailOrZip.selectByVisibleText(emailOrZip);
			driver.findElement(zipCodeField).sendKeys(valueOfEmailOrZip);
		}
		return new OrdersAndReturnsPage(driver);
	}

	public OrderInformationPage searchForOrdersAndReturns() {
		driver.findElement(searchOrdersAndReturns).click();		
		return new OrderInformationPage(driver);
	}
	

	

}
