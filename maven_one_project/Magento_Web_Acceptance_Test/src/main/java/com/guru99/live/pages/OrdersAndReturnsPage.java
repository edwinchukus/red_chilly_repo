package com.guru99.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrdersAndReturnsPage extends BasePage{

	public OrdersAndReturnsPage(WebDriver driver) {
		super(driver);
	}

	public OrdersAndReturnsPage populateOrderInformation(String orderID, String customerLastName, String emailOrZip, String valueOfEmailOrZip) {
		driver.findElement(By.id("oar_order_id")).sendKeys(orderID);
		driver.findElement(By.id("oar_billing_lastname")).sendKeys(customerLastName);
		WebElement selectEmailOrZipElement = driver.findElement(By.id("quick_search_type_id"));
		Select selectEmailOrZip = new Select(selectEmailOrZipElement);
		if(emailOrZip.contains("Email")) {
			selectEmailOrZip.selectByVisibleText(emailOrZip);
			driver.findElement(By.id("oar_email")).sendKeys(valueOfEmailOrZip);
		}else if(emailOrZip.contains("ZIP")) {
			selectEmailOrZip.selectByVisibleText(emailOrZip);
			driver.findElement(By.id("oar_zip")).sendKeys(valueOfEmailOrZip);
		}
		return new OrdersAndReturnsPage(driver);
	}

	public OrderInformationPage searchForOrdersAndReturns() {
		driver.findElement(By.xpath("//*[@id='oar_widget_orders_and_returns_form']/div[2]/button")).click();		
		return new OrderInformationPage(driver);
	}
	
	

}
