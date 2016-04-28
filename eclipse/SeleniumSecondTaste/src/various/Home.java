package various;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Home {

	private WebDriver driver;


	public Home(WebDriver driver) {
		this.driver = driver;
	}
	
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public void loadFacebookApplication(String urlAddress) {				
		driver.navigate().to(urlAddress);
	}
	
	
	
	public void logonToFacebook(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
	}

	public void enterBirthday(int dayValue, String monthValue, String yearValue)   {
		WebElement day = driver.findElement(By.id("day"));
		Select selectDay = new Select(day);
		selectDay.selectByIndex(dayValue);
	
		WebElement month = driver.findElement(By.id("month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByValue(monthValue);
		
		WebElement year = driver.findElement(By.id("year"));
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText(yearValue);
		
	}
}
