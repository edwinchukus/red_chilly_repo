package com.guru99.live.pages;


import org.openqa.selenium.WebDriver;

public class BasePage {
	
	
	protected WebDriver driver;


	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public HomePage setupTest() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://live.guru99.com/");
		return new HomePage(driver);
	}
	

	public void cleanUpTest() {
		if(driver!= null){
			driver.quit();
		}else{
			System.out.println("Driver was closed earlier");
		}
	}
	
	

}
